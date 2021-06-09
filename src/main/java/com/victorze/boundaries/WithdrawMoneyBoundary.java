package com.victorze.boundaries;

import com.victorze.entities.Account;

public interface WithdrawMoneyBoundary {

    double withdraw(Account account, double money);

}
