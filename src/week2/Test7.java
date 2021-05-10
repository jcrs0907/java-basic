package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int su, sum;
		//무한 루프
		while(true) {
			do {
				System.out.print("수입력");//100
				su = sc.nextInt();
			}while(su<1||su>5000); //1보다 작으면 안되고 5000보다 크면 안된다.
			
			sum = 0;//합계 변수 초기화
			//입력한 값까지 더하여 출력
			for(int i = 1; i<=su; i++) {
				sum+=i; //sum=sum+i;
			}
			System.out.println("1~" + su + "까지의 합: " + sum);
			System.out.print("계속 할래?");//yyyy,Y,n,N,abcf
			
			char ch;
			ch = (char)System.in.read();//y에 해당하는 값
			
			if(ch!='y' && ch!='Y') {//양쪽이 부정이면 and 연산자 사용
				System.out.println("프로그램 종료...");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
