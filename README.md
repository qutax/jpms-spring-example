# JPMS and Spring Example
This project is an example for the combination of the Java Platform Module System with the Spring Framework.

## Prerequisites
 * Java 11 JDK
 * Maven

## Building and Running
```bash
mvn install
```
```bash
cd web
```
```bash
mvn package spring-boot:repackage
```
```bash
java -jar target/web-0.0.1.jar
```