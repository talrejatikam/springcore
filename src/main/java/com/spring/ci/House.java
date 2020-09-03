package com.spring.ci;

public class House {
	private int plotNo;
	private String owner;
	public House(int plotNo, String owner) {
		super();
		this.plotNo = plotNo;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "House [plotNo=" + plotNo + ", owner=" + owner + "]";
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
