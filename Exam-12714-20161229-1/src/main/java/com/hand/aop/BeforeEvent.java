package com.hand.aop;


import org.springframework.context.ApplicationEvent;



public class BeforeEvent extends ApplicationEvent {
	private String resource;
	
	public BeforeEvent(String resource) {
		super(resource);
		this.resource=resource;
	}

	
    
}
