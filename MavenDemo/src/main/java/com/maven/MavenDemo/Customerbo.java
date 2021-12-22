package com.maven.MavenDemo;

public interface Customerbo {
	
		void addCustomer();

		String addCustomerReturnValue();
		void addCustomerThrowException() throws Exception;
		void addCustomerAround(String name);

		}


