package com.kh.chap03.model.vo;

public class Receipt {
	//가격, 결제방법, 상점명
	
	private int price;
	private String payment;
	private String storeName;
	private String date;
	
	
	//자바에서 날짜를 저장할 수 있는 JDK에서 제공되는 클래스
	
	// 생성자부 -> 월요일에 만나요!
	
	// 메소드부
	// getter() / setter() / info()
	
	
	//->
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	/*
	 * public void setPayment() {
		String payment;
		this.payment = payment;
	}
	가 안되는 이유?
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getPrice() {
		return price;
	}
	public String getPayment() {
		return payment;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getDate() {
		return date;
	}
	
	
	
	// info()
	public String info() {
		String info = "상품명 : " + storeName + ", 금액 : " + price + ", 결제수단 : " + payment + ", 결제일시 : " + date; 
		
//		String info =  "상품명 : %s , 금액 : %d , 결제수단 : %s, 결제일시 : %s", storeName, price, payment, date ;
		
		return info;
	}
	
	
	
}
// 웹개발자
// 걍 개발자(ERP, 솔루션)
// 엔지니어ㅓㅓㅓㅓㅓ(서버, 네트워크, 클라우드)
// Dev / OB( 개발 운영 중간 , 사람들이 존재를 모름. 수업 진행함.첫차타면 꿀)



