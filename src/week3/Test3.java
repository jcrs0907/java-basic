package com.week3;

class SubClass{
	int a, b; //인스턴스 변수
}

public class Test3 {
	public static void main(String[] args) {
		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		ob1.a = 10;
		ob1.b = 20;
		System.out.println("ob1.a" + ob1.a);//10
		System.out.println("ob1.b" + ob1.b);//20
		
		System.out.println("ob1.a" + ob2.a);//0
		System.out.println("ob1.b" + ob2.b);//0
		
		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob1.a" + ob2.a);//100
		System.out.println("ob1.b" + ob2.b);//200
		
		System.out.println("ob1.a" + ob1.a);//10
		System.out.println("ob1.b" + ob1.b);//20
	}
}
