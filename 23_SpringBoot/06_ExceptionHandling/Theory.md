# Exception Handling in Spring Boot

## Why Global Exception Handling?
Without it, Spring returns ugly default error responses.
A global handler gives you clean, consistent JSON error responses across all endpoints.

## @ControllerAdvice vs @RestControllerAdvice
- `@ControllerAdvice` — handles exceptions globally for MVC controllers
- `@RestControllerAdvice` — same but automatically adds `@ResponseBody` (returns JSON)

## Flow
```
Request → Controller → Service → throws Exception
                                        ↓
                              @RestControllerAdvice
                              @ExceptionHandler catches it
                                        ↓
                              Returns clean JSON error response
```

## Common Exception Types to Handle
| Exception | When it occurs |
|-----------|---------------|
| `ResourceNotFoundException` | Custom — entity not found in DB |
| `MethodArgumentNotValidException` | `@Valid` validation fails |
| `HttpMessageNotReadableException` | Malformed JSON in request body |
| `ConstraintViolationException` | `@Validated` on path/query params fails |
| `Exception` | Catch-all for unexpected errors |

## Error Response Structure (Best Practice)
```json
{
  "status": 404,
  "error": "Not Found",
  "message": "User not found with id: 5",
  "timestamp": "2024-01-15T10:30:00"
}
```
