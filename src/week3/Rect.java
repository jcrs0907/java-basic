package com.week3;

import java.util.Scanner;

public class Rect {

	int w,h;//instance 변수(전역변수, 멤버변수(웹))
	
	public void input() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("가로?");//10
		w = sc.nextInt();
		
		System.out.print("세로?");//20
		h = sc.nextInt();
		
		return;
	}
	//면적을 정수로 구해서 반환해주는 메소드 만들기
	public int area() {
		int result;//지역 변수	
		result = w * h;
		return result;
	}
	
	//둘레를 구해서 정수로 반환해주는 메소드 만들기
	public int length() {
		return (w*h)*2;
	}
	
	//출력
	public void print(int a, int l) {
		System.out.println("가로:"+ w);
		System.out.println("세로:"+ h);
		System.out.println("넓이:" + a);
		System.out.println("둘레:" + l);
	}

}
