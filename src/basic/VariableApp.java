package basic;
//어떤 결과를 만들어 내기 위한 최적화된 방법
//알고리즘, 디자인 패턴

public class VariableApp {
	public static void main(String[] args) {
		//변수 선언 형식) 자료형 변수명; 
		int su;//정수값을 저장하기 위한 su 변수 선언
		su=100;//su 변수에 정수값(100) 저장 - 대입연산자(=) 이용
		System.out.print("초기값 = ");
		System.out.println(su);//su 변수값(100) 출력
		
		//int su;//동일한 영역에 같은 식별자를 선언하면 에러 발생
		su=200;//변수에 정수값(200) 저장 - 기존값 대신 새로운 값 저장
		System.out.print("변경값 = ");
		System.out.println(su);//su 변수값(200) 출력
		System.out.println("=============================================");
		//변수 선언 및 초기값 저장
		int num=100;
		//["문자열"+값] 또는 [값+"문자열"] >> 문자열 결합
		// => + 연산자를 이용해 문자열에 값을 결합하여 제공
		System.out.println("num = "+num);//num = 100
		System.out.println("=============================================");
		System.out.println("올해는 "+2+0+2+1+"년입니다.");
		System.out.println(2+0+2+1+"년은 소띠해입니다.");
		//"" : 문자가 하나도 없는 문자열 - NullString
		System.out.println(""+2+0+2+1+"년은 소띠해입니다.");
		System.out.println("=============================================");
		
		//동일한 자료형의 변수는, 기호를 이용하여 나열 선언 가능
		int num1 = 100;
		int num2 = 200;
		
		System.out.println("연산결과= "+(num1 + num2));
		//소괄호가 없으면 결합이되고,
		//소괄호가 있으면 연산이 된다.
		//괄호가 있는것이 가독성이 좋은 이유가
		//JVM이 괄호가 있으면 우선적으로 연산을 처리한다.(최우선 연산자)
		//이런 차이가 속도의 차이를 만든다.
		System.out.println("연산결과= "+(num1 * num2));
		System.out.println("연산결과= "+num1*num2);
		System.out.println("=============================================");
		
		int kor = 88;
		int eng = 90;
		int tot = kor + eng; //연산결과를 변수에 저장
		System.out.println("점수 합계 = "+ tot);
		System.out.println("=============================================");
		/*
		int number;
		//변수에 값이 저장되어 있지 않은 상태로 사용할 경우 에러 발생
		System.out.println("number = "+number);
		*/
		
		/*
		//변수에 저장 불가능한 값을 저장할 경우 에러 발생
		int number=10.0;
		System.out.println("number = "+number);
		*/
	}
}



