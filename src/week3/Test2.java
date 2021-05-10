package week3;

import java.util.Scanner;

class Hap{
	
	int su, sum;//인스턴스 변수
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력?");
		su = sc.nextInt();
		
		
	}
	
	public int cnt() {
		for(int i=1; i<=su; i++) {
			sum+=i;//sum=sum+i
		}
		return sum;
	}
	
	public void print(int s) {
		System.out.println("1~"+su+"까지의 합:"+s);
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		//객체 두번 생성 메모리 두번 할당
		//Hap h = 스택에 저장
		//new Hap() = 힙에 저장
		Hap h = new Hap();
		
		h.input();//10
		int i = h.cnt();
		h.print(i);
		
		Hap h1 = new Hap();//메모리상의 객체 생성
		h1.input();//100
		i = h1.cnt();
		h1.print(i);
		
		System.out.println(h.su);//10
		System.out.println(h1.su);//100
		
		
		
	}
}
