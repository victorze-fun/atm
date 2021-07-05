package com.victorze.atm.usecases.interfaces.boundaries;

import com.victorze.atm.entities.Account;

public interface DepositMoneyBoundary {

    double deposit(Account account, double money);

}
