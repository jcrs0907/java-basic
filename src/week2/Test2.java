package com.week2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		System.out.print("�̸�"); //suzi
		name = sc.next(); // scanner�� next��� �޼��� => String���� ���� ������
		
		System.out.println("����");//50
		kor = sc.nextInt();
		
		String pan = "";
		
		//������ �������� ��� ���
		if(kor> 90) {
			pan = "��";
		}else if(kor>80) {
			pan = "��";
		}else if(kor>70) {
			pan = "��";
		}else if(kor>60) {
			pan = "��";
		}else{
			pan = "��";
		}
		
		System.out.println(name+":"+pan);
	}

}
