package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {
    @Before("execution(* EmployeeManager.getEmployeeById(..))")
    public void logBeforeV1(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUAspect.logBeforeV1()"+ joinPoint.getSignature().getName());
    }
}
