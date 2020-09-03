package com.spring.lc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean{
		private int value;
		private String name;
		
	public UsingInterface() {
			super();
			// TODO Auto-generated constructor stub
		}

	public UsingInterface(int value, String name) {
			super();
			this.value = value;
			this.name = name;
		}

	@Override
		public String toString() {
			return "UsingInterface [value=" + value + ", name=" + name + "]";
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

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroyed method using interface");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init state using interface");
		
	}
	
}
