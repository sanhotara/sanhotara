package com.learn;

import org.springframework.context.annotation.Lazy;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Component("manager") : 
//By default, if we specify the name of the class (lower case the first letter) in @Qualifier such as @Qualifier("manager"), Spring still understand without complaining about bean's name
//To be more explicit, we can declare a name for a bean, then use it with the @Qualifier annotation
@Lazy
public class Manager implements Employee{
	
	//Accountant accountant;
	
	//@Autowired
	//public void setAccountant(Accountant accountant) {
	//	this.accountant = accountant;
	//}
	public Manager()
	{
		System.out.println("Manager constructor");
	}
	public void doWork() {
		System.out.println("Manage the branch office");
	}
	
	//public void callMetting() {
	//	accountant.doWork();
	//}
}
