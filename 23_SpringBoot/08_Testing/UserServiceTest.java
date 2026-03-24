package com.example.demo.service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// Unit test — no Spring context, uses Mockito to mock dependencies
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository; // mocked — no real DB calls

    @InjectMocks
    private UserService userService; // real service with mocked repo injected

    private UserEntity sampleUser;

    @BeforeEach
    void setUp() {
        sampleUser = new UserEntity("Alice", "alice@example.com", "Mumbai");
    }

    @Test
    void getAllUsers_shouldReturnListOfUsers() {
        when(userRepository.findAll()).thenReturn(List.of(sampleUser));

        List<UserEntity> result = userService.getAllUsers();

        assertEquals(1, result.size());
        assertEquals("Alice", result.get(0).getName());
        verify(userRepository, times(1)).findAll();
    }

    @Test
    void getUserById_whenExists_shouldReturnUser() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(sampleUser));

        Optional<UserEntity> result = userService.getUserById(1L);

        assertTrue(result.isPresent());
        assertEquals("alice@example.com", result.get().getEmail());
    }

    @Test
    void getUserById_whenNotExists_shouldReturnEmpty() {
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        Optional<UserEntity> result = userService.getUserById(99L);

        assertFalse(result.isPresent());
    }

    @Test
    void createUser_shouldSaveAndReturnUser() {
        when(userRepository.save(sampleUser)).thenReturn(sampleUser);

        UserEntity result = userService.createUser(sampleUser);

        assertNotNull(result);
        assertEquals("Alice", result.getName());
        verify(userRepository, times(1)).save(sampleUser);
    }

    @Test
    void deleteUser_shouldCallRepositoryDeleteById() {
        doNothing().when(userRepository).deleteById(1L);

        userService.deleteUser(1L);

        verify(userRepository, times(1)).deleteById(1L);
    }

    @Test
    void updateUser_whenNotFound_shouldThrowException() {
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> userService.updateUser(99L, sampleUser));
    }
}
