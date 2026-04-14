package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.lang.*; 항상 기본적으로 되어있기에 해당 패키지에 있는 클래스랑 메서드를 사용 가능(자주 쓰는 애들이 들어있음)

public class UncheckedException /*extends Object*/ {
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * RuntimeException
	 * 
	 * NullPointerException : 주소값이 있을거라 예상하고 객체를 참조했더니 null 값이 들어있는 경우 발생하하는 예외
	 * ArrayInexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * 
	 * InputMismatchException : 입력버퍼의 값이 자료형과 일치하지 않을 때 발생하는 예외
	 * ...
	 * 
	 * 개발자가 예측이 가능함
	 * 
	 * ClassCastException :  허용할 수 없는 형변환을 진행할 경우 발생하느느 예외
	 * 
	 */
	
	// ArithmeticException
	public void divZero() {
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램입니다!");
		System.out.print("첫번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 > ");
		int num2 = sc.nextInt();
		/* 문제가 일어나지 않게 원천 차단
		if(num2 != 0) {	
			System.out.println("연산 결과 : " + (num1 / num2));
		} else {
			System.out.println("0은 나누기 연산을 수행할 수 없습니다.");
		}
		*/
		
		//예외처리 : 예외상황을 감지하고 예외상황 발생 시 -> 예외를 막는 게 아님 
		// 			프로그램이 비정상적인 종료가 되는 것을 방지하고 적절한 대응 조취를 취하는 모든 절차
		
		// 예외처리 구문
		/*
		 * try ~ catch 문
		 * 
		 * try {
		 * 		(num1 / num2) 예외가 발생할 수도 있는 구문
		 * } catch(발생할예외클래스명 변수명) {
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * }
		 * 
		 * 
		 */
		
		try {	
			System.out.println("연산결과 : " + (num1 / num2));
		} catch(ArithmeticException e) {
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수 없습니다.");
		}
		//예외클래스명을 다른 걸 어덯게 넣지 다른 클래스 아닌가 메서드나 생성자가 아니라 문법이라 괜찮나
		
		sc.close();
		System.out.println("메소드 호출 끝 ~~");
		
		
		
	}
	public void code() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.print("1번 또는 2번을 입력해주세요.");
			int menu = 0;
			try {
				menu = sc.nextInt();
			sc.nextLine();
			
			} catch(InputMismatchException ime) {
				System.out.println("정수를 입력해주세요.");
			}
			System.out.println(menu + "번 메뉴를 선택하셨습니다.");
			
			
//			
//			try {
//			int menu = sc.nextInt();
//			sc.nextLine();
//			System.out.println(menu + "번 메뉴를 선택하셨습니다.");
//			} catch(InputMismatchException ime) {
//				System.out.println("정수를 입력해주세요.");
//			}
//			
//			가능은 하지만 프린트 문이 아닐 때 빙글빙글 돌 수 있다? 뭐 암튼 문제가 생길 수 있고, int menu를 밖에 빼는 게 좋아보임
			
			
			
		}
	}
	public int multiCatch() {
		
		Scanner sc = new Scanner(System.in);
			// 사용자에게 정수값을 하나 입력받아서
			// 100을 사용자가 입력한 정수값으로 나눈 결과를 출력
		
		System.out.print("정수를 입력해주세요 > ");
//		int num = 1;
//		try {
//		num = sc.nextInt(); //자료형이 int 형이 아닌 값이 들어올 시
//								//InputMismatchException이 발생
//		} catch(InputMismatchException e) {
//			
//		}
//		try {
//		System.out.println("결과 : " + (100 / num)); //num에 대입된 값이 0 일 시
//													//ArithmeticException이 발생	
//		} catch(ArithmeticException e) {
//			
//		} 번거로움
		
	// int num = sc.nextInt();
//		sc.close();이거를 밖으로 빼면 안되나 왜 안되지
		try {
			int num = sc.nextInt();
			
//			System.out.println("결과 : " + (100 / num));	
//			sc.close();
			return(100 / num);
		} catch(InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
//			sc.close();
			return 0;
		} catch(ArithmeticException e) {
			System.out.println("0이 아닌 정수값을 입력해주세요.");
			return 0;
		} finally {//리턴하기 적전 무조건 finally 블럭을 수행 
			sc.close();
		}
		//multiCatch
	
		}
	
	public void orderByCatch() {
		//배열
		//사용자에게 정수값을 입력받아서
		//입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
		// 이 배열의 100번째 인덱스에 대입되어있는 기본값을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 > ");
		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지 않는다면
		// NegativeArraySizeException : 배열의 크기를 음수로 할당하려고 하면
		// ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면
		
		try {
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println(arr[100]);
	
		} catch(ArrayIndexOutOfBoundsException e) {
		
		} catch(NegativeArraySizeException e) {
			
		} catch(InputMismatchException e) {
			
		} catch(RuntimeException e) { // 부모클래스로 다형성, 그래서 이를 먼저 사용하면 자식클래스의 일들을 이미 처리한 상태이기에 마지막에 사용
			
			e.printStackTrace(); //개발단계에서만 사용, 프로그램 종료가 아니라 오류 코드를 추적해서 콘솔창에서 확인할 수 있음
			System.out.println("정수값을 입력해주세요");
		} finally {
			sc.close();
		}
		
	}
	
	
	
	
	}
	


