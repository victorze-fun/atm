package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.LoginBoundary;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login implements LoginBoundary {

    @Autowired
    private UserRepository userRepository;

    public boolean login(String userName, String password) {
        var user = userRepository.get(userName);
        return  user != null &&
                user.getUsername().equals(userName) &&
                user.getPassword().equals(password);
    }

}
