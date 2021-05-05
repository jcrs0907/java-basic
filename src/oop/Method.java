package oop;


//참조가 목적인 클래스 - 인스턴스(객체) 생성을 위한 클래스
public class Method {
	//클래스를 선언하면 클래스 내부에는 매개변수가 없는 생성자(Default Constructor)가
	//선언된 것으로 처리
	
	//메소드 선언
	void displayOne() {//이 메서드를 호출해서 얻는 결과가 없다.
		System.out.println("Method 클래스의 displayOne() 메서드 호출");
	}
	
	void displayTwo() {//이 메서드를 호출해서 얻는 결과가 없다.
		System.out.println("Method 클래스의 displayTwo() 메서드 호출");
	}
	
	void printOne() {
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot += i;
		}
		System.out.println("1~100 범위의 정수들의 합계 = " + tot);
	}
	
	void printTwo(int num) {
		
		if(num<=0) {
			System.out.println("[에러] 매개변수에는 0보다 큰 값이 전달되어야 됩니다.");
			return;
		}
		int tot=0;
		for(int i=1; i<=num; i++) {
			tot += i;
		}
		System.out.println("1~"+num+"범위의 정수들의 합계 = " + tot);
	}
	
	void printThree(int num1, int num2) {//자료형을 쓰지 않고 사용하면 에러
		/*
		if(num1>num2) {
			System.out.println("[에러]첫번째 매개변수에 전달된 값이 두번째 매개변수에 전달된 값보다 작아야 됩니다.");
			return;
		}
		*/
		
		if(num1>num2) {//치환하여 사용
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot=0;
		for(int i=num1; i<=num2; i++) { 
			tot += i;
		}
		System.out.println(num1+"~"+num2+"범위의 정수들의 합계 = " + tot);
	}
	
	int returnTot(int num1, int num2) {
		if(num1>num2) {//치환하여 사용
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int tot=0;
		for(int i=num1; i<=num2; i++) { 
			tot += i;
		}
		
		//변수에 저장된 값을 메소드 종료시 반환
		//=> 메소드의 반환형과 같은 자료형의 값을 반환
		return tot;
	}
	
	//매개변수에 전잘된 정수값이 홀수인 경우 false,
	//짝수인 경우 true를 반환하는 메소드
	boolean isOddEven(int num) {
		if(num%2!=0) {
			return false;
		}else {
			return true;
		}
	}
	
	//매개변수로 객체를 전달 받거나 객체 반환이 가능하다
	String nameHello(String name) {//객체 전달받아 저장
		return name+"님. 안녕하세요.";
	}
	
	//배열의 해시코드를 반환하는 메서드
	//배열의 모든 요소값 반환
	int[] returnArray() {
		/*
		int[] array = {10,20,30,40,50};
		return array;
		*/
		
		//return {10,20,30,40,50};//값의 나열이고 배열이 아님
		return new int[]{10,20,30,40,50}; //배열로 반환
	}
	
	//3개의 매개변수에 정수값을 전달 받아 합계를 계산하여 반환하는 메소드
	int sumOne(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//매개변수로 배열을 전달받아 배열 요소값의 합계를 계산하여 반환하는 메소드
	int sumTwo(int[] num) {//매개 변수로 배열 사용
		int tot = 0;
		for(int temp:num) {
			tot += temp;//배열 요소들의 합계를 계산
		}
		return tot;
	}
	
	
	//매개 변수 생략 기호(...)를 사용한 매개변수 선언한 경우 값을 0개 이상 전달받아
	//배열 형식으로 사용 가능
	int sumThree(int... num) {//매개 변수의 갯수를 생략
		int tot = 0;
		for(int temp:num) {
			tot += temp;//배열 요소들의 합계를 계산
		}
		return tot;
	}
	
	
	
	
	
}
