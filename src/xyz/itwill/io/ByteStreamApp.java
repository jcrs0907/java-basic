package xyz.itwill.io;

import java.io.IOException;

//Byte Stream: ���õ���Ÿ�� �����ϱ� ���� �Է� �Ǵ� ��� ��Ʈ��
//=> InputStream Ŭ���� �Ǵ� OutputStream Ŭ������ ��� ���� ��� �ڽ� Ŭ������ ������ ��Ʈ��(�ν��Ͻ�)

//Ű���� �Է°��� ���õ����ͷ� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
//=> EOF(End Of File: �Է� ���� - Ctrl + Z) ��ȣ�� �����ϸ� ���α׷��� ����
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���] Ű���带 ���� ���� �Է��� �ּ���[����:Ctrl+Z]");
		
		//Ű���� �Է°��� ��ȯ�޾� �����ϱ� ���� ����
		int readByte;
		
		while(true) {
			//System.in: Java���� �⺻������ �����Ǵ� Ű���� �Է� ��Ʈ��
			//=>InputStream Ŭ������ ��ӹ޾� ������ ��Ʈ��
			//InputStream.read(): �Է� ��Ʈ���� �����ϴ� ���� ���õ�����(1Byte)�� �о� ��ȯ�ϴ� �޼ҵ�
			//�Է� ��Ʈ���� ���� ���� ��� ������ �Ͻ� ����
			//Ű���带 ���� �Է� ��Ʈ���� ���� �����ϰ� ���͸� ���� ������ �����
			//��� �Է� �Ǵ� ��� ��Ʈ���� �޼ҵ忡���� IOException�� �߻��� �� �ִ�.
			//IOException: �Է� �Ǵ� ��� ��Ʈ���� ������ �ִ� ��� �߻��Ǵ� ����
			
			
			readByte = System.in.read();
			
			//�Է� ���� ��ȣ(Ctrl+Z: EOF >> -1)�� ���޵� ��� �ݺ��� ����
			if(readByte==-1) break;
			
			//System.out: JAVA���� �⺻������ �����Ǵ� ����� ��� ��Ʈ��
			//=>OutputStream Ŭ������ ��ӹ��� �ڽ�Ŭ����(PrintStream)�� ������ ��Ʈ��
			//OutputStream.write(int b):���� ������(1Byte)�� ��� ��Ʈ������ �����ϴ� �޼ҵ�
			System.out.write(readByte);
		}
		
		System.out.println("[�޼���] ���α׷��� �����մϴ�.");
	}
}
