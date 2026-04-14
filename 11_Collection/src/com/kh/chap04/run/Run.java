package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

import com.kh.chap04.model.vo.Sandwich;

public class Run {

	public static void main(String[] args) {
		
		//Map
		
		// Key + Value 세트로 저장			// Key는 당연히 달라서 식별할 수 있어야함, Value는 뭐 같은 수도 있음
		
		//HashMap
		
		// 키	=> 식별자 => 샌드위치 이름
		// 밸류	=> 샌드위치 객체
		
		Map<String, Sandwich> subway = new HashMap();
		// 비어있는 맵에 요소를 추가해보기~~
		
		// HashMap -> put()				// collection 하위 클래스(사실 인터페이스) 가 아니기 때문에 add 사용 안됨. ex) List,
		// key + value 함께 요소로 추가해야함
		
		//put(K key, V value) : Map에 key + value 세트로 요소 추가하기
		
		subway.put("에그마요", new Sandwich("담백고소","에그랑 마요"));
		subway.put("이탈리안BMT", new Sandwich("기본에 충실한 맛","베이컨 양상추 토마토"));
		subway.put("풀드포크바비큐", new Sandwich("짭짤달달감칠맛","풀드포크바베큐"));
		subway.put("아보카도에그마요", new Sandwich("담백고소","에이보케이도랑 에그랑 마요"));
		
		//순서보장 X
		
		System.out.println(subway);
		subway.put("메가에그마요", new Sandwich("담백고소", "에그랑 마요")); // Value 값의 경우 중복저장 O
		System.out.println(subway);
		subway.put("메가에그마요", new Sandwich("담백꼬소함", "에그랑 마요")); 
		System.out.println(subway);// Key == 식별자 --> 중복이 발생하면 덮어씌움(뭔가 배열을 이용하는 줄 알았는데 아닌가보네)
		
		//2. get(Object key) : Object
		// 인자로 전달된 Key값에 해당하는 value 값을 반환해주는 메소드
		// key로 value를 찾아옴
		
		System.out.println(subway.get("이탈리안BMT"));
		System.out.println(subway.get("에그마요"));
		System.out.println(subway.get("없는거")); // 없는 key값을 전달 시 null을 반환
		
		System.out.println(subway.size());
		System.out.println(subway.isEmpty());
		
		//replace(K key, V value) : key로 요소를 찾아서 Value값을 치환해줌
		subway.replace("에그마요", new Sandwich("아주맛있는맛","에그랑마요"));
		subway.replace("없는거", null);
		//기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않음! put과의 차이점. put은 추가도 되고 치환도 됨
		System.out.println(subway);
		
		//remove(Object key) -> Key값을 이용해서 key + value 세트로 바꿔주는 			//여기 뭐 놓침 12시 ~~
		
		subway.remove("아보카도에그마요");
		
		System.out.println(subway);
		
		System.out.println("===================================");
		
		//Map에 들어잇는 모든 요소들에 순차적으로 접근해야한다면??
		//addAll(Collection c) => X
		//for loop문 X, while X, for X, Iterator X
		
		subway.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		}); 
		
		//============================================================
		//============================================================
		//Map이 key - Value를 세트로 가지고 있음
		//Key값들만 Set으로 바꿔줘야함 -> Set으로 바꾸면 Iterator 를 사용가능
		
		//1) Map의 Key 들만 Set으로 만들기
		
		Set<String> subSet = subway.keySet();
//		System.out.println(subSet);
		//2) Set을 Iterator로 변경
		Iterator<String> itKey = subSet.iterator();
		//3) 반복문 사용하기
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "===" + subway.get(key));  
		}
		
		// entrySet()
		Set<Entry<String,Sandwich>> entrySet = subway.entrySet();
		
		
		
		System.out.println(subway);
		
		

	}

}
