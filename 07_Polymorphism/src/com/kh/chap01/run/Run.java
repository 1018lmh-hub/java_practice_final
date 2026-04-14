//11:00

package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		// 다형성
		// polymorphism

		Parent p1 = new Parent();
		p1.printParent();
		// p1.pritnChild(); 자식의 맴버는 부모가 사용할 수 없음
		// p1변수로는

		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		// c1변수로는 child1. parent 타입 객체 사용 가능

		// = 를 기준으로 양변의 자료형이 같아야한다.
//	Parent p2 = (Parent)new Child1(); 같은 구조 (Parent) 생략, 형변환
//	Parent p3 = c1;
		Parent p2 = new Child1();
		// 객체를 생성할 때에는 Child1 클래스와 부모 클래스인 Parent 클래스가 같이 Heap 영역에 올라가 있음
		// KlassPointer(객체헤더) 가 클래스 정보를 가르킴 좌측에 있는 자료형을 기준으로 가르키기에 Parent 클래스 내부에 있는
		// 것들(매서드)만 사용이 가능함
		// 클래스랑 매서드는 stack 영역에

		// 양쪽의 자료형이 다름에도 불구하고 대입될 수 있는 이유는
		// 부모클래스인 Parent가 자식 클래스인 Child1에게 자료형을 상속해주었기 때문에
		// Child1 객체가 parent 타입으로 형변환을 수행해서 대입됨

		// 더 많은 것을 가진 클래스가 더 작은 클래스로 변환
		p2.printParent();
		// p2로는 Parent 타입 객체만 사용 가능

		((Child1) p2).printChild1();

		// 부모타입 자료형으로 (여러)자식객체를 다룰 수 있음

		// 질문을 뭘 해야할 지 모르겠다/ 내가 뭘 모르는 지 모르겠다 / 어떻게 해야할 지 모르겠다
		// 질문의 내용을 글로 작성해보자

		/*
		 * 클래스 형 변환
		 *
		 * "상속 구조"일 경우에만 가능
		 * 
		 * 1. UpCasting 자식타입 => 부모타입
		 * 
		 * 2. DownCasting 부모타입 => 자식타입 생략이 불가능함 꼭 명시해줘야함
		 * 
		 */

		// Child1 타입의 객체 두 개, Child2 타입의 객체 두 개
		/*
		 * Child1 child1 = new Child1(); Child1 child2 = new Child1(); Child2 child3 =
		 * new Child2(); Child2 child4 = new Child2();
		 * 
		 * child1.printChild1(); child2.printChild1(); child3.printChild2();
		 * child4.printChild2();
		 */

		// 배열을 써보자
		// 배열 == 한 자료형의 여러 주소값을 관리할 수 있음
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr2[0] = new Child2();
		arr1[1] = new Child1();
		arr2[1] = new Child2();
		// 12:41

		System.out.println("\n\n\n\n\n다형성을 배워볼까?");

		Parent[] arr = new Parent[4];
		arr[0] = new Child1();
		arr[1] = new Child2();
		arr[2] = (Parent) new Child1();
		arr[3] = new Child2();

		for (int i = 0; i < arr.length; i++) {
			

			/*
			 * //12:41 if(arr[i] instanceOf {//instanceOf => true/ false //현재 참조변수가 실질적으로 어떤
			 * 클래스 타입을 참조하고 있었는 지 확인
			 * 
			 * //정적 바인딩, 동적 바인딩, }
			 */
			
			arr[i].print();
			
			/*
			 * 동적바인딩 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩을 수행
			 * 			 실질적으로 참조하는 객체가 해당 메소드를 오버라이딩 했다면 <- 전제조건
			 * 			 프로그램 "실행 시점" 동적으로 자식클래스의 오버라이딩 된 메소드를 호출
			 * 					(Runtime)
			 * 			오버로딩 : 정적 바인딩, 오버라이딩 : 동적 바인딩
			 * 
			 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
			 * 
			 */
			
			
			
			
			
		}

	}
}

/*
 * 상속
 * 
 * 필드 / 메서드 ===> 안중요함 (생성자는 왜 못받지)
 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 * 타입(자료형)
 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */

/*
 * 내가 이해가 부족한 부분 : 상속, 생성자, 배열, 객체 등
 * 
 * 
 * 
 */
