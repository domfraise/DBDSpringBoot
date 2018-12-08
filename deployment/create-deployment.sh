#!/usr/bin/env bash

password=$1

cd frontend
npm run build
cp -r dist/* ../src/main/resources/static
cd ..

 mvn clean package -Pprod -Djks.password=${password}

