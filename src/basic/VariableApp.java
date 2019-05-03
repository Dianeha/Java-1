package basic;

public class VariableApp {
	public static void main(String[] args) {

		int su;
		
		su = 10;
		System.out.print("변경 전 변수값 = ");
		System.out.println(su);
		//명령이 많을수록 가독성이 떨어짐. 아래처럼 하는 것을 권장
		
		su = 20;
		System.out.println("변경 후 변수값 = "+su);
		
				
		System.out.println("올해는 "+2+0+1+9+"년입니다.\n");
		
		System.out.println(2+0+1+9+"년은 돼지띠입니다.");
		System.out.println(""+2+0+1+9+"년은 돼지띠입니다.\n");//결합은 " 사용
		
		System.out.println("결과 = "+10+20);
		System.out.println("결과 = "+(10+20));//먼저 연산하고 싶으면 ()
		
		System.out.println("결과 = "+10*20); //수식계산할때처럼 *가 +보다 우선
		System.out.println("결과 = "+(10*20)); //위와 같은 식이지만 속도가 더 빠름(무엇을 먼저 계산할지 판단하는 과정이 생략됨)
		
		//변수 선언 및 초기화 작업 - 변수를 생성하여 초기값(상수)를 저장
		int num=30;
		System.out.println("num = " + num);
		
		//동일한 자료형의 변수는, 기호를 이용하여 나열 선언 가능
		int kor=80,eng=90,mat=100;
		int tot=kor+eng+mat;
		System.out.println("점수합계 = "+tot+"점");
	
 
		/*
		int age; //변수에 상수가 저장되어 있지 않은 상태에서 사용할 경우 에러 발생 - 초기화 에러
		System.out.println("나이 = "+age);
		 */
		
		/* 변수에 저장될 수 없는 크기의 상수를 저장할 경우 에러 발생 - 데이터 손실 방지 
		 
		 int age=20.0;
		 System.out.println("나이 = "+age);
		
		 - int는 정수형(4byte), 20.0는 실수형(8byte) 자료형이 맞지 않음(작은 그릇에 큰 음식을 담는 것처럼) > 데이터 손실 발생 가능
		 - 반대의 경우는 가능 ex) double에 정수형 (큰 그릇에 작은 음식) > 데이터 손실 X 
		 - type mismatch라는 문구 */
		
	}
	
}
