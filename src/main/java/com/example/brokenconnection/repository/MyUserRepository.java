package com.example.brokenconnection.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.math.BigInteger;

@Component
@RequiredArgsConstructor
public class MyUserRepository implements IMyUserRepository {
    private final EntityManager entityManager;

    public Long get(Long uuid) {
        Object uuid1 = entityManager.createNativeQuery("select id from users where id = :uuid")
                .setParameter("uuid", uuid)
                .getSingleResult();

        return ((BigInteger) uuid1).longValue();
    }
}
