package com.week2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		System.out.print("이름"); //suzi
		name = sc.next(); // scanner의 next라는 메서드 => String으로 값을 돌려줌
		
		System.out.println("국어");//50
		kor = sc.nextInt();
		
		String pan = "";
		
		//조건이 여러개일 경우 사용
		if(kor> 90) {
			pan = "수";
		}else if(kor>80) {
			pan = "우";
		}else if(kor>70) {
			pan = "미";
		}else if(kor>60) {
			pan = "양";
		}else{
			pan = "가";
		}
		
		System.out.println(name+":"+pan);
	}

}
