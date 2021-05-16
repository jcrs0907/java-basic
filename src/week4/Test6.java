package week4;

class RectA{
	private int w,h;
	
	public RectA() {
		// TODO Auto-generated constructor stub
	}
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//매개 변수가 있는 생성자를 만들 경우, 기본 생성자도 함께 만들어줘야 한다.
			RectA ob1 = new RectA();
			ob1.set(10, 20);
			
			int a = ob1.area();
			int l = ob1.length();
			ob1.print(a, l);
			
			System.out.println("----------------");
			//객체 생성과 초기화 값까지 넣어줌
			//set이라는 메서드를 만들어서 사용할 필요가 없음
			RectA ob2 = new RectA(100, 200);
			a = ob2.area();
			l = ob2.length();
			ob2.print(a, l);
			
			System.out.println("----------------");
			//w, h 값 변경시에는 set method를 사용
			ob2.set(10, 20);
			a = ob2.area();
			l = ob2.length();
			ob2.print(a, l);
			
	}

}
