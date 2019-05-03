package example;

import java.util.Scanner;

// 키보드로 정수를 입력받아 1~9 범위의 정수를 곱한 결과를 출력하는 프로그램 작성
// 단, 입력된 점수는 2~9 범위의 정수만 허용하며 범위 밖의 정수를 입력한 경우 재입력
//ex) 정수 입력[2~9] >> 7
// 7 * 1 = 7
// 7 * 2 = 14
//   ...
// 7 * 9 = 63

public class GugudanExampleApp_0417 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int dan;
		while (true) {
			System.out.print("정수 입력 [2~9] >> ");
			dan = n.nextInt();
			if (dan >= 2 && dan <= 9)
				break;
			System.out.println("[에러] 2단부터 9단까지만 출력가능합니다.");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		n.close();

	}

}
