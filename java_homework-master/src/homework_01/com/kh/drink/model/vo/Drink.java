package homework_01.com.kh.drink.model.vo;

import java.util.Objects;

public class Drink {
	
	// 어떤 값들을 쓰면 좋을까. 기본상품명, 가격, 옵션(아이스 핫, 샷추가, 시럽) 
	
	private String name;
	private int price;
	
	

	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}



	
	
	

}
