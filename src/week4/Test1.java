package week4;

//this(me)

class Circle{
	
	private int r;
	
	public void setData(int r) {//setData(int r, Circle this)
		this.r = r;
	}
	
	public double area() {//area(Circle this)
		return this.r * r *3.14;//소수점 사용은 더블로 인식한다
	}
	
	public void write(double a) {
		System.out.println("반지름은 " + r);
		System.out.println("둘레: "+ a);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		
		//ob.r = 10; //private 접근제어자라 접근 불가
		
		ob.setData(20);//setData(20,ob);
		double result = ob.area(); //ob.area(ob)
		ob.write(result);

	}

}
