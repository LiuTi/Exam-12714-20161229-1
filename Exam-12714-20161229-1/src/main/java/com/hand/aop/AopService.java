package com.hand.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 
 * @author violet
 *
 */
@Component
@Aspect
public class AopService {
	//返回值类型  类名  方法名    
	@Pointcut("execution(* com.hand.service.*.*(..))")
    public void run(){
    }

   /* @Before("run()")
    public void before(ProceedingJoinPoint pdjp) throws Throwable{
        Object o=pdjp.proceed();
        System.out.println("before insert film data");
    }*/
    @Around("run()")
    public Object around(ProceedingJoinPoint pdjp) throws Throwable{
        Object o=pdjp.proceed();
        return o;
    }
/*
    @After("run()")
    public void after(ProceedingJoinPoint pdjp) throws Throwable{
        Object o=pdjp.proceed();
        System.out.println("before insert film data");
    }*/


}
