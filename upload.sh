#!/bin/bash
#./gradlew clean build bintrayUpload -PbintrayUser=BINTRAY_USERNAME -PbintrayKey=BINTRAY_KEY -PdryRun=false
./gradlew bintrayUpload -PbintrayUser=bigoat -PbintrayKey=03eec37cffe6790b5462501e874e89e9dc70820c -PdryRun=false
#./gradlew bintrayUpload -PbintrayUser=bigoat -PbintrayKey=03eec37cffe6790b5462501e874e89e9dc70820c -PdryRun=false
