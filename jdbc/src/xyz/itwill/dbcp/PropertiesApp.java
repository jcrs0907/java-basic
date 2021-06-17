package xyz.itwill.dbcp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Properties 파일: 프로그램 실행에 필요한 값을 제공하기 위한 텍스트 파일
//=> 프로그램을 변경하지 않고 pROPERTIES 파일의 내용을 변경하여 프로그램 실행
//프로그램의 유지보수 효율성 증가
//properties 파일에서는 값을 무조건 문자열로만 제공
//Properties 파일에서는 영문자, 숫자, 일부 특수 문자를 제외한 문자는 유니코드로 작성

//user.properties 파일에 저장된 값을 읽어 출력하는 프로그램
public class PropertiesApp {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Properties 파일을 읽기 위한 파일 입력 스트림 생성
		//FileInputStream in = new FileInputStream("src/xyz/itwill/dbcp/user.properties");

		
		InputStream in = PropertiesApp.class.getClassLoader().getResourceAsStream("xyz/itwill/");
	}

}
