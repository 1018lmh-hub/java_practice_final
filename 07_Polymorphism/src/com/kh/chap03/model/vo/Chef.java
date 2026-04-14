package com.kh.chap03.model.vo;
/*
 * 클래스 내부에 추상메소드를 한 개라도 선언하는 순간
 * 클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의해야함
 * 
 * 추상클래스 == 필드 + 메소드 + 추상메소드(생략가능)
 * 
 * -> 추상메소드가 존재하지 않아도 추상클래스로 정의할 수 있음
 * 
 * => 구현 도중 해당 클래스가 구체적으로 구현된 상태가 아닌 것 같다~ 라는 생각이 들면 추상클래스로 선언
 * 
 * => 개발자가 생각했을 때 이 클래스로는 부모클래스 역할만 할 것이고 객체 생성은 불가능해야한다!1 라는 생각이 들면
 * 	  추상 클래스로 선언
 * 
 * 
 * (잘 만들진 않지만 사용은 많이 함)
 * 추상 클래스 abstract 권장하지 않는 이유 :
 * 상속 권장하지 않음
 * 추상 메서드를 구현하는 인터페이스라는 친구가 있다.
 * 
 * 
 */

public abstract class Chef {
	private String name;
	public Chef(String name) {
		this.name = name;
	}
	public void cooking() {
		System.out.println("요리해야지");
	}
	public void breakTime() {
		System.out.println(" 쉬는 시간입니다~ ");
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}

	
	//이 메소드는 단순히 자식 클래스들이 오버라이딩하기 위해서 사용하는 용도입니다.
	//public void cooking(){}
	
	//추상화 => 추상메소드
	//			"abstract" <==> "implement"
	
	//다형성 저장시키기용 추상 클래스
}
