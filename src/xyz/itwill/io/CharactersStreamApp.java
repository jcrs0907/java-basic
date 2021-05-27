package xyz.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//Character Stream: ���ڵ� ó���� ���� �����ͷ� �����ϱ� ���� �Է� �Ǵ� ��� ��Ʈ��
//Reader Ŭ���� �Ǵ� Writer Ŭ������ ��ӹ��� �ڽ� Ŭ������ ������ ��Ʈ��(�ν��Ͻ�)

//Ű���� �Է°��� ���ڵ� ó���� ���� �����ͷ� �Է¹޾� ����Ϳ� �����Ͽ� ����ϴ� ���α׷�
//=> EOF(End Of File: �Է� ���� - Ctrl + Z) ��ȣ�� �����ϸ� ���α׷��� ����
//reader, writer�� ���������� ��Ʈ���� ���� �� ����.
//inputStream�� OutputStream�� �̿��Ͽ� ��Ʈ�� ������ �����ϴ�.
public class CharactersStreamApp {
	public static void main(String[] args) throws IOException {
		
		System.out.println("[�޼���] Ű���带 ���� ���� �Է��� �ּ���[����:Ctrl+Z]");
		
		//InputStreamReader: ���ڵ� ó���� ���� �����͸� ��ȯ �ϱ� ���� ����� �����ϴ� Ŭ����
		//InputStream �ν��Ͻ�(�Է� ��Ʈ��)�� ���޹޾ƾ� �Է� ��Ʈ�� ���� ����
		
		//System.in�� ���õ����͹ۿ� �������� ���ϴµ� InputStreamReader�� �̿��Ͽ� ��Ʈ���� Ȯ���Ͽ� �����Ѵ�.
		InputStreamReader in = new InputStreamReader(System.in);
		
		//OutputStreamWriter: ���ڵ� ó���� ���� �����͸� ���� �ϱ� ���� ����� �����ϴ� Ŭ����
		//OutputStream �ν��Ͻ��� ���޹޾ƾ� ��� ��Ʈ�� ���� ���� - Ȯ�� ��Ʈ��
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		//PrintWriter: ���ڵ� ó���� ���� �����͸� �����ϱ� ���� ����� �����ϴ� Ŭ����
		//��� ���� ���� �����ͷ� ��ȯ�Ͽ� �����ϴ� �޼ҵ尡 �߰��� Ŭ����
		PrintWriter out = new PrintWriter(System.out);
		
		int readByte;
		
		while(true) {
			//Reader.read(): �Է½�Ʈ���� �����ϴ� ���� ���ڵ� ó���� ���� ������(2Byte)�� �о� ��ȯ�ϴ� �޼ҵ�
			readByte = in.read();
			
			if(readByte==-1) break;
			
			//readByte�� 2byte ���ε� 1byte ������ ����ؼ� �ѱ��� ������ ���´�.
			//System.out.write(readByte);
			
			//Writer.write(int b): ��� ��Ʈ���� ���ڵ� ó���� ���� �����͸� �����ϴ� �޼ҵ�
			//���� �����͸� ���� ũ�⸸ŭ ��� ����(�ӽ� �޸�)�� ��Ƽ� �ѹ��� ��� ��Ʈ���� ����
			out.write(readByte);
			
			//Writer.flush(): ��� ���ۿ� ����� ���� �����͸� ��� ��Ʈ������ �����ϴ� �޼���
			out.flush();
		}
		
		System.out.println("[�޼���] ���α׷��� �����մϴ�.");

	}
}
