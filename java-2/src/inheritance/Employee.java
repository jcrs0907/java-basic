package inheritance;

//사원정보(사원번호,사원이름)를 저장하기 위한 클래스
// => 인스턴스 생성이 목적이 아닌 상속이 목적인 클래스로 작성 - 추상 클래스로 선언
//추상 클래스(Abstract Class) : abstract 지정자를 이용하여 선언된 클래스
// => 인스턴스를 생성할 수 없는 클래스
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//상수필드(Constant Field) : 값 대신 의미있는 단어를 사용하여 값을 표현하기 위해 선언
	// => public static final 지정자를 이용하여 필드 선언 - 필드값 초기화
	// => 필드명은 스네이크 표기법으로 선언하는 것을 권장
	// => final 지정자를 사용하여 필드값 변경 불가능하도록 선언
	public static final double INCENTIVE_RATE=1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/*
	//급여를 계산하여 반환하는 메소드
	// => 자식 클래스에서 오버라이드 선언하도록 작성된 메소드 - 강제성 없는 메소드
	// => 자식 클래스에서 오버라이드 선언하지 않으면 호출 가능
	public int computePay() {
		return 0;//무의미한 명령
	}
	*/

	//급여를 계산하여 반환하는 메소드
	// => 자식 클래스에서 무조건 오버라이드 선언하도록 작성된 메소드 - 추상 메소드로 선언
	//추상 메소드(Abstract Method) : abstract 지정자로 선언된 메소드
	// => 명령을 작성하는 영역이 없는 불완전한 메소드
	// => 추상 메소드가 하나라도 선언된 클래스는 반드시 추상 클래스로 선언
	// => 자식 클래스에서 반드시 메소드를 오버라이드 선언하도록 강제성을 제공하는 메소드
	//추상 메소드가 선언된 추상 클래스를 상속받은 자식 클래스는 모든 추상 메소드를
	//오버라이드 선언하거나 추상 클래스로 선언해야만 에러 미발생
	public abstract int computePay();
	
	//인센티브를 계산하여 반환하는 메소드
	// => 모든 사원에게 급여의 150%를 인센티브로 계산하여 지급
	//자식 클래스에서 오버라이드 선언하면 반환되는 인센티브가 변경 가능
	// => 자식 클래스에서 오버라이드 선언하지 못하도록 final 메소드로 선언
	//final 메소드 : 오버라이드 선언할 수 없도록 final 지정자로 작성된 메소드
	public final int computeIncentive() {
		//추상 메소드를 호출할 경우 묵시적 객체 형변환에 의해 자식 인스턴스의 메소드 호출
		// => 부모 클래스의 메소드에서 자식 클래스의 메소드 호출 가능
		//int incentive=(int)(computePay()*1.5);
		
		int incentive=(int)(computePay()*INCENTIVE_RATE);
		return incentive;
	}
}
