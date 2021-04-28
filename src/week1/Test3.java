package com.week1;

public class Test3 {
	//class안에는 반드시 메서드가 있어야 한다
	public static void main(String[] args) {

		int r = 10;
		float area, length;
		area = r * r * 3.14f;
		length = r * 2 * 3.14f;
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
		
		a = 5;
		b = 5;
		System.out.println(a);//5
		System.out.println(b);//5.0
	}

}