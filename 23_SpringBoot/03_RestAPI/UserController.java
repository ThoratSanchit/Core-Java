package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Simple User model (in real apps, this lives in model/ package)
class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}

@RestController
@RequestMapping("/api/users")  // base URL for all endpoints in this controller
public class UserController {

    // In-memory list (replace with DB in real apps)
    private List<User> users = new ArrayList<>(List.of(
        new User(1, "Alice", "alice@example.com"),
        new User(2, "Bob", "bob@example.com")
    ));

    // GET /api/users — get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(users);
    }

    // GET /api/users/{id} — get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        Optional<User> user = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();

        return user.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    // GET /api/users/search?name=Alice — search by query param
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchByName(@RequestParam String name) {
        List<User> result = users.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .toList();
        return ResponseEntity.ok(result);
    }

    // POST /api/users — create new user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
        users.add(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    // PUT /api/users/{id} — update user
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return ResponseEntity.ok(user);
            }
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE /api/users/{id} — delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        boolean removed = users.removeIf(u -> u.getId() == id);
        return removed ? ResponseEntity.noContent().build()
                       : ResponseEntity.notFound().build();
    }
}
