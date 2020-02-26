package com.example.brokenconnection.repository;

import com.example.brokenconnection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<User, Long> {
}
