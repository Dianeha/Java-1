package FreeEx;

public class ArrayExampleApp_0418_YS {
	public static void main(String[] args) {

		// 배열에 저장된 사람들의 나이를 이용하여 연령별 인원수를 계산하여 출력하세요.
		// ex) 10대 = 3명
		// 20대 = 4명
		// ..
		// 60대 = 2명
		int[] age = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };
		System.out.println("나이대별 분류\n");
		
		for (int i = 0; i < age.length; i++)
			age[i] /= 10;

		for (int j = 1; j <= 6; j++) {
			int cnt = 0;
			for (int i = 0; i < age.length; i++) {
				if (age[i] == j) cnt++;
			}
			System.out.println(j * 10 + "대 = " + cnt + "명");

		}

	}
}
