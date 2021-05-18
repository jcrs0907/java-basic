package xyz.itwill.lang;

//String : 문자열을 저장하기 위한 클래스
// => 내부적으로 String 인스턴스의 문자열은 byte 배열의 요소에 문자로 저장되어 처리
public class StringApp {
	public static void main(String[] args) {
		//" " 기호를 이용하여 String 인스턴스 표현 가능
		String str1="ABC";//String 인스턴스 생성
		
		//String.toString() : String 인스턴스에 저장된 문자열을 반환하는 메소드 
		System.out.println("str1.toString() = "+str1.toString());
		//참조변수를 출력할 경우 자동으로 toString() 메소드 호출
		System.out.println("str1 = "+str1);
		System.out.println("============================================================");
		//" " 기호를 이용하여 String 인스턴스를 표현할 경우 동일한 문자열을 저장한 
		//인스턴스가 존재하면 기존 인스턴스를 재사용
		String str2="ABC";//기존 인스턴스 재사용
		
		//참조변수를 관계연산자로 비교할 경우 참조변수에 저장된 인스턴스의 해쉬코드(HashCode)를
		//비교하여 결과 제공
		// => String 인스턴스에 저장된 문자열을 비교하는 것이 아니라 인스턴스가 저장된 위치를 비교
		// => 관계연산자로 String 인스턴스에 저장된 문자열 비교 불가능
		if(str1==str2) {
			System.out.println("str1과 str2에 저장된 인스턴스의 해쉬코드가 같습니다.");
		} else {
			System.out.println("str1과 str2에 저장된 인스턴스의 해쉬코드가 다릅니다.");
		}
		System.out.println("============================================================");
		//new 연산자로 생성자를 호출하여 인스턴스를 생성하면 무조건 새로운 인스턴스 생성
		String str3=new String("ABC");
		
		if(str1==str3) {
			System.out.println("str1과 str3에 저장된 인스턴스의 해쉬코드가 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 인스턴스의 해쉬코드가 다릅니다.");
		}
		System.out.println("============================================================");
		//String.equals(String s) : 저장된 문자열과 전달받은 문자열을 서로 비교하여 다르면
		//false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equals(str3)) {
			System.out.println("str1과 str3에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		String str4="abc";
		//equals() 메소드는 대소문자를 구분하여 비교 결과 반환
		if(str1.equals(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		//String.equalsIgnoreCase(String s) : 저장된 문자열과 전달받은 문자열을 대소문자
		//구분없이 서로 비교하여 다르면 false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		//String.compareTo(String s): 저장된 문자열과 전달받은 문자열을 대소문자 포함 구분, 비교하여 저장된 문자열이 크면 양수를 반환하고
		//같으면 0을 반환하고 전달받은 문자열이 크면 음수를 반환하는 메소드 (크다 작다 같다 세가지 비교)
		if(str1.compareTo(str4)>0) {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 큽니다");
		}else if(str1.compareTo(str4)==0) {
			System.out.println("str1에 저장된 문자열과 str4에 저장된 문자열이 같습니다");
		}else {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 작습니다");

		}
		System.out.println("============================================================");
		String str5 = "ABCDEFG";
		//String.length(): 저장된 문자열의 문자 갯수를 반환하는 메소드
		System.out.println("문자열의 갯수 ="+ str5.length());
		//String.charAt(int index): 전달받은 첨자위치의 문자를 반환하는 메소드
		System.out.println("문자열의 두번째 위치에 문자 ="+ str5.charAt(1));
		//String.indexOf(String str): 전달된 문자열을 검색하여 저장된 위치의 시작첨자를 반환하는 메소드
		//검색 문자열이 없는 경우 -1 반환
		System.out.println("A 문자열의 저장위치(Index) = " +str5.indexOf("A"));
		System.out.println("EFG 문자열의 저장위치(Index) = " +str5.indexOf("EFG"));
		System.out.println("X 문자열의 저장위치(Index) = " +str5.indexOf("X"));
		System.out.println("============================================================");
		
		
		String str6 = "Java Programming";
		//String.toUpperCase(): 저장된 문자열을 모두 대문자로 변환하여 반환하는 메소드
		System.out.println(str6.toUpperCase());
		//String.toLowerCase(): 저장된 문자열을 모두 소문자로 변환하여 반환하는 메소드
		System.out.println(str6.toLowerCase());
		System.out.println("============================================================");

		String str7 = "   홍길동       ";
		System.out.println(str7);
		//String.trim(): 저장된 문자열의 앞 또는 뒤에 존재하는 모든 공백을 제거하여 반환하는 메소드다. 중간에 있는 공백은 제거가 되지 않는다.
		System.out.println(str7.trim());
		
		String str8 = "   아이스    아메리카노       ";
		System.out.println(str8);
		//String.replace(String regEx, String replacement): 저장된 문자열에서 검색 문자열
		//정규표현식(String regEx)을 찾아 치환문자열(String replacement)로 변경하여 반환하는 메소드
		System.out.println(str8.replace(" ","").replace("아이스","따뜻한"));
		System.out.println("============================================================");
		String str9 = "010-1234-5678";
		System.out.println(str9);
		
		//String.split(String regEx):저장된 문자열을 전달받은 구분 문자열(정규표현식)로 분리하여 문자열 배열로 반환하는 메소드
		//정규표현식의 메타문자는 \\를 이용하여 Escape 문자로 표현
		String[] array = str9.split("-");
		//String[] array = str9.split("*");
		
		System.out.println(array);
		System.out.println("전화번호 앞부분 = " + array[0]);
		System.out.println("전화번호 앞부분 = " + array[1]);
		System.out.println("전화번호 앞부분 = " + array[2]);
		
		//String.substring(int beginIndex, int endIndex): 
		//저장된 문자열에서 시작첨자(문자 포함)부터 종료첨자(문자 미포함)까지의 문자열을 분리하여 반환하는 메소드
		System.out.println(str9.substring(0,3));
		System.out.println(str9.substring(4,8));
		//System.out.println(str9.substring(9,13));
		//시작첨자만 전달할 경우 시작 첨자의 문자부터 마지막 문자까지 분리하여 반환
		System.out.println(str9.substring(9));
		

	}
}

