package com.week1;

import java.io.IOException;

public class Test8 {

	public static void main(String[] args) throws IOException {
		//ascii �ڵ忡�� �ش��ϴ� ���ڱ�ȣ�� ����.
		//char ch = 'a';//97
		char ch;
		char result;
		System.out.print("�Ѱ��� ����?");//a(97)
		//���������� 97�̶�� ��ȣ�� ���ܼ� int�� �ν��� ĳ���ͷ� �� ��ȯ�� ����� �Ѵ�.
		ch = (char) System.in.read();
		//System.out.println(ch);
		//System.out.println(Integer.toString(ch));
		
		result = ch>=65 && ch <= 90 ? (char)(ch+32) : (ch>='a'&&ch<='z'?(char)(ch-32):ch);
		
		System.out.println(ch+" : "+result);
	}

}
