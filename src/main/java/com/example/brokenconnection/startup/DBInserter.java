package com.example.brokenconnection.startup;

import com.example.brokenconnection.model.User;
import com.example.brokenconnection.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
//@Component
public class DBInserter implements CommandLineRunner {
    private final UsersRepository usersRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Test");
        usersRepository.save(user);
    }
}
