package week4;

//static
//객체가 1000번 생성되도 메모리 공간은 한개만 사용
//스스로 메모리 공간에 로딩된다
public class Test2 {

	public static int a = 10;//static 변수
	//클래스 변수 또는 클래스 메소드는
	//로딩되는 순간 메모리 할당이 이루어지며[클래스이름.객체]를 통해 접근
	//즉 new를 통해 메모리 할당을 받지 않아도 사용 가능하다.
	
	public int b = 20;//instance 변수
	//인스턴스 변수 또는 인스턴스 메소드는 new를 통해서만 접근이 가능
	//클래스 메소드에서는 접근이 불가능하다
	
	public void write() {
		System.out.println("class 변수 a:"+ a);
	}
	
	public static void print(){
		System.out.println("class 변수 a:"+ a);		
		//System.out.println("instance 변수 b:"+ b);		
	}
	
	public static void main(String[] args) {
		System.out.println("class 변수 a:"+ a);
		System.out.println("class 변수 a:"+ Test2.a);
		
		//write();
		print();
		Test2.print();
		
		Test2 ob = new Test2();
		
		System.out.println(ob.b);
		ob.write();
		ob.print();
		System.out.println(ob.a);
		
		
		Test2 ob1 = new Test2();
		ob1.a = 100;
		ob1.b = 200;
		
		Test2 ob2 = new Test2();
		ob1.a = 1000;
		ob1.b = 2000;
		
		System.out.println("ob.a:"+ ob.a);
		System.out.println("ob.b:"+ ob.b);
		
		System.out.println("ob1.a:"+ ob1.a);
		System.out.println("ob1.b:"+ ob1.b);
		
		System.out.println("ob2.a:"+ ob2.a);
		System.out.println("ob2.b:"+ ob2.b);
		
		
		
		
		
	}

}
