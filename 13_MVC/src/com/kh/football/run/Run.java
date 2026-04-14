package com.kh.football.run;

import com.kh.football.view.FootballView;

public class Run {

	public static void main(String[] args) {
		
		// MVC 패턴 (Model - View - Controller)
		// 어플리케이션의 구조를 세가지 요소로 분리하자
		// 라는 소프트웨어 아키텍쳐 디자인 패턴
		// 1. Model => 데이터담당
		// VO => 값을 담당
		// DAO => (데이터를) 외부매체와의 상호작용
		// Service => 비즈니스로직
		// DTO => 데이터 전송용도
		// Entity => 테이블과의 매핑
		
		// 2. View => 사용자 인터페이스 담당
		// 사용자에게 정보 표시 / 사용자의 입력값을 받음
		// 모델에서 만들어진 데이터를 시각적으로 표현
		// 모델과 직접 상호작용하지 않음
		
		// 3. controller => 
		// Model 하고 View 의 중간다리 역할
		// 사용자가 View 에서 입력한 값을 Model 에 전달
		// Model 에서 일어난 처리작업 결과를 View 로 반환
		
		// 축구선수 CRUD 구현
		// Create(생성) : View 에서 만들어진 데이터를 축구선수 모양으로 만들고 저장
		// Read(조회)   : 저장되어있는 축구선수들을 조회해서 출력
		// Update(수정) : 저장되어ㅣ있는 축구선수들을 조회해서 출력
		// Delete(삭제) : 저장되어있는 축구선수의 데이터를 삭제
		
		// 악세사리
		
		// 이벤트
		
		// 공지사항(C : 게시글 작성, R : 게시판, U : 게시글 수정, D : 게시글 삭제)
		
		// 회원(C : 회원가입, R : 마이페이지(내 정보조회), U : 내정보수정, D : 회원탈퇴)
		
		/*
		 * 회원의 C를 구현해야겠다.
		 * 
		 * 아이디, 비밀번호, 전화번호, 이메일
		 *
		 * 	public class Member {
			private String userId;
			private String userPwd;
			private String phoneNumber;
			private String email;
			}
		 * 
		 * 공지사항의 C를 구현해야겠다.
		 * 
		 * 게시물의 제목, 게시글 내용, 게시글 작성자, 카테고리
		 * 
		 * 	public class NoticeVO {
			private String title;
			private String content;
			private String writer;
			private String category;
			}
		 */
		
		new FootballView().mainMenu();
		
	
		
	}

}

/*
 * 으ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
 * 1. 정처기 1순위
 * 2. SQLD 있으면 좋은데 없어도 됨 그냥 한스푼 첨가 정도임 당락을 정하지 않으므ㅡㅡㅡ 뭐 비등비등한 사람 있으면 이거 차이로 될지도 난 안해야지
 * 3. 영어공부 말하기 구지 읽기 듣기 쓰기 점수
 * 4. 대회 참가 수상 못해도ㅗㅗ ㄱㅊ 자소서 면접 한마디 정도ㅗㅗㅗㅗ 비전공자 할만한 게 없
 * 5. 배운 내용 정리 -> 매일매일 성실 ㅇㅈ;
 * 
 * 
 * 
 * 
 */


/*
 * 
 *  자바 어렵다
 *  이론 +  기술
 * 
 * 1. 일단 따라한다.
 * 2. 이거 어떻게 (뭐) 하는거에요~~ -> 이해 시키기 위해 설명 -> 이론적인 내용
 * 
 * 3. 많이 반복한다.
 * 4. 생각없이 손이 먼저 써짐												-> 체득의 과정
 * 
 * 목표 -> 월요일까지 숙제
 * 		   -> 다음주 주말까지 CRUD 하는 거는 띄엄띄엄 구현할 수 있게 숙력해오기!☆★
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
