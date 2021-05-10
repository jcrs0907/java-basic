package inheritance;

//이벤트 관련 회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
//=> 회원정보를 저장하는 Member 클래스를 상속받아 작성하는 것을 권장
//exends 키워드를 이용하여 기존 클래스(부모 클래스 - Super Class)를 상속받아
//새로운 클래스(자식 클래스 - Sub Class)에서 사용하도록 작성
//=> 자식 클래스에서는 부모 클래스의 필드 또는 메소드에 접근하여 사용 - 상속성
//=> 단일 상속만 가능 - 부모 클래스를 하나만 설정 가능
public class MemberEvent extends Member {
	
	/*
	//부모 클래스를 상속 받았으므로 필드 미선언
	private String id;
	private String name;
	*/

	private String email;
	
	//super: 자식 클래스의 메소드에서 부모 인스턴스를 저장하기 위한 매개변수(키워드)
	//=> super 키워드를 이용하여 부모 인스턴스의 필드 또는 메소드에 접근하여 사용 가능
	//=> super 키워드를 사용하지 않아도 부모 인스턴스의 필드 또는 메소드 접근 가능
	//가능한 이유는 this 키워드로 필드 또는 메소드를 참조하여 없을 경우
	//super 키워드로 참조하기 때문이다
	
	//super 키워드를 표현하는 경우
	//1. 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하기 위해 사용
	//=> 생성자 호출 명령 전에 다른 명령을 작성할 경우 에러 발생
	//=> 부모 클래스의 매개변수가 선언된 생성자를 호출하여 부모 인스턴스 필드에 초기화 작업
	
	public MemberEvent() {
		//부모 클래스의 매개변수가 없는 생성자가 없는 경우 에러 발생
		//super();//부모 클래스의 매개변수가 없는 생성자(기본 생성자) 호출 - 생략 가능
	}

//	public MemberEvent(String id, String name, String email) {
//		super();
//		//자식 클래스에서 필드 또는 메소드 접근 순서 : 
//		//자식 클래스 참조 -> 부모 클래스 참조
//		//=> 부모 클래스의 은닉화 선언된 필드 또는 메소드는 접근 불가능
//		//this.id = id;
//		
//		//super라는 것 때문에 부모인스턴스를 참조할 수 있다.
//		//super.setId(id);//부모 인스턴스의 메소드 호출
//		
//		this.setId(id); // = setId(id);
//		setName(name);
//		this.email = email;
//	}

	//alt shift s a -> 생성자 생성 -> 필드 선택 -> generate
	
	public MemberEvent(String id, String name, String email) {
		super(id, name);//부모 클래스의 매개변수가 있는 생성자 호출 - 필드 초기화 작업
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		//System.out.println("아이디 = "+ id);
		System.out.println("아이디 = "+ getId());
		//System.out.println("아이디 = " + name);
		System.out.println("아이디 = "+ getName());
		System.out.println("아이디 = " + email);
	}
	
	
}
