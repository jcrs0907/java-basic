package xyz.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;

//Ű���� �Է°��� ���� ����Ÿ�� �Է¹޾� ���Ͽ� �����Ͽ� �����ϴ� ���α׷�
// => EOF(End Of File : �Է� ���� - Ctrl+Z) ��ȣ�� �����ϸ� ���α׷� ����
public class FileByteSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]Ű���带 ���� ���� �Է��� �ּ���.[����:Ctrl+Z]");

		//FileOutputStream : ���Ͽ� ���� ����Ÿ�� �����Ͽ� �����ϴ� ��� ��Ʈ���� �����ϱ� ���� Ŭ����
		//FileOutputStream(String name) : ���ϰ�θ� ���޹޾� ���� ��� ��Ʈ���� �����ϴ� ������
		// => ���޹��� ���ϰ�ο� ������ ���� ��� FileNotFoundExcetion �߻� - ����ó��(����) 
		// => ���޹��� ���ϰ�ο� ������ ���� ��� ������ �ڵ����� ����� ��� ��Ʈ�� �����Ͽ� ��ȯ
		// => ���޹��� ���ϰ�ο� ������ �ִ� ��� ���� ������ ���� ��� ���ο� ������ ���޹޾� ���� - ������(OverWrite)
		//FileOutputStream out=new FileOutputStream("c:/data/byte.txt");

		//FileOutputStream(String name, boolean append) : ���ϰ�ο� ������ ���޹޾� ����
		//��� ��Ʈ���� �����ϴ� ������
		// => false : ���� ���� �����(�⺻), true : ���� ���� �̾��
		FileOutputStream out=new FileOutputStream("c:/data/byte.txt",true);
		
		int readByte;
		while(true) {
			//Ű���� �Է� ��Ʈ���� ���� ���� ����Ÿ�� �о� ������ ����
			//FileNotFoundExcetion Ŭ������ IOException Ŭ������ �ڽ� Ŭ����
			readByte=System.in.read();	
			if(readByte==-1) break;
			//���� ����Ÿ�� ����� �������� ���� ��� ��Ʈ���� ���� - ���� ����
			out.write(readByte);			
		}
		
		//FileOutputStream.close() : ���� ��� ��Ʈ���� �����ϴ� �޼ҵ�
		// => ���Ͽ��� �Է� ��Ʈ���� ��� ��Ʈ���� ���� �ϳ��� ���� ����
		// => ���� ó���� ���� ������ ��Ʈ���� ��� �� �ݵ�� ����
		out.close();
		
		System.out.println("[�޼���]c:\\data\\byte.txt ���Ͽ� Ű���� �Է°��� ���� �Ǿ����ϴ�.");
	}
}







