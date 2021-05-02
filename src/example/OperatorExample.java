package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		//d-day 프로그램 만들 때 많이 사용함
		int cho = 245678;
		System.out.print(cho+"초 >> ");
		int day = cho / (24 * 60 * 60); // 24 * 60 * 60 = 86400
		
		cho %= (24 * 60 * 60); 
		//cho=cho%86400; 86400으로 나눈 나머지값이 저장
		
		int hour=cho/(60*60); // 3600으로 나눈 몫을 저장
		cho %= cho/(60*60);
		int min = cho/60;
		int sec= cho%60;
		System.out.println(day+"일"+hour+"시"+min+"분"+sec+"초");
		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산 
		//출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요. 
		int danga = 150_000_000, gae = 20;
//		int don; //21억이 넘어서 음수로 나옴-> long으로 변환해줘야 함
		long don = (long)(gae>15? danga * 0.75 : danga)*gae; 
		System.out.println("지불금액 = "+don);
		System.out.println("===============================================");
	}
}
