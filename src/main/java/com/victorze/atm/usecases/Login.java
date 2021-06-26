package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.LoginBoundary;
import com.victorze.atm.usecases.gateways.LoginGateway;
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
