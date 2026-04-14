package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {
	
	// 사용자에게 장아지의 정보를 입력받아서
	// 입력받은 강아지의 정보를 출력해주고
	// 강아지와 함께 놀아줄 수 있는 프로그램
	
	
	public void run() {
		System.out.println("\n\n\n\n\n🐶🐶🐶🐶🐶강아지 다마고치🐕🐕🐕🐕🐕");
		Scanner sc /*스캐너 타입의 변수 선언*/= new Scanner(System.in);//스캐너 객체 생성
		//Scanner 객체가 Heap 영역에 올라가 있어야 Scanner 에 있는 메서드를 사용 가능
//		System.out.println(sc);
		Puppy puppy = new Puppy();
		System.out.print("아이구~~ 강아지가 귀여워요 이름이 뭐에요 > ");
		puppy.name = sc.nextLine();
		System.out.print("아이고~~ 무슨 종이에요? > ");
		puppy.species = sc.nextLine();
		System.out.print("아이구~~ 암컷이에요? 수컷이에요? > ");
		puppy.gender = sc.nextLine();
		System.out.print("아이구~~ 몇살이에요? > ");
		puppy.age = sc.nextInt();
		System.out.print("아이구~~ 몸무게가...? > ");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println(puppy.gender);
		
		
		while(true) { 
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
			System.out.println(puppy.name + "의 정보");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 : " + puppy.gender);
			System.out.println("종 : " + puppy.species);
			System.out.println("몸무게 : " + puppy.weight);
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println();//이렇게 출력하면 개행(줄을 바꿈)인데 ""를 출력하거나 ''를 출력하는 거랑 같나?
			
			System.out.println("메뉴를 선택해주세요. > ");
			if(puppy.weight > 10 ) {
				System.out.println("운동을 위해 앉기를 추천드립니다.~ ");
			}
			System.out.print("1. 짖기 / 2. 앉기 / 3. 프로그램 종류 > ");
			int menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 있는 개행문자 날라가 버리기
			
			switch(menuNum) {
			case 1 : puppy.bark(); break;
			case 2 : puppy.sit(); break;
			case 3 : return;
			default : System.out.println("메뉴를 다시 선택해주세요!");
			}
		
		}
		
		
	}
	

}
