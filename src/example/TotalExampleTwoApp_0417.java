package example;

import java.util.Scanner;

//키보드로 정수를 계속 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//단, 입력된 정수가 0인 경우 입력을 종료하여 합계 출력
/* 정수 입력[0:종료] >> 10
   정수 입력[0:종료] >> 20
   정수 입력[0:종료] >> 30
   정수 입력[0:종료] >> 0
   [결과]합계 = 60
*/

public class TotalExampleTwoApp_0417 {
	public static void main(String[] args) {
		Scanner scanner2 = new Scanner(System.in);

		int tot = 0;
		while (true) {
			System.out.print("정수 입력[0:종료] >> ");
			int num=scanner2.nextInt();
			if(num==0) break;
			tot += num;
		}
		
		System.out.println("[결과]합계 = "+tot);
		scanner2.close();
	}
}
