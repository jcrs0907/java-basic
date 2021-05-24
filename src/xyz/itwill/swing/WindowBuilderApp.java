package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class WindowBuilderApp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton red;
	private JButton green;
	private JButton blue;
	private JButton black;
	private JTextArea area;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderApp frame = new WindowBuilderApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderApp() {
		setType(Type.UTILITY);
		setTitle("WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		red = new JButton("\uBE68\uAC04\uC0C9");
		red.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 16));
		red.setForeground(Color.RED);
		panel.add(red);
		
		green = new JButton("\uCD08\uB85D\uC0C9");
		green.setForeground(Color.GREEN);
		green.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 16));
		panel.add(green);
		
		blue = new JButton("\uD30C\uB780\uC0C9");
		blue.setForeground(Color.BLUE);
		blue.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 16));
		panel.add(blue);
		
		black = new JButton("\uAC80\uC815\uC0C9");
		black.setForeground(Color.BLACK);
		black.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 16));
		panel.add(black);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		area = new JTextArea();
		area.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18));
		area.setFocusable(false);
		scrollPane.setViewportView(area);
		
		JTextField field = new JTextField();
		field.setFont(new Font("³ª´®°íµñÄÚµù", Font.BOLD, 18));
		contentPane.add(field, BorderLayout.SOUTH);
		field.setColumns(10);
	}

}
