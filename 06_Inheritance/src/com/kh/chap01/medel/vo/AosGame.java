package com.kh.chap01.medel.vo;
//		부모클래스		자식클래스
//		슈퍼클래스		서브클래스
//		상위클래스		하위클래스
//		조상클래스		후손클래스
//		확장클래스		파생클래스

import com.kh.chap02.model.vo.Game;

public class AosGame extends Game {
	private int characterCount;

//	private boolean  isOnline;
	// Source 에서 찾아가기(좌측 상단 3번째)
	// 기본 생성자, 매개변수 생성자
	// 게터, 세터
	// Alt + Shift + s -> o -> Alt + d -> Alt + g
	// 기본생성자 단축키
	public AosGame() {
		
	}

	// Alt + Shift + s -> o -> Alt + g
	// 모든 필드를 매개변수로 갖는 생성자
	public AosGame(String gameName, String publisher, int characterCount) {
		super();
		this.characterCount = characterCount;
	}
	// Alt + Shift + s -> r -> Alt + a -> Alt + r
	// getter setter

	
	//스티커 메모 해놓기
	public int getCharacterCount() {
		return characterCount;
	}

	public void setCharacterCount(String gameName, String publisher, int characterCount) {
		this.characterCount = characterCount;
	}

	public String info() {
		return "게임정보 [게임명 : " + gameName + ", 운영사 : " + publisher + ", 캐릭터 수 : " + characterCount + "]";
	}
}