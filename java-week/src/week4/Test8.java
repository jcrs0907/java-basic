package week4;

//���(�θ� �ڽ����� �ִ°�)
//1.�θ𲨴� �ڽĲ���
//2.private�� ������ ���� ��� �Ұ���
//3.protected�� �����Ѱ��� ��� ����
//4.������ ������
//5.�ڽİ� �θ� ���� ��ü�� ������ ������ ���� ����.

class Super {
	private String title;//�簢��
	protected int area;//protected�� �����Ѱ��� ��� ����
	
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
		set("�簢��");
	}
}

public class Test8 {
	public static void main(String[] args) {
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print(); //1.�θ𲨴� �ڽĲ���
	}
}
