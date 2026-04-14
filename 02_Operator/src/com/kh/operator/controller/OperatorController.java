package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {

	public void arithmetic() {
		// 산술연산자 -> 이항연산자, 우선순위
		// +, -, *, /
		// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구하는 연산
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num1 + num2 : " + num1 + num2);
		System.out.println("num1 + num2 : " + (num1 + num2));
		int sum = num1 + num2;
		System.out.println("num1 + num2 : " + sum);
		System.out.print("num1 + num2 : ");
		System.out.println(num1 + num2);
		System.out.printf("num1 + num2 : %d\n", num1 + num2);

		System.out.println("num1 - num2 : " + (num1 - num2));

		System.out.println("num1 * num2 : " + (num1 * num2));
		// *, /, %, -> 우선순위가 +, -보다 높기 때문에 묶어주지 않더라도 먼저 연산을 수행하나
		// 다른 개발자들의 가독성을 위해 괄호를 사용하는 것을 권장!
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));

		// 조심해야할 부분
		// System.out.println(10/0);
	}

	public void test() {
		System.out.println("메소드를 호출할 때 꼭 메인에서만 불러야하는 것은 아닙니다.!");

	}

	// 사탕 개수 구하기 프로그램 구현하기
	// 메소드 : presentToStudent()

	// 사용자에게 값을 입력받으세요. <= Scanner
	// 1. 나눠줄 학생의 수 <=nextInt();
	// 2. 사탕개수 <=nextInt();

	// 1인당 받을 수 있는 사탕의 개수: 사탕개수 / 학생 수 <= 산술 연산자
	// 남은 사탕의 개수 : 사탕 개수 % 학생 수 <=산술 연산자

	// 출력형식
	// 학생 한명당 받을 수 있는 사탕 개수 : X개 <== println();
	// 남은 사탕 개수 : X 개 <== println();

	public void presentToStudent() {
		Scanner sca = new Scanner(System.in);

		System.out.print("학생 수를 입력해주세요 > ");
		int students = sca.nextInt();
		System.out.println("학생 수 : " + students + "명");
		System.out.print("사탕 개수를 입력해주세요 > ");
		int candies = sca.nextInt();
		System.out.println("사탕 개수 : " + candies + "개");

		int result = candies / students;
		int mod = candies % students;
		sca.close();

//		System.out.println("학생 한명당 받을 수 있는 사탕의 개수 : " + (candies/students));
//		System.out.println("남은 사탕의 개수 : " + candies%students);

		System.out.println("학생 한명당 받을 수 있는 사탕의 개수 : " + result + "개");
		System.out.println("남은 사탕의 개수 : " + mod + "개");
	}

	public void inDecrease() {
		/*
		 * 증감연산자 : 단항연산자로 한번에 1증가하거나 / 1감소하는 연산을 함
		 * 
		 * [ 표현법 ]
		 * 
		 * ++ : 값을 1 증가 시킴 -- : 값을 1 감소 시킴
		 * 
		 * =>증감을 먼저 할건지, 아니면 나중에 할건지에 따라 연산자의 위치가 달라짐
		 * 
		 * 전위 연산 : ++값, --값 --> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리 후위 연산 : 값++, 값-- --> 먼저 값을
		 * 처리하고나서 증가하거나 감소
		 * 
		 */

//		int num = 10;
//		System.out.println(num); // -> 10
//		
//		num++;
//		System.out.println(num); // 11
//		num--;
//		System.out.println(num); //10
//		System.out.println(num++); //10
//		System.out.println(num++); //11
//		System.out.println(num); // 12

		int num = 10;
		int number = num++;

		System.out.println("num : " + num);
		System.out.println("number : " + number);

	}
	// 1번 102행
	// 1. num 이라는 식별자를 가진 int형 변수공간을 할당
	// 2. 정수형 리터럴 값 10
	// 3. 대입

	// 2번 103행
	// 1. number라는 식별자를 가진 int형 변수공간을 할당
	// 2-1. num이라는 변수공간에 대입된 리터럴 값을 가져옴
	// 2-2. num이라는 변수공간의 값을 1증가
	// 3. 가져온 리터럴 값을 number 공간에 초기화

	public void compound() {
		/*
		 * = 대입연산자 산술연산자에 대입연산자를 합친 연산자 : 복합 대입 연산자 자기자신과 해당 산술연살을 수행한 후 그 결과를 자기자신에게 다시
		 * 대입하는 용도 += -= *= /= %=
		 * 
		 */
		int endDay = 128;
		System.out.println(endDay);
		endDay = endDay - 1;
		System.out.println(endDay);
		endDay -= 1;
		System.out.println(endDay);
	}
	
	public void logicalNagation() {
		/*
		 * 논리 부정 연산자 : 논리값 (true, false)을 반대로 바꿔주는 연산자
		 */
		
		System.out.println(!true);
	}
	
	public void comparison() {
		
		/*
		 * 관계 연산자(비교 연산자)
		 * 
		 * 두 개의 값을 가지고 비교하는, 이항 연산자
		 * 비교연산을 한 결과 -> true, false
		 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것
		 * 
		 * 종류
		 * 
		 * 1. 동등비교 : 일치함을 비교
		 * 비교는 의?문 으로 해석하라
		 * 
		 * a == b : a와 b가 일치합니까?
		 * a != b : a와 b가 일치하지 않습니까?
		 * 
		 * 2. 대소비교 : 크고 작음을 비교
		 * 
		 * a < b : a가 b보다 작습니까?
		 * a > b : a가 b보다 큽니까?
		 * a <= b : a가 b보다 작거나 같습니까?
		 * a >= b : a가 b보다 크거나 같습니까?
		 * 
		 * 결과값은 true / false
		 */
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println(firstNumber < secondNumber);
		System.out.println(firstNumber == secondNumber);
		
		System.out.print("firstNumber가 짝 수 입니까?");
		
		// true가 출력이 되도록 연산을 해야함
		// 나는 무슨 값을 가지고 연산을 해야하는 가! => firstNumber
		// 무슨 최종 연산을 해야하는 가!				=> 비교연산
		// 짝스특) 2의 배수(2로 나눴을 때 나머지가 0 과 같음)
		//
		
		System.out.println(firstNumber % 2 == 0);

	}
	
		public void logical() {
			/*
			 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
			 * 
			 * [ 표현법 ]
			 * 논리값 논리연산자 논리값 => 논리값
			 * 
			 * 종류
			 * 
			 * 1. AND 연산 : 논리값 && 논리값
			 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
			 * 
			 * 
			 * 2. OR 연산 : 논리값 || 논리값
			 * 좌항과 우항의 값이 하나라도 true일 경우 최종 결과값이 true
			 * 
			 */
			// 계획
			// 1. 사용자에게 한 개의 정수값을 입력받음
			// 2. 입력한 정수 값이 0보다 크면서 짝수인지 연산
			// 3. 그리고 나서 결과를 출력
			
			
			Scanner sca = new Scanner(System.in);
			System.out.print("정수 값을 입력해주세요. >");
			int userNumber = sca.nextInt();
			System.out.println("입력한 정수는 " + userNumber + "입니다.");
			boolean result = (userNumber > 0) && (userNumber % 2 == 0);
//			System.out.println("입력값이 0보다 크면서 짝수인가요? > " + result);
			System.out.printf("입력값이 0보다 크면서 짝수인가요? > %b ", result);
			
//			System.out.println("해당 정수는 0보다 크면서 짝수입니다 : " + ((userNumber > 0) && (userNumber % 2 == 0)));
			sca.close();
		}
			public void andOper() {
				//	사용자에게 정수값을 하나 입력받아서
				//	입력받은 정수값을 변수에 대입한 뒤 
				//콘솔값에 출력해보세요.
				Scanner sca = new Scanner(System.in);
				System.out.print("정수값을 입력하세요. > ");
				int num = sca.nextInt();
				System.out.printf("입력된 정수 값은 %d 입니다.", num);
				sca.close();
			}
			
			
			//사용자가 입력한 정수가 1~ 10 사이의 값인지 확인하기
			
			public void range() {
				Scanner sca = new Scanner(System.in);
				System.out.print("정수값을 입력하세요 > ");
				int num = sca.nextInt();
				System.out.printf(" 정수값은 %d 입니다.", num);
				boolean result = (1 <= num) && (num <=10);
				System.out.println("입력값이 1부터 10 사이의 값 입니까?" + result);
				sca.close();
				
			}
			
			public void orOper() {
				// 사용자에게 한 글자를 입력 받아서
				// 입력받은 글자가 'A'또는 'a'인지 확인해서 출력하기
				Scanner sca = new Scanner(System.in);
				System.out.print("꼭 꼭 꼭 한 글자만 입력해주세요 >");
				char letter = sca.nextLine().charAt(0);
				boolean result = (letter == 'a') || (letter == 'A');
//				System.out.println(letter);
				System.out.println("사용자가 입력한 값이 에이인가요? > " + result);
				sca.close();
				
				
				
			}
			
			//삼항 if switch for, for문 객체지항 hard 
			
			/*
			 * 삼항 연산자 : 피 연산자가 3개
			 * => 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 쓰임)
			 * 
			 * [ 표현식 ]
			 * 조건식? 조선식이 true일 경우 결과값: 조건식이 false일 경우 결과값
			 * 
			 * 조건문 : 값에 따라 연산을 처리하는 방식
			 * 			결과값이 true일 경우 첫 번째 문장을 처리~~
			 * 			결과값이 false일 경우 두 번째 문장을 처리~~
			 * 
			 * 
			 * 
			 */
			
			// 치킨
			public void triple() {
				System.out.println("깐부치킨에 오신 것을 환영합니다!");
				System.out.println("1. 회장님의 입맛 그대로 AI치킨");
				System.out.println("2. 바삭한 식스팩 치킨");
				System.out.println("3. 치킨의 근본 후라이드 치킨");
				
				// ctrl + shift + o (import 자동완성 단축키, import java.util.Scanner;)
				Scanner sca = new Scanner(System.in);
				
				System.out.print("메뉴 번호를 입력해주세요 > ");
				int menuNo = sca.nextInt();
				// 계획
				// 사용자가 메뉴번호로
				// 1번을 입력하면 회장님의 입맛 그대로 AI치킨을 주문하셨습니다.
				// 2번을 입력하면 바삭한 식스팩 치킨을 주문하셨습니다.
				// 3번을 입력하면 치킨의 근본 후라이드 치킨을 주문하셨습니다.
				// 라고 출력
				// 1번, 2번, 3번이 아니면 없는 메뉴를 주문하셨습니다.
				// 라고 출력
//				System.out.println(menuNo);
				
				String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다."
								: menuNo == 2 ? "빠싺한 식스팩 치킨을 주문하셨습니다." 
								: menuNo == 3 ? "치킨의 근본 후라이드 치킨을 주문하셨습니다."
								: "없는 메뉴를 주문하셨습니다.";
				
				
				
				System.out.println(selected);
				
				
				
				
				
				
				
				
				
				
//				if (menuNo == 1) {
//					System.out.println("회장님의 입맛 그대로 AI치킨을 주문하셨습니다.");
//				}
//				else if (menuNo == 2) {
//					System.out.println("바삭한 식스팩 치킨을 주문하셨습니다.");
//				}
//				else if (menuNo == 3) {
//					System.out.println("치킨의 근본 후라이드 치킨을 주문하셨습니다.");
//				}
//				else { 
//					System.out.println("없는 메뉴를 주문하셨습니다.");
//				}
//				
//				
				
			}
			
			/*
			 * 
			 */
			
			
			
			
			
		
}
	
	
	
	
	
	
	
	
	
	
	
	
