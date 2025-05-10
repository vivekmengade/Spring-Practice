package com.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/StandaloneCollection/Config.xml");
		Books b1 = con.getBean("b1", Books.class);
		System.out.println(b1);
		
		System.out.println("2nd");
		
		Books b2 = con.getBean("b2", Books.class);
		System.out.println(b2);
	}
}
