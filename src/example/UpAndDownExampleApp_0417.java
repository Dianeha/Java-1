package example;

import java.util.Scanner;

//컴퓨터로부터 제공된 정수난수를 키보드로 입력하여 맞추는 프로그램을 작성하세요.
//=> 1~100 범위의 정수난수를 제공 받도록 작성
//=> 난수를 맞출 수 있는 기회는 10번만 제공되도록 작성
//=> 키보드 입력값이 1~100 범위가 아닌 경우 재입력
//=> 난수와 입력값이 동일한 경우 입력횟수 출력 후 프로그램 종료
//=> 난수와 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
//=> 난수를 10번 안에 맞추지 못한 경우 난수 출력

public class UpAndDownExampleApp_0417 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int com = (int) (Math.random() * 100) + 1;
		int gamer;

		System.out.println("컴퓨터가 제시한 난수를 맞추는 UP/DOWN 게임입니다.\n게이머에게는 10번의 기회가 주어집니다.\n ");
		System.out.println("1~100 사이의 숫자를 입력하세요. >> \n");

		while (true) {

			while (true) {
				gamer = scanner.nextInt();
				if (gamer >= 1 && gamer <= 100)
					break;
				System.out.println("[에러] 1~100 사이 숫자를 입력하세요.\n\n");
			}

			if (com == gamer) {
				count++;
				System.out.println("\n[결과] 컴퓨터가 제시한 숫자 " + com + "와(과) 게이머가 입력한 숫자 " + gamer + "이(가) 일치합니다.");
				System.out.println("       게이머가 " + count + "회만에 최종 승리했습니다.");
				break; 
			} else if (com > gamer) {
				System.out.println("UP\n");
				count++;
			} else {
				System.out.println("DOWN\n");
				count++;
			}

			if (count == 10) {
				System.out.println("\n[결과] 주어진 10번의 기회를 모두 사용했습니다.");
				System.out.println("       컴퓨터가 제시한 난수는 " + com + "이며, ");
				System.out.println("       게이머는 최종 승리를 거두지 못했습니다.");
				break;
			}

		}

		scanner.close();
	}
}
