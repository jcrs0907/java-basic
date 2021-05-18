package xyz.itwill.lang;

//StringBuffer ���ڿ��� �����ϱ� ���� Ŭ����
//=> ����� ���ڿ��� ���ڸ� ���� ��ȯ�ϴ� �޼ҵ� ����
public class StringBufferApp {
	public static void main(String[] args) {
		
		
		//StringBuffer Ŭ������ new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println("toString=========================================");
		//StringBuffer.toString(): StringBuffer �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println(sb.toString());
		System.out.println(sb);
		
		System.out.println("StringBuffer=========================================");
		//StringBuffer �ν��Ͻ��� String �ν��Ͻ��� ��ȯ�޾� ����
		String str = sb.toString();
		System.out.println(str);
		System.out.println("append=========================================");
		
		//StringBuffer.append(Object o):���ް��� ����� ���ڿ��� �߰��ϴ� �޼ҵ�
		// String �ν��Ͻ��� ����� ���ڿ��� += �����ڸ� ����� ȿ���� ����
		sb.append("DEF");
		System.out.println(sb);
		
		System.out.println("insert=========================================");
		//StringBuffer.insert(int offset, Object o): ����� ���ڿ����� ���ϴ� ��ġ(index)��
		//���ް��� �����ϴ� �޼ҵ�
		sb.insert(4, "X");
		System.out.println(sb);
		System.out.println("deleteCharAt=========================================");
		//StringBuffer.deleteCharAt(int index): ����� ���ڿ����� ���ϴ� ��ġ(index)��
		//���ڸ� �����ϴ� �޼ҵ�
		sb.deleteCharAt(2);
		System.out.println(sb);
		System.out.println("delete=========================================");
		//StringBuffer.delete(int start, int end): ����� ���ڿ����� ���ϴ� ����
		//(start ���� ����, end ���� ������)�� ���ڵ��� �����ϴ� �޼ҵ�
		sb.delete(4,6);
		System.out.println(sb);
		System.out.println("reverse=========================================");
		//StringBuffer.reverse: ����� ���ڿ��� ���ڸ� �ݴ�� �ٲپ� �����ϴ� �޼���
		sb.reverse();
		System.out.println(sb);

		
		
	}
}
