package week4;

//�簢���� ������ ���ϴ� �޼���
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
	//	System.out.println("����:"+w);
	//	System.out.println("����:"+h);
	//}
	
	
	//�޼ҵ� �����ε�(overload)
	//���� Ŭ�����ȿ��� �޼ҵ��� �̸��� ����������
	//�μ��� ������ �ٸ��ų� �ڷ����� �ٸ��� �ٸ� �޼ҵ�� �ν�
	public void print() {
		System.out.println("����:"+w);
		System.out.println("����:"+h);

	}
	

	public void print(int a) {
		System.out.println("����:"+w);
		System.out.println("����:"+h);
		System.out.println("����:"+a);
	}
	
	public void print(double l) {
		System.out.println("����:"+w);
		System.out.println("����:"+h);
		System.out.println("�ѷ�:"+l);
	}
	
	public void print(int a, double l) {
		System.out.println("����:"+w);
		System.out.println("����:"+h);
		System.out.println("����:"+a);
		System.out.println("�ѷ�:"+l);
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
