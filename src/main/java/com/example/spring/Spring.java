package com.example.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp1 = ctx.getBean(Employee.class);
        Employee emp2 = ctx.getBean(Employee.class);
        emp1.display();

    }
}