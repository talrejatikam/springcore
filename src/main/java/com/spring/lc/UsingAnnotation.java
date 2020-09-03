package com.spring.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
	private int phone;
	private String name;
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UsingAnnotation [phone=" + phone + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method using annotation");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destory method using annotation");
	}
	
}
