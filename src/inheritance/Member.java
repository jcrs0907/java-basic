package inheritance;

//ȸ������(���̵�, �̸�)�� �����ϱ� ���� Ŭ����
public class Member {
	private String id;
	private String name;
	
	//ctrl + space > contsructor ����(����)
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//alt shift s > o > �ʵ� > generate
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//alt shift s > a > �ʵ� > generate
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("���̵� = "+id);
		System.out.println("�̸� = "+name);
	}
	
}
