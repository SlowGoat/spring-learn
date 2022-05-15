package com.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.pojo.User.*(..))")
    public void before(){
        System.out.println("========方法执行前=========");
    }
    @After("execution(* com.pojo.User.*(..))")
    public void after(){
        System.out.println("========方法执行后=========");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.pojo.User.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("========环绕前=========");

        Signature signature = pj.getSignature();//获得签名
        System.out.println("signature："+signature);//打印调用的方法
        //执行方法
        Object proceed = pj.proceed();

        System.out.println("========环绕后=========");
    }
}
