package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.DepositMoneyBoundary;
import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.interfaces.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositMoney implements DepositMoneyBoundary {

    @Autowired
    private AccountRepository accountRepository;

    public double deposit(Account account, double money) {
        account.deposit(money);
        accountRepository.update(account);
        return account.getBalance();
    }

}
