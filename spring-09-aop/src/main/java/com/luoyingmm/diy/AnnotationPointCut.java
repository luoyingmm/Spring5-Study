package com.luoyingmm.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.luoyingmm.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前123");
    }

    @After("execution(* com.luoyingmm.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后123");
    }

    @Around("execution(* com.luoyingmm.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
