package com.week2;

import java.util.Scanner;

//반복문(for,while,do-while)

public class Test6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	//scanner라는 클래스를 sc로 복사해서 쓰겠다.
	int dan;
	
	System.out.print("단 입력?");
	dan = sc.nextInt();
	
	//for(시작값;최대값;증가값)
	//시작값, 증가값, 최대값이 명확하게 정해져 있을 때
	
	for(int i=1; i<=9; i++) {//i=i+1 - i++의 또 다른 표현
		System.out.println("for"+ dan +"x"+ i+"="+(dan * i));
	}
	System.out.println("\n------------------------------\n");
		
	//초기값
	//while(최대값){
	// 증가값
	//}

	int j=1; //초기값을 만들 때 1이 들어갈 지 0이 들어갈 지 고민한다.
	
	while(j<=9) {
		//j++; 위에 있을 경우 더하기먼저 진행하기 때문에 2부터 출력된다(2부터 10까지)
		System.out.println("while"+ dan+"*"+j+"="+(dan*j));
		j++;
	}
	
	System.out.println("\n------------------------------\n");
	
	int e=0;//배열에서 주로 0부터 사용(인덱스)
	while(e<9) {
		e++;
		System.out.println("while"+ dan+"*"+e+"="+(dan*e));
	}
		
	System.out.println("\n------------------------------\n");
		
	//do-while(최대값);
	//초기값
	//do{
	//	증가값
	//}while(최대값);
	
	int k=1;
	do {
		k++;
		System.out.println("do-while"+ dan+"*"+k+"="+(dan*k));
	}while(k<9);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
