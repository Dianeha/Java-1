package basic;

public class DoubleArrayApp_04191 {
	public static void main(String[] args) {

		int[][] num = new int[2][3];

		System.out.println("num = " + num);
		System.out.println("num[0] = " + num[0]);
		System.out.println("num[1] = " + num[1]);
		System.out.println("========================================");

		System.out.println("num[0][0] = " + num[0][0]);
		System.out.println("num[0][1] = " + num[0][1]);
		System.out.println("num[0][2] = " + num[0][2]);
		System.out.println("num[1][0] = " + num[1][0]);
		System.out.println("num[1][1] = " + num[1][1]);
		System.out.println("num[1][2] = " + num[1][2]);
		System.out.println("========================================");

		System.out.println("num.length = " + num.length);
		System.out.println("num[0].length = " + num[0].length);
		System.out.println("num[1].length = " + num[1].length);
		System.out.println("========================================");

		// 2차원 배열은 for문 2번 써야 일괄처리 가능
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
		System.out.println("========================================");

		int[][] su = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int[] array : su) {
			for (int temp : array) {
				System.out.println(temp + "  ");
			}
			System.out.println();
		}
		System.out.println("========================================");

		// 학생이름과 국어, 영어, 수학 점수를 입력받아 학생 성적합계와 과목별 점수합계,
		// 전체학생의 성격합계 계산해 출력
		// ex) 홍길동 80 90 100 270
		// ...
		// 장길산 88 92 90 270
		// 총합계 392 380 370 1140
		String[] name = { "홍길동", "임꺽정", "전우치", "일지매", "장길산", "총합계" };
		int[][] score = { { 80, 90, 100, 0 }, { 76, 89, 77, 0 }, { 78, 99, 87, 0 }, { 98, 99, 100, 0 },
				{ 88, 92, 90, 0 }, { 0, 0, 0, 0 } };

		// 학생 점수 합계와 과목별 점수합계, 전체 학생의 점수합계 계산
		for (int i = 0; i < score.length-1; i++) { //행제어
			for (int j = 0; j < score[i].length-1; j++) { //열제어
				//score[i][j] : 학생의 과목별 점수 >  학생성적합계, 과목점수합계, 전체성적합계 3군데 누적시키기
				
				//학생점수합계 : 같은 행 마지막 열 요소에 각 과목 점수를 누적시킨 값
				score[i][score[i].length-1]+=score[i][j];
				
				//과목 점수합계 : 마지막 행에 같은 열의 요소에 점수 누적
				score[score.length-1][j]+=score[i][j];
			
				//전체 점수합계 계산: 마지막행 마지막 열 요소에 점수 누적
				score[score.length-1][score[i].length-1]+=score[i][j];
				
			}
		}

		// 학생이름, 국영수 점수와 각 합계들을 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
