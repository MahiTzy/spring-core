package com.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	private static AbstractApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcConfig.xml");
//		Samosa s1 = (Samosa) con.getBean("s1");
//		System.out.println(s1);
		con.registerShutdownHook();
//		
//		Pepsi p1 = (Pepsi)con.getBean("p1");
//		System.out.println(p1);
		Example e1 = (Example)con.getBean("e1");
		System.out.println(e1);

	}

}
