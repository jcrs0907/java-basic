package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		
		//BufferedR ����Ű
		//����, ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader : ó�� �ӵ��� ���̱� ���� �޸𸮿� ���۸� ����� ����
		//InputStreamReader : ���ڸ� 2byte�� ��ȯ
		//System.in : Ű����� �Է��� 1byte ���ڸ� �о
	
		int r;
		double area, length;
		
		//�Է�
		System.out.println("������?");//20 ���ڷ� �о ������
		
		//readLine()�� �Է°����� ���� �����͸� �� �ٷ� �о String���� �ٲٴ� �޼ҵ�
		//������ �Է��̶��, ����ȯ �ʼ�!
		r = Integer.parseInt(br.readLine());
		
		//����
		area = r*r*3.14;
		length = r*2*3.14;
		
		//���
		System.out.println("������:" + r);
		System.out.println("����:" + area);
		//double�� ����Ͽ��� �Ҽ����� ��� ���´�.
		System.out.println("�ѷ�:" + length);
	}
}
