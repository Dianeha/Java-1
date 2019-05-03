package basic;

public class ForApp_0415_4 {
	public static void main(String[] args) {
		// "Java Programming"을 화면에 5번 출력하세요.
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("===============================================");

		// for문으로 "Java Programming"을 화면에 5번 출력하세요.
		// for 명령의 변수에 1을 저장(초기식)한 후 x까지(조건식) 1씩 증가(증감식)하여 x번 반복 처리
		for (int i = 1; i <= 5; i++) {
			System.out.println("Java Programming");
		}
		System.out.println("===============================================");

		for (int i = 5; i >= 1; i--) {
			System.out.println("Java Programming");
		}
		System.out.println("======================================");

		for (int i = 1; i <= 10; i += 2) {
			System.out.println("Java Programming");
		}
		System.out.println("===============================================");
		// "1 2 3 4 5"를 화면에 출력하시오.
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("===============================================");

		// 1~100 범위의 정수들의 합계를 계산하여 출력하세요.
		int tot = 0;
		for (int i = 1; i <= 100; i++) {
			tot += i;
		}
		System.out.println("1~100 범위의 정수들의 합계 = " + tot);
		System.out.println("===============================================");

		// A~Z 범위의 알파벳을 출력하시오.
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		System.out.println();

		System.out.println("===============================================");

		// 두 정수변수에 저장된 변수값 범위의 정수 중 5의 배수 갯수를 계산하여 출력
		int begin = 88, last = 27;

		if (begin > last) {
			/*
			 * System.out.println("[에러]시작 입력값이 마지막 입력값보다 작아야 됩니다."); System.exit(0);
			 */

			// 두 변수에 저장된 상수를 서로 바꾸어 저장 - 치환 알고리즘(Swap Algorithm)을 아래처럼 사용

			int temp = begin;
			begin = last;
			last = temp;
		}

		int cnt = 0;
		for (int i = begin; i <= last; i++) {
			if (i % 5 == 0)
				cnt++;
		}
		System.out.println(begin + " ~ " + last + " 범위의 정수 중 5의 배수의 갯수는 총 " + cnt + "개");
		System.out.println("===============================================");

		for (int i = 1, j = 5; i <= 3; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		System.out.println("===============================================");
		int i = 1; // for문 바깥에서 변수선언 > for문이 끝나도 소멸되지 않음

		for (i = 1; i <= 4; i++) {
			System.out.print(i + "  ");
		}

		// i=5;
		for (; i >= 1; i--) { // i가 소멸되지 않았다면 초기식 생략해도 된다.
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("===============================================");

		/*
		 * for(;;) { System.out.println("무한 반복되는 명령"); }
		 * 
		 */
	}
}
