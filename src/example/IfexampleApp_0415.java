package example;

public class IfexampleApp_0415 {
	public static void main(String[] args) {
		// 1. 문자변수에 저장된 상수를 출력하세요.
		// 단, 저장된 상수가 알파벳 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun = 'x';

		if (mun >= 'a' && mun <= 'z')// 소문자를 표현하는 식
			mun -= 32; // {}생략
		System.out.println("1. mun = " + mun);
		System.out.println("====================================================");

		// 2. 정수변수에 저장된 상수가 4의 배수인지 아닌지를 구분하여 출력하세요.
		int su = 345644;

		if (su % 4 == 0) {
			System.out.println("2. " + su + "는(은) 4의 배수입니다.");
		} else {
			System.out.println("2. " + su + "는(은) 4의 배수가 아닙니다.");
		}

		System.out.println("====================================================");
		// 3. 올해가 평년인지 윤년인지를 구분하여 출력하세요.
		// => 연도를 4로 나누어 나머지가 0인 경우 윤년
		// => 위 조건을 만족하는 연도 중 100으로 나누어 나머지가 0인 경우 평년
		// => 위 조건을 만족하는 연도 중 400으로 나누어 나머지가 0인 경우 윤년
		int year = 2019;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("3. " + year + "년은 윤년입니다.");
		} else {
			System.out.println("3. " + year + "년은 평년입니다.");
		}

		System.out.println("====================================================");
		// 4. 이름이 "홍길동"인 학생의 시험성적은 국어 87점, 영어 93점, 수학 80점입니다.
		// 이름, 시험성적의 총점과 평균, 평균에 대한 학점을 계산하여 출력하세요.
		// => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F(평균 처리는 switch 명령을 사용할 것)
		// => 국어, 영어, 수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 종료 : System.exit(0);
		// 단, 평균은 소수점 두자리까지만 출력되도록 하고 나머지는 내림처리하세요

		String name = "홍길동";
		int kor = 87, eng = 93, mat = 80;

		// if (kor>=100 || kor<=0) 역시 가능
		// 입력값 유효성 검사 **
		/*
		 * if (!(kor <= 100 && kor >= 0) || !(eng <= 100 && eng >= 0) || !(mat <= 100 &&mat >= 0)) { 
		 * System.out.println("[에러]비정상적인 점수가 입력되었습니다."); 
		 * System.exit(0); 
		 * }
		 */

		boolean valid = false;
		if (kor < 0 || kor > 100) {
			System.out.println("[에러]비정상적인 국어점수가 입력되었습니다.");
			valid = true;
		}

		if (eng < 0 || eng > 100) {
			System.out.println("[에러]비정상적인 영어점수가 입력되었습니다.");
			valid = true;
		}

		if (mat < 0 || mat > 100) {
			System.out.println("[에러]비정상적인 수학점수가 입력되었습니다.");
			valid = true;
		}

		if (valid) {
			System.exit(0);
		}

		
		
		
		int tot = kor + eng + mat;
		double ave = tot / 3.;

		String grade = "";
		switch ((int) ave / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		System.out.println("4. 이름 = " + name);
		System.out.println("   총점 = " + tot + "점");
		System.out.println("   평균 = " + (int) (ave * 100) / 100.0 + "점");
		System.out.println("   학점 = " + grade);
		System.out.println("====================================================");

	}
}
