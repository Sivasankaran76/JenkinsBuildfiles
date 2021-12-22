package com.maven.MavenDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class LoginAspect {
	@Before("execution(* com.maven.MavenDemo.Customerbo.addCustomer())")
	public void logBefore(JoinPoint join) {
		System.out.println(" Lofbefore is running ");
		System.out.println("Hijacked "+ join.getSignature().getName());
		System.out.println("***************");
	}
}
