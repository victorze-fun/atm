package com.victorze.atm.boundaries;

import com.victorze.atm.entities.Account;

public interface DepositMoneyBoundary {

    double deposit(Account account, double money);

}
