package xyz.itwill06.oop;

public class OopOne {
	//�޼ҵ忡 �ߺ��ڵ尡 ������ ��� �ߺ��ڵ� ��� ���� �޼ҵ� ����
	// => �ߺ��ڵ带 �ּ�ȭ �Ͽ� ���������� ȿ���� ����
	/*
	public void beforeLog() {
		System.out.println("### �޼ҵ��� ��� ���� �� ��ϵ� ���� ###");
	}
	*/
	
	OopLogger logger=new OopLogger();
	
	public void display1() {
		//System.out.println("### �޼ҵ��� ��� ���� �� ��ϵ� ���� ###");
		//beforeLog();
		logger.beforeLog();
		System.out.println("*** OopOne Ŭ������ display1() �޼ҵ� ȣ�� ***");
	}
	
	public void display2() {
		//System.out.println("### �޼ҵ��� ��� ���� �� ��ϵ� ���� ###");
		//beforeLog();
		logger.beforeLog();
		System.out.println("*** OopOne Ŭ������ display2() �޼ҵ� ȣ�� ***");
	}
	
	public void display3() {
		//System.out.println("### �޼ҵ��� ��� ���� �� ��ϵ� ���� ###");
		//beforeLog();
		logger.beforeLog();
		System.out.println("*** OopOne Ŭ������ display3() �޼ҵ� ȣ�� ***");
	}
}
