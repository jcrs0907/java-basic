package xyz.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one = new PriorityOne();
		PriorityTwo two = new PriorityTwo();
		
		one.setPriority(Thread.MIN_PRIORITY);//�����: 1, �켱������ ����
		two.setPriority(Thread.MAX_PRIORITY);//�����: 10, �켱������ ����
		
		one.start();
		two.start();
	}
}
