package com.hand.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.hand.aop.BeforeEvent;

public class EventListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
	        if(event instanceof BeforeEvent){
	            System.out.println(event.getSource());
	        }
	}
}
