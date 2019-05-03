package basic;

public class BreakApp_0416_3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				break;
			System.out.println("i = " + i);
		}
		System.out.println();

		loop: // 라벨명(식별자) : 반복문에 부여하는 위치정보
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3)
					break loop; // 이 줄을 break; 로 하면for (int j = 1; j <= 5; j++) 내부 선언 반복문만 종료
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();

		// 1부터 X범위의 정수들의 합계가 300 이상 되려면 X 상수가 얼마인지를 출력
		int x = 1, xtot = 0;
		while (true) { // 무한루프, 중간에 break 사용하기 때문에 while(조건식 자리)에 true를 쓴다.
			xtot += x;
			if (xtot >= 300) break;
			x++;
		}
		System.out.println("1 ~ " + x + " 범위 정수들의 합계 = 300");
		System.out.println();
		
		
		
		//continue
		for (int i = 1; i <= 5; i++) {
			if (i == 3) continue;
			System.out.println("i = " + i);
		}
		System.out.println();
		
		//-------------------------------------------------------------
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) continue; 
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		//-------------------------------------------------------------
		loop2:
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//if(j == 3) break; 와 동일한 기능을 구현. >> continue 라벨은 잘 쓰지 않는다.
				if (j == 3) continue loop2; 
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();

		
		//1~100 범위의 정수들 중 짝수들의 합계 출력
		int tot=0;
		for (int i = 1; i <=100; i++) {
			if (i%2!=0) continue;
			tot+=i;
		}
		System.out.println("1~100 범위 내 짝수들의 합계 = "+tot);
		System.out.println();
	
	
	
	
	
	}
}
