package com.annotation.demo;

import org.springframework.stereotype.Component;

import com.xmlconfig.demo.Employee;
@Component("Manager")
public class Manager implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println("Manager");
	}

}
