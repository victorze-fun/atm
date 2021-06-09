package com.victorze.usecases;

import com.victorze.entities.Account;
import com.victorze.usecases.gateways.DepositMoneyGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositMoney {

    @Autowired
    private DepositMoneyGateway gateway;

    public double deposit(Account account, double money) {
        account.deposit(money);
        gateway.update(account);
        return account.getBalance();
    }

}
