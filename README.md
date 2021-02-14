# Simple Web App Running Spring-Boot

## Prerequisites

* Java 8+
* Apache Maven 3+
* PostgreSQL 3+
* User `postgres` must exist with credentials found in `src/main/properties/liquibase.properties`

## Local Set-up

### Backend
* Create a local database DBD
`CREATE DATABASE DBD`
* Run liquibase to create schema
`mvn liquibase:update`

### Frontend

`cd frontend`

`npm install`




## Run

Run just front end using node
`npm run serve`

Run spring-boot app
`mvn spring-boot:run -Pdev`


## Build
Compile front end
`npm run build`

Compile whole app
`sh deployment/create-deployment <PASSWORD>`

## Deploy
`npm run build`
`firebase deploy --only hosting`
`sh deployment/deploy.sh` 