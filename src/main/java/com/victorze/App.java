package com.victorze;

import com.victorze.boundaries.LoginBoundary;
import com.victorze.boundaries.UserDetailBoundary;
import com.victorze.boundaries.WithdrawMoneyBoundary;
import com.victorze.config.AppConfig;
import com.victorze.entities.Account;
import com.victorze.repositories.AccountRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        var withdrawMoney= appContext.getBean(WithdrawMoneyBoundary.class);
        var account = new Account("1234", 80);
        withdrawMoney.withdraw(account, 50);
        var repo = appContext.getBean(AccountRepository.class);
        System.out.println(repo.find("1234"));

        var userDetail = appContext.getBean(UserDetailBoundary.class);
        var user = userDetail.find("qwerty");
        System.out.println(user);

        var loginBoundary = appContext.getBean(LoginBoundary.class);
        System.out.println(loginBoundary.login("qwerty", "secret"));

        appContext.close();
    }

}
