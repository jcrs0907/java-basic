package basic;

public class WhileApp {
	public static void main(String[] args) {
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		int i=1;
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println("=================================================");
		//1~100 ������ �������� �հ踦 ����Ͽ� ����ϼ���.
		int j=1, tot=0;
		do {
			tot+=j;
			j++;
		} while(j<=100);
		
		System.out.println("1~100 ������ �������� �հ� = "+tot);
		System.out.println("=================================================");
		//A4 ������ ������ ��� ���� ������ ��� �簢�� ����� 500�� �̻��� �����������
		//�� �� ����� �Ǵ��� ����Ͽ� ����ϼ���.
		//cnt : ���� Ƚ���� �����ϱ� ���� ����
		//gae : �簢�� ����� ������ �����ϱ� ���� ����
		int cnt=0, gae=1;
		
		//A4 ������ ������ ���� ������ �ݺ� ó�� 
		// => �簢�� ����� ������ 500�� �̸��� ��� �ݺ� ó�� - 500�� �̻��� ��� �ݺ� ����
		while(gae<500) {
			cnt++;//���� Ƚ���� 1�� ����
			gae*=2;//�簢�� ����� ������ 2�辿 ����
		}
		
		System.out.println(cnt+"�� ������ "+gae+"���� �簢�� ����� ��������ϴ�.");
		System.out.println("=================================================");
		//1���� X ������ �������� �հ谡 300 �̻��� �Ƿ��� X�� ������ ����Ͽ� ����ϼ���.
		int x=0, sum=0;//x : �������� ������, sum : �հ�
		
		while(sum<300) {
			x++;
			sum+=x;
		}
		
		System.out.println("1~"+x+" ������ �������� �հ� = "+sum);
		System.out.println("=================================================");
	}
}