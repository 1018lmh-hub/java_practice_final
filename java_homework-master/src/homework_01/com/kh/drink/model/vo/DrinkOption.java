package homework_01.com.kh.drink.model.vo;

import java.util.Objects;

public class DrinkOption {
	
	private String optionName;
	private int optionPrice;
	
	public DrinkOption(String optionName, int optionPrice) {
		this.optionName = optionName;
		this.optionPrice = optionPrice;
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

	
	
	@Override
	public String toString() {
		return "DrinkOption [optionName=" + optionName + ", optionPrice=" + optionPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(optionName, optionPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrinkOption other = (DrinkOption) obj;
		return Objects.equals(optionName, other.optionName) && optionPrice == other.optionPrice;
	}
	
	
	
	
	

}
