package com.kh.chap03.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// FileWriter : 파일로 데이터를 2Byte 단위로 출력하는 스트림
		
		/*
		 * try ~ with ~ resource 구문
		 * 
		 * try(스트림객체생성) {
		 * 		예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e) {
		 * 		예외처리 구문;
		 * }
		 * 
		 * 블럭이 종료되는 시점에 close()를 호출해서 자동으로 자원반납
		 */
		try(FileWriter fw = new FileWriter("c_char.txt")) {
			fw.write("문자스트림은 이렇게도 나가요~~");
			fw.write("입출력 재미가 있다~~");
			fw.write("易");
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void writeDiary() {
		
		// 사용자에게 다이어리 내용을 입력받아서
		// 외부파일로 출력
		
		//내보낼 파일명 : 2026년 03월 30일 오늘의 다이어리.txt
		Date now = new Date();
		System.out.println(now);   
//		Mon Mar 30 12:27:39 KST 2026 <- 이렇게 찍힘
		// 2026년 03월 30일 <- 이렇게 뽑고 싶음
		String title = new SimpleDateFormat("yyyy년 MM월 dd일").format(now);
		System.out.println(title);
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append("오늘의 다이어리");
		
		
		
		try(FileWriter fw = new FileWriter(sb.toString());
				Scanner sc = new Scanner(System.in)) {
				System.out.print("다이어리를 작성해보세요~ > ");
				String content = sc.nextLine();
				fw.write("오늘의 다이어리 내용 : \t" + content);		
			} catch(IOException e) {
				e.printStackTrace();
			}
				
		
	}

}
