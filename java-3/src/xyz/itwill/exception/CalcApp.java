package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� ������ 2���� �Է¹޾� ���� ���� ����ϴ� ���α׷� �ۼ� 
public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� >> ");
		//Scanner.nextInt() : �Է°��� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => �Է°��� ���������� ��ȯ���� ���� ��� InputMissMatchException �߻� - ���� ó��
		int num1=scanner.nextInt();
		
		System.out.print("�ι�° ���� �Է� >> ");
		int num2=scanner.nextInt();
		
		//0���� ���� ��� ArithmeticException �߻� 
		System.out.println("[���]"+num1+" / "+num2+" = "+(num1/num2));
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		/*
		try {
			//�����ڸ� �̿��Ͽ� �ν��Ͻ� ���� >> �������� ��� ���� - ���� �߻�
			new CalcApp();
		} catch (InputMismatchException e) {
			System.out.println("[����]������ �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			//Exception : ��� ���� Ŭ������ �θ� Ŭ����
			// => ��� ���ܸ� ���޹޾� ���� ó�� ����
			System.out.println("[����]���α׷��� ����ġ ���� ������ �߻� �Ǿ����ϴ�.");
		}
		*/
		
		try {
			new CalcApp();
		} catch (InputMismatchException | ArithmeticException e) {
			//JDK7 �̻󿡼��� ���� Ŭ������ | �����ڷ� �����Ͽ� ���� ó�� ���� 
			System.out.println("[����]���Ŀ� �°� ���� �Է��� �ּ���.");
		} catch (Exception e) {
			System.out.println("[����]���α׷��� ����ġ ���� ������ �߻� �Ǿ����ϴ�.");
		}
	}
}
