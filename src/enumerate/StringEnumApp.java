package enumerate;

public class StringEnumApp {

	public static void main(String[] args) {
		System.out.println(StringEnum.INSERT);
		System.out.println(StringEnum.UPDATE);
		System.out.println(StringEnum.DELETE);
		System.out.println(StringEnum.SELECT);
		System.out.println("===================================");
		//나열형의 상수필드에 대한 Getter 메소드를 호출하여 상수필드값 반환
		System.out.println(StringEnum.INSERT.getValue());
		System.out.println(StringEnum.UPDATE.getValue());
		System.out.println(StringEnum.DELETE.getValue());
		System.out.println(StringEnum.SELECT.getValue());
		System.out.println("===================================");
		//EnumType.values(): 나열형에 선언된 모든 상수필드를 배열로 변환하여 반환하는 메소드
		for(StringEnum temp: StringEnum.values()) {
			//EnumType.ordinal(): 상수필드를 구분하기 위한 첨자(Index)를 반환하는 메소드
			System.out.println(temp+" = "+temp.getValue()+" >> "+temp.ordinal());
		}
		
	}

}
