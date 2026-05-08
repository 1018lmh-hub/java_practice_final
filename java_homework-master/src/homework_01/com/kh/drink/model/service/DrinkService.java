package homework_01.com.kh.drink.model.service;

import java.util.ArrayList;
import java.util.List;

import homework_01.com.kh.drink.model.dto.DrinkDto;
import homework_01.com.kh.drink.model.vo.Drink;
import homework_01.com.kh.drink.model.vo.DrinkOption;

public class DrinkService {
	
	private List<Drink> list = new ArrayList();
	private List<DrinkOption> optionList = new ArrayList();
	{
		list.add(new Drink("아메리카노", 2000));// 이렇게 만드는 건 별로 안좋아보이네 옵션은 따로 빼야겠다
		list.add(new Drink("카페라떼", 3500));
		list.add(new Drink("밀크티", 3500));
		optionList.add(new DrinkOption("휘핑크림",500));
		optionList.add(new DrinkOption("샷추가",500));
		optionList.add(new DrinkOption("휘핑크림",500));
	}
	
	 // 여기서 반환 타입을 List<Drink> 로하고 얘를 부모타입으로 DrinkOption을 자식타입으로 해서 하는 게 더 낫나
																								// 별로임 그냥 Drink 클래스에 다 넣어서 ㄱㄱ

		

	
	
	public List<Drink> selectAll() {
		return list; 
	}
	
	public Drink addDrink(DrinkDto drink) {
		if(drink.getPrice() > 0) {
		 list.add(new Drink(drink.getName(), drink.getPrice()));
		 return list.get(list.size()-1);
		} return null;
	}
	

	
	public Drink deleteDrink(String name) {
		
		int index = indexOfDrink(name); 
		if(index != -1) {		
		return list.remove(index);
		} return null;
				
	}
	
	private int indexOfDrink(String name) {
	    for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getName().equals(name)) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	public boolean updateDrink(String name, DrinkDto drink) {
		

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getPrice() > 0 ) {
				if(list.get(i).getName().equals(name)) {
					list.set(i, new Drink(drink.getName(), drink.getPrice()));
					return true;
				} 
			} 
		
		} return false;  
	
	}

}
