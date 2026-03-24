# DTO Pattern in Spring Boot

## What is a DTO?
DTO (Data Transfer Object) is a plain object used to carry data between layers.
It decouples your API contract from your database entity.

## Why use DTOs?
- Entity has ALL fields (including sensitive ones like password, internal IDs)
- DTO exposes ONLY what the client needs
- Validation annotations belong on DTOs, not entities
- Prevents over-posting attacks (client sending extra fields)
- API shape can change without touching the DB schema

## Entity vs DTO
```
Entity (DB layer)          DTO (API layer)
─────────────────          ───────────────
id                         (hidden)
name              →        name
email             →        email
password          ✗        (never expose)
createdAt         ✗        (internal)
role              →        role (maybe)
```

## Mapping: Entity ↔ DTO
You can map manually or use MapStruct (annotation processor).

### Manual mapping
```java
// Entity → Response DTO
UserResponse toDto(UserEntity entity) {
    return new UserResponse(entity.getId(), entity.getName(), entity.getEmail());
}

// Request DTO → Entity
UserEntity toEntity(UserRequest request) {
    return new UserEntity(request.getName(), request.getEmail(), request.getCity());
}
```

### MapStruct (recommended for large projects)
```java
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toDto(UserEntity entity);
    UserEntity toEntity(UserRequest request);
}
```

## Common DTO Types
| DTO | Purpose |
|-----|---------|
| `UserRequest` | Incoming create/update payload (has `@Valid` annotations) |
| `UserResponse` | Outgoing response (only safe fields) |
| `LoginRequest` | Auth credentials |
| `JwtResponse` | Token returned after login |
| `ErrorResponse` | Standardized error body |
