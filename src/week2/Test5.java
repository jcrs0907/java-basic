package week2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str;
		
		System.out.print("수입력?");//12
		num = sc.nextInt();
		
		if(num%3==0 && num%4==0) {
			str = "3과 4의 배수입니다.";
		}else if(num%4==0){
			str = "4의 배수입니다.";
		}else if(num%3==0){
			str = "3의 배수입니다.";
		}else{
			str = "3과 4의 배수가 아닙니다.";
		}
		
		System.out.println(str);
		
		
		
		

	}

}
