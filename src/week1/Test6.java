package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		
		//�غ��� ���̸� �Է¹޾� �ﰢ���� ���� ���ϱ�
		//�غ�:10
		//����:20
		//����:???
		//����:�غ�*����/2
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		float width, height;
		float area;
		
		System.out.print("�غ�?");//24.5;
		width = Float.parseFloat(br.readLine());
		
		System.out.print("����?");//11.5
		height = Float.parseFloat(br.readLine());
		
		area = width * height / 2;
		
		System.out.println("����:" + area);
		//������ ���� �� %g
		System.out.printf("����: %g", area);
		
	}

}
