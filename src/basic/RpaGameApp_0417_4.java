package basic;

import java.util.Scanner;

//가위바위보 게임 프로그램을 작성하시오.
//=> 컴퓨터(난수)와 게이머(키보드)의 가위바위보 대결
//=> 게이머가 이길 경우 게임 반복 실행/ 질 경우 게임 종료
//=> 게임이 종료된 후 게이머가 이긴 횟수 출력

public class RpaGameApp_0417_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;// 연승횟수를 저장하기 위한 변수

		// 가위바위보 대결 반복 실행
		while (true) {
			// 컴퓨터에게 가위바위보를 제공받아 저장 >> 난수(1~3)
			// => 1:가위, 2:바위, 3:보 약속
			int com = (int) (Math.random() * 10) % 3 + 1;

			// 게이머에게 가위바위보를 제공받아 저장 >> 키보드(1~3)
			// => 입력값이 1~3 범위의 정수가 아닌 경우 재입력
			int gamer;
			while (true) {
				System.out.print("가위바위보 입력[1:가위, 2:바위, 3:보] >> ");
				gamer = scanner.nextInt();
				if (gamer >= 1 && gamer <= 3)
					break;
				System.out.println("[에러] 가위, 바위, 보 셋 중 하나만 입력하세요.");
				System.out.println();			
			}

			// 컴퓨터와 게이머의 가위바위보 입력값 출력
			System.out.print("[입력]컴퓨터 = ");
			if (com == 1)
				System.out.print("가위");
			else if (com == 2)
				System.out.print("바위");
			else
				System.out.print("보");

			System.out.print(", 게이머 = ");
			if (gamer == 1)
				System.out.print("가위");
			else if (gamer == 2)
				System.out.print("바위");
			else
				System.out.print("보");

			System.out.println();

			// 컴퓨터와 게이머의 승패유무를 판단하여 결과 출력
			if (com == gamer) {
				System.out.println("[결과]컴퓨터와 게이머가 서로 비겼습니다.");
			} else if ((com == 1 && gamer == 2) || (com == 2 && gamer == 3) || (com == 3 && gamer == 1)) {
				System.out.println("[결과]게이머가 컴퓨터에게 이겼습니다.");
				count++; // 연승횟수 증가
			} else {
				System.out.println("[결과]컴퓨터가 게이머에게 이겼습니다.");
				break;// 게임대결종료
			}
			System.out.println();

		}

		System.out.println();
		if (count == 0) {
			System.out.println("[메세지]게이머가 컴퓨터에게 한 번도 이기지 못했습니다ㅠㅠ");
		} else {
			System.out.println("[메세지]게이머가 컴퓨터에게 " + count + "번 연속으로 이겼습니다.");
		}
		scanner.close();
	}
}
