package com.victorze.atm.usecases.interfaces.repositories;

import com.victorze.atm.entities.User;

public interface UserRepository {

    User get(String userName);

}
