package realization;

public class BoatCarRealApp {
	public static void main(String[] args) {
		//BoatCarReal boatCar=new BoatCarReal();
		BoatCar boatCar=new BoatCarReal();
		
		//묵시적 객체 형변환에 의해 자식 인스턴스의 메소드 호출
		boatCar.run();
		boatCar.navigate();
		boatCar.floating();
	}
}
