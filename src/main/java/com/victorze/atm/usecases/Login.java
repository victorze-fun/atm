package com.victorze.atm.usecases;

import com.victorze.atm.usecases.interfaces.boundaries.LoginBoundary;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;

public class Login implements LoginBoundary {

    private UserRepository userRepository;

    public Login(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String userName, String password) {
        var user = userRepository.get(userName);
        return  user != null &&
                user.getUsername().equals(userName) &&
                user.getPassword().equals(password);
    }

}
