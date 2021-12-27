package com.korkuts;

import com.korkuts.configs.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import com.korkuts.quoters.Quoter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Quoter quoter = (Quoter) context.getBean("T1000");
        quoter.sayQuote();
    }
}
