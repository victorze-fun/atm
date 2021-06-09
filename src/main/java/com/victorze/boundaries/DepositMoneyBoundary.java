package com.victorze.boundaries;

import com.victorze.entities.Account;

public interface DepositMoneyBoundary {

    double deposit(Account account, double money);

}
