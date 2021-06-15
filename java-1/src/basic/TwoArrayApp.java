package basic;

public class TwoArrayApp {
	public static void main(String[] args) {
		int[][] num=new int[2][3];
		
		System.out.println("num = "+num);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("=====================================================");
		System.out.println("num[0][0] = "+num[0][0]);
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[0][2] = "+num[0][2]);
		
		System.out.println("num[1][0] = "+num[1][0]);
		System.out.println("num[1][1] = "+num[1][1]);
		System.out.println("num[1][2] = "+num[1][2]);
		System.out.println("=====================================================");
		System.out.println("num.length = "+num.length);
		System.out.println("num[0].length = "+num[0].length);
		System.out.println("num[1].length = "+num[1].length);
		System.out.println("=====================================================");
		for(int i=0;i<num.length;i++) {//행 - 1차원 배열의 갯수만큼 반복
			for(int j=0;j<num[i].length;j++) {//열 - 요소의 갯수만큼 반복
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		//int[][] su=new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int[][] su={{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array:su) {//1차원 배열정보를 제공받아 참조변수에 저장하여 반복 처리
			for(int temp:array) {//요소값을 제공받아 변수에 저장하여 반복 처리
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		//1차원 배열이 없는 2차원 배열 생성
		// => 1차원 배열 정보를 저장할 수 있는 참조여서만 생성
		int[][] number=new int[3][];
		
		//1차원 배열이 없으므로 2차원 배열의 참조요소에는 자동으로 null 저장
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		
		//1차원 배열이 없는 경우 요소를 표현하면 예외 발생
		// => NullPointerException 발생 - NULL을 저장된 참조요소를 이용하여 참조할 경우 발생
		//System.out.println("number[0][0] = "+number[0][0]);
		System.out.println("=====================================================");
		
		//2차원 배열의 참조요소에 1차원 배열을 생성하여 배열 정보 저장
		// => 1차원 배열에 요소의 갯수를 다르게 생성하여 저장 - 가변배열 
		number[0]=new int[3];
		number[1]=new int[2];
		number[2]=new int[4];
		
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		
		number[1][0]=40;
		number[1][1]=50;
		
		number[2][0]=60;
		number[2][1]=70;
		number[2][2]=80;
		number[2][3]=90;

		//int[][] number={{10,20,30},{40,50},{60,70,80,90}};
		
		for(int[] array:number) {
			for(int temp:array) {
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
	}
}
