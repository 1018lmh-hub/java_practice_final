package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * (단일) if 문
	 * 
	 *  [ 표현법 ]
	 *  
	 *  if(조건식) {
	 *  	조건식이 true일 경우 실행하고자 하는 코드
	 *  }
	 *  
	 *  => 조건식의 결과값이 true일 경우 : if문 Scope({})안의 코드가 수행
	 *  => 조건식의 결과값이 false일 경우 : if문 Scope({})를 건너뜀!
	 *  
	 *  조건식에는 최종적으로 true / false 가 나와야함(현시점 들어갈 수 있는 건 비교 연산자, 논리연산자를 배움)
	 * 
	 */
	
	public void method1() { 
		
//		System.out.println("메소드가 잘 수행되는가?");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작습니다.");
		}
		//if 문의 조건식 자리에는 결론적으로 true아니면 false값이 들어가도록 만들어야함!
		//if를 만나면 뒤의 괄호 안으로 들어가서 조건검사를 진행한다.
		if(true) { 
			System.out.println("이 코드는 if 문을 만나면 무조건 수행되는 코드");
		}
		if(false) {
			System.out.println("이 코드는 if 문을 만나면 절대 동작하지 않는 코드");
		}

	}
	
	public void quiz() {
		
		int count = 0;
		int wrongCount = 0;
		int prob = 0;
		
		// 문제를 출력해준 뒤	
		System.out.println("문제 : 고양이는 호랑이과다.");
		// 사용자에게 o 또는 x를 입력받아서
		Scanner sca = new Scanner(System.in);
		System.out.print("정답을 o 또는 x로 입력해주세요 > ");
		char answer = sca.nextLine().charAt(0); // o/x
		if ((answer == 'x') || (answer == 'X')) {
			System.out.println("정답입니다.");
			count++;
		}
		// 숏 서 킷
//		if (answer == 'x') {
//			System.out.println("정답입니다.");
//		}
//		if (answer == 'X') {
//			System.out.println("정답입니다.");
//		}
		
	// 코드의 중복이 발생 => 유지보수를 어렵게 함 => 중복을 제거해주면 아주 좋음
		
		if ((answer == 'o') || (answer == 'O')) {
			System.out.println("오탑입니다.");
			wrongCount++; 
		}
		if(!((answer == 'o') || (answer == 'O') || (answer == 'x') || (answer == 'X'))) {
			System.out.println("O 또는 X를 입력해주세요.");
		}
		
		prob++;
		// 정답입니다~/ 오답입니다~ 를 출력해주는 퀴즈 프로그램
		// 1. 무슨 값을 가지고 =>사용자ㅏ 입력한 값 == answer
		//							'x', 'o'
		// 2. 무슨 연산을 하지 => ==
		//사용자가 입력한 값이 x와 같다면
		// 1절 소문자로 체크하기 => 대문자로 입력해도 정답 오답 처리 해주세요.
		System.out.println("문제 : 여우는 개과일까요?");
		System.out.print("정답을 o / /x로 입력해주세요 > ");
		answer = sca.nextLine().charAt(0);
		
		if((answer == 'o') || (answer == 'O')) {
			System.out.println("정답입니다.");
			count++;
		}
		if((answer =='x') || (answer == 'X')) {
			System.out.println("오오답입니다!!!!!!!!!!!");
			wrongCount++;
		}
		if((answer != 'X') && (answer != 'x') && (answer != 'o') && (answer != 'O')) {
			System.out.println("O 또는 X를 입력해주세요.");
		}
		
		prob++;
		
		//문제 카운트를 o,x말고 다른 것을 입력했을 때 증가시키지 않기, 그렇다면 x,o가 들어간 구간에서만 카운트(prob++)를 넣기
		//o,x말고 다른 문자를 입력하면 문제 다시 내기 continue를 사용해야함
		//그렇다면 continue를 사용하지 않고 가능할까?
		
		//반복 시키고 break는 넣어야함 그러면 원하는 행동을 했을 때 다음으로 넘어가고 원하는 행동을 안하면 반복시키면 되겠네
		
		
		// 총 몇 문제 풀었고 -> 정답은 몇 개 -> 오답은 몇 개
		//	저장 -> 출력
		// 세가지를 출력!!!!!
		
		//	경우의 수 사용가자 입력한 값이 x,X,o,O일 경우--> 빠짐
		// O 또는 X를 입력해주세요
		//1. 무슨 값을 가지고? (answer) /
		//2. 무슨 연산
		
		// 정규표현식(JavaScript)을 쓰면 빠르게 
		
		
		System.out.printf("총 %d 문제 풀었습니다.", prob);
		System.out.printf("퀴즈 끝 ~ 정답 %d개, 오답 %d개 입니다!", count, wrongCount);
	}
	

}
