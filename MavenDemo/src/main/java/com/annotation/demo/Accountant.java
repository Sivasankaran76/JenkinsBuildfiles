package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component("Ac")
public class Accountant implements Employee{

	@Override
	public void doWork() {
		System.out.println("Accountant");
		
	}

}
