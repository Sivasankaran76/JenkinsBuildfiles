package com.annotation.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bankapp {
	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("anotationexample.xml");
		    
//		Accountant ac = (Accountant) context.getBean("account");
//		ac.dework();
//		
		Employee e = (Employee) context.getBean("Manager");
		e.doWork();
		
		Employee f = (Employee) context.getBean("Ac");
		f.doWork();
				
		

	}

}