package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		// File 클래스를 가지고 File 작업을 해보자~~
		// java.io 패키지에 존재
		
		File file1 = new File("abc.txt");
		
		//파일 만들기
		try {
			file1.createNewFile();

			//폴더 만들기
			File folder = new File("folder");
			// directory
			// makeDirectory
			folder.mkdir();
			
			//경로지정
			File file2 = new File("folder/test.txt");
			file2.createNewFile();
			
			//파일 클래스에서 제공하는 여러가지 메소드들
			System.out.println("파일인가요?? : " + file2.isFile());
			System.out.println("파일명은 뭔가요? : " + file2.getName());
			System.out.println("파일의 절대 경로는 뭔가요?? : " + file2.getAbsolutePath()); 
			System.out.println("파일의 크기는 얼만가요?? : " + file2.length());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		//실행 후 프로젝트 클릭 F5누르기
		


	}

}
