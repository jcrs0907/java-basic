package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0, num2 = 0;
		
		System.out.print("첫번째 수?");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수?");
		num2 = Integer.parseInt(br.readLine());
		
		//\t 탭
		//\n, \t 정규화 표현식(모든 표현식)
		System.out.printf("%d + %d = %d\t", num1, num2,(num1+num2));
		System.out.printf("%d - %d = %d\n", num1, num2,(num1-num2));
		System.out.printf("%d * %d = %d\t", num1, num2,(num1*num2));
		//나누기는 결과값으로 몫이 나옴
		System.out.printf("%d / %d = %d\n", num1, num2,(num1/num2));
		System.out.printf("%d %% %d = %d\n", num1, num2,(num1%num2));
		
		System.out.println(num1+ "+" + num2 +"=" + (num1+num2));
		//>, <, >=, <=, !=, ==
		System.out.println("num1>num2:"+ (num1>num2));
		System.out.println("num1<num2:"+ (num1<num2));
		
		//---------------------------------------------------------------------------------
		
		String str;
		//삼항 연산자
		str = num1%2 == 0?"짝수":"홀수";
		str = num1>0? "양수":(num1<0?"음수":"영");
		
		System.out.println(str);
		
		//A and(&&) B : A,B 둘다 true : true
		//A or(||) B : A나 B 둘중에 하나만 true이면 : true
		str = num1%4==0 && num1%100!=0 || num1%400==0 ? "윤년" : "평년";
		System.out.println(str);
	}
	
	
	
	
	

}