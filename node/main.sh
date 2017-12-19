#!/bin/sh
cd $TRAVIS_BUILD_DIR/comm
sbt dockerBuildAndPush
