package basic;

public class SwitchApp_0415_3 {
	public static void main(String[] args) {
		int choice = 1;
		System.out.println("choice = " + choice);

		switch (choice) {
		case 1:
			System.out.println("수성으로 이동합니다.");
		case 2:
			System.out.println("금성으로 이동합니다.");
			break;
		case 3:
			System.out.println("화성으로 이동합니다.");

		}
		System.out.println("=======================================");

		choice = 2; // int choice = 1; > 에러, 변수 중복 선언
		System.out.println("choice = " + choice);

		switch (choice) {
		case 1:
			System.out.println("수성으로 이동합니다.");
		case 2:
			System.out.println("금성으로 이동합니다.");
		case 3:
			System.out.println("화성으로 이동합니다.");
		}
		System.out.println("=======================================");

		choice = 4;
		System.out.println("choice = " + choice);

		switch (choice) {
		case 1:
			System.out.println("수성으로 이동합니다.");
		case 2:
			System.out.println("금성으로 이동합니다.");
		case 3:
			System.out.println("화성으로 이동합니다.");
		default:
			System.out.println("지구로 이동합니다.");
		}

		System.out.println("=======================================");
		int age = 47;

		// 저장된 나이에 대한 연령대를 계산하여 출력하세요. (10대 ~ 60대)
		switch (age / 10) {
		case 1:
			System.out.println("[결과]당신은 " + age + "살이므로 10대입니다.");
			break;
		case 2:
			System.out.println("[결과]당신은 " + age + "살이므로 20대입니다.");
			break;
		case 3:
			System.out.println("[결과]당신은 " + age + "살이므로 30대입니다.");
			break;
		case 4:
			System.out.println("[결과]당신은 " + age + "살이므로 40대입니다.");
			break;
		}
		System.out.println("=======================================");
		int num1 = 20, num2 = 10;
		String operator = "+";
		int result = 0;

		// jdk1.7 이상에서는 문자열 비교 가능
		switch (operator) {
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		}

		
		System.out.println("[연산결과] = " + result);
		System.out.println("=======================================");

	}
}