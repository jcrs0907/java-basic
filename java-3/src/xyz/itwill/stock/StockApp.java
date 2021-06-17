package xyz.itwill.stock;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Panel;

public class StockApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockApp frame = new StockApp();
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
	public StockApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uC2DD \uC885\uBAA9");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\uC8FC\uBB38 \uD3C9\uADE0\uAC00");
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC2DD \uC218");
		panel_3.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		panel.add(btnNewButton);
		
		Panel panel_4 = new Panel();
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("\uC218\uC815");
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		panel_4.add(btnNewButton_1);
		
		//table 내용
		String[] columnNames={"주식 종목", "주문 평균가","현재가"," 주식 수", "주문 금액", "수익률", "실현 손익", "최종 수정일"};
				
		String[][] rowData={{"시티갤러리","1000","300","400","500","3%","400","2021-06-15"}, {"시티갤러리","1000","300","400","500","3%","400","2021-06-15"}};

		DefaultTableModel tableModel=new DefaultTableModel(rowData, columnNames);
	
		JTable table=new JTable(tableModel);
		
		//테이블에 데이터가 없을 때 
		table.setModel(tableModel);
		
//		JScrollPane scrollPane = new JScrollPane(table);
//		scrollPane.add(table);
		//contentPane.add(table, BorderLayout.CENTER);
		
	
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, BorderLayout.CENTER);
		scrollPane_1.add(table);
		
		this.setVisible(true);
	}

}
