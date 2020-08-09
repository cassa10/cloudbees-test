#!/bin/bash

# Voy a la ruta donde se encuentra el backend
cd demo-cloudbees

# Limpia todo antes de empaquetar
mvn clean

# Ejecuta los tests y empaqueta el aplicativo en un .jar en el directorio "./demo-cloudbees/target"
mvn package

