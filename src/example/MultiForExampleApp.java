package example;

public class MultiForExampleApp {
	public static void main(String[] args) {

		// �ڡڡڡڡ�
		// �ڡڡڡ�
		// �ڡڡ�
		// �ڡ�
		// ��

		// <���1>
		for (int i = 1; i <= 5; i++) { // �� 5�� > 5�� �ݺ�
			for (int j = 1; j <= 6 - i; j++) {// �ݺ��Ǵ� Ƚ���� �ٸ��� > ���ǽĿ� ��� ���� ����(i ����ؼ�)
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// <���2>
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// �ڡڡڡڡ�
		// �١ڡڡڡ�
		// �١١ڡڡ�
		// �١١١ڡ�
		// �١١١١�

		// <���1>
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// <���2>
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("��");// ���ʿ� �ִ� ��������� ���
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// �١١١١�
		// �١١١ڡڡ�
		// �١١ڡڡڡڡ�
		// �١ڡڡڡڡڡڡ�
		// �ڡڡڡڡڡڡڡڡ�

		for (int i = 1; i <= 5; i++) {// ����� ó��
			for (int j = 1; j <= 5 - i; j++) {// ��������� ���
				System.out.print("��");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("��");
			}
			System.out.println();
		}

		System.out.println();

		// �ڡ١١١�
		// �١ڡ١ڡ�
		// �١١ڡ١�
		// �١ڡ١ڡ�
		// �ڡ١١١�

		for (int i = 1; i <= 5; i++) { //
			for (int j = 1; j <= 5; j++) { // �� �� ���� �ǹ̰� 5X5�� 25�� ����ϰڴٴ� �ǹ�
				if (i == j)
					System.out.print("��"); // if (i == j || i + j == 6)���� �ѹ��� ǥ������
				else if (i + j == 6)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// A
		// BC
		// DEF
		// GHIJ

		char mun = 'A'; //���������
		for (int i = 1; i <= 4; i++) { // �� 4�� > 1-4���� �ݺ��ǵ���
			for (int j = 1; j <= i; j++) {
				System.out.print(mun);
				mun++;
			
			}
			System.out.println();

		}
	
	
	
	
	}
}
