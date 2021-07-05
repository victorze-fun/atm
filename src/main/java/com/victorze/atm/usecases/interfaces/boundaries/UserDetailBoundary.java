package com.victorze.atm.usecases.interfaces.boundaries;

import com.victorze.atm.entities.User;

public interface UserDetailBoundary {

    User find(String userName);

}
