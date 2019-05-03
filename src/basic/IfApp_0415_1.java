package basic;

public class IfApp_0415_1 {
	public static void main(String[] args) {
		int score = 80;

		// 점수가 60점 이상인 경우 합격메세지를 출력하세요.
		if (score >= 60) {
			System.out.println("[메세지]점수가 60점 이상이므로 합격입니다.");
		}
		System.out.println("======================================================");

		score = 50;

		// 점수가 60점 미만인 경우 불합격메세지를 출력하세요.
		if (score < 60) {
			System.out.println("[메세지]점수가 60점 미만이므로 불합격입니다.");
		}
		System.out.println("======================================================");

		score = 80;
		// 점수가 60점 이상인 경우 합격, 60점 미만인 경우 불합격메세지를 출력
		if (score >= 60) {
			System.out.println("[메세지]점수가 60점 이상이므로 합격입니다.");
		} else {
			System.out.println("[메세지]점수가 60점 미만이므로 불합격입니다.");
		}
		System.out.println("======================================================");

		int number = 10;
		// 변수에 저장된 정수상수를 홀수와 짝수로 구분하여 출력하세요.
		/*
		 * if (number % 2 == 0) { System.out.println("[결과]" + number + " = 짝수"); } else
		 * { System.out.println("[결과]" + number + " = 홀수"); }
		 */
		if (number % 2 != 0) {
			System.out.println("[결과]" + number + " = 홀수");
		} else {
			System.out.println("[결과]" + number + " = 짝수");
		}
		// != 부정의 의미를 나타내는 조건문 자주 사용 ex) 패스워드가 틀리면 > 재시도 명령 출력
		System.out.println("======================================================");

		char mun = '0';

		// 문자변수에 저장된 상수가 알파벳인지 아닌지를 구분하여 출력하세요.

		if (mun >= 'A' && mun <= 'Z' || mun >= 'a' && mun <= 'z') { // mun >= 'A' && mun <= 'Z' 많이 쓰는 표현식*** 알아두기
			System.out.println("[결과]알파벳이 맞습니다.");
		} else {
			System.out.println("[결과]알파벳이 아닙니다.");
		}
		System.out.println("======================================================");

		int kor = 85;

		// 국어점수가 0~100 범위의 유효값인지 아닌지를 판단하여 결과 출력(입력값에 대한 '유효성 검사')
		if (kor >= 0 && kor <= 100) {
			// System.out.println("[메세지]정상적인 국어점수가 입력되었습니다.");
			// 국어점수를 학점으로 변환해 출력하세요
			// => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F

			String grade;
			if (kor >= 90)
				grade = "A";
			else if (kor >= 80) // kor <= 89 && kor >= 80 으로 쓸필요 없음. 윗줄에서 90점 이상인 경우는 이미 다 제외됨.
				grade = "B";
			else if (kor >= 70)
				grade = "C";
			else if (kor >= 60)
				grade = "D";
			else
				grade = "E";

			System.out.println("[결과]국어점수 = " + kor + "점 >> " + grade + "학점");
		} else
			System.out.println("[에러]비정상적인 국어점수가 입력되었습니다.");

		System.out.println("======================================================");

		boolean sw = true;

		// 논리형 boolean 변수에 저장된 값에 따른 명령을 선택실행
		if (sw) {// 변수값이 true일 경우 명령 실행, if(!sw)라고 쓰면 변수값이 false인 경우 명령 실행
			// if (여기는 true/false값을 가지는 관계식 또는 불리언 변수 사용)
			System.out.println("[결과]스위치를 켰습니다. <on>");
		} else {
			System.out.println("[결과]스위치를 껐습니다. <off>");
		}
		System.out.println("======================================================");

		int choice = 1;
		// 제어문에서 변수에 상수를 저장할 경우, 변수 선언시 초기값을 부여하는 것을 권장
		String name = ""; // NullString("") : 문자가 없는 문자열 상수를 표현
		// String name=null; < 이렇게 표현하는 것도 가능

		if (choice == 1) {
			name = "홍길동";
		} else if (choice == 2) {
			name = "임꺽정";
		} /*
			 * else { name="전우치"; }
			 */
		// else가 존재하기 때문에 초기값을 부여하지 않고 위에서 String name; 이라고 해도 가능. (위 String grade 부분
		// 참고)
		System.out.println("[결과]당신이 선택한 사람은 <" + name + ">님입니다.");
		System.out.println("======================================================");
	}
}
