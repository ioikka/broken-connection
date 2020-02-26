package com.example.brokenconnection.scheduler;

import com.example.brokenconnection.model.User;
import com.example.brokenconnection.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class MyScheduler {
    private final UsersRepository usersRepository;

//    @Scheduled(cron = "0/10 * * * * *")
//    @Scheduled(fixedRate = 5000)
    public void doIt() {
        log.info("doIt");
        User s = new User();
        s.setName(Math.random() + "");
        usersRepository.save(s);
        List<User> all = usersRepository.findAll();
        all.forEach(u -> log.info("{}", u));
    }
}
