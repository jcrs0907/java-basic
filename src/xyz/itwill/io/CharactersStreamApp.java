package xyz.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//Character Stream: 인코딩 처리된 문자 데이터로 전달하기 위한 입력 또는 출력 스트림
//Reader 클래스 또는 Writer 클래스를 상속받은 자식 클래스로 생성된 스트림(인스턴스)

//키보드 입력값을 인코딩 처리된 문자 데이터로 입력받아 모니터에 전달하여 출력하는 프로그램
//=> EOF(End Of File: 입력 종료 - Ctrl + Z) 신호를 전달하면 프로그램이 종료
//reader, writer는 독립적으로 스트림을 만들 수 없다.
//inputStream과 OutputStream을 이용하여 스트림 생성이 가능하다.
public class CharactersStreamApp {
	public static void main(String[] args) throws IOException {
		
		System.out.println("[메세지] 키보드를 눌러 값을 입력해 주세요[종료:Ctrl+Z]");
		
		//InputStreamReader: 인코딩 처리된 문자 데이터를 반환 하기 위한 기능을 제공하는 클래스
		//InputStream 인스턴스(입력 스트림)을 전달받아야 입력 스트림 생성 가능
		
		//System.in은 원시데이터밖에 저장하지 못하는데 InputStreamReader을 이용하여 스트림을 확장하여 저장한다.
		InputStreamReader in = new InputStreamReader(System.in);
		
		//OutputStreamWriter: 인코딩 처리된 문자 데이터를 전달 하기 위한 기능을 제공하는 클래스
		//OutputStream 인스턴스를 전달받아야 출력 스트림 생성 가능 - 확장 스트림
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		//PrintWriter: 인코딩 처리된 문자 데이터를 전달하기 위한 기능을 제공하는 클래스
		//모든 값을 문자 데이터로 변환하여 전달하는 메소드가 추가된 클래스
		PrintWriter out = new PrintWriter(System.out);
		
		int readByte;
		
		while(true) {
			//Reader.read(): 입력스트림에 존재하는 값을 인코딩 처리된 문자 데이터(2Byte)로 읽어 반환하는 메소드
			readByte = in.read();
			
			if(readByte==-1) break;
			
			//readByte는 2byte 값인데 1byte 값으로 출력해서 한글이 깨져서 나온다.
			//System.out.write(readByte);
			
			//Writer.write(int b): 출력 스트림에 인코딩 처리된 문자 데이터를 전달하는 메소드
			//문자 데이터를 일정 크기만큼 출력 버퍼(임시 메모리)에 모아서 한번에 출력 스트림에 전달
			out.write(readByte);
			
			//Writer.flush(): 출력 버퍼에 저장된 문자 데이터를 출력 스트림으로 전달하는 메서드
			out.flush();
		}
		
		System.out.println("[메세지] 프로그램을 종료합니다.");

	}
}
