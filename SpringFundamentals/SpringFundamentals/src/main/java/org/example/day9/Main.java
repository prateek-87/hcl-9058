package org.example.day9;

import org.example.day9.Config.AppConfig;
import org.example.day9.School.Schools;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
       Schools sch =  app.getBean(Schools.class);
       sch.setName("Prateek");
       sch.getStName();
    }
}
