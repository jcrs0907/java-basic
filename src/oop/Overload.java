package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("������ = " + param);
	}
	
	public void displayBoolean(Boolean param) {
		System.out.println("���� = " + param);
	}
	
	public void displayString(String param) {
		System.out.println("���ڿ� = " + param);
	}
	
	//�޼ҵ�� �Ű��������� �ĺ��ڷ� �ν��Ͽ�
	//�޼ҵ� �̸��� ���Ƶ� �ٸ� �޼ҵ�� �ν��Ѵ�.
	//--> �޼ҵ� �����ε�(Method Overload) ����
	//������ ����� �����ϴ� �޼ҵ尡 �Ű������� ����
	//���� �� �����ؾ� �� ��� �޼ҵ���� ���� �����ϴ� ���
	//-> �Ű� ������ ���� �Ǵ� �ڷ����� ���� �ʵ��� ����
	//-> ���� ������ �Ǵ� ��ȯ���� �����ε� ����� ����
	
	public void display(int param) {
		System.out.println("������ = " + param);
	}
	
	public void display(Boolean param) {
		System.out.println("���� = " + param);
	}
	
	public void display(String param) {
		System.out.println("���ڿ� = " + param);
	}
}
