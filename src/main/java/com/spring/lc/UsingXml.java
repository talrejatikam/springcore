package com.spring.lc;

public class UsingXml {
	private int value;
	private String name;
	@Override
	public String toString() {
		return "UsingXml [value=" + value + ", name=" + name + "]";
	}
	public UsingXml(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UsingXml() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init() {
		System.out.println("init method is called using xml ");
	}
	public void destory() {
		System.out.println("destroy method is called using xml");
	}
}
