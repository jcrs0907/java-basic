package week4;

//사각형의 면적을 구하는 메서드
class Rect {
	private int w,h;
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public double length() {
		return (w+h)*2;
	}
	
	//	public void write() {
	//	System.out.println("가로:"+w);
	//	System.out.println("세로:"+h);
	//}
	
	
	//메소드 오버로딩(overload)
	//같은 클래스안에서 메소드의 이름은 동일하지만
	//인수의 갯수가 다르거나 자료형이 다르면 다른 메소드로 인식
	public void print() {
		System.out.println("가로:"+w);
		System.out.println("세로:"+h);

	}
	

	public void print(int a) {
		System.out.println("가로:"+w);
		System.out.println("세로:"+h);
		System.out.println("넓이:"+a);
	}
	
	public void print(double l) {
		System.out.println("가로:"+w);
		System.out.println("세로:"+h);
		System.out.println("둘레:"+l);
	}
	
	public void print(int a, double l) {
		System.out.println("가로:"+w);
		System.out.println("세로:"+h);
		System.out.println("넓이:"+a);
		System.out.println("둘레:"+l);
	}
}


public class Test4 {
	public static void main(String[] args) {
		
		Rect ob = new Rect();

		ob.set(10, 20);
		int a = ob.area();
		double l = ob.length();
		ob.print();
		ob.print(a);
		ob.print(l);
		ob.print(a,l);
		
	}
}
