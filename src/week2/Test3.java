package com.week2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		
		//�ѹ��� ��â ��� �� ����~~
		//System.out.print("�̸� ���� ���� ����?");//suzi 40 60 50
		//sc = sc.next();
		
		//����ȭ ǥ���� ��ǥ ǥ�� �߰�
		System.out.print("�̸� ���� ���� ����?");//suzi,40,60,50
		//*ǥ ������ ���� �ȳ��ϱ� ����
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.print(name + (kor+eng+mat)+"��");
	}

}
