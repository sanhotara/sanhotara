package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeCRUDAspect {
    @Before("execution(* EmployeeManager.getEmployeeById(..))")
    public void logBeforeV1(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUAspect.logBeforeV1()"+ joinPoint.getSignature().getName());
    }
    @After("execution(* EmployeeDTO.*(..))")
    public void logAfterAll(){
        System.out.println("EmployeeCRUAspect.logAfterV1() called");
    }
    @AfterReturning(pointcut = "execution(* EmployeeManager.getEmployeeById(..))", returning = "retVal")
    public void logAfterReturn(Object retVal){  //Must implement with parram Object 
        System.out.println("Returning: "+retVal.toString());
    }
    @AfterThrowing(pointcut = "execution(* EmployeeDTO.throwsException(..))", throwing = "ex")
    public void logAfterThrowException(IllegalArgumentException ex){    //Must implement with parram of an exception 
        System.out.println("The following exception is raised: "+ ex.toString());
    }
    @Pointcut("execution(* EmployeeDTO.getlastName(..))")
    public void selectGetLastName(){
        System.out.println("Using pointcut for getlastName() method");
    }
    @Around("selectGetLastName()")
    public void logAroundGetlastName(ProceedingJoinPoint pJoinPoint) throws Throwable { //Must implement with parram ProceedingJoinPoint 
        System.out.println("Around: Log before processing getlastName() method");
        pJoinPoint.proceed();
        // pJoinPoint.getArgs();
        System.out.println("Around: Log after processing getlastName() method");
    }
}
