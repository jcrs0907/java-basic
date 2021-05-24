package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

//��� �����̳ʿ��� ���޵� ���۳�Ʈ�� �ڵ� �����ϴ� ����� �����ϴ� ��ġ ������ ����
//��ġ ������(Layout Manager): �����̳ʿ� ���۳�Ʈ�� ��ġ�� �� ���۳�Ʈ�� ũ�⸦ ���
//��ġ�� �ڵ����� �����ϴ� ����� �����ϴ� Ŭ����
//BorderLayout, FlowLayout, GridLayout ��
//�����̳ʿ��� �⺻ ��ġ �����ڰ� �����ϸ� �����̳��� ��ġ �����ڴ� ���� ����

public class NonLayoutApp extends Frame{
	private static final long serialVersionUID = 1L;

	public NonLayoutApp(String title) {
		super(title);
		
		//Container.setLayout(layoutManager mgr): �����̳��� ��ġ �����ڸ� �����ϴ� �޼ҵ�
		//=>setLayout() �޼��忡 null�� �����ϸ� ��ġ �����ڸ� ������� �ʵ��� ����
		setLayout(null);
		
		Button button1 = new Button("��ư-1");
		Button button2 = new Button("��ư-2");
		
		//��ġ �����ڴ� ������� ���� �ܿ� ���۳�Ʈ�� ũ��� �����ġ�� �����ؾ߸� �����̳ʿ� ����
		//�������� �������� x 80 y 100, width 50, height 80
		button1.setBounds(80, 100, 50, 80);
		button2.setBounds(190, 130, 100,120);
		
		add(button1);
		add(button2);
		
		setBounds(600,100,400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NonLayoutApp("NonLayout");
	}
}
