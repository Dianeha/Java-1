package basic;

//컴퓨터로부터 난수를 제공받아 출력하는 프로그램을 작성하시오.

public class MathRandomApp_0417_3 {
	public static void main(String[] args) {
//Math 클래스: 수학 관련 기능을 제공하는 클래스
//Math.random() : 0.0 보다 크거나 같고 1.0보다 작은 실수난수를 반환
		System.out.println("<< Math.random() >>");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 실수난수(0.0~1.0) = " + Math.random());
		}

		System.out.println();

		// 0~99 범위의 정수난수를 제공받아 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 정수난수(0~99) = " + (int) (Math.random() * 100));
		}
		System.out.println();

		// 0~45 범위의 정수난수를 제공받아 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 정수난수(0~45) = " + ((int) (Math.random() * 100)%45+1));
		}
		System.out.println();

	}
}
