package com.kh.chap02.loop;

public class LoopWhile {
	/*
	 * while 문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; //필수는 아님
	 * 
	 * while(조건식) { 반복적으로 실행하고자 하는 코드; 증감식; // 필수는 아님 }
	 * 
	 * while 문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드를 실행;
	 * 
	 * for => 개발자가 반복을 몇 번 해야할 지 명확하게 알고 있다. while => 개발자가 몇 번 반복할 지 가늠할 수 없다.
	 * 
	 * 무한반복하는 용도로 사용할 예정
	 * 
	 */

	public void method1() {
		// 초기식 조건식 증감식
		int i = 0; // 초기식
		while (i < 3) { // 조건식
			i++; // 증감식
			System.out.println(i);
		}
	}

	public void method2() {
		// 1~10까지의 합계를 구해서 출력
//		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

	public void method3() {

		/*
		 * 1부터 시작해서 1~10사이의 임의의 정수까리를 모두 더한 합계를 출력 random : 무작위 Randim이라는 클래스가 존재하지만
		 * Math라는 클래스가 가지고 있는 random()를 호출해서 만들어 볼 예정
		 * 
		 * Math math = new Math();
		 */

		double number = Math.random();
		System.out.println(number);
//		System.out.println(Math.random());

		// 0.9177169316043065
//		0.8612894874245819
		// random()의 결과값은 : 0.0 ~~~0.999999999999999
		// 16자리
		System.out.println(number * 10);
		// 10을 곱한 결과를 int형으로 강제형변환
		System.out.println((int) (number * 10));
		// (number * 10)을 괄호로 묶어주지 않으면 강제형변환이 number에 적용되어서 0.0 ~ 0.9999... 를 강제형변환 해
		// 결과값이 0 * 10이 된다.
		// 10을 곱한 결과를 int형으로 강제형변환을 해준 뒤 정수값 1을 더해줌
		// 1 ~~~ 10
		System.out.println((int) (number * 10) + 1);

		int randomNum = ((int) (Math.random() * 100/* 범위 */) + 200/* 초기값 */);/* 어떤 값부터 어떤 값까지의 랜덤 숫자를 얻는 방법 */
		System.out.println(randomNum);

		int i = 1;
		int sum = 0;

		while (i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.printf("\n1부터 %d 까지 더한 결과 : %d", randomNum, sum);
	}

	// 다시 해보기 while 안에 넣었는데 오류 남(중복이 발생했을 때 랜덤을 다시 돌려야하믈 while 안에 넣어야함)
	public void lotto() {
		while (true) {
			int num1 = (int) (Math.random() * 45) + 1;
			int num2 = (int) (Math.random() * 45) + 1;
			int num3 = (int) (Math.random() * 45) + 1;
			int num4 = (int) (Math.random() * 45) + 1;
			int num5 = (int) (Math.random() * 45) + 1;
			int num6 = (int) (Math.random() * 45) + 1;

			if (num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6 && num2 != num3
					&& num2 != num4 && num2 != num5 && num2 != num6 && num3 != num4 && num3 != num5 && num3 != num6
					&& num4 != num5 && num4 != num6 && num5 != num6) {
				System.out.printf("오늘의 운세~ %d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
				break;
			} else
				continue;
		}
	}

}

//public void method00() {
//int i = 1;
//while(i <= 10) {
//	i += i;
//	System.out.println(i);
//	i++;
//	
//	}
//}
