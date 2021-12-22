package com.dependancies.constructor;

import org.springframework.stereotype.Component;

@Component
public class Manager implements EmpInterface {
	Accountant acc;
	public Manager(Accountant acc) {
    	super();
    	System.out.println("Inside manager ");
         this.acc=acc;
	}
	@Override
	public void doWork() {
		System.out.println("I am Manager in com.dependancies.constructor");

	}
    public void callMeeting() {
    	acc.doWork();
    }
	@Override
	public void jobDetail() {
		System.out.println("Job is Manage persons in com.dependancies");
	}

}
