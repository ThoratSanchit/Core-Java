package com.example.demo.controller;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// Slice test — only loads controller layer, mocks service
@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc; // simulates HTTP requests

    @MockBean
    private UserService userService; // mocked Spring bean

    @Autowired
    private ObjectMapper objectMapper; // for JSON serialization

    @Test
    void getAllUsers_shouldReturn200WithList() throws Exception {
        UserEntity user = new UserEntity("Alice", "alice@example.com", "Mumbai");
        when(userService.getAllUsers()).thenReturn(List.of(user));

        mockMvc.perform(get("/api/users"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$[0].name").value("Alice"));
    }

    @Test
    void getUserById_whenExists_shouldReturn200() throws Exception {
        UserEntity user = new UserEntity("Alice", "alice@example.com", "Mumbai");
        when(userService.getUserById(1L)).thenReturn(Optional.of(user));

        mockMvc.perform(get("/api/users/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.email").value("alice@example.com"));
    }

    @Test
    void getUserById_whenNotFound_shouldReturn404() throws Exception {
        when(userService.getUserById(99L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/api/users/99"))
               .andExpect(status().isNotFound());
    }

    @Test
    void createUser_shouldReturn201() throws Exception {
        UserEntity user = new UserEntity("Bob", "bob@example.com", "Delhi");
        when(userService.createUser(any())).thenReturn(user);

        mockMvc.perform(post("/api/users")
               .contentType(MediaType.APPLICATION_JSON)
               .content(objectMapper.writeValueAsString(user)))
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.name").value("Bob"));
    }
}
