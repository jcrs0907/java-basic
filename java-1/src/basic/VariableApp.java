package basic;

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
		System.out.println(2+0+2+1+"년은 소띠해입니다.");//실행 오류
		//"" : 문자가 하나도 없는 문자열 - NullString
		System.out.println(""+2+0+2+1+"년은 소띠해입니다.");
		System.out.println("=============================================");
		//동일한 자료형의 변수는 , 기호를 이용하여 나열 선언 가능
		int num1=100, num2=200;
		System.out.println("연산결과 = "+num1+num2);
		System.out.println("연산결과 = "+(num1+num2));
		System.out.println("연산결과 = "+(num1*num2));
		System.out.println("연산결과 = "+num1*num2);
		System.out.println("=============================================");
		int kor=88, eng=90;
		//int tot=88+90;
		int tot=kor+eng;//연산결과를 변수에 저장
		System.out.println("점수 합계 = "+tot);
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
