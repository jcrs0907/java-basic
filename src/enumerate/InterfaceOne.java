package enumerate;//나열하다, 열거하다

public interface InterfaceOne {
	//interface안에 상수필드(Constant Field) 선언할 때에는 public static final 지정자 생략
	//클래스에서 선언 가능하지만 보다 쉬운 선언을 위해 인터페이스 활용
	//상수 필드만을 작성하기 위해 인터페이스를 사용할 경우도 있다.
	int INSERT=1, UPDATE=2, DELETE=3, SELECT=4;
}
