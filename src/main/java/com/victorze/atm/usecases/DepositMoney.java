package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.DepositMoneyBoundary;
import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.gateways.DepositMoneyGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositMoney implements DepositMoneyBoundary {

    @Autowired
    private DepositMoneyGateway gateway;

    public double deposit(Account account, double money) {
        account.deposit(money);
        gateway.update(account);
        return account.getBalance();
    }

}
