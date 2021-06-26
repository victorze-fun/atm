package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.UserDetailBoundary;
import com.victorze.atm.entities.User;
import com.victorze.atm.usecases.gateways.UserDetailGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetail implements UserDetailBoundary {

    @Autowired
    UserDetailGateway gateway;

    public User find(String userName) {
        return gateway.find(userName);
    }

}
