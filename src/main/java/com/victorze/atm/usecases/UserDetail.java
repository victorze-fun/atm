package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.UserDetailBoundary;
import com.victorze.atm.entities.User;
import com.victorze.atm.usecases.interfaces.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetail implements UserDetailBoundary {

    @Autowired
    UserRepository userRepository;

    public User find(String userName) {
       return userRepository.get(userName);
    }

}
