package homework_01.com.kh.drink.model.dto;

public class DrinkDto {
	

	private String name;
	private int price;
	private String optionName;
	private int optionPrice;

	
	public DrinkDto() {
	}


	public DrinkDto(String name, int price, String optionName, int optionPrice) {
		this.name = name;
		this.price = price;
		this.optionName = optionName;
		this.optionPrice = optionPrice;
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


	public String getOptionName() {
		return optionName;
	}


	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}


	public int getOptionPrice() {
		return optionPrice;
	}


	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
	}
	
	
	
}
