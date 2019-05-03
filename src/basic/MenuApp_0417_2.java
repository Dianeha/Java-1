package basic;

import java.util.Scanner;

// 키보드로 선택메뉴를 입력하여 사용자에게 선택메뉴에 대한 기능을 제공하는 프로그램을 작성하세요.
// => 프로그램 종료 메뉴르 선택하기 전까지 사용자에게 원하는 기능을 계속 제공 while 사용
// => 선택메뉴가 없는 경우 에러메세지 출력
public class MenuApp_0417_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 변경");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 검색");
		System.out.println("5. 학생정보 종료");
		
		while (true) {
			// 메뉴출력
			

			System.out.print("\n메뉴 선택[1~5] >> ");
			int choice = scanner.nextInt();

			//선택메뉴에 대한 유효성 검사
			if (choice<1 || choice > 5) {
				System.out.println("[에러]선택한 메뉴는 존재하지 않습니다.");
				continue;
			}
			
			//선택메뉴 처리
			if (choice == 5) break;

			switch (choice) {
			case 1:
				System.out.println("[처리결과]학생정보를 저장하였습니다.");
				break;
			case 2:
				System.out.println("[처리결과]학생정보를 변경하였습니다.");
				break;
			case 3:
				System.out.println("[처리결과]학생정보를 삭제하였습니다.");
				break;
			case 4:
				System.out.println("[처리결과]학생정보를 검색하였습니다.");
				break;

			}

		}

		System.out.println("[메세지] 학생관리 프로그램을 종료합니다.");
		scanner.close();

		
		
		
		
		
		
	}
}
