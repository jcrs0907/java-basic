package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

//모든 컨테이너에는 전달된 컴퍼넌트를 자동 부착하는 기능을 제공하는 배치 관리자 존재
//배치 관리자(Layout Manager): 컨테이너에 컴퍼넌트를 배치할 때 컴퍼넌트의 크기를 출력
//위치를 자동으로 변경하는 기능을 제공하는 클래스
//BorderLayout, FlowLayout, GridLayout 등
//컨테이너에는 기본 배치 관리자가 존재하며 컨테이너의 배치 관리자는 변경 가능

public class NonLayoutApp extends Frame{
	private static final long serialVersionUID = 1L;

	public NonLayoutApp(String title) {
		super(title);
		
		//Container.setLayout(layoutManager mgr): 컨테이너의 배치 관리자를 변경하는 메소드
		//=>setLayout() 메서드에 null을 전달하면 배치 관리자를 사용하지 않도록 설정
		setLayout(null);
		
		Button button1 = new Button("버튼-1");
		Button button2 = new Button("버튼-2");
		
		//배치 관리자는 사용하지 않을 겨우 컴퍼넌트의 크기와 출력위치를 변경해야만 컨테이너에 부착
		//프레임을 기준으로 x 80 y 100, width 50, height 80
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
