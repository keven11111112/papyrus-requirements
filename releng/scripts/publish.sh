#!/bin/bash
alias ll="ls -la"

########### Parameters Check ###########
if (test $# -ne 5) then
  echo "The script must have access to the following parameters:
  - MILESTONE,
  - SIGN,
  - RELEASE_NUMBER,
  - OVERRIDE,
  - PUBLISH"
fi

########### Parameters Initialization ###########
if ! $PUBLISH ; then
  exit 0 # nothing to do here
fi 

if ! $SIGN ; then
  echo "The sources may not have been signed. Please verify the build and artifacts parameters and try again."
  exit 1
fi

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

#jobArtifacts=$HOME/.jenkins/jobs/$PROMOTED_JOB_NAME/builds/$PROMOTED_NUMBER/archive
jobArtifacts=$HOME/agent/workspace/$JOB_NAME/
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
  ls
  exit 1
fi
if [ ! -d repository ] ; then
  echo "There is no repository directory here."
  pwd
  ls
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
cp -r repository/* $destinationUpdateSite


########### Set Access Rights ###########
# This function sets the acess rights to allow all memebers of the group to edit the files
function setAccessRights() {
  chmod -R 775 "$1"
  chgrp -hR modeling.mdt.papyrus "$1"
}
echo "Set access right -R: $destinationUpdateSite"
setAccessRights $destinationUpdateSite


echo "publishing done."