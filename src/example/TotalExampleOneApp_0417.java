package example;

import java.util.Scanner;

//Ű����� ���� 5���� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
/* 1��° ���� �Է� >> 10
 * 2��° ���� �Է� >> 20
 * 3��° ���� �Է� >> 30
 * 4��° ���� �Է� >> 40
 * 5��° ���� �Է� >> 50
 * [���] �հ� = 150
 */
public class TotalExampleOneApp_0417 {
	public static void main(String[] args) {
	/*	int a1, a2, a3, a4, a5;
		Scanner n = new Scanner(System.in);

		System.out.println("1��° ���� �Է� >> ");
		a1 = n.nextInt();
		System.out.println("2��° ���� �Է� >> ");
		a2 = n.nextInt();
		System.out.println("3��° ���� �Է� >> ");
		a3 = n.nextInt();
		System.out.println("4��° ���� �Է� >> ");
		a4 = n.nextInt();
		System.out.println("5��° ���� �Է� >> ");
		a5 = n.nextInt();
		System.out.println("[���] �հ� = " + (a1 + a2 + a3 + a4 + a5));
		
		n.close(); */
		
		Scanner scanner = new Scanner(System.in);

		
		// ������ �Է¹޾� �հ踦 ����ϴ� ���� - 5�� �ݺ�
		int tot = 0; // tot �� ���Ӱ� ������ְ�
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "��° ���� �Է� >> ");
			// int num = scanner.nextInt();//num�̶�� ������ Ű���带 ���� �Էµ� ���� �����ϴ� ����
			// tot+=num;// ���� ǥ������ ������
		
			tot+=scanner.nextInt(); //�Էµ� ���� num�̶�� ������ �����ߴٰ� �ٽ� tot�� ���ϴ� ���� �ƴ϶�
			//�ٷ� Ű���忡�� �޾Ƽ� tot�� �����ϴ� ���, ������ ���������� ������� �ʴ� ���� 
			//���������� ����
		}
		
		System.out.println("[���] �հ� = "+tot);
		scanner.close();
	}

}
