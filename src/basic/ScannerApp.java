package basic;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		//Scanner Ŭ���� : �Է���ġ�κ��� ����
		//�����ޱ� ���� �޼ҵ尡 ����
		//Scanner Ŭ������ ��ü�� �����Ͽ� ������ ����
		//������ ����� ��ü�� �޼ҵ� ȣ��
		//=> Ű����κ��� ���� �Է¹ޱ� ���� Scanner ��ü ����
		//System.in : Ű���� �Է� ��Ʈ�� -
		// Ű����� �Էµ� ���� �����ϴ� ��ü 
		
		//java.util �� ��ĳ�ʸ� ����ؾ� �Ѵ�
		//System in => �Է��� ���� ����Ʈ ������ �д´�.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸� �Է� >> ");
		//Scanner.nextLine() : �Է°��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼���
		//����� Ű����� �Է¹��� ���ڿ��� ������ ����
		//=> Ű���� �Է°��� ���� ��� ���α׷��� �帧(������)�� �Ͻ� ����
		//=> ����� Ű����� ���� �Է��� �� ���͸� �Է��ϸ� ������ �����
		String name = scanner.nextLine();
		
		System.out.print("���� �Է� >>");
		//scanner.nextInt() : �Է°��� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼���
		//����� Ű����� �Է¹��� �������� ������ ����
		// => Ű���� �Է°��� �������� �ƴ� ��� ����(Exception) �߻�
		int age = scanner.nextInt();
		
		System.out.println("[���]"+name+"���� "+age+"���Դϴ�.");
		
		//scanner.close(); Scanner ��ü�� ��Ʈ���� �����ϴ� �޼ҵ�
		scanner.close();//close���� ������ �����
	}

}
