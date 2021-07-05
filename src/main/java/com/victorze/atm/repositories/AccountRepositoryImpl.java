package com.victorze.atm.repositories;

import com.victorze.atm.entities.Account;
import com.victorze.atm.usecases.interfaces.repositories.AccountRepository;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository {

    List<Account> data = new ArrayList<>();

    @Override
    public void update(Account account) {
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getAccountNumber().equals(account.getAccountNumber())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            data.set(index, account);
        }
    }

    public Account find(String accountNumber) {
        var optionalAccount = data
                .stream()
                .filter(acc -> acc.getAccountNumber().equals(accountNumber))
                .findFirst();
        return optionalAccount.orElse(null);
    }

    public void init() {
        data.add(new Account("1234", 100));
    }

}
