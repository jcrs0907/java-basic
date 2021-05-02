package basic;


//형 변환(Type Cast) : 값의 자료형을 일시적으로 변환하여 사용하는 방법
//=> 자동 형변환(JVM), 강제 형변환(프로그래머)
public class TypeCastApp {

	public static void main(String[] args) {
		//자동 형변환 : 자료형이 다른 값을 연산하기 위해 JVM에 의해
		//자료형 변환 사용
		
		//정수와 실수의 연산 
		System.out.println("결과 ="+(3+1.5));//3 >> 3.0
		
		System.out.println("결과 ="+(95.0/10.0));//9.5
		System.out.println("결과 ="+(95/10));
		System.out.println("결과 ="+(95/10.0));//자동 형변환
		System.out.println("결과 ="+(95.0/10));
		//두 정수값에 대한 연산의 결과값 : 정수 - 9
		//정수 나누기 정수는 무조건 정수
	
		int kor = 95;
		int eng = 90;
		int tot = kor + eng;

		//연산 후 결과값(정수값)을 실수 변수에 저장
		//double ave = tot / 2;//92.0 
		double ave = tot/2.;//92.5
		System.out.println("총점 = "+tot+",평균 = "+ ave);
		byte su1=10, su2=20;
		//int 자료형보다 작은 자료형의 값을 연산할 경우
		//자동으로 int 자료형으로 형변환 연산.
		int su3 = su1+su2;
		System.out.println("su3= "+su3);
		//강제 형변환 : 프로그래머가 Cast 연산자를 이용하여
		//원하는 자료형의 값으로 일시적으로 변환하여 사용하는 방법
		int num = (int)12.3; //int(12.3) >> 12
		System.out.println("num= "+num);
		
		int num1 = 95;
		int num2 = 10;
//		double num3 = num1 / num2;//9.0
		double num3 = (double)num1 / num2;//9.5
		//강제 형변환((double)num1)과 자동 형변환(num2)
		System.out.println("num3 ="+num3);
		
		//정수값이 큰 경우 _를 이용하여 표현이 가능함.
		int num4 = 100_000_000;
		int num5 = 30;
		long num6 = (long)num4 * num5;
		//int *int => int 그래서 둘중 하나라도 형 변환이 필요함
		//연산 결과가 int 자료형의 표현 범위를
		//초과할 경우 쓰레기값 발생
		System.out.println("num6 ="+num6);
		
		double number = 1.23456789;
		System.out.println("number = "+number);
		
		//소수점 2자리까지만 출력되도록 프로그램 작성
		System.out.println("number(버림) "+(int)(number*100)/100.0);//1.23
		System.out.println("number(반올림) "+(int)(number*100 + 0.5)/100.0);//1.23
		System.out.println("number(올림) "+(int)(number*100 + 0.9)/100.0);//1.24
		


		
	}

}
