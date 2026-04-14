package com.kh.second;

public class Run {

	public static void main(String[] args) {
		
		//printMyName();
		//클래스 외부에서 메서드를 선언해서 문법오류가 일어남. 
		//클래스 외부에서 호출하는 방법
		
		/*
		 * 외부 클래스의 메소드를 호출할 때는 메소드가 존재하는 클래스를 생성(new) 해줘야함!
		 * 
		 * [ 표현법 ]
		 * "클래스 이름" "클래스 이름을 대신할 별칭" = new "클래스 이름()";
		 *  
		 *  
		 */
		Printcontroller pc = new Printcontroller();
		pc.printMyName();
		// .
		// 참조 연산자 / 직접접근연산자
		
	}

}
