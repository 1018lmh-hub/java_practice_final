package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {

	public static void main(String[] args) {
		
		// HashSet
		// Value 값만 저장, Index 개념이 없음 == 순서보장 X , 중복 X
		
		// 문자열만 담을 수 있는 HashSet
		Set<String> set = new HashSet();
		// add()
		
		set.add("반갑습니다");
		
		set.add("안녕하세요");
		set.add("날이 더워요");
		
		set.add("반갑습니다~~~");
		
		set.add("뭐하지");
		
		
		set.add("안녕하세요");
		
		System.out.println(set); // 저장순서보장 X, 중복 허용 X // 언제 쓴다고 했더라
		
		//요소 개수 구하기 size();
		System.out.println(set.size());
		
		// 주변 식당들 정보를 set에 담아야겠다!
		Set<Shop> shops = new HashSet();
		
		
		Shop gonShop = new Shop("공평동꼼장어", "꼼장어", 15000);
		Shop choiShop = new Shop("최고기", "고기고기", 18000);
		Shop macShop =new Shop("맥주이마트", "라면", 5000);
		
		shops.add(macShop);
		shops.add(choiShop);
		shops.add(gonShop);
		shops.add(new Shop("최고기", "고기고기", 18000));
		
		
		System.out.println(shops); 
		
		// HashSet => set에 새로운 요소를 추가할 때 마다
		// equals() 와 hashCode()의 반환값을 기준으로 일치하는 요소가 있는 지 없는 지 판별함// toString equals hashCode 가 원래 어떻게 작동하는 지 String에서 어떻게 작동하는 지 보자
		
		/*
		 * equals()의 호출 결과가 true이고 hashCode()의 반환값을 동등비교 연산자를 통해
		 * 비교했을 때 값이 일치하다면 ==> 동일객체로 판단(중복저장을 하지 않음)
		 * 
		 * VO클래스는 일반적으로 반드시 내부에 equals()와 hashCode()를 오버라이딩
		 * 
		 * 
		 */
		
		System.out.println("==============================");
		/* 반복문을 쓰고 싶은데 for while 안됨
		 for(int i = 0; i < shops.size(); i++) {
		 	System.out.println(shops.get); get()가 존재하지 않음
		} 		
		 		 */
		
		for(Shop shop : shops) {
			System.out.println(shop);
		}	// 이 상태에서는 collection 이나 배열로 반복이 됨? 얘도 사실 이해 잘 못함
		
		System.out.println("===============================");
		
		//Set의 요소를 List 로 옮기기
//		List list = new ArrayList(); // 이렇게 쓰면 좋은 점도 공부
//		list.addAll(shops);
//		System.out.println(list);
		
		List list = new ArrayList(shops);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");
		
		//Iterator (반복자)
		//StringTokenizer 랑 비슷한 느낌
		
		// hsaNext(), next()
		
		// ArrayList -> 배열로
		// LinkedList -> 노드로 연결
		// HashSet -> 헤시테이블
		// TreeSet -> 트리구조로
		//
		//개발자가 구체적인 자료구조를 모르더라도 반복을 시킬 수 있는 방법
		
		Iterator it = shops.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//List계열, Set 계열 전부 다 iterator()로 호출해서 반복시킬 수 있음
		// Map => 바로 사용이 불가능
		

	}

}
