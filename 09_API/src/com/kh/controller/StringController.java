package com.kh.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 => 불변
	
	public void method1() {
		
//		String abc = "350829yutjnea98g84";
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		//이렇게 하지 않아도 되는 이유 상속
		Run run = new Run();
		System.out.println(str1);
		System.out.println(run);
		System.out.println(str2.toString()); 
		//1. String 클래스의 toString() 의 경우
		// 실제 담겨있는 문자열 value 값을 반환하게끔 오버라이딩
		
		// equals()
		System.out.println(str1.equals(str2));
		Run run2 = new Run();
		System.out.println(run.equals(run2));    
		// 2. 문자열 value 를 비교하도록 오버라이딩
		
		
		//hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		// 해시충돌 비둘기집, 이외에 파일 메모리 문제? 3:45
		
		//System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		
		
		
	}
	
	
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";

		//toString()
		System.out.println(str1);
		System.out.println(str2);

		//equals()
		System.out.println(str1.equals(str2));   

		//hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		//identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		System.out.println(str1 == str2); 
		
	}
	
	public void method3() {
		//어찌하여 이 둘은 다른가?
		String str1 = new String("hello"); // 절대 금지 문법
		String str2 = "hello";			   // 절대 허용 문법
		
		// 문자열 리터럴은 대입연산자를 사용해 대입할 때
		// String Pool(heap) 영역에 등록됨
		// StringPool : 동일한 내용의 문자열 value 가 존재할 수 없음
		
		System.out.println(System.identityHashCode(str2));
		str2 += "bye"; // 근데 이건 메소드도 아니고 연산자인데 새로운 객체를 만들어서 String pool 에 올리는 게 가능한건가? byte 배열이라 숫자? 라 가능한가, 배열은 더하기 연산이 안되죠
		// constant pool 에서? 
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
	}
	
	public void method4() {
		
		StringBuffer sb = new StringBuffer();
		String str = "Hello" + "World"; // 그냥 변수 선언 대입 없이 그냥 "문자열" 만 그냥 사용이 가능한 이유는 뭘까 그러면 얘도 주소를 가지고 참조도 되나 // 객체라 가능
		char a = 'a';
		char b = 'b';
		System.out.println(a + b);
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);
		
		//문자열임시저장공각
		//문자열이 불변객체라서 내용물 변경이 일어나면 계속 새로운 공간을 할당해서 올릴 것
		// 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡담았다가 한번에 처리하는 클래스
		
		StringBuilder sr = new StringBuilder();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		//동시제어기능(Thread-Safe), StringBuffer 는 이게 내장되어 있음
		//Thread t;
		//Tomcat, Jetty -> 서버들에서 제공이 많이 되고 있음
		// 충돌나겠다! 가 아니라면 굳이 구현할 필요가 없음
		
	}
	
	public void method() {
		
		String str1 = "은총알은 없다.";
		
		// 1. 문자열.length()
		// 문자열의 길이를 반환
		
		System.out.println("str1의 길이 : " + str1.length()); //아 그러면 length 가 가능한 것도 byte 배열이라 그러네 그러니까 글자수를 세는 게 가능하지
		
		String userId = "argoihaei";
		//아이디 8자에서 ~ 20자
		if (!(8 <= userId.length() && userId.length() <= 20)) {
			throw new RuntimeException("아이디 글자수 어쩌고 저쩌고");
		}
		
//		2. 문자열.charAt() : char
		char ch = userId.charAt(0);
		System.out.println(ch);
		
//		 
		String phoneNumber = "010-1234-5678";
		// 3. 문자열.substring(int beginIndex) : String
		System.out.println(phoneNumber.substring(3));
		System.out.println(phoneNumber.substring(3,13));
	
		// 4. 문자열.indexOf(String) : int
		//								"은총알은 없다"
		System.out.println(str1.indexOf("없"));
		System.out.println(str1.indexOf("없다"));
		System.out.println(str1.indexOf(""));
		System.out.println(str1.indexOf(" "));
		
		// kim@kh.co.kr
		String[] emails = {"hong@kh.com", "kim@kh.com", "lee@kh.com", "hahahoho@kh.com"};// String 은 byte 배열이니까 숫자 배열로도 사용할 수 있나 혹은 문자 배열이나
		System.out.println(emails[0].substring(0, 4));
		System.out.println(emails[1].substring(0,3));
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0,emails[i].indexOf("@")));
		}
		
		String fileName = "sdfsdf.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));
		
		String fileName2 = "sd.ahre.sterh.asdf.png";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		
		// 문자열.toCharArry() : char[]
		String ch1 = "배열로만들문자열";
		char[] chArr = ch1.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		for(char c: chArr) {
			System.out.println(c);
		}
		//char[] -> String
		System.out.println(String.valueOf(chArr));
		
		//new String 의 존재 이유 생성자 어찌고
		
		String replaceStr = "KH 아카데미";
		//문자열.replace(Str, Str) : String
		System.out.println(replaceStr.replace("KH", "더조은"));
		
		// 문자열.toUpperCase() -> 싹 다 대문자로 변환
		//	   .toLowerCase() -> 싹다 소문자로 변환
		String lowerStr = "abcd";
		String upperStr = "ABCD";
		System.out.println(lowerStr.toUpperCase());
		System.out.println(upperStr.toLowerCase());
		
		/*
		 * String str1 = "11,22,33,44";
		 * String str2 = "22,44,66,88";
		 * 
		 * 
		 */
		
		// 문자열 분리시키기
		String split = "갈비,갈비찜,곽만근갈비찜,관만근어얼큰갈비탕";
		
		String[] galubi = split.split(",");
		System.out.println(Arrays.toString(galubi));
		
		// java.util.StringTokenizer 클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(split, ",");
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		*/
		
		while(stn.hasMoreTokens()) { // 남아있는 토큰이 있다면 true / 없다면 false 로 반환
			System.out.println(stn.nextToken());
		}
			
		}


	
	}
	
	


