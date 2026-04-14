package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부(클래스가 가지는 요소들을 맴버라 함)
public class AutoSellingMachine { // 단 한개의 제품을 파는 자판기, -> 필요한 요소가 무엇이 있을까? 답이 없음
									// table ? 화면을 보고 생각/ 기획자 쪽에서 주는 거 보고 ㄱㄱ

	// ★☆★☆★☆★☆★☆요즘 개발자 취업 트렌드 과제형 ★☆★☆★☆★☆★☆

	/*
	 * 자 과제를 드리겠습니다. AI를 활용하셈
	 * 
	 * 주제 1. 1 ~ 7 <- 택해서 진행
	 * 
	 * 2. 주제 선정 이유 및 기획서 작성
	 * 
	 * 3. 개발도 하고 배포도 하고(필수 구현 기능)
	 * 
	 * 4. AI 활용을 했을 때의 세션파일을 제출(프롬프트 작성내역)
	 *
	 */

	/*
	 * ※★☆★☆핵심! 중요! 필수! 무조건!!! : 업무에 대한 도메인 지식★☆★☆※(정보처리기사, 영어, 해커톤..에 더하여 가장 중요 미리
	 * 준비)
	 * 
	 * AI -> 회계법인 개발자 -> 금융관련 지식, 법률관련 지식, 회계 업계가 어떻게 돌아가는가, 회계사들이 현재 사용하고 있는 익숙한
	 * 프로그램 10:3
	 * 
	 * 명확한 지시가 가능한 사람(그러면 결국 인맥이랑 현장이 중요할듯?)
	 * 
	 * 주말 숙제 꼭!!!!!! 해오기!!!!!! : 어떤 분야 개발자 할 지 정해오기., 관련 분야 지식, 자격증 뭘 준비하면 좋을 지 해당
	 * 업계에 대해서 공부 등..
	 * 
	 * 
	 * 
	 */

	// 자판기 == 제품이름, 제품가격, 수량

	private String name;
	private int price;
//	public int productNumber;(제품 이름이 곂칠 때 이를 구분하기 위해 주소값을 만들 때 productNumber 를 사용해서 수량을 받을 변수명으로 보통 stock 를 사용) amount(잔고)
	private int amount;

	/*
	 * Dependency(의존) 관계 정말정말중요 ☆ * 1
	 * 
	 * 캡술화 하는 방법 : 접근 제한자를 private 으로 제한자를 바꿈
	 * 
	 */

	public void checkAmount() {
		System.out.println("재고는 총 " + amount + "개 입니다.");
	}

	public void sellingProduct() {
		amount -= 1;
	}

	public void insertAmount() {
		amount += 3;
	}

	public void openMachine() {
		checkAmount();
		insertAmount();
		sellingProduct();
		checkAmount();

	}

	// 객체의 속성 값을 기록 미 ㅊ수정하는 기능의 메소드 : setter();
	/*
	 * VO => setter 메소드를 구현하지 않음 DTO -> setter를 구현해서
	 * 
	 * DTO를 배우려면 짧게 잡아도 한달 반 정도는 더 수업을 해야함 그래서 DTO를 배울 떄 까지만 VO에 setter 를 구현해서 사용하겠음
	 * 
	 * 
	 * setter만들기 규칙
	 * 
	 * 11:50
	 * 
	 * 1. setter 메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public 을 이용 2. set 필드명으로 식별자를 작성하여
	 * 낙타봉표기법(camelCase)를 꼭 지키도록한다!!
	 * 
	 */

	// 하나의 메소드는 하나의 역할을 수행해야한다. ☆ * 1
	// 12:45

	// price필드 값을 set할 수 있는 메소드를 구현
	public void/* 반환형 (return type), void 빈 공간 즉 반환할 것이 없다. */ setPrice(int price) {
		// parameter, 매개변수
		// 매개변수는 메소드 호출 시 초기화가 강제됨 ※ 암기 ☆ * 1
		// 지역변수는 초기화를 진행하지 않아도 메소드가 실행되는데 문제가 없음(물론 변수를 사용하려면 초기화를 해야겠지만)
		System.out.println(price);
//		price = price;
//		Scope 안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가진다.
		AutoSellingMachine asm = new AutoSellingMachine();
		asm.price = price;
		System.out.println("내 주소가 뭐지 : " + this);
//		this : 해당 객체의 주소값을 가리키는 역할
//		(클래스 내부에 있기 때문에 클래스를 자료형으로 가지는 (클래스 모양을 본뜬)객체를 Heap 영역에 할당했을 때 
//		같은 클래스라면 해당 객체는 그 메서드를 포함한다. 그렇기 때문에 메서드에서 객체의 주솟값을 지정하는 this로 주솟값을 불러올 수 있다.)

		this.price = price;

	}

