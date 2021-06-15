package week4;

import java.util.Calendar;

public class Test3 {

	public static void main(String[] args) {
		
		//static 접근지정자를 사용한 method로
		//new 연산자를 이용하여 인스턴스 생성을 할 필요가 없음
		//Data.print();
		Data.getInstance();
		
		Calendar now1 = Calendar.getInstance();
		Calendar now2 = Calendar.getInstance();
		Calendar now3 = Calendar.getInstance();
		
		
	}

}
