package com.week2;

import java.util.Scanner;

//�ݺ���(for,while,do-while)

public class Test6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	//scanner��� Ŭ������ sc�� �����ؼ� ���ڴ�.
	int dan;
	
	System.out.print("�� �Է�?");
	dan = sc.nextInt();
	
	//for(���۰�;�ִ밪;������)
	//���۰�, ������, �ִ밪�� ��Ȯ�ϰ� ������ ���� ��
	
	for(int i=1; i<=9; i++) {//i=i+1 - i++�� �� �ٸ� ǥ��
		System.out.println("for"+ dan +"x"+ i+"="+(dan * i));
	}
	System.out.println("\n------------------------------\n");
		
	//�ʱⰪ
	//while(�ִ밪){
	// ������
	//}

	int j=1; //�ʱⰪ�� ���� �� 1�� �� �� 0�� �� �� ����Ѵ�.
	
	while(j<=9) {
		//j++; ���� ���� ��� ���ϱ���� �����ϱ� ������ 2���� ��µȴ�(2���� 10����)
		System.out.println("while"+ dan+"*"+j+"="+(dan*j));
		j++;
	}
	
	System.out.println("\n------------------------------\n");
	
	int e=0;//�迭���� �ַ� 0���� ���(�ε���)
	while(e<9) {
		e++;
		System.out.println("while"+ dan+"*"+e+"="+(dan*e));
	}
		
	System.out.println("\n------------------------------\n");
		
	//do-while(�ִ밪);
	//�ʱⰪ
	//do{
	//	������
	//}while(�ִ밪);
	
	int k=1;
	do {
		k++;
		System.out.println("do-while"+ dan+"*"+k+"="+(dan*k));
	}while(k<9);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
