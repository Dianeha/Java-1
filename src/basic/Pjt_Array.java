package basic;

public class Pjt_Array {
	public static void main(String[] args) {
/* ���1
		String[] classGroup = { "������", "������", "���̶�", "�̰���" };

		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		System.out.println();

		for (int i = 0; i < classGroup.length; i++) {
			System.out.println(classGroup[i]);
		}
*/
// ���2
		String[] classGroup = new String[4];
		classGroup[0] = "������";
		classGroup[1] = "������";
		classGroup[2] = "���̶�";
		classGroup[3] = "�̰���";

		System.out.println(classGroup[1]);
		System.out.println(classGroup.length);

		String[] members = { "������", "������", "���̶�", "�ϴٿ�", "������", "�赿��", "�ֿ���" };
		int cnt=0;
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i] + "���� ����� �޾ҽ��ϴ�");
			cnt++;
			if (cnt==members.length) {
				System.out.println(members.length+"���� ����� ��� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			System.out.println("�� "+(members.length-cnt)+"���� ����� �����ֽ��ϴ�.\n");
		}
	
	
	}

}
