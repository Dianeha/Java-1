package basic;

public class VariableApp {
	public static void main(String[] args) {

		int su;
		
		su = 10;
		System.out.print("���� �� ������ = ");
		System.out.println(su);
		//����� �������� �������� ������. �Ʒ�ó�� �ϴ� ���� ����
		
		su = 20;
		System.out.println("���� �� ������ = "+su);
		
				
		System.out.println("���ش� "+2+0+1+9+"���Դϴ�.\n");
		
		System.out.println(2+0+1+9+"���� �������Դϴ�.");
		System.out.println(""+2+0+1+9+"���� �������Դϴ�.\n");//������ " ���
		
		System.out.println("��� = "+10+20);
		System.out.println("��� = "+(10+20));//���� �����ϰ� ������ ()
		
		System.out.println("��� = "+10*20); //���İ���Ҷ�ó�� *�� +���� �켱
		System.out.println("��� = "+(10*20)); //���� ���� �������� �ӵ��� �� ����(������ ���� ������� �Ǵ��ϴ� ������ ������)
		
		//���� ���� �� �ʱ�ȭ �۾� - ������ �����Ͽ� �ʱⰪ(���)�� ����
		int num=30;
		System.out.println("num = " + num);
		
		//������ �ڷ����� ������, ��ȣ�� �̿��Ͽ� ���� ���� ����
		int kor=80,eng=90,mat=100;
		int tot=kor+eng+mat;
		System.out.println("�����հ� = "+tot+"��");
	
 
		/*
		int age; //������ ����� ����Ǿ� ���� ���� ���¿��� ����� ��� ���� �߻� - �ʱ�ȭ ����
		System.out.println("���� = "+age);
		 */
		
		/* ������ ����� �� ���� ũ���� ����� ������ ��� ���� �߻� - ������ �ս� ���� 
		 
		 int age=20.0;
		 System.out.println("���� = "+age);
		
		 - int�� ������(4byte), 20.0�� �Ǽ���(8byte) �ڷ����� ���� ����(���� �׸��� ū ������ ��� ��ó��) > ������ �ս� �߻� ����
		 - �ݴ��� ���� ���� ex) double�� ������ (ū �׸��� ���� ����) > ������ �ս� X 
		 - type mismatch��� ���� */
		
	}
	
}
