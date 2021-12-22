package com.java.configioc;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Emp {

	@Override
	public void doWork() {
	System.out.println("Manager java config");
	}

}
