package week1;

public class Test3 {
	//class안에는 반드시 메서드가 있어야 한다
	public static void main(String[] args) {

		int r = 10;
		float area, length;
		area = r * r * 3.14f; //같다라는 뜻이 아니라 대입 연산자
		length = r * 2 * 3.14f;
		//area를 float타입으로 정의한 후 area 에 r * r * 3.14을 대입하면
		//실수로 판단을 하는데 실수 타입 중 큰 타입인 Double로 인식을 한다.
		//그래서 float로 형 변환을 해줘야한다.
		//%d : 정수
		//%f : 실수
		//%c : 문자
		//%s : 문자열
		System.out.printf("반지름: %d, 넓이 : %f, 둘레: %f\n", r, area, length);
		System.out.printf("반지름: %d, 넓이 : %.2f, 둘레: %.2f\n", r, area, length);
		
		//byte, short, int, long : 정수
		//float, double : 실수
		int a;
		float b;
		
		a = 5;//5
		b = 15;//15.0
		System.out.println(a);//5
		System.out.println(b);//15.0
		
		b = a; // int는 float에 들어갈 수 있다.
		System.out.println(b);//5.0;
		
		a = (int)b;
		
		
	}

}
