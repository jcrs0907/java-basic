package week4;

//상속(부모가 자식한테 주는것)
//1.부모꺼는 자식꺼다
//2.private로 선언한 것은 상속 불가능
//3.protected로 선언한것은 상속 가능
//4.내꺼는 내꺼다
//5.자식과 부모가 같은 객체를 가지고 있으면 내꺼 쓴다.

class Super {
	private String title;//사각형
	protected int area;//protected로 선언한것은 상속 가능
	
	public void set(String title) {
		this.title = title;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title + ":"+ area);

	}
}

class RectC extends Super{
	
	private int w,h;//10, 20
	
	public RectC(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		area = w*h;
		set("사각형");
	}
}

public class Test8 {
	public static void main(String[] args) {
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print(); //1.부모꺼는 자식꺼다
	}
}
