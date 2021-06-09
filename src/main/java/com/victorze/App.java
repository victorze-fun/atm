package com.victorze;

import com.victorze.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(appContext);

        appContext.close();
    }

}
