package week1;

public class Test2 {
	
	public static void main(String[] args) {
		//�ڷ��� ���� �̸�
		int a = 15;
		int b = 5;
		int c,d; //�����Ⱚ
		
		c = a + b;
		d = a - b;
		
		//syso : System.out.println()
		//������ ���� : ������ ����, ��Ÿ�� ����
		// /n : ����
		System.out.println("a������: "+a);
		System.out.println("b������: "+b);
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d\n",a,b,d);

	}
}