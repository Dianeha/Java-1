package basic;

public class MultiForApp_0416_1 {
	public static void main(String[] args) {
		/*
		 * A����� B���� Ŀ�ٶ� ���� ���̿� �ΰ� �����Ѵ�. �� ������ ���� �ϳ� ������ A����� �ٸ��� 3�� ������� B����� �ٸ��� 4��
		 * �������. A���󿡼� ���� ���� B����� ���� ����� ��
		 */

		int cnt = 0;// �̵���������� �����ϱ� ���� ����

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				cnt++;
			}
		}
		System.out.println("�̵������ = " + cnt);
		System.out.println();

		// �ڡڡڡڡڡڡ�
		System.out.println("�ڡڡڡڡڡڡ�");
		System.out.println();

		for (int i = 1; i <= 9; i++) { // ��(Row) ���� �ݺ���
			for (int j = 2; j <= 9; j++) { // ����for�� - ��(Column) ���� �ݺ���
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

		/*
		 * int cnt_star=0; for (int i = 1; i <= 35; i++) { System.out.print("��");
		 * cnt_star++; if(cnt_star%7==0) System.out.println(); }
		 */
		System.out.println();

		// �� i=1 
		// �ڡ� i=2
		// �ڡڡ� i=3
		// �ڡڡڡ� i=4
		// �ڡڡڡڡ� i=5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();

		// �١١١١�
		// �١١١ڡ�
		// �١١ڡڡ�
		// �١ڡڡڡ�
		// �ڡڡڡڡ�

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("��");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();   

		// �١١١١�
		// �١١١ڡ�
		// �١١ڡڡ�
		// �١ڡڡڡ�
		// �ڡڡڡڡ�

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j < 6)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}

		
		
		
		
		
	}
}