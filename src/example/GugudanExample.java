package example;

import java.util.Scanner;

//Ű����� �������� �Է¹޾� 1~9 ������ �������� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��,�Էµ� �������� 2~9 ������ �������� ���Ǹ� ���� ���� �������� �Է��� ��� �޼��� ��� �� ���Է�
//ex) �� �Է�[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 8 = 56
//    7 * 9 = 63
public class GugudanExample {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner (System.in);
//		while(true) {
//			int num;
//			System.out.println("������ �Է�");
//			num = scanner.nextInt();
//			System.out.println(num);
//			System.out.println(num >=2 && num <= 9);
//			
//			if(num >=2 && num <= 9) {
//				for(int i = 1; i <= 9; i++) {
//					System.out.println(num +"*"+ i +"="+ num * i);
//				}
//			}else {
//				System.out.println("2~9 ������ �������� ���");
//			}	
//		}
//	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan;
		while(true) {
			System.out.print("�� �Է�[2~9] >>");
			dan = scanner.nextInt();
			if(dan>=2 && dan<=9) break; //�������� �Է°��� ��� �ݺ��� ����
			System.out.println("[����]�������� 2~9 ������ �������� �Է� �����մϴ�.");
		}
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		scanner.close();
		
	}
}
