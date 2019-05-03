package example;

public class ForExampleApp_0416 {
	public static void main(String[] args) {
		// 1�� //���� �̸��� ȭ�鿡 7�� ����ϼ���.
		//

		for (int i = 1; i <= 7; i++) {
			System.out.print("�ϴٿ�");
		}
		System.out.println();
		System.out.println();

		// 2�� //1~10 ������ ���� �� ¦���� ȭ�鿡 ����ϼ���.
		// ex)2 4 6 8 10
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();

		// ���2
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println();

		// 3�� // 1~100 ������ �������� 3�� ��� �հ�� 5�� ��� �հ踦 ����Ͽ�
		// 3�� ��� �հ迡�� 5�� ��� �հ踦 �� ����� ����� ��� 633
		
		int tot_3=0, tot_5=0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) tot_3+=i;
			if (i%5==0) tot_5+=i;
		}
		System.out.println(tot_3-tot_5);
		System.out.println();
		
				
		/*
		 int tot_3 = 0; 
		 for (int i = 1; i <= 100; i++) { 
		 if (i % 3 == 0) { tot_3 += i;
		 	} 
		 }
		 
		 int tot_5 = 0; 
		 for (int i = 1; i <= 100; i++) { 
		 if (i % 5 == 0) { tot_5 += i;
		 	} 
		 }
		 
		 if (tot_3 > tot_5) { 
		 System.out.println(tot_3 - tot_5); 
		 } else {
		 System.out.println(tot_5 - tot_3); 
		 }
		 */
		System.out.println();

		// ������ �� 7���� ȭ�鿡 ����ϼ���
		// 7 * 1 = 7
		int dan=7;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		System.out.println();

		// 5!�� ������� ����� ����ϼ���
		/*
		 int tot = 1; 
		 for (int i = 1; i <= 5; i++) { 
		 tot *= i; 
		 }
		 */
		
		int num=5, fac=1;
		for (int i = num; i >=1; i--) {
			fac*=i;
		}
				
		System.out.println(num+"! = "+fac);
		System.out.println();

		// �� ���������� ����� ��� ������ �������� ȭ�鿡 ����ϼ���.
		// ��, �� �ٿ� ��������� 7���� ��µǵ��� �ۼ��ϼ���.
		// ex) 36 37 38 39 40 41 42
		// 43 44 45 46 47 48 49
		// 50 51 52 53 54 55 56
		// 57
		
		/*
		int start = 36, end = 57; 
		for (int i = start; i <= end; i++) {
			System.out.print(i + " "); 
			if (i % 7 == 0) { System.out.println(); } }
		 */
		
		int start = 36, end = 57;
		int cnt = 0; // ��� ������ �����ϱ� ���� ���� - ����� ����� ������ 1�� ����
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
			cnt++;
			if (cnt % 7 == 0)
				System.out.println();
		}	
		System.out.println();
		System.out.println();

		// �� ���������� ����� ��� ������ �������� �հ踦 ����Ͽ� ����ϼ���.
		// ��, �� ���������� ����� ���� �ݴ��� ��쿡�� ���� ����� ��µǵ��� �ۼ��ϼ���.
		// ex) 17 ~ 79 ������ ���� �հ� = 3024
		int begin = 79, last = 17;

		if (begin > last) {
			int temp = begin;
			begin = last;
			last = temp;
		}

		int total_sum = 0;
		for (int i = begin; i <= last; i++) {
			total_sum += i;
		}
		System.out.println(begin+" ~ "+last+" ������ ���� �հ� = "+total_sum);

		// int begin=79, last=17;

		
	}

}
