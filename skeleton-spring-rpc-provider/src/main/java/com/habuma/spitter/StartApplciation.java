package com.habuma.spitter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApplciation {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		new ClassPathXmlApplicationContext("spring-context.xml");
	    
	}
	
}