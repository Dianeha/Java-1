package basic;

public class OperatorApp {
public static void main(String[] args) {
	System.out.println("<<�ֿ켱 ������>>");
	System.out.println("20 + 10 * 4 = " + 20+10*4 );
	System.out.println("20 + 10 * 4 = " +(20+10*4));
	System.out.println("20 + 10 * 4 = " +(20+10)*4);
	System.out.println("================================================================================================");
	
	System.out.println("<<���� ������>>");
	int a1 =-10;
	System.out.println("a1 = "+a1);
	System.out.println("-a1 = "+(-a1));
	a1=-a1;//���Կ����ڸ� ��� a1�� 10���� �����. ����ó���� �캯�����ϰ� �� ����� �º��� ������/���Կ����ڰ� ���� �������� ����Ǳ� ����
	System.out.println("new a1 = "+a1);
	
	boolean a3 = false;
	System.out.println("a3 = " + a3);
	System.out.println("!a3 = " +!(a3));//���길 �ϰ� ������ ���� �ƴ�
	a3=!a3;//���ο� ���� a3�� �����
	System.out.println("a3 = "+ a3);
	
	double a4=12.3;
	System.out.println("a4 = " + a4);
	System.out.println("(int)a4 = " + (int)a4);
	
	int a5=10, a6=10;
	System.out.println("a5 = " +a5+", a6 = " +a6);
	System.out.println("++a5 = " +(++a5)+", a6++ = " +(a6++)); //���ϸ���� �ƴѰ�� �������� ��ġ�� �ٸ� ���� a6++�� ���� ���� ��ó��. +1�� ����ȵ�.

		/*
		 * ++a5;//a5=a5+1; 
		 * --a6;//a6=a6-1; 
		 * System.out.println("a5 = " +a5+", a6 = "+a6);
		 */
	
	//��������θ� ������ ���ϸ���� ��� �������� ��ġ�� ������� ������ ����� �����Ѵ�
	a5++;
	a6--;
	System.out.println("a5 = " +a5+", a6 = " +a6);
	System.out.println("================================================================================================");

	System.out.println("<<��� ������>>");
	int c1=20, c2=10;
	System.out.println(c1 + " + " + c2 + " = " + (c1+c2));
	System.out.println(c1 + " - " + c2 + " = " + (c1-c2));
	System.out.println(c1 + " * " + c2 + " = " + (c1*c2));
	System.out.println(c1 + " / " + c2 + " = " + (c1/c2));
	System.out.println(c1 + " % " + c2 + " = " + (c1%c2));
	
	//X % Y = ��� : 0 > ���ǥ���� ��밡��
	//X % Y = ��� : 0 ~ Y-1 > ����ǥ����
	System.out.println("20 % 4 = "+(20%4));
	System.out.println("21 % 4 = "+(21%4));
	System.out.println("22 % 4 = "+(22%4));
	System.out.println("23 % 4 = "+(23%4));
	System.out.println("24 % 4 = "+(24%4));
	System.out.println("================================================================================================");
	
	System.out.println("<<���� ������>>");
	System.out.println("20 >= 10 = "+(20>=10));
	System.out.println("20 < 10 = "+(20<10));
	System.out.println("20 == 10 = "+(20==10));
	System.out.println("20 != 10 = "+(20!=10));
	
	//���ǥ������ ����� 0�� ���Ͽ� ó���ϴ� ��찡 ����(����̸� A��ó��, ����� �ƴϸ� B�� ó�� ��)
		/*
		 * System.out.println("20 % 4 == 0 = "+(20%4==0));
		 * System.out.println("21 % 4 == 0 = "+(21%4==0));
		 */
	System.out.println("================================================================================================");

	
	System.out.println("<<�� ������>>");
	int d1=20,d2=10, d3=15;
	
	//X>Y1 && X<Y2 : X�� Y1(���� ��)~Y2(ū ��) ������ �������� �Ǵ��� �� �ַ� ���
	System.out.println("d1 > d3 && d2 < d3 = "+(d1>d3&&d2<d3));//��������(&&)���� ���迬����(><)�� ���� ó����
	//X=Y1 || X=Y2 : X�� Y1 �Ǵ� Y2 �� �ϳ��� �������� �Ǵ��� �� �ַ� ��� 
	System.out.println("d1 < d3 || d2 < d3 = "+(d1<d3||d2<d3));
	
	int d4=30;
	//ù��° ������� ����� false�� ��� && �����ڴ� �ι�° ����� �̽���
	System.out.println("d1 > d4 && d2 < d4 = "+(d1>d4&&d2<d4));
	//ù��° ������� ����� true�� ��� || �����ڴ� �ι�° ����� �̽���
	System.out.println("d1 < d4 || d2 < d4 = "+(d1<d4||d2<d4));

	
	//&��|�� �ѹ��� ���� ���) ������ ��� ������� �����Ͽ� �� �� false �Ǵ� true �Ǵ�
	System.out.println("d1 > d4 & d2 < d4 = "+(d1>d4&d2<d4));
	System.out.println("================================================================================================");
	
	System.out.println("<<���� ������>>");
	int e1=20, e2=10;
	System.out.println("ū�� = "+(e1>e2?e1:e2));

	int e3=95, e4=10; //e3 : �Խñ� ����, e4 : �������� ��� �Խñ� ����
	int e5=e3/e4+(e3%e4==0?0:1);//e5 : ��ü ��������
	System.out.println("��ü �������� = "+e5);

	int e6=85;//e6 : ����
	//��7 : ������ ���� ����
	// => 90 �̻�: A, 89 ~ 80: B, 79 ~ 70: C, 69 ~ 60: D, 59 ���� : F
	char e7=e6>=90?'A':e6>=80?'B':e6>=70?'C':e6>=60?'D':'F';
	System.out.println("���� = "+e6+", ���� = "+e7);
	System.out.println("================================================================================================");

	System.out.println("<<���� ������>>");
	int f1=100;
	System.out.println("f1 = "+f1);
	
	f1+=200;//f1=f1+200
	System.out.println("f1 = "+f1);

	int f2,f3;
	f2=f3=300;//���Կ����ڴ� ���� ������ �����ʿ��� �������� �����Ѵ�.
	System.out.println("f2 = "+f2+", f3 = "+f3);
	
}
}
