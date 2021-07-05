package com.victorze.atm.usecases;

import com.victorze.atm.boundaries.DepositMoneyBoundary;
import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.interfaces.repositories.AccountRepository;

public class DepositMoney implements DepositMoneyBoundary {

    private AccountRepository accountRepository;

    public DepositMoney(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public double deposit(Account account, double money) {
        account.deposit(money);
        accountRepository.update(account);
        return account.getBalance();
    }

}
