package week2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int������ �����͸� ���� ���� 5���� ���������.
		int[] num = new int[5];
//		String[] str = new String[5];
		
		System.out.print("�ټ����� ����?");// 4 6 2 8 9
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("�迭�� ����"+ num.length);
		
		for(int su : num) {//Ȯ�� for�� �迭������ ��� ����
			System.out.println(su);
		}
		System.out.println();
		
		
		//num 3�� ���� ����
		num[3] = 400;
		System.out.println("num[3]:"+num[3]);
		
		//num 1�� ���� ���� ������ ����
		int a = num[1];
		System.out.println(a);//20
		
		

	}

}
