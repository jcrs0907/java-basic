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
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}
}

public class Test6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�Ű� ������ �ִ� �����ڸ� ���� ���, �⺻ �����ڵ� �Բ� �������� �Ѵ�.
			RectA ob1 = new RectA();
			ob1.set(10, 20);
			
			int a = ob1.area();
			int l = ob1.length();
			ob1.print(a, l);
			
			System.out.println("----------------");
			//��ü ������ �ʱ�ȭ ������ �־���
			//set�̶�� �޼��带 ���� ����� �ʿ䰡 ����
			RectA ob2 = new RectA(100, 200);
			a = ob2.area();
			l = ob2.length();
			ob2.print(a, l);
			
			System.out.println("----------------");
			//w, h �� ����ÿ��� set method�� ���
			ob2.set(10, 20);
			a = ob2.area();
			l = ob2.length();
			ob2.print(a, l);
			
	}

}
