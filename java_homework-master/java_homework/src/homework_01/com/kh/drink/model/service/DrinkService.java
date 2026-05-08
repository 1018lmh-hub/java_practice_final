package homework_01.com.kh.drink.model.service;

import java.util.ArrayList;
import java.util.List;

import homework_01.com.kh.drink.model.dto.DrinkDto;
import homework_01.com.kh.drink.model.vo.Drink;

public class DrinkService {
	
	private List<Drink> list = new ArrayList();
	{
		list.add(new Drink("아메리카노", 2000, "샷추가", 500));// 이렇게 만드는 건 별로 안좋아보이네 옵션은 따로 빼야겠다
		list.add(new Drink("카페라떼", 3500, "시럽추가", 300));
		list.add(new Drink("밀크티", 3500, "무지방우유로 교체", 500));
	}
	
	public List<Drink> selectAll() {
		return list; 
	}
	
	public Drink addDrink(DrinkDto drink) {
		if(drink.getPrice() > 0 && drink.getOptionPrice() > 0) {
		 list.add(new Drink(drink.getName(), drink.getPrice(), drink.getOptionName(), drink.getOptionPrice()));
		 return list.get(list.size()-1);
		} return null;
	}
	
//	public Drink updateDrink() {
		
//	}
	
	public List<Drink> deleteDrink(String name) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)){
				list.remove(i);
				return list;
			}
		}
		return null;
	}
	
	public void updateDrink(String name, DrinkDto drink) {
		

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPrice() > 0 && list.get(i).getOptionPrice() > 0) {
				if(list.get(i).getName().equals(name)) {
					list.set(i, new Drink(drink.getName(), drink.getPrice(), drink.getOptionName(),drink.getOptionPrice()));
				}  
			} else System.out.println("잘못된 입력입니다. "); 
		
		} 
	
	}

}
