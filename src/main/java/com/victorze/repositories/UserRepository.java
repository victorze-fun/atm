package com.victorze.repositories;

import com.victorze.entities.User;
import com.victorze.usecases.gateways.LoginGateway;
import com.victorze.usecases.gateways.UserDetailGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements UserDetailGateway, LoginGateway {

    @Autowired
    private AccountRepository accountRepository;

    private List<User> data = new ArrayList<>();

    @Override
    public User find(String userName) {
        var optionalUser = data
                .stream()
                .filter(u -> u.getUsername().equals(userName))
                .findFirst();
        return optionalUser.orElse(null);
    }

    @Override
    public boolean checkUser(String userName, String password) {
        var optionalUser = data
                .stream()
                .filter(u -> u.getUsername().equals(userName) && u.getPassword().equals(password))
                .findFirst();
        return optionalUser.isPresent();
    }

    @PostConstruct
    public void init() {
        var account = accountRepository.find("1234");
        data.add(new User("qwerty", "secret", "Elliot", account));
    }

}
