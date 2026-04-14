package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;
import com.kh.chap01.abstraction.view.PuppyCare;

public class Run {
	public static void main (String[] args) {
	
		//현실세계의 강아지 => 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무게 : 8, 성별 : 암컷
		// 강아지 객체 생성해보기
		Puppy puppy = new Puppy();//객체 생성(인스턴스화)
		//new 라는 예약어를 사용
		//Memory heap 영역에 데이터를 생성
		
	//	System.out.println(puppy);//puppy 는 주소값
		//참조자료형은 기본값이 null
	//	System.out.println(puppy.name);// 참조(직접접근)연산자를 사용해서 {point 점 찍다 카리키다.} 
		
		puppy.name = "나폴레옹";
		System.out.print(puppy.name);
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게 : 15, 성별 : 수
		Puppy khan = new/*객체를 만들어냄*/ Puppy();// 배열과 다르게 다른 자료형의 값들을 가질 수 있음 (동종배열이 아님)
		khan/*주소값 그 공간이 객체*/./*그 값을 참조*/name/*해당 객체에 있는 공간, 필드*/ = /*값을 대입*/"징기스칸"/*값*/;
		//그러면 주소를 칭하는 것도 있고 필드를 칭하는 것도 있는데 객체를 칭하는 건 없나? 주소값이 이를 칭하나?
		System.out.println(khan.name);
		
		// 정수값 => 정수 자료형 int short byte long
		// 실수값 => 실수자료형 float double
		// 논리값 => boolean
		
		//현실 세계의 강아지의 값을 담을 자료형이 자바에 존재하지 않음 => 개발자가 직접 강아지 자료형 만듦 => 이 자료형을 칭하는 이름이 클래스
		//대신에 자료형을 만들 때 필요한 것만 넣자 추상화를 잘하자
		// 클래스란? 객체들의 정보(속성과 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세 
		// 붕어빵 틀이나 청사진으로 비유, 구조는 동일 속내용은 다르게 할 수 있다.
		//소프트웨어 == 실체가 없음
		
		//객체 지향 프로그래밍! => 현실세계에서의 개체의 속성과 행위를 가진 객체로 생성하여
		//						객체간의 관계를 맺고 상화작용을 통해 프로그래밍을 하는 개발방법론
		
		puppy.bark(); 
		
		khan.bark();
		
		puppy.weight = 8;/*원하는 리터럴 값을 넣음*/
		khan.weight = 15;
		
		System.out.println(puppy.weight);
		System.out.println(khan.weight);
		khan.sit();
		khan.sit();
		khan.sit();
		System.out.println(khan.weight);
		
		
		
		
		//////////////////////////////////////
		
		
		
		
		PuppyCare pc = new PuppyCare();//1. 자료형 PuppyCare 의 변수 선언 2. PuppyCare 모양의 객체생성하고 3. 그 주소값을 변수 pc에 대입
		pc.run(); //pc 변수 안의 주소값을 참조하여 메소드를 스택에 올라감
		
		//그러면 왜 필드에 리터럴 값을 넣는 건 Run 에서 해야하고 메서드는 Puppy 랑 Run 이랑 둘 다 가능? 
		
		
		
		
		//Class는 자료형이다. 그러면 참조자료형은 다 클라스이이고 대문자로 시작?
		
	}
	
	

}
