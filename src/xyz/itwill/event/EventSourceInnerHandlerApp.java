package xyz.itwill.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//������ Ŭ������ �ܺ� Ŭ������ �ۼ��ϰ� �̺�Ʈ �ڵ鷯 Ŭ������ ���� Ŭ������ �����Ѱ��
//�̺�Ʈ �ڵ鷯 �޼ҵ忡�� ������ Ŭ������ �����۳�Ʈ �Ǵ� �����̳� ���� ����
public class EventSourceInnerHandlerApp extends Frame{
	private static final long serialVersionUID = 1L;

	public EventSourceInnerHandlerApp(String title) {
		super(title);
		
		
		setLayout(new FlowLayout());
	
		Button button = new Button("���α׷� ����");
		add(button);
		
		button.addActionListener(new ActionEventInnerHandler());
		
		setBounds(800, 200, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventSourceInnerHandlerApp("EventSourceInnerHandle");
	}
	
	public class ActionEventInnerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	}
}
