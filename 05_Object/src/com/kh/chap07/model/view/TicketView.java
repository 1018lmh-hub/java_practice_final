package com.kh.chap07.model.view;

import java.util.Scanner;

import com.kh.chap07.model.controller.TicketController;
import com.kh.chap07.model.vo.Ticket;

public class TicketView {
	
	private Scanner sc = new Scanner(System.in);//this 를 쓸 필요가 없나 private 이라 클래스 내부에서는 사용이 가능한데 주소값이 이미 있으니까 갖다 쓰면 된다?
	//												생각해보니까 클래스 밑에 선언한 필드도 그냥 사용이 가능했던 거 같기도
	private TicketController tc = new TicketController();
	
	
	// 화면에 메인메뉴를 출력해주는 메소드
	public void mainMenu() {
		// 두 가지 기능 구현
		// 1. 티켓 추가하기
		// 2. 추가된 티켓 발급해주기
		
//		5시 몇분이더라 Scanner 에 대해서 설명해준거 다시보기
		
		while (true) {
			System.out.println("티켓 발권 서비스입니다~");
			System.out.println("원하시는 메뉴를 선택해주세요~");
			System.out.println("0. 티켓 조회하기");
			System.out.println("1. 티켓 추가하기");
			System.out.println("2. 티켓 발급받기");
			System.out.println("3. 프로그램 종료");
			System.out.print("원하시는 메뉴를 선택해주세요 >");
			int menuNo = sc.nextInt();
			sc.nextLine();
//			System.out.println(menuNo);

			switch (menuNo) {
			case 0 : findAll(); break;
			case 1 : saveView(); break;
			case 2 : printTicket(); break;
			case 3 : System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default : System.out.println("없는 메뉴를 선택하셨습니다.");
			}
		}
	}


	
	// 티켓을 추가할 수 있는 화면을 출력해주는 기능
	private void saveView() {
		
		System.out.print("티켓 가격을 입력해주세요 > ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("기내식을 입력해주세요 >");
		String meal = sc.nextLine();
		System.out.print("좌석번호를 입력해주세요 >");
		String seatNumber = sc.nextLine();
		System.out.print("서비스를 입력해주세요 >");
		String service = sc.nextLine();
		
		Ticket ticket = new Ticket(meal, service, seatNumber, price);
		//얘는 그러면 객체의 주소를 ticket에 담는 일과 meal, service, seatNumber, price 의 값을
		//전달하는 일을 동시에 하는건가
		System.out.println(ticket.info());
		//등록된 티켓이 3장이 아니라면 어딘가에 저장해둬야지~
//		TicketController tc = new TicketController(ticket);
		
		
//		객체에서 다른 객체로 값을 전달할 때는 메소드를 호출해서 넘겨주자!!
		System.out.println("View : " + ticket);
		
		int result = tc.saveTicket(ticket);
		if(result == 1) {
		System.out.println("티켓 등록 성공");
		} else {
		System.out.println("티켓 등록 실패");
		}
		//성공 실패 여부 출력
	}
	
	private void printTicket() {
		
		//컨트롤러야 서비스에게 티켓정보 하나만 받아다 주지 않으련?
		Ticket ticket = tc.printTicket();
		
		//티켓이 있을 수도 있고
		if(ticket != null ) {
			System.out.println(ticket.info());
			System.out.println("티켓이 성공적으로 발급되었습니다.");
		} else {
		//티켓이 없을 수도 있음
			System.out.println("티켓이 하나도 존재하지 않습니다.");
		}
//		12:00 보기
		
		
	}
	
	private void findAll() {
		Ticket[] tickets = tc.findAll();
		
//		if(tickets[0] != null) {
//			System.out.println(tickets[0].info());
//		}
		
		for(int i =0; i < tickets.length; i++) {
		if(tickets[i] != null) {
			System.out.println(tickets[i].info());
			}
		
		} 
		
	}
	
	
	
	//view 는 자바 밖에서
}

//특별한 경우가 아니면(잘 입력되나 찰 처리되나 확인할 때) 입력이랑 출력은 View 클래스에서만 되도록 진행하도록


