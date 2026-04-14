package com.kh.chap04.controller;

/*
 * 필드 == 맴버변수 == 인스턴스 변수 == 속성
 * 
 * 클래스를 구성하는 요소중에 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 블록 안에 존재
 * 
 * 필드(맴버변수, 인스턴스 변수)
 * 
 * 생성시점 => new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 소멸시점 => 객체가 소멸 될 때 => GC이 동작을 안하면 OOM(Out of Memory) 발생
 * 
 * static 필드(클래스변수)
 * 
 * static 이라는 예약어가 붙어있는 필드(static == meta space)
 * 
 * 			=> ClassLoader
 * 생성시점 => static 필드 호출 시점 MetaSpace(static)에 올라감
 * 소멸시점 => 블록이 종료되면, 프로그램이 종료되면 소멸 => 보다 정확한 설명 : 프로그램 종료 후에 ClassLoader를 GC가 소멸시키는 시점
 * 
 * 지역변수
 * 
 * 생성시점 => 특정 영역 ( { } ) 내부에서 선언되는 시점에 메모리 영역에 할당 -> stack
 * 소멸시점 => 특정 영역( { } )가 종료될 때 =>stack 메모리에서 소멸하는 시점에
 * 
 * 
 * 
 * 
 */

public class FieldController {
	
	public static String str = "static";
	// static 영역에 있어서 객체 생성 안하고 사용할 수 있는건가? O
	// 프로그램 구동 중 계속 값을 사용하기 위해 씀
	
	public static final String JAVA_VERSION = "21"; //final 상수값을 정하기 위해서
	//public final static 
	
	// static	: 프로그램 전체에서 공유
	// final	: 절대 못바꿈
	// 무조건 선언과 동시에 초기화를 진행 해야함!
	
	public int global; //필드
	
	public void checkVariable(int parameter/*매개변수*/) {
		int local; // 지역변수
		local = 1;
		
		System.out.println(global);	//필드
		System.out.println(local);	//지역변수
		System.out.println(parameter);	//매개변수(지역변수)
		
		
		
		//Python AI LLM 추가 학습 예정
		
	}

}
