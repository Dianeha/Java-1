package example;

public class ArrayExampleApp_0418 {
	public static void main(String[] args) {
		// 사람들에 대한 나이를 저장하고 있는 배열 생성
		int[] age = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };

		// 배열에 저장된 사람들의 평균 나이를 계산하여 출력하세요.
		// ex) 평균 나이 = 30살(정수범위에서만)

		int tot = 0;
		for (int nai : age) {
			tot += nai;
		}

		System.out.println("1. " + age.length + "명의 평균 나이 = " + (tot / age.length) + "살");
		System.out.println();

		// 배열에 저장된 사람들의 나이를 이용하여 연령별 인원수를 계산하여 출력하세요.
		// ex) 10대 = 3명
		// 20대 = 4명
		// ..
		// 60대 = 2명

		// int cnt_10 = 0, cnt_20 = 0, cnt_30 = 0, cnt_40 = 0, cnt_50 = 0, cnt_60 = 0;
		int[] cnt = new int[6];

		for (int nai : age) {
			/*
			 * if (nai >= 10 && nai < 20) cnt[0]++; else if (nai >= 20 && nai < 30)
			 * cnt[1]++; else if (nai >= 30 && nai < 40) cnt[2]++; else if (nai >= 40 && nai
			 * < 50) cnt[3]++; else if (nai >= 50 && nai < 60) cnt[4]++; else if (nai >= 60)
			 * cnt[5]++; }
			 */

			switch (nai / 10) {
			case 1:
				cnt[0]++;
				break;
			case 2:
				cnt[1]++;
				break;
			case 3:
				cnt[2]++;
				break;
			case 4:
				cnt[3]++;
				break;
			case 5:
				cnt[4]++;
				break;
			case 6:
				cnt[5]++;
				break;
			}
		}
		
		/*
		 * System.out.println("2. 10대 = " + cnt[0] + "명");
		 * System.out.println("   20대 = " + cnt[1] + "명");
		 * System.out.println("   30대 = " + cnt[2] + "명");
		 * System.out.println("   40대 = " + cnt[3] + "명");
		 * System.out.println("   50대 = " + cnt[4] + "명");
		 * System.out.println("   60대 = " + cnt[5] + "명");
		 */
		
		System.out.print("2. ");
		for (int i = 0; i < cnt.length; i++) {
			System.out.println("\t" + (i + 1) + "0대 = " + cnt[i] + "명"); // 이렇게 일괄처리
		}
		System.out.println();
	}
}
