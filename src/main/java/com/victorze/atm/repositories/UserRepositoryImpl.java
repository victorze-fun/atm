package com.victorze.atm.repositories;

import com.victorze.atm.entities.User;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private AccountRepositoryImpl accountRepository;

    private List<User> data = new ArrayList<>();

    @Override
    public User get(String userName) {
        var optionalUser = data
                .stream()
                .filter(u -> u.getUsername().equals(userName))
                .findFirst();
        return optionalUser.orElse(null);
    }

    @PostConstruct
    public void init() {
        var account = accountRepository.find("1234");
        data.add(new User("qwerty", "secret", "Elliot", account));
    }
}
