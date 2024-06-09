package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("config.xml");
		Student std = (Student) con.getBean("std1");
		System.out.println(std);	
		Student std1 = (Student) con.getBean("std2");
		System.out.println(std1);	
	}
}
