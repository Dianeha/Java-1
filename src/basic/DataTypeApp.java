package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("<< 정수형 >>");
		//print() 또는 println() 메소드에서 정수의 연산 결과는 10진수 정수형으로만 출력
		System.out.println("연산 결과 = "+(100+0100+0x100));
		
		System.out.println("정수형 상수(int : 4Byte) = "+2147483647);
		System.out.println("정수형 상수(long : 8Byte) = "+21474836478L);
		
		byte a1 = 127;
		short a2 = 32767;
		int a3 = 2147483647;
		long a4 = 2147483648L;
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		
		//int a5=100L;//에러발생
		long a5=100;//가능 - 상수가 자동 형변환되어 변수에 저장되지만 long은 너무 커서가독성 문제. 
		System.out.println("a5 = "+a5);
		System.out.println("============================================");
		
		System.out.println("<< 실수형 >>");
		System.out.println("실수형 상수(float : 4Byte) = "+1.23F);
		System.out.println("실수형 상수(double : 8Byte) = "+1.23);
		
		//지수형태의 
		System.out.println("지수형태의 실수형 상수 = "+1.23E-9);
		//print() 혹은 println() 메소드에서는 아주 작은 실수상수 또는 아주 큰 
		System.out.println("지수형태의 실수형 상수 = "+0.0000000123);
		
		//float b1 = 1.23456789; 에러발생 - Type mismatch
		float b1 = 1.23456789F;//가수부의 유효자릿수 : 7자리 - 유효자릿수를 벗어난 실수값은 절삭)
		double b2 = 1.23456789;//가수부의 유효자릿수 : 15자리
		
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("============================================");
		System.out.println("문자상수 = "+'A');//일반문자
		System.out.println("문자상수 = "+'\'');//escape 문자
		System.out.println("문자상수 = "+'\"');//escape 문자
		System.out.println("문자상수 = "+'\\');//escape 문자
		System.out.println("문자상수 = "+'\0');//null 문자

		char c1 ='A';
		char c2 =65;//정수상수에 대한 문자코드 = 'A'	
		char c3 ='a'-32;//'a'(code:97) -32 =65('A') 숫자형은 연산이 가능
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println("============================================");
		
		System.out.println("<< 논리형 >>");
		System.out.println("논리형 상수 = "+false);
		//관계식(비교식)의 결과는 논리현 상수로 표현
		System.out.println("비교결과 = "+(20>10));
		
		boolean d1=true;
		boolean d2=20<10;
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("============================================");
		
		System.out.println("<< 문자형 >>");
		System.out.println("문자열 상수 = "+"ABC");
		System.out.println("당신의 이름은 \"홍길동\"입니까?");
		
		String e1="JAVA";
		String e2="JSP";
		//문자열 상수에 + 연산자를 사용할 경우 다른 대상과의 결합으로 표현된다.
		String e3=e1+" & "+e2;
		
		System.out.println("e1 = "+ e1);
		System.out.println("e2 = "+ e2);
		System.out.println("e3 = "+ e3);
		System.out.println("============================================");
		
		
		
		
				
		
				
		
		
	}
	
}
