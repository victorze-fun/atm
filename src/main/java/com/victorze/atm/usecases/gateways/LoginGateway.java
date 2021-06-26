package com.victorze.atm.usecases.gateways;

public interface LoginGateway {

    boolean checkUser(String userName, String password);

}
