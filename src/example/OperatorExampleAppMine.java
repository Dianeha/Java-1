package example;

public class OperatorExampleAppMine {
	public static void main(String[] args) {

		// 245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���. (%������ ���)
		int totsec = 245678;
		int day = totsec / (60 * 60 * 24);// totsec/86400
		int hour = (totsec - day * 60 * 60 * 24) / (60 * 60);
		int min = (totsec - day * 60 * 60 * 24 - hour * 60 * 60) / 60;
		int sec = totsec - day * 60 * 60 * 24 - hour * 60 * 60 - min * 60;

		System.out.println(day);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println("��" + day + "��" + hour + "�ð�" + min + "��" + sec + "��");

		int totsec2 = 245678;
		int sec2 = totsec2 % 60;
		int min2 = (totsec2 / 60) % 60;
		int hour2 = totsec2 / 60 * 60; ////////////// ???????????????????????????????????/
		int day2 = totsec2 / (60 * 60 * 24); // int�� �Ҽ��� �Ʒ� ��� �����

		System.out.println(sec2);
		System.out.println(min2);
		System.out.println(hour2);
		System.out.println(day2);
		System.out.println("��" + day2 + "��" + hour2 + "�ð�" + min2 + "��" + sec2 + "��");

		// ����� �Ѵ��� ������ 1�� 5õ���� ��� 20�븦 ������ ��� �ݾ���?
		// ��, 15�� �̻� ������ ��� 25% �������� �����Ͽ� ����Ͻÿ�. (3�� ������ ���)

		int dan = 150000000, su = 20;
		long kum = (long) (su >= 15 ? dan * 0.75 : dan) * su;
		System.out.println("����� ���Ŵ�� = " + kum);

	}

}
