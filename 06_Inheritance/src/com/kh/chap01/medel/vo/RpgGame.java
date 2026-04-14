package com.kh.chap01.medel.vo;

public class RpgGame {
	private String gameName;
	private String publisher;
	private double maxLevel;
	
	public RpgGame() {
		super();
	}

	public RpgGame(String gameName, String publisher, double maxLevel) {
		super();
		this.gameName = gameName;
		this.publisher = publisher;
		this.maxLevel = maxLevel;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getNextLevel() {
		return maxLevel;
	}

	public void setNextLevel(double maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	public String info() {
		return "게임정보 [게임명 : " + gameName + ", 운영사 : " + publisher + ", 레벨 상한 : " + maxLevel+ "]";

	}
	
}
