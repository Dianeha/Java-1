package example;

public class ForExampleApp_0416 {
	public static void main(String[] args) {
		// 1번 //본인 이름을 화면에 7번 출력하세요.
		//

		for (int i = 1; i <= 7; i++) {
			System.out.print("하다연");
		}
		System.out.println();
		System.out.println();

		// 2번 //1~10 범위의 정수 중 짝수를 화면에 출력하세요.
		// ex)2 4 6 8 10
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();

		// 방법2
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println();

		// 3번 // 1~100 범위의 정수에서 3의 배수 합계와 5의 배수 합계를 계산하여
		// 3의 배수 합계에서 5의 배수 합계를 뺀 결과를 계산해 출력 633
		
		int tot_3=0, tot_5=0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) tot_3+=i;
			if (i%5==0) tot_5+=i;
		}
		System.out.println(tot_3-tot_5);
		System.out.println();
		
				
		/*
		 int tot_3 = 0; 
		 for (int i = 1; i <= 100; i++) { 
		 if (i % 3 == 0) { tot_3 += i;
		 	} 
		 }
		 
		 int tot_5 = 0; 
		 for (int i = 1; i <= 100; i++) { 
		 if (i % 5 == 0) { tot_5 += i;
		 	} 
		 }
		 
		 if (tot_3 > tot_5) { 
		 System.out.println(tot_3 - tot_5); 
		 } else {
		 System.out.println(tot_5 - tot_3); 
		 }
		 */
		System.out.println();

		// 구구단 중 7단을 화면에 출력하세요
		// 7 * 1 = 7
		int dan=7;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		System.out.println();

		// 5!의 결과값을 계산해 출력하세요
		/*
		 int tot = 1; 
		 for (int i = 1; i <= 5; i++) { 
		 tot *= i; 
		 }
		 */
		
		int num=5, fac=1;
		for (int i = num; i >=1; i--) {
			fac*=i;
		}
				
		System.out.println(num+"! = "+fac);
		System.out.println();

		// 두 정수변수에 저장된 상수 사이의 정수들을 화면에 출력하세요.
		// 단, 한 줄에 정수상수가 7개씩 출력되도록 작성하세요.
		// ex) 36 37 38 39 40 41 42
		// 43 44 45 46 47 48 49
		// 50 51 52 53 54 55 56
		// 57
		
		/*
		int start = 36, end = 57; 
		for (int i = start; i <= end; i++) {
			System.out.print(i + " "); 
			if (i % 7 == 0) { System.out.println(); } }
		 */
		
		int start = 36, end = 57;
		int cnt = 0; // 출력 갯수를 저장하기 위한 변수 - 상수를 출력할 때마다 1씩 증가
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
			cnt++;
			if (cnt % 7 == 0)
				System.out.println();
		}	
		System.out.println();
		System.out.println();

		// 두 정수변수에 저장된 상수 사이의 정수들의 합계를 계산하여 출력하세요.
		// 단, 두 정수변수에 저장된 값이 반대인 경우에도 같은 결과가 출력되도록 작성하세요.
		// ex) 17 ~ 79 범위의 정수 합계 = 3024
		int begin = 79, last = 17;

		if (begin > last) {
			int temp = begin;
			begin = last;
			last = temp;
		}

		int total_sum = 0;
		for (int i = begin; i <= last; i++) {
			total_sum += i;
		}
		System.out.println(begin+" ~ "+last+" 범위의 정수 합계 = "+total_sum);

		// int begin=79, last=17;

		
	}

}
