package week4;

import java.util.Scanner;

//������
//����� ����: 1.�޸� �Ҵ�, 2.���� �ʱ�ȭ
//Class�� �̸��� ����
//���ϰ��� ��� property�� ����
//�ߺ�����(overload)�� �����ϴ�.

//�����ڿ��� �����ڸ� ȣ���� �� �ִ�.
//��, ���ο����� ȣ�� ����

public class Test5 {
	private int x;
	
	//�⺻ �����ڴ� ������
	
	//�⺻ ������ ���Ƿ� �����
	public Test5() {
		// TODO Auto-generated constructor stub
	}
//	public Test5() {
//		//this(30);
//		
//		System.out.println("�⺻ ������...");
//		x=10;
//		System.out.println("x: "+x);
//	}
	
	public Test5(int x) {
		//this();
		System.out.println("�⺻ ������...");
		this.x=10;
		System.out.println("x: "+x);
	}
	
	public void set(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		//Test5 ob1 = new Test5(20);
		
		ob.set(20);
		ob.print();
	}

}
