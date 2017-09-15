package com.kholodok;

import com.kholodok.implem.T1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");
        T1000 robot = (T1000)app.getBean("t1000");
        robot.dance();
        robot.fire();
    }
}
