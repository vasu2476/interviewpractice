package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String ar[]){
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	HelloWorld hello=(HelloWorld)context.getBean("helloWorld");
	hello.getMessage();
	 context.registerShutdownHook();
}
}
