package com.week2;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int su, sum;
		//���� ����
		while(true) {
			do {
				System.out.print("���Է�");//100
				su = sc.nextInt();
			}while(su<1||su>5000); //1���� ������ �ȵǰ� 5000���� ũ�� �ȵȴ�.
			
			sum = 0;//�հ� ���� �ʱ�ȭ
			//�Է��� ������ ���Ͽ� ���
			for(int i = 1; i<=su; i++) {
				sum+=i; //sum=sum+i;
			}
			System.out.println("1~" + su + "������ ��: " + sum);
			System.out.print("��� �ҷ�?");//yyyy,Y,n,N,abcf
			
			char ch;
			ch = (char)System.in.read();//y�� �ش��ϴ� ��
			
			if(ch!='y' && ch!='Y') {//������ �����̸� and ������ ���
				System.out.println("���α׷� ����...");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
