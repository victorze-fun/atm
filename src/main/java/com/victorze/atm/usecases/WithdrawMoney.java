package com.victorze.atm.usecases;

import com.victorze.atm.usecases.interfaces.boundaries.WithdrawMoneyBoundary;
import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.interfaces.repositories.AccountRepository;

public class WithdrawMoney implements WithdrawMoneyBoundary {

    private AccountRepository accountRepository;

    public WithdrawMoney(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public double withdraw(Account account, double money) {
        account.withdraw(money);
        accountRepository.update(account);
        return account.getBalance();
    }

}
