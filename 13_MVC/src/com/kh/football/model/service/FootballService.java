package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dao.FootballPlayerDao;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

// 축구선수 저장된 걸 가지고 얼씨고 절씨고
// 비즈니스 로직 : 기능을 구현할 때 ~~ 해야한다 를 써놓은 코드. 의사결정 코드
public class FootballService {
	// 정석적으로 가려면 DAO 클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service 단에서 저장

	private List<FootballPlayer> list = new ArrayList();
	private int id;
//	FootballPlayer fp = new FootballPlayer(); 

	{
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날두", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 10));

	}

	public FootballService() {

	}

	// View 가 축구선수들 정보를 출력하기 위해서 건너건너옴 그러면 어떤 타입의 값을 반환해줘야할까

	public List<FootballPlayer> selectAll() {
		return list;
	}

//	public void addFootballPlayer(String name, String position, int backNumber) {
//
//	}

	// 뷰가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) { // List<FootballPlayer> 왜 이거 아니지
		// 서비스에는 비즈니스 로직 의사결정 코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수 / 미드필더 / 수비수 / 골키퍼만 들어가게 하고 싶음
		// 3. 등번호는 0 이상

		/*
		 * if (fpd.getName().length() >= 2) {
		 * 
		 * // 아하! fdp 가 정상적으로 돌아오지 못했다면 // NullPointException 이 발생할 수 있겠구나! -> 언체크드 익셉션
		 * 발생하는 무친 코드 공격적이라고 표현 if ("공격수".equals(fpd.getPosition()) ||
		 * fpd.getPosition().equals("미드필더") || fpd.getPosition().equals("수비수") ||
		 * fpd.getPosition().equals("골키퍼")) { if (fpd.getBackNumber() >= 0) { // 값에 대한
		 * 유효성 검증 == validate
		 * 
		 * // 코드는 변수 조건문 반복문으로 만든다~ // 기능 구현 시
		 * 
		 * // 자 여러분 ~~이걸 한번 해보세요~~
		 * 
		 * // 어떻게 써야할 지 모르겠어요 // 뭘 써야할 지 모르겠어오 // 시작을 못함! => 부담감 => 코드를 잘 써야해!!!!! // =>
		 * 나는 완변한 무언가를 만들어내야한다! // 사지선다 : 출력문 / 변수 / 조건문 / 반복문 // 근데 그거보단 단답형 문제가 더 적절한
		 * 표현 아닌가 list.add(new FootballPlayer(id++, fpd.getName(), fpd.getPosition(),
		 * fpd.getBackNumber()));
		 * 
		 * return list.get(list.size() - 1);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */
		if (validateFootballPlayer(fpd)) {
			list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber()));
			return list.get(list.size() - 1);
		}
		return null;

	}

//		3:17

	public boolean checkId(int id) {
		// 여기서 뭐해용?
		// 첫번째 요소 비교해봐야지
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return true;
			}
		}
		return false;

	}

	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		/*
		 * // 리스트에서 일치하는 id 를 찾아서 // 인덱스 값을 추출한 뒤 // DTO 객체의 필드값으로 VO 객체를 새로 생성하면서 ///
		 * int index = 0; // id 값을 가지고 list를 순회해서 // 동일한 id값을 가진 FootballPlayer 의 index를
		 * 알아내야함 for (int i = 0; i < list.size(); i++) { if (list.get(i).getId() == id)
		 * {
		 * 
		 * // 3이라고 입력했을 시 세번째 바퀴에 if 문에 들어옴 index = i; break; } }
		 */
		// 유효성 검사 예외처리랑 잘 구분하기
		indexOf(id);
		boolean result = validateFootballPlayer(player);

		if (result) {
			list.set(id, new FootballPlayer(id, player.getName(), player.getPosition(), player.getBackNumber()));
		}
	}

	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if (fpd.getName().length() >= 2) {
			if ("공격수".equals(fpd.getPosition()) || fpd.getPosition().equals("미드필더") || fpd.getPosition().equals("수비수")
					|| fpd.getPosition().equals("골키퍼")) {
				if (fpd.getBackNumber() >= 0) {

					//list.add(new FootballPlayer(++id, fpd.getName(), fpd.getPosition(), fpd.getBackNumber()));

					return true;

				}

			}

		}
		return false;

	}

	private int indexOf(int id) {

		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {

				index = i;
				break;
			}
		}
		return index;
	}

	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		
		if (index > 0) {
			return list.remove(index).getName();
			
		} return null;
		
	}
	public void outputFootballPlayer() {
		new FootballPlayerDao().outputFootballPlayer(list);
		
	}
	
	public List<FootballPlayer> findByKeyword(String keyword) {
		// 검색 => 찾아
		// 사용자가 입력한 keyword 가 포함된 FootballPlayer 의 name 필드값을
		// 하나하나 순회하면서 전부다 검사를 해서 만약에 name 필득밧에 
		// 사용자가 입력한 keyword 가 포함되어있다면 이 VO 객체의 주소값을
		// 전부다 View 로 반환해주어야하는데
		// 이게 하나도 없을 수도 있는데 엄청 많을 수도 있음
		
		// 저장소 == 배열[], List, Map, Set
		//					X	, 	O	, 세모, 세모
		
//		boolean result = list.get(0).getName().contains(keyword);
//		
//		if(result) {
//			
//		}
		
		List<FootballPlayer> searched = new ArrayList();
		
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);
			}
		}
		return searched;
		
	}
	
}

// 클래스에는 필드 생성자 메서드 가 있을 수 있다. 초기화 블록?
