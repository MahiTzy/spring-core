package com.springcore.consinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/springcore/consinjection/ciconfig.xml");
		Person person = (Person) con.getBean("person");
		System.out.println(person);

	}

}
