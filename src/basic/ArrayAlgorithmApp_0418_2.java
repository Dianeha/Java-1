package basic;

public class ArrayAlgorithmApp_0418_2 {
	public static void main(String[] args) {
		// 정수상수를 5개 저장할 수 있는 배열 선언
		int[] num = new int[5];

		// 배열요소에 0~99 범위의 정수난수를 제공받아 저장 >> 입력
		// => 배열요소에 저장되는 상수는 중복되지 않도록 작성
		for (int i = 0; i < num.length; i++) {
			// 난수를 제공받아 요소값으로 저장되는 명령 - 반복
			// => 제공된 난수값이 기존 배열 요소값과 다른 경우 반복문 종료
			while (true) {
				// 중복 유무 상태를 저장하기 위한 변수(false 미중복 true 중복)
				boolean result = false;
				num[i] = (int) (Math.random() * 100);
				// 난수값과 기존 배열 요소값을 비교(반복처리)해 동일한 경우 중복상태 정보 변경
				for (int j = 0; j < i; j++) {
					// num[i] 난수값 / num[j] 배열요소값
					if (num[i] == num[j]) {
						result = true;
						break;
					}
				}
				// 난수값과 동일한 배열 요소값이 존재하지 않을 경우 반복문 종료
				if (!result)
					break;

			}
		}
		// 배열 요소값 출력
		System.out.println("배열 요소값 >> ");
		for (int su : num) {
			System.out.print(su + "\t");
		}
		System.out.println();
		System.out.println("===================================================");

//배열요소값 중 최소값과 최대값을 계산하여 출력하세요.
		int min, max;
		min = max = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		}
		System.out.println("배열 요소의 최대값 = " + max);
		System.out.println("배열 요소의 최소값 = " + min);
		System.out.println("===================================================");

		// 배열 요소값을 비교하여 순위를 계산하여 출력하세요. > 순위를 저장할 수 있는 배열이 따로 필요
		int[] rank = { 1, 1, 1, 1, 1 }; // 순위를 저장할 수 있는 배열 선언

		for (int i = 0; i < num.length; i++) { // 비교요소의 첨자
			for (int j = 0; j < num.length; j++) { // 피비교소의 첨자
				if (i != j) { // 첨자를 이용한 배열요소 같지 않을 경우
					if (num[i] < num[j]) { // 비요요소값과 피비교요소값을 비교해 후자가 큰 경우
						rank[i]++; // 비교요소 순위 증가
					}

				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.println(num[i] + " = " + rank[i] + "등");
		}
		System.out.println("===================================================");

// 검색 알고리즘		
// 입력된 정수상수를 배열요소에서 검색하여 위치값(index)을 출력하세요.		
// => 입력된 정수상수가 배열 요소에 저장되어 있지 않을 경우에 대한 		
		int searchNum = 50;

		// 배열 요소값을 차례대로 비교하여 검색 - 순차검색(Sequence Search)
		int index = -1;

		// 배열 요소의 위치값을 저장하기 위한 변수(검색값의 존재 유무 판단)
		for (int i = 0; i < num.length; i++) {
			if (searchNum == num[i]) {
				index = i;
				break;
			}
		}
		if (index != -1) { // 검색값이 배열 요소에 저장되어 있는 경우
			System.out.println(searchNum + "은(는) " + index + "번째 요소값으로 저장되어 있습니다.");
		} else { // 검색값이 배열 요소에 저장되어 있지 않은 경우
			System.out.println(searchNum + "은(는) 요소값으로 저장되어 있지 않습니다.");
		}
		System.out.println("===================================================");

// 정렬(Sort) => 오름차순(Ascending) 정렬, 내림차순(Descending) 정렬		
//배열 요소값을 비교하여 순차적으로 재저장한 후 출력하세요.		
		
		System.out.print("정렬 전 배열 요소값 >> ");
		for (int su:num) {
			System.out.print(su+" ");
		}
		System.out.println();
		System.out.println("===================================================");

		//배열 요소값을 비교하여 오름차순 정렬 >> 선택정렬(Selection Sort)
		for (int i = 0; i < num.length-1; i++) { //비교요소 첨자 : 처음~(끝-1)
			for(int j=i+1;j<num.length;j++) {//피비교요소 첨자 :(처음+1)~끝{
				//비교요소값이 피비교요소값보다 큰 경우 요소값 치환
				if(num[i]>num[j]) {//오름차순 정렬
				 
				}
			}
		}
		
		System.out.print("정렬 후 배열 요소값 >> ");
		for (int su:num) {
			System.out.print(su+" ");
		}
		System.out.println();
		System.out.println("===================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}