package FreeEx;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("1-5까지 숫자 중 하나를 골라 입력하시면 당신의 성격을 알려드립니다.");
		
		while (true) {
			
			int num = sca.nextInt();
			
			if (num < 1 || num > 5) {
				System.out.println("[에러] 정확한 숫자를 입력해주시기 바랍니다.");
				continue;
			}
			
			switch (num) {
			case 1:
				System.out.println("당신은 온화한 성격의 소유자입니다.");
				break;

			case 2:
				System.out.println("당신은 배려심이 깊습니다.");
				break;

			case 3:
				System.out.println("당신은 한 가지 일을 꾸준히 하지 못합니다.");
				break;

			case 4:
				System.out.println("당신은 주변환경에 대한 호기심이 많습니다.");
				break;

			case 5:
				System.out.println("당신은 이타적이기보다는 이기적인 편입니다.");
				break;

			}
			sca.close();
		}

	}
	
}
