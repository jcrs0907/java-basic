package basic;

public class DataTypeApp {

	public static void main(String[] args) {
		System.out.println("<<정수형>>");
		//println() 출력메소드는 정숫값을 10진수로 변환하여 출력
		System.out.println("정수값(10진수) ="+100);
		System.out.println("정수값(8진수) ="+0100);
		System.out.println("정수값(16진수) ="+0x100);
		
		System.out.println("정수값(4Byte) ="+2147483647);
		//int(4Byte)로 표현할 수 없는 정수값을 사용할 경우 에러 발생
//		System.out.println("정수값(4Byte) ="+2147483648);
		//int(4Byte)로 표현할 수 없는 정수값은 long(8Byte)으로 표현
		System.out.println("정수값(8Byte) ="+2147483648L);
		
		
		byte a1 = 127;//1Byte :  -127~127
		short a2 = 32767;//2Byte : -32768 ~ 32767
		int a3 = 2147483647;//4Byte : -2147483648 ~ 2147483647
		long a4 = 2147483648L;//8Byte
		
		System.out.println("a1 ="+ a1);
		System.out.println("a2 ="+ a2);
		System.out.println("a3 ="+ a3);
		System.out.println("a4 ="+ a4);
		
		long a5 = 100; //데이터 손실 가능성에 의한 에러 발생
		System.out.println("a5 ="+ a5);
		System.out.println("====================================");
		
		System.out.println("<<실수형>>");
		System.out.println("실수값(4Byte) ="+1.23F);
		System.out.println("실수값(8Byte) ="+1.23);
		//println() 출력메소드는 아주 작은 실수값 또는 아주 큰 실수값을
		//지수형으로 변환하여 출력 처리한다.
		System.out.println("실수값(8Byte) ="+0.00000000123);
		//실수값을 지수형으로 표현가능
		System.out.println("실수값(8Byte) ="+1.23E9);
		
//		float b1 = 1.23456789;//에러 발생
		float b1 = 1.23456789F;
		//가수부의 표현범위 : 소숫점 7자리
		//마지막 9가 짤리고 그 앞 8이 반올림되어서 결과값이 나옴.
		double b2 = 1.23456789;//가수부의 표현범위 : 소숫점 15자리
		System.out.println("b1 ="+b1);
		System.out.println("b2 ="+b2);
		System.out.println("====================================");
		
		float b3 = 2147483648L;
		System.out.println("b3 = "+b3);
		System.out.println("====================================");

		System.out.println("<<문자형>>");
		//'' << 싱글 쿼테이션 안에 문자
		System.out.println("문자값(2Byte) = "+'A');
		System.out.println("문자값(2Byte) = "+'한');
		//제어 문자 (Escape Character)
		System.out.println("문자값(2Byte) = "+'\'');
		System.out.println("문자값(2Byte) = "+'\\');
		//코드값을 직접 보낼 때 alt + 숫자(텐키)
		//'A': 65, 'a' : 97, '0' : 48, ' ' : 32, '\n' : 13, '가' : 44032
		char c1 = 'A'; //문자값은 내부적으로 약속된 정수값으로 저장
		char c2 = 65;
		char c3 = 'a'-32; //연산 가능
		
		System.out.println("c1 =" +c1);
		System.out.println("c2 =" +c2);
		System.out.println("c3 =" +c3);
		
		char c4 = 45000;// 완성된 한글 문자
		System.out.println("c4 =" +c4);
		System.out.println("==========================");
		System.out.println("<<논리형>>");
		System.out.println("논리값(1Byte) ="+ false);
		System.out.println("논리값(1Byte) ="+ true);
		//관계식(비교식)의 연산 결과값으로 논리값 제공
		System.out.println("논리값(1Byte) ="+ (20 > 10));
		System.out.println("논리값(1Byte) ="+ (20 < 10));
		
		boolean d1 = false;
		boolean d2 = 20>10;
		
		System.out.println("d1 =" +d1);		
		System.out.println("d2 =" +d2);	
		System.out.println("==========================");
		//int
		//long
		//double
		//boolean
		
		System.out.println("<<문자열>>");
		System.out.println("문자열 ="+"홍길동");
		System.out.println("유관순 열사가 \"대한독립 만세\"라고 외쳤습니다.");
		
		
		String e1="Java";
		String e2="열심히 공부해요.";
		System.out.println("e1 ="+e1);
		System.out.println("e2 ="+e2);
		//문자열에 + 연산자를 사용할 경우 문자열 결합 의미
		System.out.println(e1+" "+e2);
	}

}