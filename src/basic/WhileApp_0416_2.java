package basic;

public class WhileApp_0416_2 {
	public static void main(String[] args) {
		//"Java Programming"을 화면에 5번 출력하세요.
		int i = 1;
		while (i <= 5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println();

		
		
		// 1~100 범위의 점수들의 합계를 계산해 출력하시오.
		int num = 1, tot = 0;
		while (num <= 100) {
			tot += num;
			num++;
		}
		System.out.println("1~100 범위의 점수들의 합계 = " + tot);

		
		
		// 101~200 범위의 점수들의 합계를 계산해 출력하시오.
		int n = 101, t = 0;
		do {
			t += n;
			n++;
		} while (n <= 200);
		System.out.println("1~100 범위의 점수들의 합계 = " + t);
		System.out.println();

		// A4 용지를 반으로 계속 접어 펼쳤을 경우 사각형 모양이 500개 이상이 되려면
		// 몇 번 접었다 펼치면 되는지 계산하여 출력하세요.
		int gae = 1, cnt = 0; // gae: 사각형 모양의 개수
		while (gae < 500) { // 접는 동작의 반복
			cnt++;
			gae *= 2;
		}
		System.out.println(cnt + "번 접었다 펼치면 사각현 모양은 " + gae + "개가 발생됩니다.");
		System.out.println();


		
		// 1부터 X범위의 정수들의 합계가 300 이상 되려면 X 상수가 얼마인지를 출력
		int x = 0, xtot = 0;
		while (xtot < 300) {
			x++;
			xtot += x;
		}
		System.out.println("1 ~ " + x + " 범위 정수들의 합계 = 300");
		System.out.println();

		
		
		
	}
}
