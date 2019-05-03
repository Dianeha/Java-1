package example;

import java.util.Scanner;

//키보드로 정수 5개를 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
/* 1번째 정수 입력 >> 10
 * 2번째 정수 입력 >> 20
 * 3번째 정수 입력 >> 30
 * 4번째 정수 입력 >> 40
 * 5번째 정수 입력 >> 50
 * [결과] 합계 = 150
 */
public class TotalExampleOneApp_0417 {
	public static void main(String[] args) {
	/*	int a1, a2, a3, a4, a5;
		Scanner n = new Scanner(System.in);

		System.out.println("1번째 정수 입력 >> ");
		a1 = n.nextInt();
		System.out.println("2번째 정수 입력 >> ");
		a2 = n.nextInt();
		System.out.println("3번째 정수 입력 >> ");
		a3 = n.nextInt();
		System.out.println("4번째 정수 입력 >> ");
		a4 = n.nextInt();
		System.out.println("5번째 정수 입력 >> ");
		a5 = n.nextInt();
		System.out.println("[결과] 합계 = " + (a1 + a2 + a3 + a4 + a5));
		
		n.close(); */
		
		Scanner scanner = new Scanner(System.in);

		
		// 정수를 입력받아 합계를 계산하는 과정 - 5번 반복
		int tot = 0; // tot 를 새롭게 만들어주고
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 정수 입력 >> ");
			// int num = scanner.nextInt();//num이라는 변수는 키보드를 통해 입력된 수를 저장하는 역할
			// tot+=num;// 여기 표현법을 몰랐음
		
			tot+=scanner.nextInt(); //입력된 수를 num이라는 변수에 저장했다가 다시 tot에 더하는 것이 아니라
			//바로 키보드에서 받아서 tot에 저장하는 방법, 가능한 지역변수를 사용하지 않는 것이 
			//유지보수에 유리
		}
		
		System.out.println("[결과] 합계 = "+tot);
		scanner.close();
	}

}
