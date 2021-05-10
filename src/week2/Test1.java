package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException{
		
		//제어문
		//if, for, while, do~while, switch
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		String str = ""; // null로 초기화
		
		System.out.print("수입력?");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		 if(조건문) {
			작업;
		}
		 */
		/*
		//단일 if문
		//if문이 단순 2번 실행하기 때문에 str를 초기화 시켜주지 않을 경우 에러가 난다.
		if(num%2==0) //조건이 1개일 때 괄호 생략
			str = "짝수";
		
		
		//if(num%2==1) {
		if(num%2!=0) 
			str = "홀수";
		*/
		
		//if - else문
		//컴퓨터가 str의 값이 둘 중에 하나 반드시 걸리겠다라고 생각을 해서
		//str 변수 초기화 하지 않아도 에러가 나지 않는다
		if(num%2==0) {
			str = "짝수";
		}else{
			str = "홀수";
		}
		
		System.out.println(num+" : "+str);
		
		
		
		
		
		
	}
}
