package example;

import java.util.Scanner;

//��ǻ�ͷκ��� �������� ���� �������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
// => 1~100 ������ ���� �������� �����޵��� �ۼ�
// => �������� ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
// => Ű���� �Է°��� 1~100 ������ �ƴ� ��� �޼��� ��� �� ���Է�
// => �������� �Է°��� ���� ��� �Է� Ƚ�� ��� �� ���α׷� ����
// => �������� �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
// => �������� 10�� �ȿ� ������ ���� ��� �������� ��µǵ��� �ۼ�
public class UpAndDownExample {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner (System.in);
//		
//		int count = 0;
//		int randomNum =(int)(Math.random()*100) + 1;
//		System.out.println(randomNum);
//		while(true) {
//			int num;
//			System.out.println("�Է�");
//			count++;
//			num = scanner.nextInt();
//			System.out.println(num + "num");
//			if(num == randomNum) {
//				System.out.println(count + "count");
//				break;
//			}else {
//				if(count < 10) {
//					if(num > randomNum)System.out.println("������ �Է�");
//					if(num < randomNum)System.out.println("ū�� �Է�");
//				}else if(10 == count) {
//					System.out.println("��" +  randomNum);
//					break;
//				}
//			
//			}
//			
//			
//		}
//		
//	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1~100 ������ ���� �������� �����޾� ������ ����
		int dap = (int)(Math.random()*100)+1;
		
		//���� ���� ���������� �����ϱ� ���� ���� ����
		//-> false:������ ������ ���� ����, true : ������ ���� ����
		boolean result = false;
		
		//10���� �Է±�ȸ�� �����ϱ� ���� �ݺ���
		//=> �������� �Է¹޾� �������� ���Ͽ� ��� ���
		for(int i=1; i<=10; i++) {
			//����ڷκ��� Ű���� �Է°��� �����޾� ������ ����
			// => ���������� �������� �Էµ� ��� ���Էµǵ��� �ݺ� ó��
			
			
			int input;
			while(true) {
				System.out.print(i+"��° ������ �Է�[1~100] >>");
				input = scanner.nextInt();
				if(input>=1 && input<=100) break;
				System.out.println("[����]1~100 ������ �������� �Է� �����մϴ�.");
			}
			
			//�������� �Է°��� ���Ͽ� ��� ���
			//=> �������� �Է°��� ���� ��� �ݺ��� ����
			if(dap==input) {
				System.out.println("[�޼���] �����մϴ�."+i+"������ ������ϴ�.");
				result = true;
				break;
			}else if(dap>input){
				System.out.println("[�޼���] "+input+"���� ū ���� �Է��غ�����");
			}else {
				System.out.println("[�޼���] "+input+"���� ���� ���� �Է��غ�����");

			}
		}
		
		if(!result) {//������ ������ ���� ������ ���
			System.out.println("������" + dap);
		}
		scanner.close();
	}
}
