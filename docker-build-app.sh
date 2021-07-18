#!/bin/bash
set +eux

CURRENT_DIRECTORY=$(pwd)

docker run --rm -u root -v "${CURRENT_DIRECTORY}:/root/autoservice-backend-demo" -w /root/autoservice-backend-demo gradle:jdk11 gradle clean build