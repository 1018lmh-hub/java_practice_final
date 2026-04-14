package com.kh.chap06.run;

import com.kh.chap06.controller.OverloadingController;

public class Run {

	// 메소드! -->
	// 특정 객체가 수행할 수 있는 기능
	// 소프트웨어로 현실세계의 문제를 해결하기 위해서 ==> 웹개발자
	// 우리나라 == 자바 공화국 
	// 너무 오랜 기간동안 자바를 사용함(정형화가 잘 되어있음)
	
	
	public static void main(String[] args) {
//		int result = new MethodController().add(5, 4);
		
		/*MethodController result = new MethodController();
		int a = result.add(1, 2);
		int b = result.add(2, 3);
		int c = result.add(a, b);
		int d = result.add(c, a);
		
		System.out.printf("%d, %d, %d, %d", a,b,c,d);
		System.out.println();
		result.method1();
		String str = result.method2();
		System.out.println(str);
		System.out.println(result.method2());
		System.out.println(result.method3());
		int e = result.method4(46);
		System.out.println(e);
		*/
		
		
		OverloadingController oc = new OverloadingController();// 보통 80글자 넘으면 개행, 그냥 잘리거나 보기 싫으면 ㄱㄱ
		// static, dynamic, automatic(정적, 동적, 자동)
		
		// 정적 바인딩(Static Binding)
		//컴파일이 끝난 시점에 어떤 메소드가 호출될 지 결정
		//컴파일러가 알아서 코드를 분석하여 메소드 호출 연결

		
		int a =30;
		oc.method();
		oc.method(a);
		oc.method("str");
		oc.method(3, 4);
	}
	


		
		
		
	


}
