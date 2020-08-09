# Prueba-CloudBees

## Objetivo
Este repo es para realizar pruebas lab en el curso de CloudBees University, los cuales es necesario un artefacto. Por motivos de simpleza, se descarto el uso de una base de datos o algun tipo persistencia.

## Stack tecnologico
En el presente contiene una API construida con lo siguiente:
- Spring boot
- Java 8
- Maven

## Pre-requisitos
Tener instalado:
- Java 8
- Maven
- Puerto 8080 libre

## Generación del artefacto
En el main folder, se encuentra el bash script build.sh que ejecuta comandos maven para generar el jar (artefacto) en la ruta especificada dentro del script.

## Ejecución del artefacto
Para ejecutar la API (el jar o artefacto), hay que ejecutar el siguiente comando:
 "java -jar <<ruta-donde-se-encuentra-el-artefacto>>"

Si no se cambio nada del pom, la ruta donde se encuentra el artefacto seria "./demo-cloudbees/target" desde la carpeta del repo.

Una vez que esta en ejecucion el aplicativo, se pueden utilizar los siguiente endpoints:
- "localhost:8080/" => Responde "API Running".
- "localhost:8080/market" => Responde Una lista de Markets hardcodeados.
