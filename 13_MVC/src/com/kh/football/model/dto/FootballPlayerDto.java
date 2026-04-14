package com.kh.football.model.dto;

// DTO : Data Transfer Object													DDD <-- 요놈 알아보기
//		  값		전송		객체
// DTO : 순수하게 데이터를 옮겨담을 용도로 만드는 클래스
//		DTO						/		VO
// 		값의 전송					/		값을 담음							
//		setter O				/		setter X (불변)
//		코드 안넣음				/	equals(), hashCode(), 비즈니스로직		--> record 에는 equals(), hashCode(), final 달려있어서 상황에 따라서 DTO 에 사용하기도 하고 안하기도 함
//		극단적으로가면 필드를 public	/	 필드를 final 로 선언					--> record 에는 setter 도 존재해서 VO 에 사용하기도 하고 안하기도 함 // 상황 보고 VO/ DTO에 사용 결정 당연히 둘 다 사용안할 수도 잇음

// 서비스단에서 처리해야하는 비즈니스 로직을 VO 에서 처리하기도 하는데 예시로 변수에 예외처리나 특정 조건들에 대해서 처리해야하면 해당 변수에 책임을 분리하기 위해서 변수에 대한 클래스를 따로 만들기도 함 

// DTO ㅣ 순수하게 데이터를 옮겨담을 용도로 만드는 클래스
public class FootballPlayerDto {	// DTO 클래스를 만들 때 record 로 만드는 경우 많음
	// 필드, 기본생성자, 매개변수생성자, getter / setter --> 평소에  vo에 만들었는데 vo에 만들면 안됨 그리고 setter를 만들면 안됨 vo 내부의 값은 불변이어야 함 final 활용
	private String name;
	private String position;
	private int backNumber;
	
	public FootballPlayerDto() {
		super();
	}
	
	public FootballPlayerDto(String name, String position, int backNumber) {
		super();
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
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

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	
	

}
