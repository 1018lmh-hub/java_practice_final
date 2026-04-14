package com.kh.sw.controller;

import com.kh.sw.model.vo.Switch;
import com.kh.sw.util.SwitchUtil;
import com.kh.sw.util.SwitchUtilImpl;

//지금은 service 의 역할도 같이 수행, 메서드를 원래 서비스에서
public class SwitchController {

	private Switch s = new Switch(false);// boolean의 기본값이 false 이고 필드가 하나여서 불필요하긴 함 안좋은 코드
	
	
	//
	public boolean toggleSwitch() {
		SwitchUtil su = new SwitchUtilImpl();
		boolean on = su.toggle(s);
		return on;
	}
	

}
