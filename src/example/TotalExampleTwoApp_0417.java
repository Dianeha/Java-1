package example;

import java.util.Scanner;

//Ű����� ������ ��� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, �Էµ� ������ 0�� ��� �Է��� �����Ͽ� �հ� ���
/* ���� �Է�[0:����] >> 10
   ���� �Է�[0:����] >> 20
   ���� �Է�[0:����] >> 30
   ���� �Է�[0:����] >> 0
   [���]�հ� = 60
*/

public class TotalExampleTwoApp_0417 {
	public static void main(String[] args) {
		Scanner scanner2 = new Scanner(System.in);

		int tot = 0;
		while (true) {
			System.out.print("���� �Է�[0:����] >> ");
			int num=scanner2.nextInt();
			if(num==0) break;
			tot += num;
		}
		
		System.out.println("[���]�հ� = "+tot);
		scanner2.close();
	}
}
