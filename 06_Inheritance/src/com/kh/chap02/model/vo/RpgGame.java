package com.kh.chap02.model.vo;
//			자식클래스 extends 부모클래스
public class RpgGame extends Game {

	// 부모로부터 상속받은 부분은 기술하지 않는다.
	private int maxLevel;
	
	public RpgGame() {}
	public RpgGame(String gameName, String publisher, int maxLevel) {
		//gameName,publisher -> 부모클래스 필드에 대입
		//maxLevel ->내 필드에 대입
		super(gameName, publisher);
		this.maxLevel = maxLevel;
	}
	
	//메소드를 상속받았는데 마음에 안듭니다! 발전을 시키고 싶음
	//다시 쓸 수 있음 ===> 재정의
	
	//자식 클래스에 메소드를 재정의 했을 경우
	//☆★☆★☆★자식클래스에 재정의한 메소드가 우선권을 가져서 호출됨!!!!☆★☆★☆★☆★
	public int getMaxLevel() {
		return maxLevel;
	}
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	
	
	
}
