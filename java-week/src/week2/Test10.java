package week2;

import java.io.IOException;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char oper;
		
		System.out.print("첫번째 수?");//20, 30
		num1 = sc.nextInt();
		
		System.out.print("두번째 수?");//5
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]?");//+
		oper = (char)System.in.read();
		
		//%d : 정수
		//%f : 실수
		//%c : 문자
		//%s : 문자열
		
		switch(oper) {
		case '+':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
			break;
		case '-':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
			break;
		case '*':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
			break;
		case '/':
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
			break;
		}

	}

}
