package homework_01.com.kh.drink.model.dto;

public class DrinkDto {
	

	private String name;
	private int price;
	

	
	public DrinkDto() {
	}


	public DrinkDto(String name, int price) {
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



	
	
}
