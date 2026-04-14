package com.kh.chap03.escape;

import java.util.Scanner;

public class EscapeBreak {

	
	/*
	 * 주의 사항 : switch 문 내부에 작성하는 break; 문과는 구분을 해야함!
	 * 			switch 문 내부에 있는 break 는 switch 문을 빠져나가는 용ㄷ로 사용
	 * 
	 * break : break 문을 만나는 순간 " 가장 가까운 반복문"을 빠져나감
	 * 			break; 문이 속해 있는 반복문 "한 겹"을 빠져나감
	 */
	
	public void method1() {
		//무한 반복을 돌리면서
		//매 번 사용자에게 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력
		//단, 사용자가 입력한 문자열 "exit"dhk rkxekaus qksqhrdmf whdfy
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("글자수 체크(종료하고 싶으면 'exit'를 입력하세요) >")	;
			String keyword = sc.nextLine();
			System.out.println(keyword + "은(는)" + keyword.length() + "글자 입니다!");
			
			if(keyword.equals("exit")) {
				break; // 반복문만 빠져나감
//				return; // 메서드 끝으로 나감(메인 메서드에서는?)
			}
		}
		
		System.out.println("다음에 또 오세요~~");
	}
	
	/*
	 * continue : 반복문 안에서 사용하는 문법
	 * 
	 * 반복문 안에서 continue 를 만나면 이후에 모든 코드를 pass
	 * 반복문 최상단 scope 로 이동
	 */
	
	public void checkId() { 
		
		System.out.println("회원가입 서비스입니다.");
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 아이디값을 입력 받을 것인데 10 글자가 넘으면 다시 입력하게 할 것.
		//								10 글자가 넘지 않으면 다음 파트로 진행할 것
	
		// 지시 연산자는 문자열 말고 문자나 정수 실수에 못쓰나? int num = 3; num.length
		
		while(true) {
			System.out.print("아이디를 입력해주세요 ()10글자 이하 > ");
			String userId = sc.nextLine();
			
			if(userId.length() <= 10) {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			} else { 
				System.out.println("아이디는 10자 이하만 사용 가능합니다");
				continue; //돌아가는 시점이 여기 ㅇ
			}
			
			
		}// continue가 없으면 돌아가는 시점이 여기
	
	
		System.out.println("비밀번호를 어쩌고.");
	}

	
	
}
