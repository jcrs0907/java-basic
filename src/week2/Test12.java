package com.week2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		//�迭 ����Ͽ� �޷¸����
		Scanner sc = new Scanner(System.in);
		
		//month��� �迭�� �ϼ� �Է��ϸ� �ʱ�ȭ
		int[] month = {31,28,30,30,31,30,31,31,30,31,30,31};
		
		int y, m, nalsu, i, week;
		
		do {
			System.out.print("�⵵?");//2021
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		
		//���� �޾Ƽ� ���� ����ϱ�
		
		//���⿡ ���� 2������ ���� ���
		if(y%4==0 && y%100!=0 || y%400!=0) {
			month[1] = 29;
		}
		
		//1�� 1�� 1�Ϻ��� (y-1)�� 12�� 31�ϱ����� ����(��������)
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
//		int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
//		System.out.println(nalsu);
//		System.out.println(yy);
	
		
		
		//m-1�������� ����
		for(i=0;i<m-1;i++) {
			nalsu += month[i];
		}
		
		//���ϴ� ��(m)�� 1���� ����
		nalsu += 1; //nalsu = nalsu + 1;
		
		week = nalsu % 7;
//		System.out.println(week);
		
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("--------------------------");
		
		//��������
		for(i=0; i<week; i++) {
			System.out.print("    ");//4ĭ
		}
		
		//index    0  1  2  3  4  5  6  7  8  9  10  11
		//month = {31,28,30,30,31,30,31,31,30,31,30,31};
		//		   1  2  3  4  5  6  7  8  9  10 11  12
		
		for(i=1;i<=month[m-1]; i++) {
			System.out.printf("%4d",i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		
		System.out.println("--------------------------");
	
	}

}
