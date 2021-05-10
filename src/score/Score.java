package score;

import java.util.Scanner;

public class Score {

	//인스턴스 변수
	int inwon;//정수값 1개를 저장함
	
	//레코드(클래스)라는 타입의 자료를 저장하는 rec라는 변수
	//Record rec;//레코드값 1개를 저장함(7개의 저장공간을 가짐)
	Record[] rec;//배열안에 클래스 값을 저장할 수 있다.
	Scanner sc = new Scanner(System.in);
	public void set() {
		
	
		do {
			System.out.print("인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1|| inwon>10);
		
		rec = new Record[inwon];
	}
	
	public void input() {

		for(int i = 0; i<inwon; i++) {
			rec[i] = new Record();
			
			System.out.print("이름?");//suzi
			rec[i].name = sc.next();
			
			System.out.print("국어?");//30
			rec[i].kor = sc.nextInt();
			
			System.out.print("영어?");//40
			rec[i].eng = sc.nextInt();
			
			System.out.print("수학?");//50
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			rec[i].ave = rec[i].tot / 3;
		}
		
	}
	
	private void ranking() {
		int i,j;
		
		//rec 배열의 rank에 기본값 1로 변경: 초기화
		for(i=0; i<inwon; i++) {
			rec[i].rank = 1;
		}
		
		//석차구하기(i와 j의 비교)
		for(i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				if(rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				}else if(rec[i].tot<rec[j].tot) {
					rec[i].rank++;
				}
			}
		}
		
		
	}
	
	public void print() {
		ranking();//메소드에서 메소드 호출
		
		for(int i=0; i<inwon; i++) {
			System.out.printf("%6s",rec[i].name);
			System.out.printf("%4d",rec[i].kor);
			System.out.printf("%4d",rec[i].eng);
			System.out.printf("%4d",rec[i].mat);
			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].ave);
			System.out.printf("%4d\n",rec[i].rank);
		}
	}
	
}
