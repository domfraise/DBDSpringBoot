#!/usr/bin/env bash

scp target/spring-boot-web-app-1.0.jar pi@192.168.1.74:/opt
ssh pi@192.168.1.74 'nohup sudo java -jar /opt/spring-boot-web-app-1.0.jar  > foo.out 2> foo.err < /dev/null &'