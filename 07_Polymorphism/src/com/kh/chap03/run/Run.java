package com.kh.chap03.run;

import com.kh.chap03.controller.Cooking;
import com.kh.chap03.controller.CookingController;
import com.kh.chap03.controller.Pasta;
import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {
	public static void main(String[] args) {
		
		MainChef mc = new MainChef("이승철");
		mc.cooking();
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		
//		Chef c = new Chef();
		//추상클래스로 선언되었기 때문에 객체 생성이 불가능함
		
		Chef[] c = {mc, sc};
		for (int i = 0; i < c.length; i++) {
			c[i].cooking();
		}
		
		
		CookingController pc = new CookingController();
		pc.pastaCooking();// CookingCOntroller 클래스에 의존
		
		Cooking cook = new Pasta();
		cook.cooking(); // Cooking 클래스에 의존
		
		//4:00
		
		
		//꼮 기억해야하는 내용
		// 다형성 : 부모클래스를 자료형으로 여러 자식객체를 다룰 수 있음 * 내 코멘트
		// 다형성 : 부모타입자료형으로 여러 자식객체를 다룰 수 있음 * 선생님 코멘트
		//객체 바깥에서 모르게 하려고 (정보 은닉하려고)
		//의존성 주입할 때 처음부터 다시 설명
		
		/*
		 * 소프트웨어 개발자들의 목표
		 * 
		 * 코드 수정이 쉬움, 기능 추가가 쉬움, 기능 교체도 쉬움(유지보수)
		 * 
		 * 객체지향언어에서는 위 목표를 수행하기 위해서
		 * 숨기는 방법을 택함 {캡슐화, 상속, 다형성 등을 이용}(클래스 즉, 자료형까지 숨김)
		 * 
		 */
		
	}
	

}
