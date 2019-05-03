package basic;

// java는 class 안에 method 안에 명령이 선언되는 구조
// 나머지 언어들은 class 밖에서도 전역변수(global variable) 존재
public class LocalVariableApp0415_2 {
	int a;// class 안에 있지만 메소드 밖에 있으므로 local variable이 아니고 field

	public static void main(String[] args) {
		// 지역변수(Local Variable) : 메소드 영역(블럭) 안에 선언되어 사용되는 변수
		// => 지역변수는 선언된 블럭 내부에서만 사용 가능 >> 블럭 외부에서 사용 불가 => 블럭이 종료될 경우 블럭 내부에서 선언된 지역변수는 자동소멸
		// 메소드 안에서는 다양한 블럭 사용 가능 - ex) 제어문의 블럭
	int num1=100;//지역변수
	
	//임의블럭
	{
		// int num2=300; //중복선언에러: 이미 선언된 변수를 다시 선언할 경우 에러
		int num2=200;
		System.out.println("========== 임의블럭 내부 시작 ==========");
		//임의블럭 외부에서 선언된 지역변수 사용가능
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		System.out.println("========== 임의블럭 내부 종료 ==========");
		
	}
	System.out.println("num1 ="+num1);
	//System.out.println("num2 ="+num2); //에러발생 > 임의블럭 내부에서 선언된 변수는 임의블럭이 종료된 경우 자동 소멸.
	
	int num2=300; //여기서는 중복 선언 에러 미발생 - num2 변수가 임의블럭 종료시 소멸
	System.out.println("num2 ="+num2);
	}
}