	// name 필드를 기록 및 수정할 수 있는 메소드 2:03 시작할 때 놓침
	public void setname(String name) { // 필드명과 매개변수명을 동일하게 작성하는 것이 암묵적인 룰
		this.name = name;

	}

	// amount 필드를 기록 및 수정할 수 있는 메소드
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/*
	 * 관례 위반 : 두 개 이상의 필드값을 변경하는 메소드 이름에 set이 붙으면 안됨!! public void
	 * setPriceAndAmount(int price, int amount) { setPrice(price);
	 * setAmount(amount); }
	 * 
	 * set 이 아니라 changePriceAndAmount는 ㄱㅊ
	 */

	// 데이터를 반환해주는 기능의 메소드 : getter() ->> 꼮!! 있어야함!!!!

	/*
	 * 규칙!
	 * 
	 * 1. getter()는 접근제한자 public 을 사용한다. 2. get필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다. 3.
	 * vo 패키지 안에 존재하는 클래스라면 getter는 무조건 꼭 절대로 다 만드세요~~~!!!!!
	 * 
	 */

	// 메서드를 호출한 곳으로 name 필드값을 돌려주고 싶음

	public String getName() {
		return name;// this 없어도 됨 그러면 매개변수(지역변수)랑 필드값이랑 어떻게 구분함?
					// 지역변수는 해당 지역(해당 메소드 블럭) 내부에서만 작동하므로 다른 메소드에서는 작동하지 않음
					// 필드 선언을 한번만 하면 this.name 을 한번만 쓰면 그 이후에 클래스 내부에서
					// 자유롭게 필드변수를 사용 가능
	}

	// 개수를 반환해주는 메소드
	public int getAmount() {
		return amount;
	}

	public int getPrice() {
		return price;
	}
	
	public String info() {
		String info = "자판기 = [제품명 : " + name + ", 가격 : " + price + ". 재고 : " + amount + "]";
		return info;
	}
	
	
	
	
}	
	
//		return;은 항상 존재하고 있다. 보이지 않을 뿐 컴파일했을 때 코드에 쓰던 안쓰던 존재함

	// 필드들의 접근제한자를 private으로 변경한 뒤
	// 각각의 필드들에 대한 getter() / setter()를 구현하면
	// 캡슐화가 끝났다.
	/*
	 * 1. 값을 숨긴다. =>필드의 접근제한자를 private으로 선언
	 * 
	 * 2. 메소드를 통해 필드에 접근할 수 있게 만든다 => getter() / settet() 구현
	 * 
	 * 데이터를 숨김=> 객체간의 결합도가 낮아짐 => 책임을 분리시킴
	 * 
	 * 
	 */
	
	// 그러면 다른 클래스에 import 랑 new 키워드로 객체생성을 하지 않는다면
	// this를 사용할 수 없나?
	// 캡슐화 private 사용하는 것은 그러면 보안? 때문인가 굳이 
	// 한번에 진행할 수 있는 걸 한단계 추가시키는?
	
	
	


/*
 * public void a() { System.out.println("난 a당"); b();
 * System.out.println("b를 불렀당."); } public void b() {
 * System.out.println("난 b당"); c(); System.out.println("c를 불렀당."); } public void
 * c() { System.out.println("난 a당"); }
 */// 3:26

// 메모리랑 다형성(다양성?) 만 하면 나머지는 문법쓰(메모리랑 다형성에서 벽 느낌, 떨어져 나감)

// 소스코드(사람이 알아볼 수, 확장자 .java) -------> 바이트코드(컴퓨터가 알아볼 수 있게, 확장자 .class)
// 디스크에 저장 컴파일 디스크에 저장

// method는 stack에 올라감, new는 heap에 올라감

//	public void hi() {System.out.println("하이");

//	}

// 필드부(Field)부
/*
 * 객체가 가질 수 있는 속성을 기술하는 부분
 * 
 * 값을 담는 부분
 * 
 * 클래스 내부에서 값을 담는 부분을 "필드"라 함(변수랑 크게 다를 게 없삼. 메소드 안에서는 (지역)변수)
 * 
 * 필드 == 맴버변수
 * 
 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것
 * 
 * 접근제한자 자료형 필드식별자;
 * 
 */

// 프레임워크 잘 되어있음 추상화개념 높음

//하나의 클래스는 하나의 책임만을 가진다ㅏㅏㅏㅏ

//단일 책임 원칙


