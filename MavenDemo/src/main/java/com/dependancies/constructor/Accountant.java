package com.dependancies.constructor;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements EmpInterface {
    Accountant(){
    	System.out.println("Accountant constructor");
    }
	@Override
	public void doWork() {
		System.out.println("do  Accountant Work" );

	}

	@Override
	public void jobDetail() {
        System.out.println("Your job is accontant");

	}

}
