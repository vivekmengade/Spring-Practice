package com.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/CollectionInjection/config.xml");
		Vehicle v = con.getBean("V1",Vehicle.class);
		System.out.println(v.getCname().getClass().getName());
		System.out.println(v.getData().getClass().getName());
		System.out.println(v.getPrice().getClass().getName());
		
	}
}
