# Spring Boot REST API

## What is REST?
REST (Representational State Transfer) is an architectural style for building web services.
A REST API uses HTTP methods to perform CRUD operations on resources.

## HTTP Methods → CRUD Mapping
| HTTP Method | CRUD Operation | Example |
|-------------|---------------|---------|
| GET | Read | Get all users / Get user by ID |
| POST | Create | Create a new user |
| PUT | Update (full) | Update entire user object |
| PATCH | Update (partial) | Update only user's email |
| DELETE | Delete | Delete a user |

## HTTP Status Codes
| Code | Meaning |
|------|---------|
| 200 OK | Request succeeded |
| 201 Created | Resource created successfully |
| 204 No Content | Success but no body (used in DELETE) |
| 400 Bad Request | Invalid input from client |
| 404 Not Found | Resource doesn't exist |
| 500 Internal Server Error | Server-side error |

## Key Annotations
| Annotation | Purpose |
|------------|---------|
| `@RestController` | Marks class as REST controller, returns JSON |
| `@RequestMapping("/path")` | Base URL for all methods in the class |
| `@GetMapping` | Handle GET requests |
| `@PostMapping` | Handle POST requests |
| `@PutMapping` | Handle PUT requests |
| `@DeleteMapping` | Handle DELETE requests |
| `@PathVariable` | Extract value from URL path `/users/{id}` |
| `@RequestParam` | Extract query param `/users?name=John` |
| `@RequestBody` | Map JSON request body to Java object |
| `@ResponseStatus` | Set HTTP status code on response |

## Layered Architecture
```
Client (Postman / Browser)
        ↓ HTTP Request
  Controller Layer   ← @RestController
        ↓
  Service Layer      ← @Service (business logic)
        ↓
  Repository Layer   ← @Repository (database)
        ↓
  Database (MySQL / H2)
```

## ResponseEntity
Use `ResponseEntity<T>` to control HTTP status + body:
```java
return ResponseEntity.ok(user);                          // 200
return ResponseEntity.status(HttpStatus.CREATED).body(user); // 201
return ResponseEntity.notFound().build();                // 404
return ResponseEntity.noContent().build();               // 204
```
