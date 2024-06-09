package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    private static ApplicationContext con;

    public static void main(String[] args) {
        con = new AnnotationConfigApplicationContext(javaconfig.class);
        Person per = (Person) con.getBean("person",Person.class);
        
        System.out.println("My friends are: " + per.getFriends());
    }

}
 