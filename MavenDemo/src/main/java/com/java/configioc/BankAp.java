package com.java.configioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankAp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager employee = context.getBean(Manager.class);
		employee.doWork();
		context.close();
	}
}
