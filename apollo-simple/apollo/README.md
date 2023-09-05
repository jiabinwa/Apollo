# Apollo Simple

> This is the primitive version of a Spring Boot project integrated with Jersey. 

## Build and Run

### Software Prerequisite
1. Java 8
2. Maven 3.6.0

### Maven Command

| Command                                             | Description                              |
|-----------------------------------------------------|------------------------------------------|
| `mvn clean install -U`                              | Build project and execute all unit tests |
| `mvn clean install -U -DskipTests -Dskip.it = true` | Build project and skip all tests         |

### Start Server

```aidl
mvn spring-boot:run
```

### API Example:

Hello World Example
```
GET http://localhost:8080/apollo/v1/hello 
```

Response:
```
{
    "status": "OK"
}
```
