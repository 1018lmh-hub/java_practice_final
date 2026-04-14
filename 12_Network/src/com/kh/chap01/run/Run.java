package com.kh.chap01.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network)
		 * 
		 * 통신이  가능한 두 대 이상의 장치들을 
		 * 물리적 또는 논리적으로 연결한 환경
		 * 
		 * 네트워크의 목적 : 데이터의 교환
		 * 
		 * 통신이 가능한 장치 == Host 라고 통칭
		 * 종단간의 실제 통신 장치는 EndPoint 라고 표현
		 * 
		 * IP(Internet Protocol) Address / MAC(Media Access Controller) Address
		 * 
		 * -MAC Address : NIC(Network Interface Card)에 제조 시 붙여지는 물리적인 주소
		 * 
		 * -IP Address : Internet 상에서 각 Host 들을 식별할 수 있는 논리적 주소
		 * 
		 * -Port Number : Host 내부에서 작동하는ㄴ Process 를 식별할 때 사용하는 내부 번호 (개발자식 엔지니어는 진짜 물리적으로 존재하는 외부에 연결하는 포트에 적힌 포트 번호를 생각함)
		 * 
		 * MAC => 킹론상 절대 고정값 => 실제 가상으로 올려서 사용함
		 * 
		 * => IP 주소와 Port Number 는 항상 고정값이 아니라 변동이 가능한 유동적인 값
		 * 	단, 값을 변경할 때 IP 주소는 같은 네트워크 범위 안에서, Port 번호는 컴퓨터 내부에서 중복이 발생되어선 안됨!1 충돌이 일어남
		 * 
		 * -Server 와 Client
		 * 
		 * Server : Client(사용자)에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램
		 *			즉, Client 의 요정에 대한 응답을 제공해주는 서비스 제공자
		 * 
		 * Client : Server 에게 서비스를 요청하는 물리적인 컴퓨터 또는 프로그램
		 * 			즉, 서비스를 제공받는 고객
		 * 
		 * => 서버는 자기 혼자 응답을 보낼 수 없음!! 클라이언트의 요청이 들어와야만 응답을 보내줄 수 있음
		 * => 클라이언트는 서버에 요청을 보내기 위해서 서버의 IP 주소와 Port 번호를 알아야 한다
		 * 
		 * DHCP(Dynamic Host Configuration Protocol)
		 * 
		 */
		
		
		/*
		 * InetAddress : 네트워크 정보를 확인할 수 있는 클래스
		 * 
		 * 
		 */
		
		try {
			InetAddress locaHost = InetAddress.getLocalHost();
			// loclaHost : 현재 프로그램을 동작시킨 장치를 의미
			System.out.println(locaHost);  
			System.out.println(locaHost.getHostName());
			System.out.println(locaHost.getHostAddress());
			
			System.out.println("============================");
			
			// 도메인 네임을 이용해서 서버컴퓨터와 관련된 정보를 얻어 낼 수 있음
			// domain name : 사용자가 서비스를 이용할 때 서버의 IP 주소를 외우기 어려우니까
//								외우기 쉬운 구조로 사용자에게 제공하는 이름
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : 도메인 네임을 이용해서 서버의 정보를 반환
			
			System.out.println(googleHost); 
			//서버는 분산 구조로 이루어져있음
			
			/*
			 * Client - Server Model
			 * 
			 * 현재 구동중인 서버가 존재한다면 클라이언트는 언제든 서버로 요청을 보낼 수 있음
			 * => 서버는 무조건 응답 결과를 돌려 주어야함
			 * 
			 * "요청(request)" 과 "응답(response)"으로 프로그램이 동작(통신)함
			 * 웹 통신 방식 : HTTPS(Hyper Text Transfer Protocol secure)
			 * 
			 * 자바만 가지고 클라이언트와 서버의 간단한 통신하는 프로그램을 구현
			 * 
			 * 소켓(Socket)
			 * 
			 * Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
			 * 
			 * 
			 * 
			 */
			
			/*
			 * 모듈 : 프로그램 파트 (회원 결제 이벤트 관리자 등 여러개가 있을 수 있다)
			 * 
			 *  그 중 일부 파트의 사용량 필요성이 늘어날 경우
			 *  모든 프로그램이 한번에 만들어져서 낭비가 생기는데
			 *  이를 방지하기 위해서 특정 프로그램 파트만 늘릴 수 있다.
			 *  이걸 모듈이 수행한다. 
			 *  
			 *  부품화해서 수행한다고 한다.
			 *  
			 * MSA(Micro Soft Architecture)
			 * 
			 * 프로젝트 개요 
			 * ex)
			 * 6개월 RFP 명세 가 옴
			 * 
			 * 그럼 기능들을 구현해야하는데 이걸 기획함
			 * 회의 대충 2개월
			 * 기능 구현 대충 2개월 쏼랄랄라
			 * 
			 * 검수받음 -> 오잉 이거 아닌데용
			 * 수정에 수정에 수정에 테스트 뭐 이거저거 하고(AI 딸깍이라 테스트 많이함)
			 * 
			 * 다시 만듦
			 * 
			 * 
			 * 
			 */
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		
	}

}


