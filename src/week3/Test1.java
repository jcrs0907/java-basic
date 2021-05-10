package com.week3;
//같은 패키지에 있으면 import 하지 않아도 된다.
public class Test1 {
	public static void main(String[] args) {
		//클래스
		//재사용성, 전문성
		
		Rect ob1 = new Rect();
		
		ob1.input();
		
		int k = ob1.area();
		int p = ob1.length();
		ob1.print(k, p);
	}
}
