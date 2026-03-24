package com.example.demo.repository;

import com.example.demo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // --- Derived Query Methods (Spring generates SQL automatically) ---

    // SELECT * FROM users WHERE full_name = ?
    Optional<UserEntity> findByName(String name);

    // SELECT * FROM users WHERE email = ? (case-insensitive)
    Optional<UserEntity> findByEmailIgnoreCase(String email);

    // SELECT * FROM users WHERE city = ?
    List<UserEntity> findByCity(String city);

    // SELECT * FROM users WHERE full_name LIKE %keyword%
    List<UserEntity> findByNameContaining(String keyword);

    // --- Custom JPQL Query ---
    @Query("SELECT u FROM UserEntity u WHERE u.city = :city ORDER BY u.name ASC")
    List<UserEntity> findByCityOrderedByName(@Param("city") String city);

    // --- Native SQL Query ---
    @Query(value = "SELECT * FROM users WHERE email = :email", nativeQuery = true)
    Optional<UserEntity> findByEmailNative(@Param("email") String email);
}
