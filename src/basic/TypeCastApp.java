package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("연산결과 = "+(3+1.5));
		
		System.out.println("몫 = "+(95/10));//9(둘다 int > 소수점 자리 표현X)
		System.out.println("몫 = "+(95.0/10));//9.5(하나가 double과 int 연산 > int가 double로 자동형변환 > 소수점 표현된다)
		
		
		double result = 95/10.0;
		System.out.println("result = "+result);
		
		byte su1=10,su2=20;
		//byte su3=su1+su2;//byte 변수를 연산할 경우 자동으로 int 자료형으로 형변환
		// => 연산 결과(int)를 byte 변수에 저장할 경우 에러 발생 >> 변수를 int로 변환해줘야
		int su3=su1+su2;
		System.out.println("su3 = "+su3);
		
		
		
		
		double su=12.0;
		System.out.println("정수상수 = "+su);		
		System.out.println("정수상수 = "+(int)su);
		
		int num1=95, num2=10;
		double num3=(double)num1/num2;//(double) 넣지 않으면 결과가 9로 나온다
		System.out.println("num3 = "+num3);	
		
		double num=12.3456789;
		System.out.println("num = "+num);
		//소수 2째자리수까지 표현하고 싶을 때
		System.out.println("num = "+(int)(num*100)/100.);//내림
		System.out.println("num = "+(int)(num*100+0.5)/100.0);//반올림
		System.out.println("num = "+(int)(num*100+0.9)/100.0);//올림
		
	}
}