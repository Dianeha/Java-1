package example;

import java.util.Scanner;

//��ǻ�ͷκ��� ������ ���������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
//=> 1~100 ������ ���������� ���� �޵��� �ۼ�
//=> ������ ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
//=> Ű���� �Է°��� 1~100 ������ �ƴ� ��� ���Է�
//=> ������ �Է°��� ������ ��� �Է�Ƚ�� ��� �� ���α׷� ����
//=> ������ �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
//=> ������ 10�� �ȿ� ������ ���� ��� ���� ���

public class UpAndDownExampleApp_0417 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int com = (int) (Math.random() * 100) + 1;
		int gamer;

		System.out.println("��ǻ�Ͱ� ������ ������ ���ߴ� UP/DOWN �����Դϴ�.\n���̸ӿ��Դ� 10���� ��ȸ�� �־����ϴ�.\n ");
		System.out.println("1~100 ������ ���ڸ� �Է��ϼ���. >> \n");

		while (true) {

			while (true) {
				gamer = scanner.nextInt();
				if (gamer >= 1 && gamer <= 100)
					break;
				System.out.println("[����] 1~100 ���� ���ڸ� �Է��ϼ���.\n\n");
			}

			if (com == gamer) {
				count++;
				System.out.println("\n[���] ��ǻ�Ͱ� ������ ���� " + com + "��(��) ���̸Ӱ� �Է��� ���� " + gamer + "��(��) ��ġ�մϴ�.");
				System.out.println("       ���̸Ӱ� " + count + "ȸ���� ���� �¸��߽��ϴ�.");
				break; 
			} else if (com > gamer) {
				System.out.println("UP\n");
				count++;
			} else {
				System.out.println("DOWN\n");
				count++;
			}

			if (count == 10) {
				System.out.println("\n[���] �־��� 10���� ��ȸ�� ��� ����߽��ϴ�.");
				System.out.println("       ��ǻ�Ͱ� ������ ������ " + com + "�̸�, ");
				System.out.println("       ���̸Ӵ� ���� �¸��� �ŵ��� ���߽��ϴ�.");
				break;
			}

		}

		scanner.close();
	}
}
