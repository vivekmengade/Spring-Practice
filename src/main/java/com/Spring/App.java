package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "STARTING" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        Student s1= (Student) con.getBean("stu1");
        System.out.println(s1);
        
        
        System.out.println( "END" );
    }
}
