package xyz.itwill.dbcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Properties ����: ���α׷� ���࿡ �ʿ��� ���� �����ϱ� ���� �ؽ�Ʈ ����
//=> ���α׷��� �������� �ʰ� pROPERTIES ������ ������ �����Ͽ� ���α׷� ����
//���α׷��� �������� ȿ���� ����
//properties ���Ͽ����� ���� ������ ���ڿ��θ� ����
//Properties ���Ͽ����� ������, ����, �Ϻ� Ư�� ���ڸ� ������ ���ڴ� �����ڵ�� �ۼ�

//user.properties ���Ͽ� ����� ���� �о� ����ϴ� ���α׷�
public class PropertiesApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Properties ������ �б� ���� ���� �Է� ��Ʈ�� ����
		//FileInputStream in = new FileInputStream("src/xyz/itwill/dbcp/user.properties");

		
		InputStream in = PropertiesApp.class.getClassLoader().getResourceAsStream("xyz/itwill/");
	}

}
