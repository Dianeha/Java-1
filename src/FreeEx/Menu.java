package FreeEx;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("1-5���� ���� �� �ϳ��� ��� �Է��Ͻø� ����� ������ �˷��帳�ϴ�.");
		
		while (true) {
			
			int num = sca.nextInt();
			
			if (num < 1 || num > 5) {
				System.out.println("[����] ��Ȯ�� ���ڸ� �Է����ֽñ� �ٶ��ϴ�.");
				continue;
			}
			
			switch (num) {
			case 1:
				System.out.println("����� ��ȭ�� ������ �������Դϴ�.");
				break;

			case 2:
				System.out.println("����� ������� ����ϴ�.");
				break;

			case 3:
				System.out.println("����� �� ���� ���� ������ ���� ���մϴ�.");
				break;

			case 4:
				System.out.println("����� �ֺ�ȯ�濡 ���� ȣ����� �����ϴ�.");
				break;

			case 5:
				System.out.println("����� ��Ÿ���̱⺸�ٴ� �̱����� ���Դϴ�.");
				break;

			}
			sca.close();
		}

	}
	
}
