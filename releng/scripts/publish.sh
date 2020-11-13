#!/bin/sh
alias ll="ls -la"

########### Parameters Check ###########
if [[ -v $PROMOTED_JOB_NAME ]] || [[ -v $PROMOTED_JOB_NUMBER ]] || [[ -v $MILESTONE ]] || [[ -v $RELEASE_NUMBER ]] || [[ -v $OVERRIDE ]] ; then
  echo "The script must set to the following parameters:
  - PROMOTED_JOB_NAME, found: $PROMOTED_JOB_NAME,
  - PROMOTED_JOB_NUMBER, found: $PROMOTED_JOB_NUMBER,
  - MILESTONE, found: $MILESTONE,
  - RELEASE_NUMBER, found: $RELEASE_NUMBER,
  - OVERRIDE, found: $OVERRIDE"
  
  exit 1;
fi

########### Set Access Rights ###########
# This function sets the acess rights to allow all memebers of the group to edit the files
function setAccessRights() {
  chmod -R 775 "$1"
  chgrp -hR modeling.mdt.papyrus "$1"
}

########### Parameters Initialization ###########

#The specific localization
remoteRoot="/home/data/httpd/download.eclipse.org"
requirementsRoot="modeling/mdt/papyrus/components/requirements"

if [[ "$MILESTONE" == "-R" ]] ; then
  destination=$remoteRoot/$requirementsRoot/release-$RELEASE_NUMBER
  destinationUpdateSite=$destination
else
  destination=$remoteRoot/$requirementsRoot/milestones-$RELEASE_NUMBER
  destinationUpdateSite=$destination/$RELEASE_NUMBER$MILESTONE
fi
echo $destinationUpdateSite

jobArtifacts=$HOME/.jenkins/jobs/$PROMOTED_JOB_NAME/builds/$PROMOTED_JOB_NUMBER/archive
if [ ! -d $jobArtifacts ] ; then
  echo "No artifact folder was found under the specified $jobArtifacts path"
  exit 1
fi

echo "$jobArtifacts contains the following :"
ls $jobArtifacts

if [ -d $destination ] ; then
  if [ -d $destinationUpdateSite ] ; then
    if $OVERRIDE ; then
      echo "Removing previous artifacts"
      rm -rf $destinationUpdateSite
    else
      echo "The milestone already exists. You might want to change the suffix or delete the previous one."
      exit 1
    fi
  fi
fi


########### Publish Artifacts ###########
#Go to the artifact directory
cd $jobArtifacts

# Check the availability of the artifacts to promote before creating anything
if [ ! -f Papyrus-Requirements.zip ] ; then
  echo "There is no Papyrus-Requirements.zip here."
  pwd
  ll
  exit 1
fi
if [ ! -d repository ] ; then
  echo "There is no repository directory here."
  pwd
  ll
  exit 1
fi

echo "Promoting the Job to $destinationUpdateSite"

#No error if exists, makes parent directories as needed
echo "creating $destinationUpdateSite"
mkdir -p $destinationUpdateSite

if [ ! -d $destinationUpdateSite ] ; then
  echo "The destination folder could not be created. Please look why in the logs."
  exit 1
fi

#Copy the contents onto the server folder
echo "copying the zip into $destinationUpdateSite"
cp Papyrus-Requirements.zip $destinationUpdateSite

echo "copying the p2 repository folder into $destinationUpdateSite"
cp -r repository $destinationUpdateSite


# create the composite update site
newTimeStamp=$(date +%s000)

cat > "$updateSiteDir/compositeArtifacts.xml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<repository name="Papyrus" type="org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository" version="1.0.0">
  <properties size="1">
    <property name="p2.timestamp" value="${newTimeStamp}"/>
  </properties>
  <children size="1">
    <child location="repository"/>
  </children>
</repository>
EOF

cat > "$updateSiteDir/compositeContent.xml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<repository name="Papyrus" type="org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository" version="1.0.0">
  <properties size="1">
    <property name="p2.timestamp" value="${newTimeStamp}"/>
  </properties>
  <children size="1">
    <child location="repository"/>
  </children>
</repository>
EOF


if [[ "$MILESTONE" != "-R" ]] ; then

# create the composite update site for the update site root folder
updateSiteChildren=$(($(find $updateSiteDir/.. -maxdepth 1 -type d -print | wc -l)-1))

# Update the releaseRoot composites
cat > "$updateSiteDir/../compositeContent.xml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<repository name="Papyrus" type="org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository" version="1.0.0">
  <properties size="1">
    <property name="p2.timestamp" value="${newTimeStamp}"/>
  </properties>
  <children size="${updateSiteChildren}">$(
    for folder in $updateSiteDir/../*; do
	if [[ -d ${folder} ]] ; then
    printf "\n    <child location='$(basename ${folder})'/>"
	fi
    done
    )
  </children>
</repository>
EOF

cat > "$updateSiteDir/../compositeArtifacts.xml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<repository name="Papyrus" type="org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository" version="1.0.0">
  <properties size="1">
    <property name="p2.timestamp" value="${newTimeStamp}"/>
  </properties>
  <children size="${updateSiteChildren}">$(
    for folder in $updateSiteDir/../*; do
	if [[ -d ${folder} ]] ; then
    printf "\n    <child location='$(basename ${folder})'/>"
	fi
    done
    )
  </children>
</repository>
EOF

echo "Set access right -R: $updateSiteDir/.."
setAccessRights "$updateSiteDir/.."

fi

echo "Set access right -R: $destinationUpdateSite"
setAccessRights $destinationUpdateSite

echo "publishing done."
