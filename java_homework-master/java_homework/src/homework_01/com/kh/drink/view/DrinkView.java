package homework_01.com.kh.drink.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import homework_01.com.kh.drink.controller.DrinkController;
import homework_01.com.kh.drink.model.dto.DrinkDto;
import homework_01.com.kh.drink.model.vo.Drink;

public class DrinkView {

	
	private Scanner sc = new Scanner(System.in);
	private DrinkController dc = new DrinkController();

	public void mainMenu() {

		while (true) {

			System.out.println();
			System.out.println("카페 메뉴 관리 프로그램입니다.");
			System.out.println();
			System.out.println("0. 프로그램 종료하기");
			System.out.println("1. 카페메뉴 전체 조회하기");
			System.out.println("2. 카페메뉴 추가하기");
			System.out.println("3. 카페메뉴 수정하기");
			System.out.println("4. 카페메뉴 삭제하기");
			System.out.println("5. 카페메뉴 조합하기");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠어요 > ");
			int menu = 0;

			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				sc.nextLine();
				continue;
			}
				switch (menu) {
				case 0: System.out.println("프로그램을 종료합니다."); sc.close(); return;
				case 1: selectAll(); break;
				case 2: addDrink(); break;
				case 3: updateDrink(); break;
				case 4: deleteDrink(); break;
				case 5: combineDrink(); break;
				default: System.out.println("없는 메뉴입니다. 다시 선택해주세요."); 

				}
			}

		}
	
	
	private void selectAll() {
		
		List<Drink> list = dc.selectAll();
		
		
		
		if(!list.isEmpty()) {
			System.out.println("음료 메뉴 및 옵션입니다.");
			System.out.println();
			System.out.println("음료 리스트 : ");
			System.out.println();
			for(Drink d : list) {
				System.out.println("제품명 : " + d.getName());
				System.out.println();
				System.out.println("제품가격 : " + d.getPrice());
				System.out.println();
				System.out.println("옵션 : " + d.getOptionName());
				System.out.println();
				System.out.println("옵션 가격 : " + d.getOptionPrice());
				System.out.println();
				
			}
		} else {
			
			System.out.println("===============================");
			System.out.println();
			System.out.println("|| 음료 메뉴가 존재하지 않습니다. ||");
			System.out.println();
			System.out.println("===============================");
		}
	}
		
		
	
	
	private void addDrink() {
		System.out.println();
		System.out.print("음료 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		System.out.print("음료 가격을 입력해주세요 > ");
		int price = 0;
		try {
		price = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("음료 가격은 숫자만 입력해주세요");
			return;
		}
		System.out.print("음료 옵션 이름을 입력해주세요. > ");
		String optionName = sc.nextLine();
		System.out.print("음료 옵션 가격을 입력해주세요 > ");
		int optionPrice = 0;
		try {
		optionPrice = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("음료 옵션 가격은 숫자만 입력해주세요");
			return;
		}
		
		Drink d = dc.addDrink(new DrinkDto(name, price, optionName, optionPrice));
		if(d != null) {
			selectAll();
		} else System.out.println("음료 등록 실패!");
	}
	
	private void updateDrink() {
		selectAll();
		System.out.println("카페 메뉴를 수정하시겠습니까?");
		System.out.print("메뉴의 이름을 입력해주세요 > ");
		
		String name = sc.nextLine();
		
			
		System.out.print("변경하실 이름을 입력해주세요 > ");
		String changeName = sc.nextLine();
		System.out.print("변경하실 가격을 입력해주세요 > ");
		int price = 0;
		try {
		price = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("음료 가격은 숫자만 입력해주세요");
			return;
		}
		System.out.print("변경하실 옵션 이름을 입력해주세요 > ");
		String changeOptionName = sc.nextLine();
		System.out.print("변경하실 옵션 가격을 입력해주세요 > ");
		int optionPrice = 0;
		try {
		optionPrice = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("음료 옵션 가격은 숫자만 입력해주세요");
			return;
		}
			
		dc.updateDrink(name, new DrinkDto(changeName, price,changeOptionName, optionPrice));	
	}

		
		

	
	private void deleteDrink() {
		selectAll();
		System.out.print("삭제하실 메뉴 이름을 입력해주새요 > ");
		String name = sc.nextLine();
		dc.deleteDrink(name);
		selectAll();
		System.out.println("메뉴가 삭제되었습니다.");
		
		
		
	}
	
	private void combineDrink() {
		
	}
}

// Create(생성) : View에서 만들어진 데이터를 음료수 모양으로 만들고 저장
// Read(조회)   : 저장되어있는 음료수 종류들을 조회해서 출력
// Update(수정) : 저장되어있는 음료수 정보 값을 수정
// Delete(삭제) : 저장되어있는 음료수 메뉴판 데이터를 삭제
