package basic;

// java�� class �ȿ� method �ȿ� ����� ����Ǵ� ����
// ������ ������ class �ۿ����� ��������(global variable) ����
public class LocalVariableApp0415_2 {
	int a;// class �ȿ� ������ �޼ҵ� �ۿ� �����Ƿ� local variable�� �ƴϰ� field

	public static void main(String[] args) {
		// ��������(Local Variable) : �޼ҵ� ����(��) �ȿ� ����Ǿ� ���Ǵ� ����
		// => ���������� ����� �� ���ο����� ��� ���� >> �� �ܺο��� ��� �Ұ� => ���� ����� ��� �� ���ο��� ����� ���������� �ڵ��Ҹ�
		// �޼ҵ� �ȿ����� �پ��� �� ��� ���� - ex) ����� ��
	int num1=100;//��������
	
	//���Ǻ�
	{
		// int num2=300; //�ߺ����𿡷�: �̹� ����� ������ �ٽ� ������ ��� ����
		int num2=200;
		System.out.println("========== ���Ǻ� ���� ���� ==========");
		//���Ǻ� �ܺο��� ����� �������� ��밡��
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		System.out.println("========== ���Ǻ� ���� ���� ==========");
		
	}
	System.out.println("num1 ="+num1);
	//System.out.println("num2 ="+num2); //�����߻� > ���Ǻ� ���ο��� ����� ������ ���Ǻ��� ����� ��� �ڵ� �Ҹ�.
	
	int num2=300; //���⼭�� �ߺ� ���� ���� �̹߻� - num2 ������ ���Ǻ� ����� �Ҹ�
	System.out.println("num2 ="+num2);
	}
}
