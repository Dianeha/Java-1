package basic;

import java.util.Scanner;

//���������� ���� ���α׷��� �ۼ��Ͻÿ�.
//=> ��ǻ��(����)�� ���̸�(Ű����)�� ���������� ���
//=> ���̸Ӱ� �̱� ��� ���� �ݺ� ����/ �� ��� ���� ����
//=> ������ ����� �� ���̸Ӱ� �̱� Ƚ�� ���

public class RpaGameApp_0417_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = 0;// ����Ƚ���� �����ϱ� ���� ����

		// ���������� ��� �ݺ� ����
		while (true) {
			// ��ǻ�Ϳ��� ������������ �����޾� ���� >> ����(1~3)
			// => 1:����, 2:����, 3:�� ���
			int com = (int) (Math.random() * 10) % 3 + 1;

			// ���̸ӿ��� ������������ �����޾� ���� >> Ű����(1~3)
			// => �Է°��� 1~3 ������ ������ �ƴ� ��� ���Է�
			int gamer;
			while (true) {
				System.out.print("���������� �Է�[1:����, 2:����, 3:��] >> ");
				gamer = scanner.nextInt();
				if (gamer >= 1 && gamer <= 3)
					break;
				System.out.println("[����] ����, ����, �� �� �� �ϳ��� �Է��ϼ���.");
				System.out.println();			
			}

			// ��ǻ�Ϳ� ���̸��� ���������� �Է°� ���
			System.out.print("[�Է�]��ǻ�� = ");
			if (com == 1)
				System.out.print("����");
			else if (com == 2)
				System.out.print("����");
			else
				System.out.print("��");

			System.out.print(", ���̸� = ");
			if (gamer == 1)
				System.out.print("����");
			else if (gamer == 2)
				System.out.print("����");
			else
				System.out.print("��");

			System.out.println();

			// ��ǻ�Ϳ� ���̸��� ���������� �Ǵ��Ͽ� ��� ���
			if (com == gamer) {
				System.out.println("[���]��ǻ�Ϳ� ���̸Ӱ� ���� �����ϴ�.");
			} else if ((com == 1 && gamer == 2) || (com == 2 && gamer == 3) || (com == 3 && gamer == 1)) {
				System.out.println("[���]���̸Ӱ� ��ǻ�Ϳ��� �̰���ϴ�.");
				count++; // ����Ƚ�� ����
			} else {
				System.out.println("[���]��ǻ�Ͱ� ���̸ӿ��� �̰���ϴ�.");
				break;// ���Ӵ������
			}
			System.out.println();

		}

		System.out.println();
		if (count == 0) {
			System.out.println("[�޼���]���̸Ӱ� ��ǻ�Ϳ��� �� ���� �̱��� ���߽��ϴ٤Ф�");
		} else {
			System.out.println("[�޼���]���̸Ӱ� ��ǻ�Ϳ��� " + count + "�� �������� �̰���ϴ�.");
		}
		scanner.close();
	}
}
