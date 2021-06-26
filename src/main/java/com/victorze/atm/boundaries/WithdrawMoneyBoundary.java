package com.victorze.atm.boundaries;

import com.victorze.atm.entities.Account;

public interface WithdrawMoneyBoundary {

    double withdraw(Account account, double money);

}
