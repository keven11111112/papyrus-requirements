#!/bin/bash

p2UpdateSiteDir=${WORKSPACE}/source/releng/org.eclipse.papyrus.requirements.p2/target/repository
updateSite=${WORKSPACE}/repository

zipName="Papyrus-Requirements.zip"

rm -rf tmp
mkdir -p "tmp/$FULL_BUILD_ID"

rm -rf $updateSite
mv $p2UpdateSiteDir $updateSite

# create the update site zip
cd $updateSite && zip -r $zipName *
mv $updateSite/$zipName ${WORKSPACE}
