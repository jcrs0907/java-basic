package basic;

public class WhileApp {
	public static void main(String[] args) {
		//"Java Programming"를 화면에 5번 출력하세요.
		int i=1;
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println("=================================================");
		//1~100 범위의 정수들의 합계를 계산하여 출력하세요.
		int j=1, tot=0;
		do {
			tot+=j;
			j++;
		} while(j<=100);
		
		System.out.println("1~100 범위의 정수들의 합계 = "+tot);
		System.out.println("=================================================");
		//A4 용지를 반으로 계속 접어 펼쳤을 경우 사각형 모양이 500개 이상이 만들어지려면
		//몇 번 접어야 되는지 계산하여 출력하세요.
		//cnt : 접는 횟수를 저장하기 위한 변수
		//gae : 사각형 모양의 갯수를 저장하기 위한 변수
		int cnt=0, gae=1;
		
		//A4 용지를 반으로 접는 행위를 반복 처리 
		// => 사각형 모양의 갯수가 500개 미만인 경우 반복 처리 - 500개 이상인 경우 반복 종료
		while(gae<500) {
			cnt++;//접는 횟수를 1씩 증가
			gae*=2;//사각형 모양의 갯수는 2배씩 증가
		}
		
		System.out.println(cnt+"번 접으면 "+gae+"개의 사각형 모양이 만들어집니다.");
		System.out.println("=================================================");
		//1부터 X 범위의 정수들의 합계가 300 이상이 되려면 X가 얼마인지 계산하여 출력하세요.
		int x=0, sum=0;//x : 더해지는 정수값, sum : 합계
		
		while(sum<300) {
			x++;
			sum+=x;
		}
		
		System.out.println("1~"+x+" 범위의 정수들의 합계 = "+sum);
		System.out.println("=================================================");
	}
}
