package basic;

//��ǻ�ͷκ��� ������ �����޾� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class MathRandomApp_0417_3 {
	public static void main(String[] args) {
//Math Ŭ����: ���� ���� ����� �����ϴ� Ŭ����
//Math.random() : 0.0 ���� ũ�ų� ���� 1.0���� ���� �Ǽ������� ��ȯ
		System.out.println("<< Math.random() >>");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° �Ǽ�����(0.0~1.0) = " + Math.random());
		}

		System.out.println();

		// 0~99 ������ ���������� �����޾� ���
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° ��������(0~99) = " + (int) (Math.random() * 100));
		}
		System.out.println();

		// 0~45 ������ ���������� �����޾� ���
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° ��������(0~45) = " + ((int) (Math.random() * 100)%45+1));
		}
		System.out.println();

	}
}
