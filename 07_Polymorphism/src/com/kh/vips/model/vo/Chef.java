package com.kh.vips.model.vo;

public class Chef {
	private String name;
	public Chef(String name) {
		this.name = name;
	}
	public void cooking() {
		System.out.println("요리시작");
	}
	public void breakTime() {
		System.out.println(name + " 쉬는 시간 ~ ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
