package com.victorze.atm.boundaries;

import com.victorze.atm.entities.User;

public interface UserDetailBoundary {

    User find(String userName);

}
