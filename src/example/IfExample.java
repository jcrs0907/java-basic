package example;

public class IfExample {
	public static void main(String[] args) {
		//변수에 저장된 문자값을 출력하세요.
		//단, 변수에 저장된 문자값이 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun='x';
		
		if(mun >= 'a' && mun <= 'z') {//변수값이 소문자인 경우
			mun-=32; //32 빼서 저장 -> 변수값을 소문자에서 대문자로 변환하여 저장
			
		}
		
		System.out.println("mun = "+mun);
		System.out.println("============================================================");
		//변수에 저장된 정수값이 4의 배수인지를 구분하여 출력하세요.
		int num=345644;
		
		if(num%4 == 0) {
			System.out.println(num+ " 4의 배수다");
		}else {
			System.out.println(num+ " 4의 배수가 아니다");			
		}
		
		System.out.println("============================================================");
		//올해가 평년인지 윤년을 구분하여 출석하세요.
		// => 년도를 4로 나누어 나머지가 0인 경우 윤년
		// => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
		// => 위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
		int year=2021;
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "윤년");
		}else {
			System.out.println(year + "평년");
		}
		System.out.println("============================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균, 학점을 계산하여 이름, 총점, 평균, 학점을 출력하세요.
		// => 국어,영어,수학 점수 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		//    System.exit(0) : 프로그램을 강제로 종료하는 메소드
		// => 평균을 이용한 학점 계산 : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => 평균은 소숫점 두자리까지만 출력하고 나머지는 절삭 처리 하세요.
		String name = "홍길동";
		int kor=89, eng=93, mat=95;
		
		//입력값에 대한 유효성 검사(Validation)
//		if(kor > 100 || kor < 0) {
		if(!(kor >=0 && kor <=100) || (eng < 0 || eng > 100 || (mat < 0 || mat > 100))) { //여러 표현이 나올 수 있다.
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 점수가 입력되었습니다.");
			//정상적이지 않을 때는 메세지 출력
			System.exit(0);// 프로그램 종료
		}
		
		
		boolean valid = false;
		
		if(kor < 0 || kor > 100) {
			valid = true;
		}
		
		if(eng < 0 || eng > 100) {
			valid = true;
		}
		
		if(mat < 0 || mat > 100) {
			valid = true;
		}
		
		if(valid) { //조건식 대신 boolean 변수값을 이용하여 명령 선언
			System.exit(0);
		}
	
		
		int tot = kor + eng + mat;
		double ave=tot/3.;
		String grade = "";
		
		//실수는 switch문에서 사용할 수 없다.
		//강제 형변환
		switch((int)ave/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		
		System.out.println("이름 = "+name+", 총점 ="+tot+", 평균 ="+(int)(ave*100)/100.+", 학점 = " + grade);
		System.out.println("============================================================");
	}
}









