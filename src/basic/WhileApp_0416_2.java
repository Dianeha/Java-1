package basic;

public class WhileApp_0416_2 {
	public static void main(String[] args) {
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		int i = 1;
		while (i <= 5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println();

		
		
		// 1~100 ������ �������� �հ踦 ����� ����Ͻÿ�.
		int num = 1, tot = 0;
		while (num <= 100) {
			tot += num;
			num++;
		}
		System.out.println("1~100 ������ �������� �հ� = " + tot);

		
		
		// 101~200 ������ �������� �հ踦 ����� ����Ͻÿ�.
		int n = 101, t = 0;
		do {
			t += n;
			n++;
		} while (n <= 200);
		System.out.println("1~100 ������ �������� �հ� = " + t);
		System.out.println();

		// A4 ������ ������ ��� ���� ������ ��� �簢�� ����� 500�� �̻��� �Ƿ���
		// �� �� ������ ��ġ�� �Ǵ��� ����Ͽ� ����ϼ���.
		int gae = 1, cnt = 0; // gae: �簢�� ����� ����
		while (gae < 500) { // ���� ������ �ݺ�
			cnt++;
			gae *= 2;
		}
		System.out.println(cnt + "�� ������ ��ġ�� �簢�� ����� " + gae + "���� �߻��˴ϴ�.");
		System.out.println();


		
		// 1���� X������ �������� �հ谡 300 �̻� �Ƿ��� X ����� �������� ���
		int x = 0, xtot = 0;
		while (xtot < 300) {
			x++;
			xtot += x;
		}
		System.out.println("1 ~ " + x + " ���� �������� �հ� = 300");
		System.out.println();

		
		
		
	}
}
