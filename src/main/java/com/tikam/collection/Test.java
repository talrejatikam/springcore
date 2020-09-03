package com.tikam.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/tikam/collection/collection_config.xml");
Employee emp = (Employee) context.getBean("employee1");

System.out.println(emp);
	}

}
