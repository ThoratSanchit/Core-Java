# Pagination & Sorting in Spring Boot

## Why Pagination?
Returning all records at once is a performance killer.
Pagination returns data in pages — e.g., 10 records at a time.

## Key Classes
| Class | Purpose |
|-------|---------|
| `Pageable` | Interface — holds page number, size, sort info |
| `PageRequest` | Implementation of Pageable |
| `Page<T>` | Result — contains data + metadata (total pages, total elements, etc.) |
| `Sort` | Defines sort direction and field |

## Repository
```java
// JpaRepository already supports Pageable — no extra code needed
Page<UserEntity> findAll(Pageable pageable);
Page<UserEntity> findByCity(String city, Pageable pageable);
```

## Service
```java
public Page<UserEntity> getUsers(int page, int size, String sortBy) {
    Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
    return userRepository.findAll(pageable);
}
```

## Controller
```java
@GetMapping
public ResponseEntity<Page<UserEntity>> getUsers(
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size,
    @RequestParam(defaultValue = "id") String sortBy) {

    return ResponseEntity.ok(userService.getUsers(page, size, sortBy));
}
```

## API Call Examples
```
GET /api/users?page=0&size=5              → first 5 users
GET /api/users?page=1&size=5              → next 5 users
GET /api/users?page=0&size=10&sortBy=name → sorted by name
```

## Page Response Structure
```json
{
  "content": [...],          // actual data
  "totalElements": 50,       // total records in DB
  "totalPages": 5,           // total pages
  "size": 10,                // page size
  "number": 0,               // current page (0-indexed)
  "first": true,
  "last": false
}
```
