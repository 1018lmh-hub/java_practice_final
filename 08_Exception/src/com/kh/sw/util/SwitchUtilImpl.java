package com.kh.sw.util;

import com.kh.sw.exception.SwitchBoomException;
import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) { // 11:30 다시 보기
		boom();
		s.setOn(!(s.isOn()));
		//현재 on의 필드값 => 돌려주기 전에 반전을 해주어야함
		
		return s.isOn();
	}
	
	/**
	 * 이 메소드는 스위치를 눌렀을 때 폭발 확률을 계산하는 메소드로 
	 * 10% 확률로 SwitchBoomException이 발생함
	 * 
	 * @author 종로 501 이승철
	 * @since 2026-03-27
	 */
	private void boom() {
		//90% 확률로 아무 문제 없음
		//10% 확률로 대폭발
		
		int ran = (int)(100*Math.random() + 1);
		
		if(ran < 11) {
			throw new SwitchBoomException("스위치가 폭발을 일으켰습니다.");
		} 
	}

}
