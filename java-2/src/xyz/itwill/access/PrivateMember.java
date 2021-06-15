package xyz.itwill.access;

//private : 필드, 메소드에 설정하는 접근 지정자
// => 클래스 내부에서만 접근 가능하도록 설정하는 지정자
public class PrivateMember {
	private int num;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = "+num);
	}
}
