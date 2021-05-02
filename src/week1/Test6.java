package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		
		//밑변과 높이를 입력받아 삼각형의 면적 구하기
		//밑변:10
		//높이:20
		//넓이:???
		//공식:밑변*높이/2
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		float width, height;
		float area;
		
		System.out.print("밑변?");//24.5;
		width = Float.parseFloat(br.readLine());
		
		System.out.print("높이?");//11.5
		height = Float.parseFloat(br.readLine());
		
		area = width * height / 2;
		
		System.out.println("면적:" + area);
		//더블을 받을 때 %g
		System.out.printf("면적: %g", area);
		
	}

}
