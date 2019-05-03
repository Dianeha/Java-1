package basic;

public class DoubleArrayApp_04191 {
	public static void main(String[] args) {

		int[][] num = new int[2][3];

		System.out.println("num = " + num);
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		System.out.println("========================================");

		System.out.println("num[0][0] = " + num[0][0]);
		System.out.println("num[0][1] = " + num[0][1]);
		System.out.println("num[0][2] = " + num[0][2]);
		System.out.println("num[1][0] = " + num[1][0]);
		System.out.println("num[1][1] = " + num[1][1]);
		System.out.println("num[1][2] = " + num[1][2]);
		System.out.println("========================================");

		System.out.println("num.length = " + num.length);
		System.out.println("num[0].length = " + num[0].length);
		System.out.println("num[1].length = " + num[1].length);
		System.out.println("========================================");

		// 2���� �迭�� for�� 2�� ��� �ϰ�ó�� ����
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
		System.out.println("========================================");

		int[][] su = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int[] array : su) {
			for (int temp : array) {
				System.out.println(temp + "  ");
			}
			System.out.println();
		}
		System.out.println("========================================");

		// �л��̸��� ����, ����, ���� ������ �Է¹޾� �л� �����հ�� ���� �����հ�,
		// ��ü�л��� �����հ� ����� ���
		// ex) ȫ�浿 80 90 100 270
		// ...
		// ���� 88 92 90 270
		// ���հ� 392 380 370 1140
		String[] name = { "ȫ�浿", "�Ӳ���", "����ġ", "������", "����", "���հ�" };
		int[][] score = { { 80, 90, 100, 0 }, { 76, 89, 77, 0 }, { 78, 99, 87, 0 }, { 98, 99, 100, 0 },
				{ 88, 92, 90, 0 }, { 0, 0, 0, 0 } };

		// �л� ���� �հ�� ���� �����հ�, ��ü �л��� �����հ� ���
		for (int i = 0; i < score.length-1; i++) { //������
			for (int j = 0; j < score[i].length-1; j++) { //������
				//score[i][j] : �л��� ���� ���� >  �л������հ�, ���������հ�, ��ü�����հ� 3���� ������Ű��
				
				//�л������հ� : ���� �� ������ �� ��ҿ� �� ���� ������ ������Ų ��
				score[i][score[i].length-1]+=score[i][j];
				
				//���� �����հ� : ������ �࿡ ���� ���� ��ҿ� ���� ����
				score[score.length-1][j]+=score[i][j];
			
				//��ü �����հ� ���: �������� ������ �� ��ҿ� ���� ����
				score[score.length-1][score[i].length-1]+=score[i][j];
				
			}
		}

		// �л��̸�, ������ ������ �� �հ���� ���
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
