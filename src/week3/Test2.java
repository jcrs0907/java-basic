package week3;

import java.util.Scanner;

class Hap{
	
	int su, sum;//�ν��Ͻ� ����
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�?");
		su = sc.nextInt();
		
		
	}
	
	public int cnt() {
		for(int i=1; i<=su; i++) {
			sum+=i;//sum=sum+i
		}
		return sum;
	}
	
	public void print(int s) {
		System.out.println("1~"+su+"������ ��:"+s);
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		//��ü �ι� ���� �޸� �ι� �Ҵ�
		//Hap h = ���ÿ� ����
		//new Hap() = ���� ����
		Hap h = new Hap();
		
		h.input();//10
		int i = h.cnt();
		h.print(i);
		
		Hap h1 = new Hap();//�޸𸮻��� ��ü ����
		h1.input();//100
		i = h1.cnt();
		h1.print(i);
		
		System.out.println(h.su);//10
		System.out.println(h1.su);//100
		
		
		
	}
}
