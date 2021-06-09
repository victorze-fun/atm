package com.victorze.usecases.gateways;

import com.victorze.entities.User;

public interface UserDetailGateway {

    User find(String userName);

}
