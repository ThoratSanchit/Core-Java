# Spring Boot Basics

## What is Spring Boot?
Spring Boot is an opinionated framework built on top of the Spring Framework.
It eliminates boilerplate configuration and lets you build production-ready apps fast.

## Spring vs Spring Boot
| Feature | Spring | Spring Boot |
|---------|--------|-------------|
| Configuration | Manual XML / Java config | Auto-configuration |
| Server setup | External (Tomcat, Jetty) | Embedded server included |
| Dependency management | Manual | Starter POMs handle it |
| Startup time | Slower | Faster |

## Key Annotations
| Annotation | Purpose |
|------------|---------|
| `@SpringBootApplication` | Entry point — combines `@Configuration`, `@EnableAutoConfiguration`, `@ComponentScan` |
| `@Component` | Marks a class as a Spring-managed bean |
| `@Service` | Marks service layer class |
| `@Repository` | Marks data access layer class |
| `@Controller` | Marks MVC controller |
| `@RestController` | `@Controller` + `@ResponseBody` — returns JSON directly |

## Project Structure (Standard)
```
src/
 └── main/
      ├── java/com/example/demo/
      │    ├── DemoApplication.java       ← main class
      │    ├── controller/
      │    ├── service/
      │    ├── repository/
      │    └── model/
      └── resources/
           ├── application.properties     ← config file
           └── static/
```

## application.properties — Common Config
```properties
server.port=8080
spring.application.name=demo-app
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Maven pom.xml — Starter Dependencies
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.0</version>
</parent>

<dependencies>
    <!-- Web (REST API) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- JPA + Database -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Validation -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <!-- Security -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

    <!-- Testing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```
