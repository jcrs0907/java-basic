package basic;

public class ArrayApp {

	public static void main(String[] args) {
		//배열을 생성하여 참조변수에 저장 - 자료형[] 참조변수 = new 자료형[요소갯수]
		//=> 자료형[] : 배열 정보를 저장하기 위한 참조변수의 자료형 - 참조형
		//=> new 자료형[갯수] : 자료형의 값을 갯수만큼 저장 가능한 배열을 생성해줌 - 요소의 모임
		//=> 배열은 요소를 이용하여 값을 여러개 저장
		//=> 요소는 첨자(Index : 0부터 1씩 증가되는 정수값)가 자동 부여됨
		//=> 배열의 요소는 자동으로 기본값이 저장
		int[] num = new int[3];
		
		System.out.println("num ="+ num);
		System.out.println("-------------------------------------------");
		//배열정보가 저장된 참조변수와 첨자를 이용하여 배열 요소 표현
		//=>형식) 참조변수[첨자]
	
		//배열 요소를 구분하는 첨자를 잘못 사용한 경우 예외 발생
		// => ArrayIndexOutOfBoundsException 발생
//		System.out.println("num[3] = "+num[3]);
		System.out.println("-------------------------------------------");
		//배열참조변수.length : 참조 변수에 저장된 배열의 요소 갯수
		System.out.println("배열 요소의 갯수 =" + num.length);
		System.out.println("-------------------------------------------");
		int index=0;
		//요소의 첨자는 변수 또는 연산식을 사용하여 표현 가능
		num[index] = 10;
		num[index+1] = 20;
		num[index+2] = 30;
		
		//for 구문을 이용하여 배열의 요소에 대한 일괄 처리 
		//=> 초기식, 조건식, 증감식을 이용하여 첨자 표현(입력, 연산, 출력)
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+num[i] );
		}
		
		System.out.println("-------------------------------------------");
		//배열 생성시 요소에 기본값 대신 원하는 초기값이 저장되도록 선언
		//=> {}안에 나열된 값의 갯수만큼의 요소를 가진 배열 생성
		
		//int[] su = new int[] {10,20,30};//요소가 3개짜리인 배열
		
		//{} 안에 값을 나열하여 배열 생성 가능
		int [] su = {10,20,30};
	
		//for구문을 이용하여 배열의 요소에 대한 일괄 처리
		//=> 반복지시자를 이용하여 요소값을 차례대로 제공받아 변수에 저장하여 처리 - 연산, 출력
		//=> 배열의 모든 요소값을 제공한 경우 반복문 종료
		for(int temp:su) {//향상된 for문, 변형된 for문
			System.out.println(temp);
		}
		System.out.println("-------------------------------------------");
		int[] array={44,33,22,11,134,46,67,43,23,78};
		
		//배열의 모든 요소값들의 합계를 계산하여 출력하세요.
		int tot=0;
		for(int number:array) {
			tot += number;
		}
		
		System.out.println("합계 = " + tot);
		System.out.println("-------------------------------------------");
		//배열의 요소값 중 30~60 범위의 요소값의 갯수를 계산하여 출력하세요.
		int count=0;
		for(int number:array) {
			if(number >= 30 && number <=60) {
					count++;
			}
		}
		
		System.out.println("30~60 범위의 요소 갯수 = "+count);
		System.out.println("-------------------------------------------");
		
	}

}
