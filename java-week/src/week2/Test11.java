package week2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int형태의 데이터를 갖는 변수 5개가 만들어진다.
		int[] num = new int[5];
//		String[] str = new String[5];
		
		System.out.print("다섯개의 정수?");// 4 6 2 8 9
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("배열의 갯수"+ num.length);
		
		for(int su : num) {//확장 for문 배열에서만 사용 가능
			System.out.println(su);
		}
		System.out.println();
		
		
		//num 3의 값을 변경
		num[3] = 400;
		System.out.println("num[3]:"+num[3]);
		
		//num 1의 값을 가진 변수를 선언
		int a = num[1];
		System.out.println(a);//20
		
		

	}

}
