package week1;

public class Test2 {
	
	public static void main(String[] args) {
		//자료형 변수 이름
		int a = 15;
		int b = 5;
		int c,d; //쓰레기값
		
		c = a + b;
		d = a - b;
		
		//syso : System.out.println()
		//오류의 종류 : 컴파일 오류, 런타임 오류
		// /n : 엔터
		System.out.println("a변수값: "+a);
		System.out.println("b변수값: "+b);
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d\n",a,b,d);

	}
}
