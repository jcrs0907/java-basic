package basic;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 입력장치(키보드, 파일 등)로부터 값을 제공받기 위한 메소드가 선언된 클래스
		//Scanner 클래스로 객체를 생성하여 변수에 저장 - 변수에 저장된 객체로 메소드 호출
		// => 키보드로부터 값을 입력받기 위한 Scanner 객체 생성
		// => System.in : 키보드 입력 스트림 - 키보드로 입력된 값을 전달하는 객체 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		//Scanner.nextLine() : 입력값을 문자열로 변환하여 반환하는 메소드
		//사용자 키보드로 입력받은 문자열을 변수에 저장
		// => 키보드 입력값이 없는 경우 프로그램의 흐름(스레드)이 일시 중지
		// => 사용자 키보드로 값을 입력한 후 엔터를 입력하면 스레드 재실행
		String name=scanner.nextLine();
		
		System.out.print("나이 입력 >> ");
		//Scanner.nextInt() : 입력값을 정수값으로 변환하여 반환하는 메소드
		//사용자 키보드로 입력받은 정수값을 변수에 저장
		// => 키보드 입력값이 정수값이 아닌 경우 예외(Exception) 발생
		int age=scanner.nextInt();		
		
		System.out.println("[결과]"+name+"님은 "+age+"살입니다.");
		
		//Scanner.close() : Scanner 객체의 스트림을 제거하는 메소드
		scanner.close();
	}
}









