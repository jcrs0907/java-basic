package week4;

//this(me)

class Circle{
	
	private int r;
	
	public void setData(int r) {//setData(int r, Circle this)
		this.r = r;
	}
	
	public double area() {//area(Circle this)
		return this.r * r *3.14;//�Ҽ��� ����� ����� �ν��Ѵ�
	}
	
	public void write(double a) {
		System.out.println("�������� " + r);
		System.out.println("�ѷ�: "+ a);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		
		//ob.r = 10; //private ���������ڶ� ���� �Ұ�
		
		ob.setData(20);//setData(20,ob);
		double result = ob.area(); //ob.area(ob)
		ob.write(result);

	}

}
