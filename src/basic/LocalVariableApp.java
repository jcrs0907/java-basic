package basic;

/*
 ���� ����(Local Variable) :
  �޼ҵ� �Ǵ� ��� ���� �� ���ο��� ����� ����
  => ���������� ����� �� ���ο����� ��� ����
  => ���������� ����� ���� ����Ǹ� ���������� �ڵ� �Ҹ� ó��
  
  c#�� �ڹٴ� ���������� ����.
 */

public class LocalVariableApp {
	int su;
	
	public static void main(String[] args) {
		int num1 = 100;

		//���� ��
		{
			int num2 = 200;
			
			System.out.println("===== ���� �� ���� =====");
			System.out.println("num1 = "+num1);
			System.out.println("num1 = "+num2);
		}
		
		System.out.println("===== ���� �� �ܺ� =====");		
		System.out.println("num1 ="+num1);
		//���� �� ����� num2 ������ �ڵ� �Ҹ�ǹǷ� ��� �Ұ���
		//System.out.println("num1 = "+num2); //���� �� ���̶� ������ ����.
	
//		int num2; // �� �ۿ��� �Ȱ��� �̸��� ������ ������ �����ϴ�.
	}

}
