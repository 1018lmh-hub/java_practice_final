package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Sandwich;

public class PropertiesRun {

	public static void main(String[] args) {
		// 개발을 하다보면 파일은 파일인데 확장자가 .properties 인 파일을 보게 됩니다.
		// 변경하지 않는 설정정보
		// 해당 프로그램이 기본적으로 가져야하 ㄹ정보들을 담는 용도로 많이 사용
		
		Properties prop = new Properties(); // 상속의 잘못된 예로 많이 다뤄짐 면접에서 예시로 고고혓
		
		prop.put("sdfaasdf", new Sandwich("맛있음", "에그마요"));
		prop.setProperty("List", "LinkedList");
		
		try {
			prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//데몬쓰레드?
		
		//2:14

	}

}
