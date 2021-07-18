@echo off

set CURRENT_DIRECTORY="%cd%"

docker run --rm -u root -v "%CURRENT_DIRECTORY%:/root/autoservice-backend-demo" -w /root/autoservice-backend-demo gradle:jdk11 gradle clean build