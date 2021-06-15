package week2;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		//배열 사용하여 달력만들기
		Scanner sc = new Scanner(System.in);
		
		//month라는 배열에 일수 입력하며 초기화
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y, m, nalsu, i, week, d;
		
		do {
			System.out.print("년도?");//2021
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("일?");//23
			d = sc.nextInt();
		}while(d<1||d>31);
		
		//일을 받아서 요일 계산하기
		
		//윤년에 따른 2월달의 날수 계산
		if(y%4==0 && y%100!=0 || y%400!=0) {
			month[1] = 29;
		}
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//m-1월까지의 날수
		for(i=0;i<m-1;i++) {
			nalsu += month[i];
		}
		
		//구하는 달(m)의 1일의 날수
		nalsu += d; //nalsu = nalsu + 1;
		
		week = nalsu % 7;
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.printf("%d년 %d월 %d일 %s요일",y,m,d,yoil[week]);

	
	}

}
