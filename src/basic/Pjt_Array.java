package basic;

public class Pjt_Array {
	public static void main(String[] args) {
/* 방법1
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };

		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		System.out.println();

		for (int i = 0; i < classGroup.length; i++) {
			System.out.println(classGroup[i]);
		}
*/
// 방법2
		String[] classGroup = new String[4];
		classGroup[0] = "최진혁";
		classGroup[1] = "최유빈";
		classGroup[2] = "한이람";
		classGroup[3] = "이고잉";

		System.out.println(classGroup[1]);
		System.out.println(classGroup.length);

		String[] members = { "최진혁", "최유빈", "한이람", "하다연", "이윤식", "김동설", "최영석" };
		int cnt=0;
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i] + "님이 상담을 받았습니다");
			cnt++;
			if (cnt==members.length) {
				System.out.println(members.length+"명의 상담이 모두 완료되었습니다.");
				break;
			}
			System.out.println("총 "+(members.length-cnt)+"명의 상담이 남아있습니다.\n");
		}
	
	
	}

}
