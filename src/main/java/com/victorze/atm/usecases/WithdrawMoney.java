package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.WithdrawMoneyBoundary;
import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.gateways.WithdrawMoneyGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawMoney implements WithdrawMoneyBoundary {

    @Autowired
    private WithdrawMoneyGateway gateway;

    @Override
    public double withdraw(Account account, double money) {
        account.withdraw(money);
        gateway.update(account);
        return account.getBalance();
    }

}
