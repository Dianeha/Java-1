package example;

public class ArrayExampleApp_0418 {
	public static void main(String[] args) {
		// ����鿡 ���� ���̸� �����ϰ� �ִ� �迭 ����
		int[] age = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };

		// �迭�� ����� ������� ��� ���̸� ����Ͽ� ����ϼ���.
		// ex) ��� ���� = 30��(��������������)

		int tot = 0;
		for (int nai : age) {
			tot += nai;
		}

		System.out.println("1. " + age.length + "���� ��� ���� = " + (tot / age.length) + "��");
		System.out.println();

		// �迭�� ����� ������� ���̸� �̿��Ͽ� ���ɺ� �ο����� ����Ͽ� ����ϼ���.
		// ex) 10�� = 3��
		// 20�� = 4��
		// ..
		// 60�� = 2��

		// int cnt_10 = 0, cnt_20 = 0, cnt_30 = 0, cnt_40 = 0, cnt_50 = 0, cnt_60 = 0;
		int[] cnt = new int[6];

		for (int nai : age) {
			/*
			 * if (nai >= 10 && nai < 20) cnt[0]++; else if (nai >= 20 && nai < 30)
			 * cnt[1]++; else if (nai >= 30 && nai < 40) cnt[2]++; else if (nai >= 40 && nai
			 * < 50) cnt[3]++; else if (nai >= 50 && nai < 60) cnt[4]++; else if (nai >= 60)
			 * cnt[5]++; }
			 */

			switch (nai / 10) {
			case 1:
				cnt[0]++;
				break;
			case 2:
				cnt[1]++;
				break;
			case 3:
				cnt[2]++;
				break;
			case 4:
				cnt[3]++;
				break;
			case 5:
				cnt[4]++;
				break;
			case 6:
				cnt[5]++;
				break;
			}
		}
		
		/*
		 * System.out.println("2. 10�� = " + cnt[0] + "��");
		 * System.out.println("   20�� = " + cnt[1] + "��");
		 * System.out.println("   30�� = " + cnt[2] + "��");
		 * System.out.println("   40�� = " + cnt[3] + "��");
		 * System.out.println("   50�� = " + cnt[4] + "��");
		 * System.out.println("   60�� = " + cnt[5] + "��");
		 */
		
		System.out.print("2. ");
		for (int i = 0; i < cnt.length; i++) {
			System.out.println("\t" + (i + 1) + "0�� = " + cnt[i] + "��"); // �̷��� �ϰ�ó��
		}
		System.out.println();
	}
}
