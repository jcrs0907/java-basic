package xyz.itwill.thread;

//��������� ����� ����(�����������, ����ڸ�)�� �����ϱ� ���� Ŭ����
public class AccountUser extends Thread {
	private Account account;// ����������� - ����
	private String userName;// ����ڸ�

	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(Account account, String userName) {
		super();
		this.account = account;
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public void run() {
		//�ټ��� �����尡 run() �޼ҵ��� ����� ���ÿ� ������ ��� ���� �ν��Ͻ���
		//�ʵ尪 �����Ͽ� ó���� ��� �߸��� ��� �߻�
		//=> ������ ����ȭ�� �̿��Ͽ� �������� �ν��Ͻ� �޼ҵ� ���� ������ �ڵ� ����
		//������ ����ȭ(Thread synchronized) : �������� �޼ҵ� ��û�� ���� ó���� ����� ������ 
		//�ٸ� �������� �޼ҵ� ȣ���� ����(Lock)�ϵ��� �����带 �Ͻ� �����ϴ� ���
		//�޼ҵ带 ����ȭ ó���ϴ� ��� - ����ȭ �޼ҵ�(synchronized Method)
		//account.deposit(userName, 5000);
		
		//�޼ҵ带 ����ȭ ó���ϴ� ��� - ����ȭ ����(synchronized Block)���� �޼ҵ� ȣ��
		//�ν��Ͻ� ���޹޾� �ν��Ͻ��� ��� �޼ҵ带 ����ȭ ó���Ͽ� ȣ��
		synchronized (account) {
			account.withDraw(userName, 2000);
		}
	}
}