/*
 * 통신이 가능한 두 개 이상의 Device 를 물리적/논리적으로 연결해놓은 환경
 * 
 * Local Area Network (LAN) 물리적
 * 
 * 데이터 전송을 위해서 사용ㅑ
 * 
 * ISP (internet service 
 * 
 * 
 * 컴퓨터끼리 연결, 서버실에 연결, 건물을 연결 지하로 선을 빼서 연결, 나라 내에서 다 연결
 * 전세계에 연결 Internet
 * 
 * 이 망을 이용해서 하는 서비스들
 * 
 * TCP/IP 프로토콜 준수해서 만들어야함
 * 
 * Web 은 정보제공서비스(지만 할 수 있는 게 많아지긴 함)
 * 
 * 
 * protocol 통신규약
 * 
 * OSI 7 Layers
 * 
 * Internet Protocol Address 
 * 
 *  IP에 버전이 있음
 *  그러나 새로운 것을 도입하기엔 기존의 것을 갈아야해서 돈이 많이들어서 안씀(ver4 -> ver6 안바꿨으나 사물인터넷에서 ver 6 사용 뭐 게임도 블리자드 배틀넷에서 활용)
 *  
 *  그래서 IP를 같이 쓸 수 있는 기능을 만듦
 *  
 *  Network Interface card (NIC, 랜카드)
 *  만들 때 제조사가 번호를 붙여서 만들어줌
 *  
 *  web 통신
 *  
 *  웹 브라우저에서
 *  주소창에 주소를 입력해 웹서버에 요청을 보냄						https://www.naver.com	http://www.naver.com(요것도 되긴 하는데 요즘은 이렇게 쓰면 안됨)
 *  https://www.naver.com									s 는 secure 보안 암호화	http Hyper Text Transfer Protocol
 * 	여기서 enter 를 누르면										:// <- 이건 의미없음 만든 사람이 멋있어보여서 만듦
 *  운영체제가 hosts.txt 에서 IP주소랑 도메인 네임 서버를 맵핑함		www. world wide web - host name , 어떤 서비스 요청을 받는 지에 대해서 앞에 오는 것 다른 기능이면 다른 것들이 옮 ex) 검색하면 search 가 앞에 옴. 현대에 와서는 www도 딱히 의미없이 관례적으로 붙임
 *  도메인 네임 서버에 요청을 보냄									Domain Name System 주소가 너무 길어서 사람이 알아볼 수 있게 만든 것 (돈주고 삼). IP주소 Domain name 을 ICAN 이라는 곳에서 판매함
 *  
 *  DNS Cache Server 
 *  google.com 의 IP Address 가 뭐야? 라고 서버에 요청
 *  google.com 의 IP Address 는 142.250.198.46 야 라고 서버가 대답
 *  
 *  이제 서버의 IP Address 로 보내는데 메인보드에 연결된 NIC 의 포트에 연결된 랜선으로 나감
 *  보내는 컴퓨터 무슨 데이터헤드에 있는 (내 MAC 주소 - 내 IP 주소 - port Number) 정보를 같이 보냄
 *  port Number : 프로그램 식별값 프로세스 식별?
 *  
 *  Router(길안내 해주는 애 route 루트 길 에 er 붙임) Routing Table 을 참고하고 거쳐서 목적 주소지에 도달
 *  목적지에서 다시 보낸 주소를 참고해서 Router 에 남은 흔적을 보고 다시 보내줌
 *  IP 를 보고 왔을 때 개인 컴퓨터는 IP 주소로 구분하지 못하므로 Broad Cast 를 이용해 전체 공지해서 요청을 보낸 곳으로 보내줌
 *  
 *  전제 : Internet 환경에서 통신을 하기 위해서 기본적으로 IP Address 가 필요함
 *  
 *  서비스 받는 쪽 사용자 클라이언트
 *  서비스 제공 제공자 서버
 * 
 * 코드 - 브라우저 - 웹페이지
 * 
 * 랜더링
 * 
 * 5:00
 * 
 * 
 * 
 */
