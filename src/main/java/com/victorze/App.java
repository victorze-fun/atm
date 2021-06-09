package com.victorze;

import com.victorze.boundaries.DepositMoneyBoundary;
import com.victorze.boundaries.UserDetailBoundary;
import com.victorze.config.AppConfig;
import com.victorze.entities.Account;
import com.victorze.repositories.AccountRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        var depositMoney = appContext.getBean(DepositMoneyBoundary.class);
        var account = new Account("1234", 100);
        var balance = depositMoney.deposit(account, 50);
        var repo = appContext.getBean(AccountRepository.class);
        System.out.println(repo.find("1234"));

        var userDetail = appContext.getBean(UserDetailBoundary.class);
        var user = userDetail.find("qwerty");
        System.out.println(user);

        appContext.close();
    }

}
