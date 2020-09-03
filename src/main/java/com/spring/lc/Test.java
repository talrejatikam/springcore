package com.spring.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/spring/lc/config.xml");
	UsingXml ux = (UsingXml) context.getBean("usingXml");
	  System.out.println(ux);
	context.registerShutdownHook();
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	UsingInterface ui = (UsingInterface) context.getBean("usingInterface");
	System.out.println(ui);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	 System.out.println(context.getBean("usingAnnotation"))  ;
	}

}
