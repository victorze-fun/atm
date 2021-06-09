package com.victorze;

import com.victorze.config.AppConfig;
import com.victorze.entities.Account;
import com.victorze.usecases.DepositMoney;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        var depositMoney = appContext.getBean(DepositMoney.class);
        var account = new Account("1234", 100);
        var balance = depositMoney.deposit(account, 50);
        System.out.println(balance);

        appContext.close();
    }

}
