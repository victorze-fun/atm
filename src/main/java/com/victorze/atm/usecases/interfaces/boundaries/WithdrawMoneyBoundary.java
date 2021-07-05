package com.victorze.atm.usecases.interfaces.boundaries;

import com.victorze.atm.entities.Account;

public interface WithdrawMoneyBoundary {

    double withdraw(Account account, double money);

}
