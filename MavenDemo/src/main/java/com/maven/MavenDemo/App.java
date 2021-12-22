package com.maven.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
   
		/*
		 * @SuppressWarnings("resource") ApplicationContext context=new
		 * ClassPathXmlApplicationContext("spring-module.xml"); Sentence s=(Sentence)
		 * context.getBean("sentence"); s.setSentence("Sivasankaran");
		 * s.printSentence(); Employee emp=(Employee)context.getBean("employee");
		 * emp.print_City();
		 */
    @SuppressWarnings("resource")
	ApplicationContext con=new ClassPathXmlApplicationContext("demo.xml");
    Customerbo cb=(Customerbo) con.getBean("cust");
    cb.addCustomer();
  }
}
