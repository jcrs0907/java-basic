package basic;


//�� ��ȯ(Type Cast) : ���� �ڷ����� �Ͻ������� ��ȯ�Ͽ� ����ϴ� ���
//=> �ڵ� ����ȯ(JVM), ���� ����ȯ(���α׷���)
public class TypeCastApp {

	public static void main(String[] args) {
		//�ڵ� ����ȯ : �ڷ����� �ٸ� ���� �����ϱ� ���� JVM�� ����
		//�ڷ��� ��ȯ ���
		
		//������ �Ǽ��� ���� 
		System.out.println("��� ="+(3+1.5));//3 >> 3.0
		
		System.out.println("��� ="+(95.0/10.0));//9.5
		System.out.println("��� ="+(95/10));
		System.out.println("��� ="+(95/10.0));//�ڵ� ����ȯ
		System.out.println("��� ="+(95.0/10));
		//�� �������� ���� ������ ����� : ���� - 9
		//���� ������ ������ ������ ����
	
		int kor = 95;
		int eng = 90;
		int tot = kor + eng;

		//���� �� �����(������)�� �Ǽ� ������ ����
		//double ave = tot / 2;//92.0 
		double ave = tot/2.;//92.5
		System.out.println("���� = "+tot+",��� = "+ ave);
		byte su1=10, su2=20;
		//int �ڷ������� ���� �ڷ����� ���� ������ ���
		//�ڵ����� int �ڷ������� ����ȯ ����.
		int su3 = su1+su2;
		System.out.println("su3= "+su3);
		//���� ����ȯ : ���α׷��Ӱ� Cast �����ڸ� �̿��Ͽ�
		//���ϴ� �ڷ����� ������ �Ͻ������� ��ȯ�Ͽ� ����ϴ� ���
		int num = (int)12.3; //int(12.3) >> 12
		System.out.println("num= "+num);
		
		int num1 = 95;
		int num2 = 10;
//		double num3 = num1 / num2;//9.0
		double num3 = (double)num1 / num2;//9.5
		//���� ����ȯ((double)num1)�� �ڵ� ����ȯ(num2)
		System.out.println("num3 ="+num3);
		
		//�������� ū ��� _�� �̿��Ͽ� ǥ���� ������.
		int num4 = 100_000_000;
		int num5 = 30;
		long num6 = (long)num4 * num5;
		//int *int => int �׷��� ���� �ϳ��� �� ��ȯ�� �ʿ���
		//���� ����� int �ڷ����� ǥ�� ������
		//�ʰ��� ��� �����Ⱚ �߻�
		System.out.println("num6 ="+num6);
		
		double number = 1.23456789;
		System.out.println("number = "+number);
		
		//�Ҽ��� 2�ڸ������� ��µǵ��� ���α׷� �ۼ�
		System.out.println("number(����) "+(int)(number*100)/100.0);//1.23
		System.out.println("number(�ݿø�) "+(int)(number*100 + 0.5)/100.0);//1.23
		System.out.println("number(�ø�) "+(int)(number*100 + 0.9)/100.0);//1.24
		


		
	}

}
