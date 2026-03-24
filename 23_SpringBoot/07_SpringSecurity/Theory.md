# Spring Security + JWT Authentication

## What is Spring Security?
Spring Security is a framework that handles authentication (who are you?) and
authorization (what can you do?) in Spring Boot applications.

## JWT (JSON Web Token)
JWT is a compact, self-contained token used for stateless authentication.

### JWT Structure
```
Header.Payload.Signature
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyQGV4YW1wbGUuY29tIn0.abc123
```
- Header: algorithm used (HS256)
- Payload: claims (user info, expiry)
- Signature: verifies the token wasn't tampered with

## Authentication Flow
```
1. User sends POST /auth/login with email + password
2. Server validates credentials
3. Server generates JWT token and returns it
4. Client stores token (localStorage / cookie)
5. Client sends token in every request: Authorization: Bearer <token>
6. Server validates token on each request via JwtFilter
7. If valid → allow access, if invalid → 401 Unauthorized
```

## Key Components
| Component | Role |
|-----------|------|
| `SecurityFilterChain` | Configures which endpoints are public/protected |
| `JwtFilter` | Intercepts every request, validates JWT |
| `UserDetailsService` | Loads user from DB for authentication |
| `AuthenticationManager` | Validates username + password |
| `PasswordEncoder` | BCrypt hashing for passwords |

## Security Config — Endpoint Rules
```java
http.authorizeHttpRequests(auth -> auth
    .requestMatchers("/auth/**").permitAll()     // public endpoints
    .requestMatchers("/admin/**").hasRole("ADMIN") // admin only
    .anyRequest().authenticated()                // everything else needs login
);
```

## Common Dependencies (pom.xml)
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.12.3</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.12.3</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.12.3</version>
    <scope>runtime</scope>
</dependency>
```

## application.properties
```properties
jwt.secret=your-256-bit-secret-key-here-make-it-long-enough
jwt.expiration=86400000   # 24 hours in milliseconds
```
