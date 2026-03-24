# Spring Boot Profiles & Configuration

## What are Profiles?
Profiles let you have different configurations for different environments
(dev, test, prod) without changing code.

## Profile-Specific Property Files
```
application.properties          ← shared/default config
application-dev.properties      ← dev environment
application-prod.properties     ← production environment
application-test.properties     ← testing
```

## Activating a Profile
```properties
# in application.properties
spring.profiles.active=dev
```
Or via command line:
```bash
java -jar app.jar --spring.profiles.active=prod
```
Or via environment variable:
```
SPRING_PROFILES_ACTIVE=prod
```

## Example Config Files

### application.properties (shared)
```properties
spring.application.name=my-app
server.port=8080
```

### application-dev.properties
```properties
spring.datasource.url=jdbc:h2:mem:devdb
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
logging.level.root=DEBUG
```

### application-prod.properties
```properties
spring.datasource.url=jdbc:mysql://prod-server:3306/mydb
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASS}
spring.jpa.hibernate.ddl-auto=validate
logging.level.root=WARN
```

## @Profile Annotation — Conditional Beans
```java
@Service
@Profile("dev")
public class MockEmailService implements EmailService {
    // used only in dev — no real emails sent
}

@Service
@Profile("prod")
public class RealEmailService implements EmailService {
    // used only in prod — sends real emails
}
```

## @Value — Inject Config Values
```java
@Value("${server.port}")
private int port;

@Value("${app.name:DefaultApp}")  // with default value
private String appName;
```

## @ConfigurationProperties — Bind a Group of Properties
```properties
# application.properties
app.jwt.secret=mysecret
app.jwt.expiration=86400000
```
```java
@ConfigurationProperties(prefix = "app.jwt")
@Component
public class JwtConfig {
    private String secret;
    private long expiration;
    // getters & setters
}
```

## Environment Variables in Properties
Use `${}` to reference environment variables — keeps secrets out of code:
```properties
spring.datasource.password=${DB_PASSWORD}
```
