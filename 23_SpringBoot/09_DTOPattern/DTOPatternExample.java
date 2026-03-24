package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// ─── Request DTO — what client sends ───────────────────────────────────────
class UserRequest {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank @Email(message = "Valid email required")
    private String email;

    @NotBlank
    private String city;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}

// ─── Response DTO — what server returns ────────────────────────────────────
// Only exposes safe fields — no password, no internal timestamps
class UserResponse {
    private Long id;
    private String name;
    private String email;

    public UserResponse(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}

// ─── Mapper — converts between Entity and DTO ──────────────────────────────
// In real projects use MapStruct; this is the manual approach
class UserMapper {

    // Entity → Response DTO
    public static UserResponse toResponse(com.example.demo.model.UserEntity entity) {
        return new UserResponse(entity.getId(), entity.getName(), entity.getEmail());
    }

    // Request DTO → Entity
    public static com.example.demo.model.UserEntity toEntity(UserRequest request) {
        return new com.example.demo.model.UserEntity(
            request.getName(),
            request.getEmail(),
            request.getCity()
        );
    }
}

// ─── Controller using DTOs ──────────────────────────────────────────────────
// (Illustrative — in real project this is in controller/ package)
public class DTOPatternExample {
    // Controller would use UserRequest as @RequestBody
    // and return UserResponse — never the raw Entity
}
