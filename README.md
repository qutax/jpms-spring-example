# JPMS and Spring Example
This project is a combatibility test of the Java Platform Module System and the Spring Framework using Spring Boot.

## Building and Running

### With JPMS
```bash
mvn install
```
```bash
cd web
```
```bash
java --add-modules java.instrument --module-path=target/modules --module example.web/red.jackal.training.spring.jpms.web.WebApplication
```

### Without JPMS
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
