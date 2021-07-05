package com.victorze.atm.repositories;

import com.victorze.atm.entities.User;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private AccountRepositoryImpl accountRepository;

    public UserRepositoryImpl(AccountRepositoryImpl accountRepository) {
        this.accountRepository = accountRepository;
    }

    private List<User> data = new ArrayList<>();

    @Override
    public User get(String userName) {
        var optionalUser = data
                .stream()
                .filter(u -> u.getUsername().equals(userName))
                .findFirst();
        return optionalUser.orElse(null);
    }

    public void init() {
        var account = accountRepository.find("1234");
        data.add(new User("qwerty", "secret", "Elliot", account));
    }
}
