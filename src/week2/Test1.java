package com.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException{
		
		//���
		//if, for, while, do~while, switch
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		String str = ""; // null�� �ʱ�ȭ
		
		System.out.print("���Է�?");//10
		num = Integer.parseInt(br.readLine());
		
		/*
		 if(���ǹ�) {
			�۾�;
		}
		 */
		/*
		//���� if��
		//if���� �ܼ� 2�� �����ϱ� ������ str�� �ʱ�ȭ �������� ���� ��� ������ ����.
		if(num%2==0) //������ 1���� �� ��ȣ ����
			str = "¦��";
		
		
		//if(num%2==1) {
		if(num%2!=0) 
			str = "Ȧ��";
		*/
		
		//if - else��
		//��ǻ�Ͱ� str�� ���� �� �߿� �ϳ� �ݵ�� �ɸ��ڴٶ�� ������ �ؼ�
		//str ���� �ʱ�ȭ ���� �ʾƵ� ������ ���� �ʴ´�
		if(num%2==0) {
			str = "¦��";
		}else{
			str = "Ȧ��";
		}
		
		System.out.println(num+" : "+str);
		
		
		
		
		
		
	}
}
