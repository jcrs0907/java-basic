package week2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		// switch
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("1~3�̳��� ��?");
		num = sc.nextInt();
		
		//()�� ���� �� �ִ� �� : �ڷ���(8���� ����) + String
		switch(num) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
		case 1:
			System.out.println("*");
		default:
			System.out.println("���� �Է� ����");	
			break;
		}

	}

}
