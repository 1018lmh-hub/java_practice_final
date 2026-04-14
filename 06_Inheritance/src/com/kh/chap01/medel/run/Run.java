package com.kh.chap01.medel.run;

import com.kh.chap01.medel.vo.AosGame;
import com.kh.chap01.medel.vo.FpsGame;
import com.kh.chap01.medel.vo.RpgGame;

public class Run {
	
	// 5시부터
	
	public static void main(String[] arg) {
		RpgGame rg = new RpgGame("와우", "블리자드", 80);
		AosGame ag = new AosGame("롤", "라이엇게임즈", 170);
		FpsGame fg = new FpsGame("배틀그라운드", "크래프톤", 100);
		
		System.out.println(rg.info());
		System.out.println(ag.info());
		System.out.println(fg.info());
	}
	
}

/*
 * 상속의 아주 이론적인 이야기
 * 
 * 클래스들마다 중복된 코드들을 전부 다 하나하나 기술하다보면
 * 코드를 수정하거나 추가하는 유지보수시 전부 한땀 한땀 고쳐야하는 어려움이 있음
 * 
 * 상속이라는 개념을 적용하면
 * 매 클래스마다 중복된 필드, 메소드들을
 * 단 하나의 클래스로 만들어두고(정의를 해두고)
 * 해당 클래스를 상속 받아서 중복을 없앨 수 있음
 * 
 * 
 * 
 */

