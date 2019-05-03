package example;

public class IfexampleApp_0415 {
	public static void main(String[] args) {
		// 1. ���ں����� ����� ����� ����ϼ���.
		// ��, ����� ����� ���ĺ� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun = 'x';

		if (mun >= 'a' && mun <= 'z')// �ҹ��ڸ� ǥ���ϴ� ��
			mun -= 32; // {}����
		System.out.println("1. mun = " + mun);
		System.out.println("====================================================");

		// 2. ���������� ����� ����� 4�� ������� �ƴ����� �����Ͽ� ����ϼ���.
		int su = 345644;

		if (su % 4 == 0) {
			System.out.println("2. " + su + "��(��) 4�� ����Դϴ�.");
		} else {
			System.out.println("2. " + su + "��(��) 4�� ����� �ƴմϴ�.");
		}

		System.out.println("====================================================");
		// 3. ���ذ� ������� ���������� �����Ͽ� ����ϼ���.
		// => ������ 4�� ������ �������� 0�� ��� ����
		// => �� ������ �����ϴ� ���� �� 100���� ������ �������� 0�� ��� ���
		// => �� ������ �����ϴ� ���� �� 400���� ������ �������� 0�� ��� ����
		int year = 2019;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("3. " + year + "���� �����Դϴ�.");
		} else {
			System.out.println("3. " + year + "���� ����Դϴ�.");
		}

		System.out.println("====================================================");
		// 4. �̸��� "ȫ�浿"�� �л��� ���輺���� ���� 87��, ���� 93��, ���� 80���Դϴ�.
		// �̸�, ���輺���� ������ ���, ��տ� ���� ������ ����Ͽ� ����ϼ���.
		// => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F(��� ó���� switch ����� ����� ��)
		// => ����, ����, ���� ���� �� �ϳ��� 0~100 ������ �ƴ� ��� ���α׷� ���� : System.exit(0);
		// ��, ����� �Ҽ��� ���ڸ������� ��µǵ��� �ϰ� �������� ����ó���ϼ���

		String name = "ȫ�浿";
		int kor = 87, eng = 93, mat = 80;

		// if (kor>=100 || kor<=0) ���� ����
		// �Է°� ��ȿ�� �˻� **
		/*
		 * if (!(kor <= 100 && kor >= 0) || !(eng <= 100 && eng >= 0) || !(mat <= 100 &&mat >= 0)) { 
		 * System.out.println("[����]���������� ������ �ԷµǾ����ϴ�."); 
		 * System.exit(0); 
		 * }
		 */

		boolean valid = false;
		if (kor < 0 || kor > 100) {
			System.out.println("[����]���������� ���������� �ԷµǾ����ϴ�.");
			valid = true;
		}

		if (eng < 0 || eng > 100) {
			System.out.println("[����]���������� ���������� �ԷµǾ����ϴ�.");
			valid = true;
		}

		if (mat < 0 || mat > 100) {
			System.out.println("[����]���������� ���������� �ԷµǾ����ϴ�.");
			valid = true;
		}

		if (valid) {
			System.exit(0);
		}

		
		
		
		int tot = kor + eng + mat;
		double ave = tot / 3.;

		String grade = "";
		switch ((int) ave / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		System.out.println("4. �̸� = " + name);
		System.out.println("   ���� = " + tot + "��");
		System.out.println("   ��� = " + (int) (ave * 100) / 100.0 + "��");
		System.out.println("   ���� = " + grade);
		System.out.println("====================================================");

	}
}
