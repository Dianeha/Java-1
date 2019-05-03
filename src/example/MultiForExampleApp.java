package example;

public class MultiForExampleApp {
	public static void main(String[] args) {

		// ★★★★★
		// ★★★★
		// ★★★
		// ★★
		// ★

		// <방법1>
		for (int i = 1; i <= 5; i++) { // 행 5개 > 5번 반복
			for (int j = 1; j <= 6 - i; j++) {// 반복되는 횟수가 다르다 > 조건식에 상수 말고 변수(i 사용해서)
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();

		// <방법2>
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();

		// ★★★★★
		// ☆★★★★
		// ☆☆★★★
		// ☆☆☆★★
		// ☆☆☆☆★

		// <방법1>
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println();

		// <방법2>
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("☆");// 앞쪽에 있는 흰색별부터 출력
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();

		// ☆☆☆☆★
		// ☆☆☆★★★
		// ☆☆★★★★★
		// ☆★★★★★★★
		// ★★★★★★★★★

		for (int i = 1; i <= 5; i++) {// 행단위 처리
			for (int j = 1; j <= 5 - i; j++) {// 흰색별부터 출력
				System.out.print("☆");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println();

		// ★☆☆☆★
		// ☆★☆★☆
		// ☆☆★☆☆
		// ☆★☆★☆
		// ★☆☆☆★

		for (int i = 1; i <= 5; i++) { //
			for (int j = 1; j <= 5; j++) { // 이 두 줄의 의미가 5X5의 25번 출력하겠다는 의미
				if (i == j)
					System.out.print("★"); // if (i == j || i + j == 6)으로 한번에 표현가능
				else if (i + j == 6)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println();

		// A
		// BC
		// DEF
		// GHIJ

		char mun = 'A'; //변수만들기
		for (int i = 1; i <= 4; i++) { // 행 4개 > 1-4까지 반복되도록
			for (int j = 1; j <= i; j++) {
				System.out.print(mun);
				mun++;
			
			}
			System.out.println();

		}
	
	
	
	
	}
}
