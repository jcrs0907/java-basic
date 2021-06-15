package week4;

import java.util.Scanner;

//생성자
//만드는 이유: 1.메모리 할당, 2.변수 초기화
//Class의 이름과 동일
//리턴값이 없어서 property가 없다
//중복정의(overload)가 가능하다.

//생성자에서 생성자를 호출할 수 있다.
//단, 선두에서만 호출 가능

public class Test5 {
	private int x;
	
	//기본 생성자는 생략됨
	
	//기본 생성자 임의로 만들기
	public Test5() {
		// TODO Auto-generated constructor stub
	}
//	public Test5() {
//		//this(30);
//		
//		System.out.println("기본 생성자...");
//		x=10;
//		System.out.println("x: "+x);
//	}
	
	public Test5(int x) {
		//this();
		System.out.println("기본 생성자...");
		this.x=10;
		System.out.println("x: "+x);
	}
	
	public void set(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		//Test5 ob1 = new Test5(20);
		
		ob.set(20);
		ob.print();
	}

}
