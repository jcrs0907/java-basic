package week1;

public class Test3 {
	//class�ȿ��� �ݵ�� �޼��尡 �־�� �Ѵ�
	public static void main(String[] args) {

		int r = 10;
		float area, length;
		area = r * r * 3.14f; //���ٶ�� ���� �ƴ϶� ���� ������
		length = r * 2 * 3.14f;
		//area�� floatŸ������ ������ �� area �� r * r * 3.14�� �����ϸ�
		//�Ǽ��� �Ǵ��� �ϴµ� �Ǽ� Ÿ�� �� ū Ÿ���� Double�� �ν��� �Ѵ�.
		//�׷��� float�� �� ��ȯ�� ������Ѵ�.
		//%d : ����
		//%f : �Ǽ�
		//%c : ����
		//%s : ���ڿ�
		System.out.printf("������: %d, ���� : %f, �ѷ�: %f\n", r, area, length);
		System.out.printf("������: %d, ���� : %.2f, �ѷ�: %.2f\n", r, area, length);
		
		//byte, short, int, long : ����
		//float, double : �Ǽ�
		int a;
		float b;
		
		a = 5;//5
		b = 15;//15.0
		System.out.println(a);//5
		System.out.println(b);//15.0
		
		b = a; // int�� float�� �� �� �ִ�.
		System.out.println(b);//5.0;
		
		a = (int)b;
		
		
	}

}
