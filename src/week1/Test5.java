package com.week1;
//BufferedReader를 메모리 상에 올려라
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//String은 클래스지만 자료형처럼 사용(import를 하지 않는 이유 : 사용 빈도가 높아서 자동으로 메모리 상에 올려짐)
		String name;
		int kor;
		int eng;
		int tot;
		
		//입력
		System.out.print("이름");//suzi
		name = br.readLine();

		System.out.print("국어?");//30
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어?");
		eng = Integer.parseInt(br.readLine());
		
		//연산
		//%d : 정수
		//%f : 실수
		//%c : 문자
		//%s : 문자열
		tot = kor + eng;
		System.out.printf("이름: %s, 총점: %d\n", name, tot);		
	}

}
