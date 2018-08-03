# Simple Web App Running Spring-Boot

## Prerequisites

* Java 8+
* Apache Maven 3+
* PostgreSQL 3+
* User `postgres` must exist with credentials found in `src/main/properties/liquibase.properties`

## Local Set-up
* Create a local database DBD 
`CREATE DATABASE DBD`
* Run liquibase to create schema
`mvn liquibase:update`
	
## Run

`mvn spring-boot:run`

Or for lightweight testing of static files

`cd src/main/rescources/static`

`python -m SimpleHTTPServer 8080`
