package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public void check() {
		
		FieldController fc = new FieldController();// new 도 메서드인가?
		// 1. FieldController라는 자료형으로 fc라는 지역변수를 선언
		// 2. 객체 생성(new 키워드를 만났을 때) -> global 맴버변수 할당
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		//System.out.priontln(fc.local);
		
		
		fc.checkVariable(5);// checkVariable호출 ==> parameter(매개변수) 할당 및 초기화
		//checkVariable 호출 종료!
		//parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		
		fc = null;// global은 접근 불가능
		// 주소값과 연결된 변수에 null 을 넣어서 객체와의 연결을 끊음 객체 안에 있는 필드를 사용할 수 없음
		
		System.out.println(fc.global);
		
		System.out.println(FieldController.JAVA_VERSION); // static 키워드를 가진 녀석들의 올바른 방법
		//11:33 재확인 색이랑 볼드 기울어진 것들에 따라서 구분, 그리고 연결해서 해당 것들을 만든 클래스 찾아가는 거 어떻게 하지
		//
//		System.out.println(fc.JAVA_VERSION); // 바람직한 방법이 아님
//		System.out.println(Math.PI); 
//		static 을 사용해 메모리를 아낌, 객체를 생성해 Heap 영역을 사용하는 건 메모리를 잡아먹음
		//														Java 가 아닌 C를 사용해서
		
		/*
		 * AccessModifier(접근제한자 / 접근제어자)
		 * 
		 * public => 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능 
		 * 
		 * protected => 같은 패키지라면 무조건 접근 가능!
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근 가능
		 * 			 => 07번 프로젝트에서 배울 것
		 * 
		 * default(package friendly) => 나랑 같은 패키지에서만 접근 가능
		 * 
		 * private => 오직 클래스 내부에서만 접근 가능
		 * 
		 */
		
	
	}

}
