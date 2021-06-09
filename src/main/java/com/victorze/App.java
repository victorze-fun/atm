package com.victorze;

import com.victorze.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        var consoleUI = appContext.getBean(ConsoleUI.class);
        consoleUI.startApp();

        appContext.close();
    }

}
