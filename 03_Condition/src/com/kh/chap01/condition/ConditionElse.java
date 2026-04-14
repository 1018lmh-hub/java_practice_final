package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식의 결과가 true일 경우 실행할 코드 - a
	 * } else { 
	 * 		조건식의 결과가 false일 경우 실행할 코드 - b
	 * }
	 * 
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 * 
	 * 
	 * 
	 */
	
	//특정 조건에서 한영키가 안눌리거나 키가 씹히는 이유가 잇으려나
	
	public void method1() {
		
		// 핸드폰 번호 뒷자리 입력받아서
		// 당첨자 번호랑 같으면 추카포카 아니면 다음 기회에
		
		// 당첨 핸드폰 번호 뒷자리 => 1339
		
		//사용자에게 핸드폰 번호 뒷자리를 입력받아서
		//당첨 핸드폰 번호와 일치한다면 추카포카를 출력해주고
		// 				일치하지 않는다면 다음 기회에 출력
		
		Scanner sca = new Scanner(System.in);
		System.out.print("휴대폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNumber = sca.nextLine();
//		System.out.println(phoneNumber);
		
		// 어떤 값을 가지고 	사용자가 입력한 폰번호 == phoneNimber / "7777"
		// 어떤 연산 							동등비교
		// 문자열 값을 비교하고 싶을 때 : ==(동등비교연산자)의 경우 기본타입 자료형 8개 끼라만 사용가능하기 때문에
		//							equals()라는 메소드를 호출해서 비교해주어야함
		//							문자열 값이 일치할 경우 true를 반환 일치하지 않을 경우 false를 반환
		if(phoneNumber.equals("7777")) {
			System.out.println("축하합니다~ 백만원 상품권 당첨입니다~~");
		} else {
			System.out.println("아쉽지만 다음 기회에ㅔ~~");
		}
		/*
		 * if문의 조건식 결과가 true일 경우 => if Scope가 끝나면 else Scope를 건너 뜀
		 * if문의 조건식 결과가 false 일 경우 => if Scope를 건너뛰고 else Scope로 진입
		 * 불필요한 연산이 줄어든다! => 처리속도가 향상됨!
		 */
	}
	
	/*
	 * if ~ else if 문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1) {
	 * 		조건식 1이 true일 경우 실행할 코드
	 * } else if(조건식2) {
	 * 		조건식 2가 true일 경우 실행할 코드
	 * } else if(조건식3) {
	 * 		조건식 3이 true일 경우 실행할 코드
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드;
	 * }
	 * 
	 */
	public void method2() {
		// 핸드폰 뒷자리를 입력 받아서 1둥, 2등 ,3등 , 아쉽지만 미당첨 출력해주기
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷자리를 입력해주세요. >");
		String phoneNumber = sc.nextLine();
//		System.out.println("사용자가 입력한 폰 번호 : " + phoneNumber);
		String message = "등 당첨 축하드려요 ☆";
		int num = 0;
		if(phoneNumber.equals("7777")) {
			System.out.println("일" + message);
		} else if(phoneNumber.equals ("6666")) {
			System.out.println("이" + message);
		} else if(phoneNumber.equals("5555")) {
			System.out.println("삼" + message);
		} else {
			System.out.println("꾸앙 입니돠.");
		}
		
//		if(phoneNumber.equals("7777")) {
//			num += 1;
//		} else if(phoneNumber.equals ("6666")) {
//			num += 2;
//		} else if(phoneNumber.equals("5555")) {
//			num += 3;
//		} else {
//			System.out.println("꾸앙 입니돠.");
//		}
		
		
		//그래서 이제 뭐함? --> 머리가 하얘짐 -->
		// 만약에 사용자가 입력한 값이 7777이면 일등 추카포카 출력해줘야지
		
		
		
	}
	
	
	public void ageCheck() {
		
		/*
		 * 사용자에게 나이(정수)를 입력받고
		 * 입력받은 나이에 따라서 각기다른 내용을 출력해주세요/.
		 *  1 ~ 12	: 어린이 입니다.
		 * 13 ~ 17	: 청소년입니다.
		 * 18 ~		: 성인입니다.
		 * 0. -		: 잘못입력하셨습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요.(ex : 15) >");
		int age = sc.nextInt();
//		System.out.println(age + "살 입니다.");
//		if(0 < age && age <=12) {
//			System.out.println("어린이 입니다.");
//		} else if(12 < age && age <= 17) {
//			System.out.println("청소년 입니다.");
//		} else if(17 < age) { 
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//		
		
		if(age < 0) {
			System.out.println("올바른 나이를 입력해주세요");
		} else if (17 < age) {
			System.out.println("성인입니다.");
		}if(0 < age && age <=12) {
			System.out.println("어린이 입니다.");
		} else if(12 < age && age <= 17) {
			System.out.println("청소년 입니다.");
		}
		

	
	
	
	
	}
}
