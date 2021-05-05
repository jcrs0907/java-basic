package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void displayBoolean(Boolean param) {
		System.out.println("논리값 = " + param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 = " + param);
	}
	
	//메소드는 매개변수까지 식별자로 인식하여
	//메소드 이름이 같아도 다른 메소드로 인식한다.
	//--> 메소드 오버로드(Method Overload) 선언
	//동일한 기능을 제공하는 메소드가 매개변수에 의해
	//여러 개 선언해야 될 경우 메소드명을 같게 선언하는 방법
	//-> 매개 변수의 갯수 또는 자료형을 같지 않도록 선언
	//-> 접근 지정자 또는 반환형은 오버로드 선언과 무관
	
	public void display(int param) {
		System.out.println("정수값 = " + param);
	}
	
	public void display(Boolean param) {
		System.out.println("논리값 = " + param);
	}
	
	public void display(String param) {
		System.out.println("문자열 = " + param);
	}
}
