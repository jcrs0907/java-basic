package week4;
//Call by Value
//stack 영역의 데이터가 heap 영역으로 넘어가서 처리


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
		System.out.println("sub 메소드 실행 전 x"+ ob.x);//10
		ob.sub(a);
		System.out.println("sub 메소드 실행 후 x"+ ob.x);//10
		
		//Call by Reference
		Test ob1;
		
		
	}

}
