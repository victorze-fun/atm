package com.victorze;

import com.victorze.boundaries.DepositMoneyBoundary;
import com.victorze.boundaries.LoginBoundary;
import com.victorze.boundaries.UserDetailBoundary;
import com.victorze.boundaries.WithdrawMoneyBoundary;
import com.victorze.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUI {

    @Autowired
    private LoginBoundary loginBoundary;

    @Autowired
    private UserDetailBoundary userDetailBoundary;

    @Autowired
    private DepositMoneyBoundary depositMoneyBoundary;

    @Autowired
    private WithdrawMoneyBoundary withdrawMoneyBoundary;

    private Scanner reader;
    private String option;

    private User user;

    public ConsoleUI() {
        reader = new Scanner(System.in);
        option = "";
    }

    public void startApp() {
        do {
            if (loginCorrect()) {
                System.out.println("Login correct!");
                appLoop();
            } else {
                System.err.println("Login incorrect!");
            }
        } while (true);
    }

    private boolean loginCorrect() {
        user = new User("", "", "", null);
        System.out.println("Please enter your username: ");
        user.setUsername(reader.nextLine());
        System.out.println("Please enter your password: ");
        user.setPassword(reader.nextLine());

        return loginBoundary.login(user.getUsername(), user.getPassword());
    }

    private void getUserDetail() {
        user = userDetailBoundary.find(user.getUsername());
    }

    private void appLoop() {
        getUserDetail();
        System.out.println("Account number: " + user.getAccount().getAccountNumber());
        do {
            showMenu();
            option = readOption();
            processOption();
        } while (!option.equals("4"));
    }

    private void showMenu() {
        System.out.println("Choose operation: ");
        System.out.println("1. See available deposit");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }

    private String readOption() {
        return reader.nextLine();
    }

    private void processOption() {
        switch (option) {
            case "1":
                seeAvailableDeposit();
                break;
            case "2":
                depositMoney();
                break;
            case "3":
                withdrawMoney();
                break;
            default:
                break;
        }
    }

    private void depositMoney() {
        Float money = askAmount("Please enter amount for deposit: ");
        depositMoneyBoundary.deposit(user.getAccount(), money);
    }

    private void withdrawMoney() {
        Float money = askAmount("Please enter amount for withdrawal: ");
        withdrawMoneyBoundary.withdraw(user.getAccount(), money);
    }

    private Float askAmount(String message) {
        System.out.println(message);
        return Float.parseFloat(reader.nextLine());
    }

    private void seeAvailableDeposit() {
        user = userDetailBoundary.find(user.getUsername());
        System.out.println("Total deposit: " + user.getAccount().getBalance());
    }

}