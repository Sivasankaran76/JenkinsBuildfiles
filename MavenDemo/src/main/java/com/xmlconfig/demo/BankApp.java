package com.xmlconfig.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
   private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("bankxml.xml");
       Employee e=(Employee) context.getBean("manage");
       e.doWork();
       Employee e1=(Employee) context.getBean("account");
       e1.doWork();
	}

}
