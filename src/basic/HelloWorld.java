package basic;

/*
작성목적: 이클립스 연습을 위한 어플리케이션
작성일자: 2019.04.10
작성자: 하다연
 */
/**
이 클래스는 이클립스를 이용해 만든 최초의 클래스입니다.
@author H.D.Y
@version 1.0
@since JDK1.8 
*/
//어노테이션(Annotation) : API 문서에서 특별한 의미를 가진 설명을 제공하기 위해 사용
public class HelloWorld {
	//어플리케이션 작성을 위해 반드시 선언해야 하는 메소드
	/** JVM에 의해 가장 먼저 호출되는 특별한 메소드 */
	public static void main(String[] args) {
		//화면에 원하는 내용이 출력되도록 메소드 호출
		System.out.print("Hello ");
		System.out.println("World!!!");
		System.out.println("안녕하세요. 반갑습니다.\n");
	
		
	
	}
}