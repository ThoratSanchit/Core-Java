# Spring Boot Validation

## Why Validation?
Never trust user input. Validate request data before processing it.
Spring Boot uses Bean Validation (JSR-380) via the `spring-boot-starter-validation` dependency.

## Common Validation Annotations
| Annotation | Purpose |
|------------|---------|
| `@NotNull` | Field must not be null |
| `@NotBlank` | String must not be null or empty (trims whitespace) |
| `@NotEmpty` | Collection/String must not be null or empty |
| `@Size(min, max)` | String/Collection size must be within range |
| `@Min(value)` | Number must be >= value |
| `@Max(value)` | Number must be <= value |
| `@Email` | Must be a valid email format |
| `@Pattern(regexp)` | Must match the regex pattern |
| `@Positive` | Number must be > 0 |
| `@PositiveOrZero` | Number must be >= 0 |
| `@Past` | Date must be in the past |
| `@Future` | Date must be in the future |

## How to Enable Validation
1. Add `@Valid` or `@Validated` on the `@RequestBody` parameter in the controller.
2. Spring automatically validates and returns 400 Bad Request if validation fails.

```java
@PostMapping
public ResponseEntity<User> createUser(@Valid @RequestBody UserRequest request) {
    // only reaches here if validation passes
}
```

## Handling Validation Errors
Use `@ExceptionHandler` with `MethodArgumentNotValidException` to return clean error messages.
See `06_ExceptionHandling/` for the global exception handler.
