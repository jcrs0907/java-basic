package com.week2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		
		//한번에 왕창 물어볼 수 있음~~
		//System.out.print("이름 국어 영어 수학?");//suzi 40 60 50
		//sc = sc.next();
		
		//정규화 표현식 쉼표 표현 추가
		System.out.print("이름 국어 영어 수학?");//suzi,40,60,50
		//*표 빠져도 에러 안나니까 유의
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.print(name + (kor+eng+mat)+"점");
	}

}
