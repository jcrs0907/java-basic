package week2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세수? 5 3 7
		//결과: 3 5 7
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, temp;//temp - 임시저장소
		//Scanner는 공백을 만나면 멈춤
		System.out.print("세개의 수?");//5 3 7 
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//잘못된 경우
		//else if문은 조건이 만족하는 순간 종료
		//3번 반복해야 하는데 첫번째 if가 참이면 실행 후 종료되기 때문에 사용 불가.
		//그래서 단일 if문으로 변경해야함
		if(num1>num2) {
			temp = num1; //미리 값 저장
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1; //미리 값 저장
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("결과: %d %d %d\n",num1,num2,num3);

	}

}
