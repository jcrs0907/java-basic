package week2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		// switch
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("1~3이내의 수?");
		num = sc.nextInt();
		
		//()에 들어올 수 있는 값 : 자료형(8가지 형태) + String
		switch(num) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
		case 1:
			System.out.println("*");
		default:
			System.out.println("숫자 입력 오류");	
			break;
		}

	}

}
