package homework_01.com.kh.drink.controller;

import java.util.List;

import homework_01.com.kh.drink.model.dto.DrinkDto;
import homework_01.com.kh.drink.model.service.DrinkService;
import homework_01.com.kh.drink.model.vo.Drink;

public class DrinkController {
	
	private DrinkService ds = new DrinkService();
	
	public List<Drink> selectAll() {
//		List<Drink> list = ds.selectAll();
//		return list;
		
		return ds.selectAll();
	}
	
	public Drink addDrink(DrinkDto drink){
		return ds.addDrink(drink);
	}
	
	public boolean updateDrink(String name, DrinkDto drink){
		return ds.updateDrink(name, drink);
	}
	
	public Drink deleteDrink(String name) {
		return ds.deleteDrink(name);
	}
	
	public void combineDrink(){
		
	}

}
