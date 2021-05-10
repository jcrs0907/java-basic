package com.week2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		//배열 사용하여 달력만들기
		Scanner sc = new Scanner(System.in);
		
		//month라는 배열에 일수 입력하며 초기화
		int[] month = {31,28,30,30,31,30,31,31,30,31,30,31};
		
		int y, m, nalsu, i, week;
		
		do {
			System.out.print("년도?");//2021
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		
		//일을 받아서 요일 계산하기
		
		//윤년에 따른 2월달의 날수 계산
		if(y%4==0 && y%100!=0 || y%400!=0) {
			month[1] = 29;
		}
		
		//1년 1월 1일부터 (y-1)년 12월 31일까지의 날수(윤년포함)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
//		int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
//		System.out.println(nalsu);
//		System.out.println(yy);
	
		
		
		//m-1월까지의 날수
		for(i=0;i<m-1;i++) {
			nalsu += month[i];
		}
		
		//구하는 달(m)의 1일의 날수
		nalsu += 1; //nalsu = nalsu + 1;
		
		week = nalsu % 7;
//		System.out.println(week);
		
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("--------------------------");
		
		//공백지정
		for(i=0; i<week; i++) {
			System.out.print("    ");//4칸
		}
		
		//index    0  1  2  3  4  5  6  7  8  9  10  11
		//month = {31,28,30,30,31,30,31,31,30,31,30,31};
		//		   1  2  3  4  5  6  7  8  9  10 11  12
		
		for(i=1;i<=month[m-1]; i++) {
			System.out.printf("%4d",i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		
		System.out.println("--------------------------");
	
	}

}
