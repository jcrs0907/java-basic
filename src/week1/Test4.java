package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		
		//BufferedR 단축키
		//정의, 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader : 처리 속도를 높이기 위해 메모리에 버퍼를 만들어 저장
		//InputStreamReader : 문자를 2byte로 변환
		//System.in : 키보드로 입력한 1byte 문자를 읽어냄
	
		int r;
		double area, length;
		
		//입력
		System.out.println("반지름?");//20 문자로 읽어서 돌려줌
		
		//readLine()은 입력값으로 들어온 데이터를 한 줄로 읽어서 String으로 바꾸는 메소드
		//정수형 입력이라면, 형변환 필수!
		r = Integer.parseInt(br.readLine());
		
		//연산
		area = r*r*3.14;
		length = r*2*3.14;
		
		//출력
		System.out.println("반지름:" + r);
		System.out.println("넓이:" + area);
		//double을 사용하여서 소수점이 길게 나온다.
		System.out.println("둘레:" + length);
	}
}
