package com.kh.sw.model.vo;

public class Switch {
	private boolean On;
	
	public Switch(boolean on) {
		On = on;
	}

	public boolean isOn() {
		return On;
	}

	public void setOn(boolean on) {
		On = on;
	}

	@Override
	public String toString() {
		return "Switch [On=" + On + "]";
	}

	
	

}
