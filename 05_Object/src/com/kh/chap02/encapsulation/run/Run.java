package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	// 캡슐화 (encapsulation)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)

	public static void main(String[] args) {
		// 객체 생성 == 메모리(heap)에 적재
		AutoSellingMachine asm = new AutoSellingMachine();
		// 생성자 호출

//		asm.hi();
//		new AutoSellingMachine().hi();
		// 변수 공간에 대입될 수 있는 값은 딱 9가지(null 값 제외)
		// (기본 자료형값들) boolean 리터럴값, char 리터럴값, byte 리터럴값, short 리터럴값, int 리터럴값, long
		// 리터럴값, float 리터럴값, double 리터럴값
		// 주소값 == 아 이거 객체다! (참조 자료형의 리터럴 값인가? 주소값은 리터럴값이라고 부르지 않는다!)

		// 추상화, 캡슐화 상속 다양성

		/*
		 * 
		 * asm.name = "삼양라면"; System.out.println(asm.name); asm.price = 1100;
		 * System.out.println("가격 : " + asm.price + "원"); asm.amount = 50;
		 * System.out.println("남은 수량 : " + asm.amount + "개");
		 * 
		 */

//		asm.재고확인하기();
//		asm.재고채우기();
//		asm.제품판매하기();
//		asm.재고확인하기();

		// 다른 클래스에 대해서 정보가 적으면 좋음 의존성이 낮아야 좋음 서로 안에 있는 것들을 너무 많이 알고 너무 많이 사용하면 수정할 것이
		// 많아지고 유지보수 힘들어짐

		// asm.openMachine();

		// 필드가 외부에서는 보이지 않아서 오류가 발생!
		// 접근제한자를 public 에서 private 으로 변경했기 때문!
		// 직접접근이 불가능 => 간접적으로 접근할 수 있느 방법을 만들어줘야해

		// getter / setter 라는 메소드 구현하기
		// asm.openMachine();
		// 라면가격 1500원으로 세팅하고 싶다.
		asm.setPrice(1500);
		// argument, 인자값, 인수 // AutosellingMuchine에 전달
//		asm.setPrice();
		asm.setname("삼양라면");
		asm.setAmount(50);

		// 함수 == BuiltInFunction
		// 함수는 누구나 수행 가능쓰
		// 자바의 클래스 == 자료형
		// 메소드 == 특정 자료형만 수행할 수 있는 기능(특정 클래스에 내포된 함수, 특정 객체만 수행 가능)
		// ex) 1 + 1 = 2, 3 - 2 = 1
		// "일" - "일" =
		// String dsf = "일" - "일";

//		클래스 안에 클래스는 못만드나
		// new AutoSellingMachine();
		System.out.println(asm.getName());
		String name = asm.getName();
		System.out.println(name);

		Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();

		int amount = asm.getAmount();
		System.out.println(amount);

		int price = asm.getPrice();
		System.out.println(price);
		
		String info = asm.info();
		System.out.println(info);

	}

}
