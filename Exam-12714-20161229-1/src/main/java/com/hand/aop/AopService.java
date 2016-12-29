package com.hand.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * 
 * @author violet
 *
 */
@Component
@Aspect
public class AopService {
	@Autowired
    private ApplicationContext applicationContext;
	
	//返回值类型  类名  方法名    
	@Pointcut("execution(* com.hand.service.*.*(..))")
    public void run(){
    }

    @Before("run()")
    public void before(){
    	BeforeEvent beforeEvent = new BeforeEvent("Before Insert Film Data");
        applicationContext.publishEvent(beforeEvent);
    }

    @After("run()")
    public void after(){
    	AfterEvent afterEvent = new AfterEvent("After Insert Film Data");
        applicationContext.publishEvent(afterEvent);
    }


}
