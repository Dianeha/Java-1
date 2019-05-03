package example;

import java.util.Scanner;

public class ScannerExampleApp_0417 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("값을 입력하세요.");
		String value = sc.nextLine();
		System.out.println("입력값 = " + value);
		sc.close();
	}
}
