#!/bin/bash
set +eux

CURRENT_DIRECTORY=$(pwd)

docker run --rm -p 8080:8080 -v "${CURRENT_DIRECTORY}:/root/autoservice-backend-demo" openjdk:11-jdk java -jar /root/autoservice-backend-demo/build/libs/autoservice-backend-demo-0.0.1-SNAPSHOT.jar