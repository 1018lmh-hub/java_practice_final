package com.kh.vips.model.vo;

public class MainPartChef extends Chef {
	public MainPartChef(String name) {
		super(name);
	}
	
	
	

	@Override
	public void cooking() {
		System.out.println(getName() + "고기 구워요");
	}
	public void breakTime() {
		System.out.println("요리 끝");
	}
}
