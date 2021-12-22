package com.java.configioc;
import org.springframework.stereotype.Component;

@Component
public class Accountant implements Emp {

	@Override
	public void doWork() {
		System.out.println("Accountant java config");

	}

}
