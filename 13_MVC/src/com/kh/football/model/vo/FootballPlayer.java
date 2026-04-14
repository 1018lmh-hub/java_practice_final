package com.kh.football.model.vo;


// 우리가 UPDATE를 구현해야하는데 record로 구현하면
// 필드에 final 키워드가 붙어 수정이 불가능해지기 때문에
public class FootballPlayer {
	private int id;// 식별값을 저장할 필드 => 자료형 => 실제 들어갈 값 => 1, 2, 3, 4, ++
	private String name; // 이름 저장할 필드 => 자료형?? 뭐하지 고민 => 실제 들어갈 값을 보면 된디 => 크리스티아노 도스 산토스 아베이루 로나르도
	private String position; //포지션 저장할 필드 => 자료형 => 실제 들어갈 값 => 공격수 , 미드필더 , 수비수, 골키퍼
	private Integer backNumber; // 등번호 저장할 필드 => 자료형 => 실제 들어갈 값 => 1234
	
	public FootballPlayer(int id, String name, String position, Integer backNumber) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(Integer backNumber) {
		this.backNumber = backNumber;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "FootballPlayer [id=" + id + ", name=" + name + ", position=" + position + ", backNumber=" + backNumber
				+ "]";
	}

	
	
	
	
	

}
