package com.kh.chap04.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	// 기반스트림이 있어야 보조스트림도 존재// 근데 보조스트림 기반 스트림 언제 메모하셨데

	// 기반스트림이 input / output 계열인 경우
	// 보조스트림도 input / output 계열을 사용

	// 기반스트림이 Reader / Writer 계열일 경우
	// 보조스트림도 Reader / Writer 계열을 사용

	// BufferedReader / BufferedWriter

	// 속도향상이 목적인 보조스트림
	// 임시공간을 제공해서 한 번에 입/출력을 진행

	public void outputFile() {

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("d_buffer.txt");
			bw = new BufferedWriter(fw);

			bw.write("하이");
			bw.newLine();
			bw.write("반가워요");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납은 항상 생성의 역순으로 진행
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void inputFile() {
		try (BufferedReader brf = new BufferedReader(new FileReader("d_buffer.txt"))) { // closable 을 implement 하고 있어야
																						// 사용이 가능 (자동으로 닫아주기)

			String str = "";
			while ((str = brf.readLine()) != null) {
				System.out.println(str);
			}

			String text = """ 								
						g하하ㅏ하하ㅏ하하하하
						무쩌라고
						그렇구나



						""";//자바 15부터 가능

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
