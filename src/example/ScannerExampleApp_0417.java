package example;

import java.util.Scanner;

public class ScannerExampleApp_0417 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է��ϼ���.");
		String value = sc.nextLine();
		System.out.println("�Է°� = " + value);
		sc.close();
	}
}
