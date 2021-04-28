package com.week1;

import java.io.IOException;

public class Test8 {

	public static void main(String[] args) throws IOException {
		//ascii 코드에서 해당하는 숫자기호로 들어간다.
		//char ch = 'a';//97
		char ch;
		char result;
		System.out.print("한개의 문자?");//a(97)
		//내부적으로 97이라는 신호가 생겨서 int로 인식해 캐릭터로 형 변환을 해줘야 한다.
		ch = (char) System.in.read();
		//System.out.println(ch);
		//System.out.println(Integer.toString(ch));
		
		result = ch>=65 && ch <= 90 ? (char)(ch+32) :  (ch>='a'&&ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch+" : "+result);
	}

}