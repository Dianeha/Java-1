package example;

public class VariableExampleApp {
	public static void main(String[] args) {
	//1. ������ ���̰� 10�̰� ������ ���̰� 7�� �簢���� ���̸� ����Ͽ� ����ϼ���.
	
	int width = 10, length = 7;//�Է�
	int area=width*length;//ó��
	System.out.println("1. �簢���� ���� = " +area);//���
		
		
	
	//2. �ڵ��� �� ���� ������ 2000������ ��� 10�� ���Ž� �����ؾ� �� �ݾ�
	
	int acar= 20000000, count=10;
	int price=acar*count;
	System.out.println("2. �� ���ұݾ� = " +price+"��");
	
	
	
	//3. �غ��� ���̰� 15�̰� ���̰� 9�� �ﰢ���� ���̸� ����Ͽ� ���
	
	int x=15, y=9; //�غ� = x, ���� = 9 // double x=15�� �δ� ���� �������� �ʴ´�. ����ڰ� ���� ��°��� 15.0���� ǥ���Ǳ� ����
	double area2= x*y/2.; 
	System.out.println("3. �ﰢ���� ���� = "+area2);

	/*
		 * 3���� �ǿ����� �� �ϳ��� �Ǽ��� ����� �ش�. double area2= (double)x*y/2; �̷��Ե� ���� =�� �������� ���� ��
		 * ��� �� ���ʿ� �����ϴ� ������ ����. ��, x*y/2�� �ǿ����ڰ� ��� int���� ����� 67�� ������ ���Կ����ڸ� ���� ���ʿ�
		 * ����ǹǷ� ������� 67.0���� ���´�
		 */
		
	
	
	//4. 30�� ��ü �ο��� �����԰� 1895kg�� ��� 1�δ� ��� ������	
		
	int cnt = 30, totWeight = 1895; // pnum ��ü �ο� ��, weight ��ü ������
	double aveWeight = (double)totWeight/cnt;
	System.out.println("4. 1�δ� ��� ������ = "+aveWeight+"kg");
		
		//�Ҽ��� 2�ڸ������� ����ϵ� �ݿø��Ͻÿ�.
	System.out.println("4. 1�δ� ��� ������ = "+(int)(aveWeight*100+0.5)/100.+"kg");
		
		//Sysout.printf("��³��� �� ��¼���", ��´��,...):ȭ�鿡 ���ϴ� ���
		//	=> ��´���� ��¼��Ŀ� �°� ǥ���ϱ� ���� �޼ҵ�
		//	=> ��¼��İ� ��´���� ������ �ݵ�� ��ġ�ؾ� �ϰ� ���������� ��� ó����	
		// %.2f : �Ǽ������ �Ҽ��� 2�ڸ������� ��µǵ��� ó�� - �������� �ݿø�
	System.out.printf("4. 1�δ� ��� ������ = %.2fkg\n",aveWeight);
	
	
	
	
	//5. ����� �Ѵ��� ������ 1�� 5õ���� ��� 20�븦 ������ ��� �ݾ�
	
	int airplane = 150000000, num = 20;
	long ap_price = (long)airplane*num;
	///airplane*num�� int�� ǥ���� �� �ִ� ������ �Ѿ�� ���� > ���� ���(�캯) ũ�Ⱑ int�� �ʰ��ϹǷ� �º������� long���� �ٲ���
	//(long)airplane*num�� (long)airplane (longŸ��) X num (intŸ��)	= ��ü longŸ�� ����ȯ
	System.out.println("5. ����� �� ���� �ݾ� = "+ap_price+"��");
		
	
	/*6. �̸��� "ȫ�浿"�� �л��� ���輺���� ���� 87��, ���� 93��, ���� 80���Դϴ�.
	���輺���� ������ ����� ����Ͽ� �̸�, ����, ����� ����ϼ���.
	��, ����� �Ҽ��� ���ڸ������� ��µǵ��� �ϰ� �������� ����ó���ϼ���*/
	
		
		 String name="ȫ�浿";
		 int kor = 87, eng = 93, mat = 80; 
		 int tot = kor+eng+mat; 
		 double ave = tot/3.; //�ǿ����� �� ��� �ϳ��� �Ǽ������� ������ش�. 1. (double)�� ���̰ų� 2. ��� 3�� 3.���� �ٲ۴�.
		 System.out.println("6. �̸�  : " + name);
		 System.out.println("   ����  : " + tot + "��");
		 System.out.println("   ���1 : " + ave + "��");
		 System.out.println("   ���2 : " + (int)(ave*100)/100.0 + "��");
		 
	
	}
}