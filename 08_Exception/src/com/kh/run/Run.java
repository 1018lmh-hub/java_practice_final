package com.kh.run;

import com.kh.controller.CheckedException;
import com.kh.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 
		 * 에러(Error) == Bug
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러
		 * 				=> (심각) 소스코드로 해결이 안됨
		 * 
		 * 
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드 상에서 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드를 수정해서 해결이 가능(빨간 줄로 알려줌)
		 * 				난이도 : 쉬움
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러. 문법적으로는 문제가 없음
		 * 				=> 사용자가 개발자가 의도한대로 입력값을 넣어주지 않을 가능성이 높지만..?	
		 * 				=> 개발자가 이러한 상황을 미리 예측해서 처리해주어야함!(예외 처리!!!)
		 * 				난이도 : 중간
		 * 
		 * - 로지컬 에러 : 소스코드 상 문제 없음, 실행했을 때도 문제없이 잘 돌아감
		 * 				=> 의도와는 다르게 동작
		 * 				난이도 : 어려움
		 * 
		 * 예외(Exception) : 시스템 에러를 제외한  나머지 컴파일, 런타임, 로지컬 에러와 같이 비교적 덜 심각한 애들
		 * 		  그 중에서도 주로 런타입 에러를 의미한다
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		UncheckedException ue = new UncheckedException();
//		ue.divZero();
//		ue.code();
//		int num = ue.multiCatch();
//		System.out.println(num);
//		ue.orderByCatch();
		
		
		CheckedException ce = new CheckedException();
		ce.readString();
		
		
		
		
	}

}
/*
 * 			오버로딩			|			오버라이딩
 * 
 * 		하나의 클래스 내부에서	|		상속구조의 자식클래스에서
 * 
 * 		메서드의 이름이 같음 		|		메서드의 이름이 같음 
 * 		매개변수가 다름			|	자식클래스의 메서드를 호출
 * 		기능이 여러개			|		기능이 한개
 */


// 자바를 공부할 때 무언갈 만드는 것이 참 좋다
// 그냥 주변에 보이는 걸 막 만들라고 하면 막연하니
// 어떻게 만들 지 생각을 해야한다.
// 요구사항 식으로 생각하면 편하다. ~~ 해주시고요. ~~필요해요 ..

// Run main,  패키지 controller, service, view, VO, 		인터페이스(얘는 클래스인가?) interface
// 각각 왜 분리하는 지 어떤 것들이 들어가야하는 지 등등 생각해보고 찾아보기


