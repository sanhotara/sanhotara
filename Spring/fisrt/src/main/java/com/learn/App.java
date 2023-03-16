package com.learn;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		//Manager manager =  context.getBean(Manager.class);
		//manager.callMetting();
		Leader leader = context.getBean(Leader.class);
		leader.getWhoDoWork();
		leader.PrintLeaderName();
		((AbstractApplicationContext) context).close();
	}
}
