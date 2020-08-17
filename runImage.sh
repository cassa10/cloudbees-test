#!/bin/bash

# Parámetros:
# 1. Puerto que expondrá el container en el host actual

# Parando y eliminando contenedor "demoCloudBees-api" si existe, sino sigue de largo.
docker stop demoCloudBees-api
docker rm demoCloudBees-api

#Si existe el parametro $1, crea el contenedor con el puerto solicitado
if [ ! -z "$1" ]
then
   docker run -d --name demoCloudBees-api -p $1:8080 demo-cloudbees-api
else
   docker run -d --name demoCloudBees-api -p 8080:8080 demo-cloudbees-api
fi

STATUS=$?
echo $STATUS
exit $STATUS