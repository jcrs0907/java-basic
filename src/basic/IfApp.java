package basic;

public class IfApp {

	public static void main(String[] args) {
		int num = 10;
		
		//변수값을 홀수와 짝수로 구분하여 출력
		if(num%2 != 0) {
			System.out.println(num+">> 홀수");
		}else {
			System.out.println(num+">> 짝수");
		}
		System.out.println("================================================");
		char mun = '0';
		
		//변수값을 영문자 또는 비영문자로 구분하여 출력
		if(mun >= 'A' && mun<='Z' || mun>='a' && mun<='z') {
			System.out.println("[결과]"+mun+">> 영문자");
		}else{
			System.out.println("[결과]"+mun+">> 비영문자");
		}
		System.out.println("============================");
		
		int jumsu = 188;
		//변수값이 0~100 범위의 유효값이 아닌지 구분하여 출력 - 유효성 검사
		
		if(jumsu >= 0 && jumsu <= 100) {
			//변수값에 따른 등급을 구분하여 출력
			//100~90 : A, 89~80 : B, 79~70 : c, 69~60 : D, 59~0 : F
			
			//null character : 문자값이 존재하지 않는 문자
//			char grade = '\0'; //학점을 저장하기 위한 변수
//			
//			if(jumsu <= 100 && jumsu >= 90) {
//				grade = 'A';
//			}else if(jumsu <= 89 && jumsu >= 80) {
//				grade = 'B';
//			}else if(jumsu <= 79 && jumsu >= 70) {
//				grade = 'c';
//			}else if(jumsu <= 69 && jumsu >= 60) {
//				grade = 'D';
//			}else if(jumsu <= 59 && jumsu >= 0) {
//				grade = 'F';
//			}
			
			char grade;
			if(jumsu >= 90) {
				grade = 'A';
			}else if(jumsu >= 80) {
				grade = 'B';
			}else if(jumsu >= 70) {
				grade = 'c';
			}else if(jumsu >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println(grade+ jumsu);
		}else {
			System.out.println("[결과] 0~100 범위를 벗어난 비정상적인 값이 입력 되었습니다.");
		}
	}

	//ctrl shift f -> beautify
	
}
