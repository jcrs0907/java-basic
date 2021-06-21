package xyz.itwill.stock;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

//�г� ���̹� ��Ģ Ȯ���ϱ�
//getContentPane contentPane ���� �����ϱ�
//getTableHeader�� �޼���� ã�ƺ���
//topPanel ���� Panel ���� ���ֱ�
//StudentGUIApp���� �� void�� ���� ���� �˱� 

//ActionListener �߰��ϱ� 
public class StockGUIApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	
	//����� ��ũ����, ���̺�, �г�, �ؽ�Ʈ�ʵ�, ��ư ���� 
	private JTable stockTable;
	JScrollPane tableSP;
	JPanel topPanel, bottomPanel, namePanel, averagePanel, countPanel;
	JTextField nameTF, averageTF, countTF;
	JButton addBtn, deleteBtn, updateBtn, searchBtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockGUIApp frame = new StockGUIApp();
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
	public StockGUIApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		//���α׷� title ���� 
		setTitle("�ֽ� �Ÿ� ���α׷�");
		
		//topPanel, bottomPanel ���� 
		topPanel = new JPanel();
		bottomPanel = new JPanel();	
		
		//topPanel�ȿ� "�ֽ� ����", "�ֹ� ��հ�"," �ֽ� ��" �Է� �ʵ�� "�߰�" ��ư �ޱ� 
		namePanel = new JPanel();
		namePanel.setBorder(null);
		namePanel.add(new JLabel("�ֽ� ����"));
		namePanel.add(nameTF = new JTextField(10));
		
		averagePanel = new JPanel();
		averagePanel.setBorder(null);
		averagePanel.add(new JLabel("�ֹ� ��հ�"));
		averagePanel.add(averageTF = new JTextField(10));
		
		countPanel = new JPanel();
		countPanel.add(new JLabel("�ֽ� ��"));
		countPanel.add(countTF = new JTextField(10));
		
		topPanel.add(namePanel);
		topPanel.add(averagePanel);
		topPanel.add(countPanel);
		topPanel.add(addBtn = new JButton("��  ��"));
		
		//bottomPanel�ȿ� "�˻�", "����", "����" ��ư �ޱ� 
		bottomPanel.add(searchBtn = new JButton("��  ��"));
		bottomPanel.add(updateBtn = new JButton("��  ��"));
		bottomPanel.add(deleteBtn = new JButton("��  ��"));
		
		//array: column name
		String[] columnNames={"�ֽ� ����", "�ֹ� ��հ�"," �ֽ� ��", "�ֹ� �ݾ�", "���ͷ�", "���� ����", "���� ������"};
		//���簡 ��Ͽ��� �����ϸ� ó�� ������ �ֹ� ��հ��� �����Ѵ�.
		
		//table ����(columnNames �⺻������ �����ֱ�)
		stockTable = new JTable(new DefaultTableModel(columnNames, 0));
		stockTable.getTableHeader().setReorderingAllowed(false);
		stockTable.getTableHeader().setResizingAllowed(false);
		
		//JScrollPane�ȿ� ���̺� �־ ���� 
		tableSP = new JScrollPane(stockTable);
		
		//getContentPane�� ��ü ���̾ƿ� ��ġ
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);		
		getContentPane().add(tableSP, BorderLayout.CENTER);
		
		
		
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
