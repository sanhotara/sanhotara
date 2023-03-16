package com.learn;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component //The scanned component is treated as a bean, 
//if we do not mark this class with annotation "@Component", we can declare the bean in config class
@Lazy //Do not create the bean until it was invoked
@Primary //Choose this bean as a default if multiple beans are autowired
public class Accountant implements Employee{
	
	public Accountant() {
		System.out.println("Inside Accountant Constructor");
	}
	public void doWork() {	
		System.out.println("Audit the accounts...");
	}
}
