package week4;
//Call by Value
//stack ������ �����Ͱ� heap �������� �Ѿ�� ó��


class Test{
	public int x = 10;
	
	public void sub(int a) {
		 x+=a;
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Test ob = new Test();
		int a = 20;
		
		//Call by Value
		System.out.println("sub �޼ҵ� ���� �� x"+ ob.x);//10
		ob.sub(a);
		System.out.println("sub �޼ҵ� ���� �� x"+ ob.x);//10
		
		//Call by Reference
		Test ob1;
		
		
	}

}
