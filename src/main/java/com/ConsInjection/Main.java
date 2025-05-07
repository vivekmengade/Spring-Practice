package com.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/ConsInjection/cons.xml");
//		Employee e1=con.getBean("emp1", Employee.class);
//		System.out.println(e1);
		
		
		Employee e2=con.getBean("emp2", Employee.class);
		System.out.println(e2);
	}
}
