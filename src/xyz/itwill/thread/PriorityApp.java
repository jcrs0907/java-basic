package xyz.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one = new PriorityOne();
		PriorityTwo two = new PriorityTwo();
		
		one.setPriority(Thread.MIN_PRIORITY);//상수값: 1, 우선순위가 낮음
		two.setPriority(Thread.MAX_PRIORITY);//상수값: 10, 우선순위가 높음
		
		one.start();
		two.start();
	}
}
