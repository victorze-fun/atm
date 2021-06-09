package com.victorze.usecases;

import com.victorze.boundaries.UserDetailBoundary;
import com.victorze.entities.User;
import com.victorze.usecases.gateways.UserDetailGateway;
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
