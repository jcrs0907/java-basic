package com.week3;

public class Test4 {

	public static void main(String[] args) {
		int i,j;
		
		int inwon = 3;
		//selection sort
		for(i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				System.out.println(i+ ":" + j);
			}
		}
	}

}
