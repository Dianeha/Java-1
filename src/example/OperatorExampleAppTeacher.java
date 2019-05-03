package example;

public class OperatorExampleAppTeacher {
	public static void main(String[] args) {
	
		int cho=245678;
		System.out.print(cho+"초 = ");
		
		
		int day=cho/(24*60*60);
		cho%=86400;
		
		
		int hour=cho/(60*60);
		cho%=3600;
		System.out.println(cho);
		
		int min=cho/60;
		int sec=cho%60;
		
		System.out.println(day+"일 "+hour+"시 "+min+"분 "+sec+"초");	
	}
}	
