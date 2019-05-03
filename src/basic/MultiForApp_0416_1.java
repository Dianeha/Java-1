package basic;

public class MultiForApp_0416_1 {
	public static void main(String[] args) {
		/*
		 * A나라와 B나라가 커다란 강을 사이에 두고 존재한다. 이 강에는 섬이 하나 있으며 A나라는 다리를 3개 만들었고 B나라는 다리를 4개
		 * 만들었다. A나라에서 섬을 지나 B나라로 가는 경우의 수
		 */

		int cnt = 0;// 이동방법갯수를 저장하기 위한 변수

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				cnt++;
			}
		}
		System.out.println("이동방법수 = " + cnt);
		System.out.println();

		// ★★★★★★★
		System.out.println("★★★★★★★");
		System.out.println();

		for (int i = 1; i <= 9; i++) { // 행(Row) 제어 반복문
			for (int j = 2; j <= 9; j++) { // 내부for문 - 열(Column) 제어 반복문
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}

		/*
		 * int cnt_star=0; for (int i = 1; i <= 35; i++) { System.out.print("★");
		 * cnt_star++; if(cnt_star%7==0) System.out.println(); }
		 */
		System.out.println();

		// ★ i=1 
		// ★★ i=2
		// ★★★ i=3
		// ★★★★ i=4
		// ★★★★★ i=5

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();

		// ☆☆☆☆★
		// ☆☆☆★★
		// ☆☆★★★
		// ☆★★★★
		// ★★★★★

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("☆");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();   

		// ☆☆☆☆★
		// ☆☆☆★★
		// ☆☆★★★
		// ☆★★★★
		// ★★★★★

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j < 6)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}

		
		
		
		
		
	}
}