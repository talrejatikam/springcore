package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/config.xml");
	House h  =(House)context.getBean("house");
	System.out.println(h);
	
	
	}

}
