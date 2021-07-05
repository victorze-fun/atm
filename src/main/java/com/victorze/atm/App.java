package com.victorze.atm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new ClassPathXmlApplicationContext("services.xml");

        var consoleUI = appContext.getBean(ConsoleUI.class);
        consoleUI.startApp();

        appContext.close();
    }

}
