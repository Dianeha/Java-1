package basic;

public class BreakApp_0416_3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				break;
			System.out.println("i = " + i);
		}
		System.out.println();

		loop: // �󺧸�(�ĺ���) : �ݺ����� �ο��ϴ� ��ġ����
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3)
					break loop; // �� ���� break; �� �ϸ�for (int j = 1; j <= 5; j++) ���� ���� �ݺ����� ����
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();

		// 1���� X������ �������� �հ谡 300 �̻� �Ƿ��� X ����� �������� ���
		int x = 1, xtot = 0;
		while (true) { // ���ѷ���, �߰��� break ����ϱ� ������ while(���ǽ� �ڸ�)�� true�� ����.
			xtot += x;
			if (xtot >= 300) break;
			x++;
		}
		System.out.println("1 ~ " + x + " ���� �������� �հ� = 300");
		System.out.println();
		
		
		
		//continue
		for (int i = 1; i <= 5; i++) {
			if (i == 3) continue;
			System.out.println("i = " + i);
		}
		System.out.println();
		
		//-------------------------------------------------------------
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) continue; 
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		//-------------------------------------------------------------
		loop2:
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//if(j == 3) break; �� ������ ����� ����. >> continue ���� �� ���� �ʴ´�.
				if (j == 3) continue loop2; 
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();

		
		//1~100 ������ ������ �� ¦������ �հ� ���
		int tot=0;
		for (int i = 1; i <=100; i++) {
			if (i%2!=0) continue;
			tot+=i;
		}
		System.out.println("1~100 ���� �� ¦������ �հ� = "+tot);
		System.out.println();
	
	
	
	
	
	}
}
