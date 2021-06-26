package com.victorze.atm.usecases.gateways;

import com.victorze.atm.entities.User;

public interface UserDetailGateway {

    User find(String userName);

}
