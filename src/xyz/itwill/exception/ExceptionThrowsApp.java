package xyz.itwill.exception;

public class ExceptionThrowsApp {
	//메소드의 명령 실행시 발생되는 예외를 throws 키워드로 전달
	//예외를 전달하는 메소드를 호출하면 예외 발생
	public static void display() throws ArrayIndexOutOfBoundsException{
		int[] array = {10,20,30,40,50};
		
		//예외(ArrayIndexOutOfBoundsException) 발생 명령
		for(int i=0; i<array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			// 같은 클래스의 static 메소드는 클래스명을 생략하여 호출 가능
			//ExceptionThrowsApp.display();
			
			//같은 클래스의 static 메소드는 클래스명을 생략하여 호출 가능
			//예외(ArrayIndexOutOfBoundsException)를 전달하는 메소드 호출 - 예외 발생
			display();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("에러");
		}
	}

}
