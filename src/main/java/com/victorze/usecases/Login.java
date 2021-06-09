package com.victorze.usecases;

import com.victorze.boundaries.LoginBoundary;
import com.victorze.usecases.gateways.LoginGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login implements LoginBoundary {

    @Autowired
    private LoginGateway gateway;

    public boolean login(String userName, String password) {
        return gateway.checkUser(userName, password);
    }

}
