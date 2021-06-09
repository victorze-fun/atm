package com.victorze.boundaries;

import com.victorze.entities.User;

public interface UserDetailBoundary {

    User find(String userName);

}
