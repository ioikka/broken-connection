package com.example.brokenconnection.controller;

import com.example.brokenconnection.model.User;
import com.example.brokenconnection.repository.IMyUserRepository;
import com.example.brokenconnection.repository.MyUserRepository;
import com.example.brokenconnection.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TestController {
    private final UsersRepository usersRepository;
    private final IMyUserRepository iMyUserRepository;

    @GetMapping("/t/{uuid}")
    public ResponseEntity t(@PathVariable(name = "uuid") Long id) {
        Optional<User> byId = usersRepository.findById(id);
        return ResponseEntity.ok(byId.get());
    }

    @GetMapping("/tt/{uuid}")
    public ResponseEntity tt(@PathVariable(name = "uuid") Long id) {
        Long uuid1 = iMyUserRepository.get(id);
        return ResponseEntity.ok(uuid1);
    }
}
