package xyz.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//Frame �����̳ʿ����� WindowEvent �߻�
//WindowListener �������̽��� ��ӹ��� �̺�Ʈ �ڵ鷯 Ŭ������ �ۼ��Ͽ� �̺�Ʈ ó��
public class WindowListenerApp extends Frame{
    private static final long serialVersionUID = 1L;
    
    public WindowListenerApp(String title) {
		super(title);
		
		//Frame �ν��Ͻ����� �߻��Ǵ� WindowEvent�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 ���
		addWindowListener(new WindowEventHandler());
		
		setBounds(800,200,300,300);
		setVisible(true);
	}
    
    public static void main(String[] args) {
		new WindowListenerApp("WindowEvent");
	}
    
    //WindowListener �������̽��� 7�� �߻� �޼ҵ� ����
    //�ڽ� Ŭ���������� ��� �߻� �޼ҵ带 �������̵� ����
    //���ʿ��� �̺�Ʈ �ڵ鷯 �޼ҵ嵵 �������̵� ����(�ణ�� ����)
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
