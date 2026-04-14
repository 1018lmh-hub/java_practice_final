package com.kh.chap02.model.vo;

public class FpsGame extends Game {
	private int stress;

	public FpsGame() {}

	public FpsGame(String gameName, String publisher, int stress) {
//		this.gameName = gameName;
//		super.gameName = gameName;
//	    부모 필드의 접근제한자를 protected 로 변경하면 캡슐화 원칙 위반!
//		setGameName(gameName);
//		setPublisher(publisher);
		super(gameName, publisher);
		this.stress = stress;
		
	}

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}
	public String info() {
		return super.info();
	}
	
}
