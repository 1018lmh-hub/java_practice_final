package com.kh.chap03.model.vo;

public class Shop {
	private String name;
	private String menu;
	private int price;

	public Shop(String name, String menu, int price) {

		this.name = name;
		this.menu = menu;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		

		// 전달받은 Shop객체의 필드값이
		// 현재 equals()를 호출한 객체의 필드값과
		// 모두 동일하다면 true 값을 반환

		Shop shop = (Shop) obj; //왜 안되나
		if (this.price == shop.price && this.name.equals(shop.name) && this.menu.equals(shop.menu)) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		// 객체를 가지고 뭐 어쩌고 저쩌고 해서 알아서 10진수로 만들어서 반환
		// !! 필드값이 동일하다면 동일한 해시코드값이 나오게 만들고 싶음
		//
		//

		// "최고기" + "고기고기" +18000
		// 최고기고기고기18000.hashCode();
		return (name + menu + price).hashCode();
	}

	// 우리가 해야할 일
	// 필드의 값이 동일하다면
	// equals() 와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함

}
