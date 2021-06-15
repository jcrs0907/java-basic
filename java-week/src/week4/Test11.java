package week4;


class Super2{

	private int a = 10;
	public void write() {
		System.out.println("a: "+ a);
	}
}


public class Test11 {

	public static void main(String[] args) {
		
		Super2 ob1 = new Super2();
		Super2 ob2 = new Super2();
		
		System.out.println("ob1==ob2" + (ob1==ob2));
		System.out.println("ob1.equals(ob2)" + ob1.equals(ob2));
		
		System.out.println("ob1:"+ob1);
		System.out.println("ob2:"+ob2);
		System.out.println(ob1.toString());
		
	}

}
