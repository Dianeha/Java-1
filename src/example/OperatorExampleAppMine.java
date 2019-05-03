package example;

public class OperatorExampleAppMine {
	public static void main(String[] args) {

		// 245678초를 일시분초 형식으로 변환하여 출력하세요. (%연산자 사용)
		int totsec = 245678;
		int day = totsec / (60 * 60 * 24);// totsec/86400
		int hour = (totsec - day * 60 * 60 * 24) / (60 * 60);
		int min = (totsec - day * 60 * 60 * 24 - hour * 60 * 60) / 60;
		int sec = totsec - day * 60 * 60 * 24 - hour * 60 * 60 - min * 60;

		System.out.println(day);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println("총" + day + "일" + hour + "시간" + min + "분" + sec + "초");

		int totsec2 = 245678;
		int sec2 = totsec2 % 60;
		int min2 = (totsec2 / 60) % 60;
		int hour2 = totsec2 / 60 * 60; ////////////// ???????????????????????????????????/
		int day2 = totsec2 / (60 * 60 * 24); // int라서 소숫점 아래 모두 사라짐

		System.out.println(sec2);
		System.out.println(min2);
		System.out.println(hour2);
		System.out.println(day2);
		System.out.println("총" + day2 + "일" + hour2 + "시간" + min2 + "분" + sec2 + "초");

		// 비행기 한대의 가격이 1억 5천만인 경우 20대를 구매할 경우 금액은?
		// 단, 15대 이상 구매할 경우 25% 할인율을 적용하여 계산하시오. (3항 연산자 사용)

		int dan = 150000000, su = 20;
		long kum = (long) (su >= 15 ? dan * 0.75 : dan) * su;
		System.out.println("비행기 구매대금 = " + kum);

	}

}
