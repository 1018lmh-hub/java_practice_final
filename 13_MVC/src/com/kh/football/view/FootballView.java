package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

//시각적인 부분, 화면 입/출력
//HTML CSS 안배워서 어쩔 수 없이 여기다 씀
public class FootballView {
	private Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController(); // while 바깥 mainMenu 메소드 안에 넣으면 안되나
	private BoardView bv =  new BoardView();

	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 축구선수 CRUD
		// CREATE : 사용자에게 축구선수의 이름, 포지션, 등번호를 입력받아 저장
		// READ : 만들어진 축구선수들을 조회
		// UPDATE : 기존에 존재하는 축구선수의 정보를 수정
		// DELETE : 기존에 존재하는 축구선수의 정보를 삭제

		while (true) {
			System.out.println();
			System.out.println("축구선수 관리 프로그램입니다.");
			System.out.println("1. 축구선수 전체 조회하기");
			System.out.println("2. 축구선수 추가하기");
			// 리스트에 풋볼플레이어를 추가하자 <-- 방법이 없어서 이렇게 씀 View 도 아직 안배워서 글치 뭐
			// 사용자가 입력한 값을 저장소에 저장 <-- 지금의 문제는 프로그램 종료시 입력한 정보가 다 날아감
			// 흐음음음
			System.out.println("3. 축수선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			System.out.println("5. 축구선수 검색하기");
			System.out.println("6. 축구선수 목록 파일로 저장하기");
			System.out.println("7. 축구 이야기하기 게시판");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠어요? >");

			int menu = 0;
		
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				sc.nextLine();
				continue; // sc.nextLine(); 이거 두번 쓰는 게 continue 때문에 그런건가
			}
			// 코드짤 때 유의할 점. 일단 돌아가게 완성하고 만들고 나중에 수정하기 뭐 중복을 제거하던 뭘 하던 리팩토링은 나중의 문제이다
			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			case 1:
				selectAll();
				break;
			case 2:
				addFootballPlayer();
				break;
			case 3:
				updateFootballPlayer();
				break;
			case 4:
				deleteFootballPlayer();
				break;
			case 5: findFootballPlayer();break;
			case 6: fc.outputFootballPlayer(); break;
			case 7 :  bv.boardMenu() ; break;
			default:
				System.out.println("없는 메뉴입니다.");
				continue;
			}
		}
	}

	// 선수들의 정보를 출력해주는 기능

	// 반환형이나 매개변수 등이 헷갈려서 일단 반환형 void 매개변수 비우고 나중에 수정해도 됨. 다만 나중에는 그렇게 하면 안됨 모두 코드짜기
	// 전에 어떻게 구성될 지 모두 정리된 상태에서 시작해야함.
	// 사전에 명세 작성을 해야함 필요한 역량 문서작성 기획 커뮤니케이션

	private void selectAll() {
		// View 에서 하는 일 : 사용자에게 값 입력받기X(모두 출력인데 입력받을 이유가 없음), 모델에서 만든 값 출력하기

		List<FootballPlayer> list = fc.selectAll();
		/*
		 * String name = list.get(0).getName(); String position =
		 * list.get(0).getPosition(); Integer backNumber = list.get(0).getBackNumber();
		 * 
		 * System.out.println("선수의 정보 : "); System.out.println("이름 : " + name);
		 * System.out.println("포지션 : " + position); System.out.println("등번호 : " +
		 * backNumber);
		 */

		if (!list.isEmpty()) { // 얘네는 그럼 비어있는 걸 기본으로 생각하는 건가 부정의 부정같아서 헷갈리는데
			// 축구선수가 최소한 한명은 있다.
			System.out.println("선수들의 정보를 확인하세요");
			System.out.println();
			for (FootballPlayer fp : list) {
				System.out.println("선수의 정보 : ");
				System.out.println("--------------------");
				System.out.println("아이디 : " + fp.getId());
				System.out.println("--------------------");
				System.out.println("이름 : " + fp.getName());
				System.out.println("--------------------");
				System.out.println("포지션 : " + fp.getPosition());
				System.out.println("--------------------");
				System.out.println("등번호 : " + fp.getBackNumber());
				System.out.println("--------------------"); // list.get(0).getName(); 으로 하던거 list.get(0)를 fp 로 진행. 왜
															// 그런건지 확인해보자
				System.out.println();
			}

		} else { // else 안스면 어떻게 되더라
			// 축구선수가 한명도 없다
			System.out.println("==========================");
			System.out.println("선수가 존재하지 않습니다. ");
			System.out.println("새로운 선수를 추가해보세요!");
			System.out.println("==========================");
		}

		// list 의 필드로 있는 배열의 인덱스에 있는 VO 의 주소값을 참조해서 필드 값을 출력
	}

	private void addFootballPlayer() {
		// 여기서 해야할 일을 무엇인가요?

		// 뷰가 해야할 일
		// 1. 사용자의 입력값 받기
		// 2. 모델에서 만든 값 출력하기

		// 무슨 값을 입력받아야하지?
		// 축구선수를 만들 수 있는 값들
		// 선수이름 : String , 포지션 : String , 등번호 : Integer

		System.out.println();
		System.out.print("선수의 이름을 입력해주세요 >");
		String name = sc.nextLine();
		System.out.print("선수의 포지션을 입력해주세요 >");
		String position = sc.nextLine();
		System.out.print("선수의 등번호를 입력해주세요 >");
		int backNumber = 0; // int 를 쓰는 이유 1. int가 짧으니까 2.Integer 는 정수값이 아닌게 들어올 수 있으니까 3. 서비스단에서의 검증이 null
							// 인지도 체크를 해야하고 + 음수가 아닌지도 체크를 해야하니까
		try {
			backNumber = sc.nextInt(); // 예외처리(에러 발생 프로그램 종료), -값 내가 원치 않는 값 오류 발생은 아님 그래서 서비스 단에서 비즈니스로직으로 처리
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("등 번호는 숫자만 입력이 가능합니다.");
			return;
		}

		// 사용자의 입력값 받기 끝! -> 뷰가 할일 1절 끝
		//
		// case 1) 100% 성공이니까 걍 추가하고 끝내기
		// case 2) 성공 실패 여부를 판별해서 성공했다 실패했다 출력해주기
		// case 3) 추가 성공 시 추가된 데이터 출력해주기 실패 시엔 실패했다 말해주기 ☆

		// 3개의 값을 넘기는데 너무 번거로워
		// 1. FootballPlater VO 탈락 ==> 생성자 인자값 부족
		// 2. ArrayList O ==> 인덱스 알아야 함 귀찮
		// 3. HashMap ==> <String,Object>
		// 4. Object[] ==> 이거 쓸바에 리스트 씀

		FootballPlayer fp = fc.addFootballPlayer(new FootballPlayerDto(name, position, backNumber));

		// 성공 / 실패 여부를 판별한 뒤
		// 각각 맞는 출력문을 작성
		if (fp != null) {
			selectAll();
		} else {
			System.out.println("선수등록에 실패했습니다.");
			System.out.println("관리자에게 문의하세요");
		}

		// 컨트롤러에서 호출할 축구선수 추가 성공 출력 메소드
		// 컨트롤러에서 호출할 때 실패 출력 메소드

	}

	public void updateFootballPlayer() {
		// 이름만 바꾸는 기능
		// 포지션만 바꾸는 기능
		// 등번호만 바꾸는 기능

		// 이름하고 포지션만 바꾸는 기능
		// 이름하고 등번호만 바꾸는 기능
		// 포지션하고 등번호만 바꾸는 기능

		// 이름하고 포지션하고 등번호를 바꾸는 기능 ★

		// 선수를 어떻게 식별할 것인가?
		// 이름이 일치하면
		// 포지션이 일치하면
		// 등번호가 일치하면

		// 이름하고 포지션이 일치하면
		// 이름하고 등번호이 일치하면
		// 포지션하고 등번호이 일치하면

		// 이름과 포지션과 등번호가 일치하면
		// ID 값이 일치하면 ★

		selectAll();
		System.out.println("어떤 선수의 정보를 갱신하시겠습니까?");
		System.out.print("선수의 아이디를 숫자로 입력해주세요 >");
		/*
		 * int id = sc.nextInt(); sc.nextLine(); // 1. 아이디 입력받기 // 2. 이름, 포지션, 등번호
		 */
//		
//		String id =sc.nextLine();
//		int idNum = Integer.parseInt(id);

		// BestPractice~~~~ 는 있다
		try {
			int id = Integer.parseInt(sc.nextLine());
			// 1. 입력받은 id값을 가지고 서비스까지 가서 id 가 있는 지 확인
			// 있느면 아래코드 수행 없으면 return해버리기

			// 1-1) 이미 우리는 축구선수주소를 가지고 있는 List 의 주소를 반환받는
			// 메소드를 구현 => service
			// service 메소드를 호출해서 반환받아서 여기서 검사
			// 1-2) id 값을 들고 서비스까지 가서 서비스에 검증 로직 작성 ★

			// 아이디가 있나 없나 검증하는 코드는 비즈니스 로직이니께 서비스에 들어가는 게 적절해보인다 => 2번
			boolean result = fc.checkId(id); // findById 좋아보임
			if (!result) {
				System.out.println("존재하지 않는 아이디입니다.");
				return;
			}
			// 2. 입력받은 id 값이 있던지 없던지 그냥 다 받아버리기
			// 그리고 서비스가서 있느 ㄴ지 없는 지 판별 수 작업 수행

			System.out.print("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("변경하실 포지션을 입력해주세요 > ");
			String position = sc.nextLine();
			System.out.print("변경하실 등번호를 입력해주세요 > ");
			int backNumber = Integer.parseInt(sc.nextLine());

			// 삼총사 받은 내용
			// Update 시 새로운 FootballPlayer 를 만들어서 넣어주어야 하는데
			// id 값을 기존의 id 값으로 유지할 것인가
			// 새로운 id 값으로 만들어서 넣어줄 것인가
			fc.updateFootballPlayer(id, new FootballPlayerDto(name, position, backNumber)); // 매개변수 생성자 new 배우기 전에 계속
																							// 쓰니까 익숙해지지 않은 상태로 굳어진듯

		} catch (NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}

	}

	public void deleteFootballPlayer() {
		System.out.println("등록된 축구선수를 해지하겠습니다. ");
		selectAll();
		System.out.print("어떤 선수를 해지하시겠습니까 아이디를 입력해주세요 > ");
		int id = 0;

		try {
			id = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("아이디값은 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		// 우리가 선수 삭제해서 해야할 작업

		// 사용자가 -1을 입력한다면 <-- 유효성 검증 --> 패스 숙제
		// 구현하는 방식
		// 1. id 를 들고가서 index를 가져와서 index를 전달해서 한번에 리무브
		// 2. id를 들고가서 서비스에서 반복을 돌려서 찾아서 리무브
		String result = fc.deleteFootballPlayer(id);

		if (result != null) {
			System.out.println(result + "선수의 정보가 삭제되었습니다.");
		} else {
			System.out.println("선수의 id를 찾을 수 없습니다.");
		}

	}
	
	private void findFootballPlayer(){
		System.out.println("선수 검색 서비스입니다.");
		// 사용자에게 아이디값을 입력 받아서
		// 사용자에게 이름을 받아서 ★
		// 사용자에게 이름이랑 포지션
		// 사용자에게 포지션만
		
		//똑같은 이름의 선수 다 찾기
		//입력값이 이름에 포함되어있는 선수 찾기
		
		System.out.print("찾고 싶은 이름의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		
		 List<FootballPlayer> players = fc.findByKeyword(keyword);
		// 응답이 돌아온 상황
		 // 경우의 수
		 // 검색 결과가 있을 수도 있음 / 검색 결과가 있을 수도 있음
		 // 검색 결과가 한개일 수도 있음 / 검색 결과가 백개일 수도 있음
		 
		 if(players.isEmpty()	) {
			 System.out.println("=========================");
			 System.out.println("검색 결과가 존재하지 않습니다");
			 System.out.println("=========================");
		 } else {
			 for(FootballPlayer player : players) {
				 System.out.println("이름 : " + player.getName() + ", 포지션 : " + player.getPosition() + ", 등번호 : " + player.getBackNumber());
				 
			 }
			 System.out.println();
		 }
		
		
	}
}
