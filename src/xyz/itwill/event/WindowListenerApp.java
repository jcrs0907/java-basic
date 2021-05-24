package xyz.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//Frame 컨테이너에서는 WindowEvent 발생
//WindowListener 인터페이스를 상속받은 이벤트 핸들러 클래스를 작성하여 이벤트 처리
public class WindowListenerApp extends Frame{
    private static final long serialVersionUID = 1L;
    
    public WindowListenerApp(String title) {
		super(title);
		
		//Frame 인스턴스에서 발생되는 WindowEvent를 처리하기 위한 이벤트 핸들러 등록
		addWindowListener(new WindowEventHandler());
		
		setBounds(800,200,300,300);
		setVisible(true);
	}
    
    public static void main(String[] args) {
		new WindowListenerApp("WindowEvent");
	}
    
    //WindowListener 인터페이스는 7개 추상 메소드 선언
    //자식 클래스에서는 모든 추상 메소드를 오버라이드 선언
    //불필요한 이벤트 핸들러 메소드도 오버라이드 선언(약간의 단점)
    public class WindowEventHandler implements WindowListener{
    	@Override
    	public void windowActivated(WindowEvent e) {
    		//System.out.println("windowActivated");
    		
    	}
    	@Override
    	public void windowClosed(WindowEvent e) {
    		//System.out.println("windowClosed");
    		
    	}
    	@Override
    	public void windowClosing(WindowEvent e) {
    		//System.out.println("windowClosing");
    		System.exit(0);
    		
    	}
    	@Override
    	public void windowDeactivated(WindowEvent e) {
    		//System.out.println("windowDeactivated");
    		
    	}
    	@Override
    	public void windowDeiconified(WindowEvent e) {
    		//System.out.println("windowDeiconified");
    		
    	}
    	@Override
    	public void windowIconified(WindowEvent e) {
    		//System.out.println("windowIconified");
    		
    	}
    	@Override
    	public void windowOpened(WindowEvent e) {
    		//System.out.println("windowOpened");
    		
    	}
    }

	
	
}
