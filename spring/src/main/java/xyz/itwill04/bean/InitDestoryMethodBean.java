package xyz.itwill04.bean;

public class InitDestoryMethodBean  {
	public InitDestoryMethodBean() {
		System.out.println("### InitDestoryMethodBean Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	//��ü ���� �� �ʱ�ȭ �۾��� ���� �ѹ��� ȣ���ϱ� ���� �޼ҵ�
	public void init() {
		System.out.println("*** InitDestoryMethodBean Ŭ������ init() �޼ҵ� ȣ�� ***");
	}
	
	//��ü �Ҹ� �� ������ �۾��� ���� �ѹ��� ȣ���ϱ� ���� �޼ҵ�
	public void destroy() {
		System.out.println("*** InitDestoryMethodBean Ŭ������ destroy() �޼ҵ� ȣ�� ***");
	}
	
	public void display() {
		System.out.println("*** InitDestoryMethodBean Ŭ������ display() �޼ҵ� ȣ�� ***");
	}
}
