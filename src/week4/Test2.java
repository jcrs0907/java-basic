package week4;

//static
//��ü�� 1000�� �����ǵ� �޸� ������ �Ѱ��� ���
//������ �޸� ������ �ε��ȴ�
public class Test2 {

	public static int a = 10;//static ����
	//Ŭ���� ���� �Ǵ� Ŭ���� �޼ҵ��
	//�ε��Ǵ� ���� �޸� �Ҵ��� �̷������[Ŭ�����̸�.��ü]�� ���� ����
	//�� new�� ���� �޸� �Ҵ��� ���� �ʾƵ� ��� �����ϴ�.
	
	public int b = 20;//instance ����
	//�ν��Ͻ� ���� �Ǵ� �ν��Ͻ� �޼ҵ�� new�� ���ؼ��� ������ ����
	//Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�
	
	public void write() {
		System.out.println("class ���� a:"+ a);
	}
	
	public static void print(){
		System.out.println("class ���� a:"+ a);		
		//System.out.println("instance ���� b:"+ b);		
	}
	
	public static void main(String[] args) {
		System.out.println("class ���� a:"+ a);
		System.out.println("class ���� a:"+ Test2.a);
		
		//write();
		print();
		Test2.print();
		
		Test2 ob = new Test2();
		
		System.out.println(ob.b);
		ob.write();
		ob.print();
		System.out.println(ob.a);
		
		
		Test2 ob1 = new Test2();
		ob1.a = 100;
		ob1.b = 200;
		
		Test2 ob2 = new Test2();
		ob1.a = 1000;
		ob1.b = 2000;
		
		System.out.println("ob.a:"+ ob.a);
		System.out.println("ob.b:"+ ob.b);
		
		System.out.println("ob1.a:"+ ob1.a);
		System.out.println("ob1.b:"+ ob1.b);
		
		System.out.println("ob2.a:"+ ob2.a);
		System.out.println("ob2.b:"+ ob2.b);
		
		
		
		
		
	}

}
