package com.example.brokenconnection.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IMyUserRepository {
    Long get(Long uuid);
}
