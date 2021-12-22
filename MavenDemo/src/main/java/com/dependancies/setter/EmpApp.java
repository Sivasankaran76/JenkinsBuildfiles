package com.dependancies.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext con=new ClassPathXmlApplicationContext("setterdependancies.xml");
    Employee e =(Employee) con.getBean("emp");
    System.out.println(e);
    
	}

}
