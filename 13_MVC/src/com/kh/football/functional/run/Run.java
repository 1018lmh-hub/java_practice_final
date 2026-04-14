package com.kh.football.functional.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.kh.football.functional.model.dto.Material;
import com.kh.football.functional.model.service.BinFilter;
import com.kh.football.functional.model.service.RedFilter;

public class Run {

	public static void main(String[] args) {
		List<Material> bin = new ArrayList(List.of(
				new Material("건두부", 1000, "흰색"),
				new Material("새우완자", 3000, "빨간색"),
				new Material("청경채", 1500, "초록색"),
				new Material("분모짜", 4000, "흰색"),
				new Material("소고기", 10000, "빨간색"),
				new Material("옥수수면", 3500, "노란색")
				));
		
		// 마라탕이 재료가 너무 많으니까 필터로 좀 걸러내기
		// BinFilter bf = new BinFilter();
		// 2천원 이상?
		//만원 이하?
		// 노란색? 필터 클래스 만들어?
		
		// e답은 익명클래스에 있다
		
		BinFilter bf = new RedFilter();
		
		
		BinFilter greenFilter = new BinFilter() {

			@Override
			public boolean test(Material m) {
				return m.getColor().equals("초록색");
				
			}

		};
		
		BinFilter YellowFilter = (Material m) -> {
				return m.getColor().equals("노란색");
		};
		
//		BinFilter WhiteFilter =  m -> {
//			return m.getColor().equals("하얀색");
//	};
		
	BinFilter WhiteFilter =  m -> m.getColor().equals("하얀색");

	BinFilter CheapFilter =  m -> m.getPrice() <= 3000;
	
	for(Material m : bin) {
		if(CheapFilter.test(m)) {
			System.out.println(m.getPrice());
		}
	}
		
		
		for(Material m : bin) {
			if(bf.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		// Predicate<T> -> 판별 T (타입 아무거나) -> boolean , BinFilter같은 인터페이스를 만들 필요가 없음 이런 모양을 자바에서 이미 만들어줌 그게 이거
		Predicate<Material> isRed = m -> m.getColor().equals("빨간색");
		for(Material m : bin) {
			if(isRed.test(m)) {
				System.out.println(m.getName());
			}
		}
		
		//Function<T, R> - 변환 T(타입 아무거나) -> R(리턴타입)
		// 재료객체를 받아서 재료 객체의 이름을 반환
		Function<Material, String> getName = m -> m.getName();
		Function<Material, Integer> getPrice = Material::getPrice;

		System.out.println(getName.apply(new Material("돼지고기", 5000, "빨간색")));
		
		//Consumer <T> - 소비 T(타입 아무거나) -> void
		Consumer<Material> print = m -> System.out.println(m.getName());
		print.accept(new Material("양고기", 8000, "빨간색"));
		
		// Supplier<T> - 공급
		Supplier<Material> defaultM = () -> new Material("닭고기", 4000, "빨간색");
		Material chicken = defaultM.get();
		
		
	//뷰에서 빨간색만 보고싶습니다 -> 메소드 호출
		List<Material> reds = new ArrayList();
		for(int i = 0; i < bin.size(); i++) {
			if(bin.get(i).getColor().equals("빨간색")) {
				reds.add(bin.get(i));
			}
		}
		System.out.println(reds); 

		List<Material> red = bin.stream()		//for 뭐시기 대체
				.filter(m-> m.getColor().equals("빨간색"))/*다른 애는 몰라도 얘는 자바스크립트에서씀*/ // if 뭐시기 대체
				.collect(Collectors.toList());	// 모아서 포장하기 뭔소리야
		// stream collect 는 다른 거 없이 하나 고정이고 filter 같은 중간연산만 여러개가 되나
		System.out.println(red);
		
		// 재료들이 많다. 재료들의 이름만 사용
		
		Material found = bin.stream().filter(m -> m.getPrice() > 4000).findFirst().orElse(null);
		
		System.out.println(found); 
		
		
	}

}
