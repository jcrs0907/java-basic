package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0, num2 = 0;
		
		System.out.print("ù��° ��?");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ��?");
		num2 = Integer.parseInt(br.readLine());
		
		//\t ��
		//\n, \t ����ȭ ǥ����(��� ǥ����)
		System.out.printf("%d + %d = %d\t", num1, num2,(num1+num2));
		System.out.printf("%d - %d = %d\n", num1, num2,(num1-num2));
		System.out.printf("%d * %d = %d\t", num1, num2,(num1*num2));
		//������� ��������� ���� ����
		System.out.printf("%d / %d = %d\n", num1, num2,(num1/num2));
		System.out.printf("%d %% %d = %d\n", num1, num2,(num1%num2));
		
		System.out.println(num1+ "+" + num2 +"=" + (num1+num2));
		//>, <, >=, <=, !=, ==
		System.out.println("num1>num2:"+ (num1>num2));
		System.out.println("num1<num2:"+ (num1<num2));
		
		//---------------------------------------------------------------------------------
		
		String str;
		//���� ������
		str = num1%2 == 0?"¦��":"Ȧ��";
		str = num1>0? "���":(num1<0?"����":"��");
		
		System.out.println(str);
		
		//A and(&&) B : A,B �Ѵ� true : true
		//A or(||) B : A�� B ���߿� �ϳ��� true�̸� : true
		str = num1%4==0 && num1%100!=0 || num1%400==0 ? "����" : "���";
		System.out.println(str);
	}
	
	
	
	
	

}
