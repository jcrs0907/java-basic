package basic;

/*
 지역 변수(Local Variable) :
  메소드 또는 제어문 등의 블럭 내부에서 선언된 변수
  => 지역변수가 선언된 블럭 내부에서만 사용 가능
  => 지역변수가 선언된 블럭이 종료되면 지역변수는 자동 소멸 처리
  
  c#과 자바는 전역변수가 없다.
 */

public class LocalVariableApp {
	int su;
	
	public static void main(String[] args) {
		int num1 = 100;

		//임의 블럭
		{
			int num2 = 200;
			
			System.out.println("===== 임의 블럭 내부 =====");
			System.out.println("num1 = "+num1);
			System.out.println("num1 = "+num2);
		}
		
		System.out.println("===== 임의 블럭 외부 =====");		
		System.out.println("num1 ="+num1);
		//임의 블럭 종료시 num2 변수가 자동 소멸되므로 사용 불가능
		//System.out.println("num1 = "+num2); //임의 블럭 밖이라 변수가 없음.
	
//		int num2; // 블럭 밖에서 똑같은 이름의 변수를 재정의 가능하다.
	}

}
