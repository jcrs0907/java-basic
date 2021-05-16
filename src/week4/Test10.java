package week4;

class Super1{
	private String title;
	protected double area;
	
	public Super1() {
		
	}
	
	public Super1(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title+" : "+area);
		//System.out.println(r);
	}
}

class Cir extends Super1{
	private int r;
	protected static final double PI = 3.14;
	
	public Cir(int r) {
		super("��");
		this.r = r;
	}
	
	public void circleArea() {
		area = (double)r*r*PI;
	}
}

class Rec extends Super1{
	private int w,h;
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = w*h;
	}
	
	//5.�ڽİ� �θ� ���� ��ü�� ������ ������ ���� ����.
	//�޼ҵ� ������(override)
	@Override
	public void write() {
		System.out.println("�޼ҵ��� �̸��� ���� ���� ������ �ٲ۴�");
	}
}

public class Test10 {

	public static void main(String[] args) {
		
		Cir ob = new Cir(10);
		ob.circleArea();
		ob.write();
		
		Rec ob1 = new Rec();
		ob1.rectArea(100, 200);
		ob1.write();
	}

}
