package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Employee emp = (Employee) con.getBean("employee");
		System.out.println(emp);

	}
}
