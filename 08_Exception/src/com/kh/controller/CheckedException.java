package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
	/*
	 * CheckedException 
	 * 
	 * 예외처리를 해야한다는 사실을 체크를 해주는 예외들!!!!!!!!! 
	 * 
	 * C언어는 Unmanaged 언어 입니다. (메모리 관리를 언어가 안해줌)
	 * Java 언어는 Managed 언어 입니다. (메모리 관리를 언어가 해줌)
	 * 
	 * 문법적으로 반드시 예외처리를 해야함
	 * 
	 * 
	 */
	
	public void readString() {
		//사용자에게 문자열을 딱 하나만 입력받아서
		// 입력받은 문자열의 길이를 출력
		// 임시저장공간
		System.out.println("나는 체크드 익셉션");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//CheckedException 에 대한 예외처리 방법
		// 방법 1. try ~ catch 문을 작성한다.
		
		try {
			String str = br.readLine(); //IOException
			System.out.println(str.length());
		} catch(IOException e) { // 주로 외부매체 입 / 출력 시
			e.printStackTrace();
		}
		
		sc.nextLine();
		
//		method();
		
	}
	
	private void method() throws IOException { // throws : (IOException) 에 대한 예외 처리를 메서드 호출하는 곳에서 처리해라 
												// 그래서 빨간줄 뜸, 근데 다른 문법 오류는 왜 빨간줄 뜨지
		System.out.println("아주아주아주아주아주아주아주아주아주아주 위험한 코드");
		throw new RuntimeException("예외발생!!!"); // throw : 사용자가 예외를 발생시키는 코드
	}
	
//	
	

}
