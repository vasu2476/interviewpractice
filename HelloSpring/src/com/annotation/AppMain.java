package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.first.HelloWorld;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hello=(HelloWorld)context.getBean(HelloWorld.class);
		hello.setMessage("welcome srinu");
		hello.getMessage();
		
		
	}

}
