package com.example.demo.controller;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.data.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class PaginationExample {

    private final UserRepository userRepository;

    public PaginationExample(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET /api/users?page=0&size=10&sortBy=name&direction=asc
    @GetMapping
    public ResponseEntity<Page<UserEntity>> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        Page<UserEntity> result = userRepository.findAll(pageable);

        return ResponseEntity.ok(result);
    }

    // GET /api/users/city/Mumbai?page=0&size=5
    @GetMapping("/city/{city}")
    public ResponseEntity<Page<UserEntity>> getUsersByCity(
            @PathVariable String city,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());
        Page<UserEntity> result = userRepository.findByCity(city, pageable);

        return ResponseEntity.ok(result);
    }
}
