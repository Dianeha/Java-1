package example;

public class VariableExampleApp {
	public static void main(String[] args) {
	//1. 가로의 길이가 10이고 세로의 길이가 7인 사각형의 넓이를 계산하여 출력하세요.
	
	int width = 10, length = 7;//입력
	int area=width*length;//처리
	System.out.println("1. 사각형의 넓이 = " +area);//출력
		
		
	
	//2. 자동차 한 대의 가격이 2000만원인 경우 10대 구매시 지불해야 할 금액
	
	int acar= 20000000, count=10;
	int price=acar*count;
	System.out.println("2. 총 지불금액 = " +price+"원");
	
	
	
	//3. 밑변의 길이가 15이고 높이가 9인 삼각형의 넓이를 계산하여 출력
	
	int x=15, y=9; //밑변 = x, 높이 = 9 // double x=15로 두는 것을 권장하지 않는다. 사용자가 보는 출력값이 15.0으로 표현되기 때문
	double area2= x*y/2.; 
	System.out.println("3. 삼각형의 넓이 = "+area2);

	/*
		 * 3개의 피연산자 중 하나를 실수로 만들어 준다. double area2= (double)x*y/2; 이렇게도 가능 =의 오른쪽을 먼저 다
		 * 계산 후 왼쪽에 대입하는 순서로 계산됨. 즉, x*y/2의 피연산자가 모두 int여서 계산이 67로 나오고 대입연산자를 통해 왼쪽에
		 * 저장되므로 결과값이 67.0으로 나온다
		 */
		
	
	
	//4. 30명 전체 인원의 몸뭄게가 1895kg인 경우 1인당 평균 몸무게	
		
	int cnt = 30, totWeight = 1895; // pnum 전체 인원 수, weight 전체 몸무게
	double aveWeight = (double)totWeight/cnt;
	System.out.println("4. 1인당 평균 몸무게 = "+aveWeight+"kg");
		
		//소숫점 2자리까지만 출력하되 반올림하시오.
	System.out.println("4. 1인당 평균 몸무게 = "+(int)(aveWeight*100+0.5)/100.+"kg");
		
		//Sysout.printf("출력내용 및 출력서식", 출력대상,...):화면에 원하는 결과
		//	=> 출력대상을 출력서식에 맞게 표현하기 위한 메소드
		//	=> 출력서식과 출력대상의 갯수가 반드시 일치해야 하고 순차적으로 출력 처리됨	
		// %.2f : 실수상수를 소숫점 2자리까지만 출력되도록 처리 - 나머지를 반올림
	System.out.printf("4. 1인당 평균 몸무게 = %.2fkg\n",aveWeight);
	
	
	
	
	//5. 비행기 한대의 가격이 1억 5천만인 경우 20대를 구매할 경우 금액
	
	int airplane = 150000000, num = 20;
	long ap_price = (long)airplane*num;
	///airplane*num이 int로 표현할 수 있는 범위를 넘어서기 때문 > 연산 결과(우변) 크기가 int를 초과하므로 좌변변수를 long으로 바꿔줌
	//(long)airplane*num는 (long)airplane (long타입) X num (int타입)	= 전체 long타입 형변환
	System.out.println("5. 비행기 총 구매 금액 = "+ap_price+"원");
		
	
	/*6. 이름이 "홍길동"인 학생의 시험성적은 국어 87점, 영어 93점, 수학 80점입니다.
	시험성적의 총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
	단, 평균은 소수점 두자리까지만 출력되도록 하고 나머지는 내림처리하세요*/
	
		
		 String name="홍길동";
		 int kor = 87, eng = 93, mat = 80; 
		 int tot = kor+eng+mat; 
		 double ave = tot/3.; //피연산자 중 적어도 하나를 실수형으로 만들어준다. 1. (double)을 붙이거나 2. 상수 3을 3.으로 바꾼다.
		 System.out.println("6. 이름  : " + name);
		 System.out.println("   총점  : " + tot + "점");
		 System.out.println("   평균1 : " + ave + "점");
		 System.out.println("   평균2 : " + (int)(ave*100)/100.0 + "점");
		 
	
	}
}