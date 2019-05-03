package basic;

import java.util.Scanner;

//키보드로 점수를 입력받아 학점을 계산하고 출력하는 프로그램 만들기
// => => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
// => 점수가 0~100 범위의 정수상수가 입력되지 않은 경우 재입력 - 입력을 반복처리하는 것과 같음
//    (제대로된 점수를 입력할 때까지 반복처리할 것이므로 while을 사용)
public class ScoreInputCheckApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * int score=-1; while (score<0 || score>100) {
		 * System.out.print("점수 입력[0~100] >> "); score = scanner.nextInt(); if(score<0
		 * || score>100) { System.out.println("[에러] 0~100 범위의 정수만 입력 가능합니다."); } }
		 */
		
		/*
		int score; // while을 쓴 위의 식과 do-while 의 차이점. 초기값 설정
		do {
			System.out.print("점수 입력[0~100] >> ");
			score = scanner.nextInt();
			if(score<0 || score>100) {
				System.out.println("[에러] 0~100 범위의 정수만 입력 가능합니다.");
			}
		} while(score<0 || score>100);
		*/
		
		int score; //입력값에 대한 유효성 검사
		while(true){
			System.out.print("점수 입력[0~100] >> ");
			score = scanner.nextInt();
			if (score>=0 && score<=100) break; //정상적인 점수를 입력한 경우 반복문 종료
				System.out.println("[에러] 0~100 범위의 정수만 입력 가능합니다.");
			}
		
		
		String grade = "";
		switch (score / 10) {
		case 10:
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
			break;
		}

		System.out.println("[결과]" + score + "점 = " + grade + "학점");
		scanner.close();

	}
}
