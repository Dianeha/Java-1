package FreeEx;

public class ArrayExampleApp_0418_YS {
	public static void main(String[] args) {

		// �迭�� ����� ������� ���̸� �̿��Ͽ� ���ɺ� �ο����� ����Ͽ� ����ϼ���.
		// ex) 10�� = 3��
		// 20�� = 4��
		// ..
		// 60�� = 2��
		int[] age = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };
		System.out.println("���̴뺰 �з�\n");
		
		for (int i = 0; i < age.length; i++)
			age[i] /= 10;

		for (int j = 1; j <= 6; j++) {
			int cnt = 0;
			for (int i = 0; i < age.length; i++) {
				if (age[i] == j) cnt++;
			}
			System.out.println(j * 10 + "�� = " + cnt + "��");

		}

	}
}
