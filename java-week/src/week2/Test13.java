package week2;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		//�迭 ����Ͽ� �޷¸����
		Scanner sc = new Scanner(System.in);
		
		//month��� �迭�� �ϼ� �Է��ϸ� �ʱ�ȭ
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y, m, nalsu, i, week, d;
		
		do {
			System.out.print("�⵵?");//2021
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//5
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("��?");//23
			d = sc.nextInt();
		}while(d<1||d>31);
		
		//���� �޾Ƽ� ���� ����ϱ�
		
		//���⿡ ���� 2������ ���� ���
		if(y%4==0 && y%100!=0 || y%400!=0) {
			month[1] = 29;
		}
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		//m-1�������� ����
		for(i=0;i<m-1;i++) {
			nalsu += month[i];
		}
		
		//���ϴ� ��(m)�� 1���� ����
		nalsu += d; //nalsu = nalsu + 1;
		
		week = nalsu % 7;
		
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		
		System.out.printf("%d�� %d�� %d�� %s����",y,m,d,yoil[week]);

	
	}

}
