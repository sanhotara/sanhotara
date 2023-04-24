package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appctx = new ClassPathXmlApplicationContext("com/springaop/applicationContext.xml");
        EmployeeManager eManager = appctx.getBean(EmployeeManager.class);
        eManager.getEmployeeById(1);
        ((ConfigurableApplicationContext)appctx).close();
    }
}
