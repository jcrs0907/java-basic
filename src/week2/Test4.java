package week2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����? 5 3 7
		//���: 3 5 7
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, temp;//temp - �ӽ������
		//Scanner�� ������ ������ ����
		System.out.print("������ ��?");//5 3 7 
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//�߸��� ���
		//else if���� ������ �����ϴ� ���� ����
		//3�� �ݺ��ؾ� �ϴµ� ù��° if�� ���̸� ���� �� ����Ǳ� ������ ��� �Ұ�.
		//�׷��� ���� if������ �����ؾ���
		if(num1>num2) {
			temp = num1; //�̸� �� ����
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1; //�̸� �� ����
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("���: %d %d %d\n",num1,num2,num3);

	}

}
