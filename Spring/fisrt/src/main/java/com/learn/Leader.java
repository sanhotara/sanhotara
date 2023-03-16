package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Leader implements Employee{
    //@Autowired //field injection
    //@Qualifier("manager")
    private Employee employee; 
    @Autowired 
    public Leader(@Qualifier("manager") Employee employee)
    {
        this.employee = employee;
    }
    public void doWork()
    {
        System.out.println("I do the work for team leader");
    }
    void getWhoDoWork()
    {
        employee.doWork();
    }
    @Value("${name}")
    private String LeaderName;
    public void PrintLeaderName()
    {
        System.out.println(n);
    }
    @Value("#{'Leader.name'.toUpperCase()}")
    String n;

}
