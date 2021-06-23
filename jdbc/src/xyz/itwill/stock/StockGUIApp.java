package xyz.itwill.stock;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.table.DefaultTableModel;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StockGUIApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	//����� ��ũ����, ���̺�, �г�, �ؽ�Ʈ�ʵ�, ��ư ���� 
	private JTable stockTable;
	JScrollPane tableSP;
	JPanel topPanel, bottomPanel, namePanel, averagePanel, countPanel;
	JTextField titleTF, averageTF, countTF;
	JButton addBtn, deleteBtn, updateBtn, searchBtn, cancelBtn;
	
	//��ȿ�� �˻�
	String titleReg="[��-�R]{1,50}";//1-50�� ������ �ѱ� ���
	String intReg = "^[0-9]+$";//0~9������ ���� ���
	

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
		setTitle("�ֽ� ���� ���α׷�");
		
		//topPanel, bottomPanel ���� 
		topPanel = new JPanel();
		bottomPanel = new JPanel();	
		
		//topPanel�ȿ� "�ֽ� ����", "�ֹ� ��հ�"," �ֽ� ��" �Է� �ʵ�� "�߰�" ��ư �ޱ� 
		namePanel = new JPanel();
		namePanel.setBorder(null);
		namePanel.add(new JLabel("�ֽ� ����"));
		namePanel.add(titleTF = new JTextField(10));
		
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
		
		//bottomPanel�ȿ� "�˻�", "����", "����", "���" ��ư �ޱ� 
		bottomPanel.add(searchBtn = new JButton("��  ��"));
		bottomPanel.add(updateBtn = new JButton("��  ��"));
		bottomPanel.add(deleteBtn = new JButton("��  ��"));
		bottomPanel.add(cancelBtn = new JButton("��  ��"));
		
		
		//JButton�鿡�� addActionListener �߰��ϱ�
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		
		//array: column name �迭 ����
		String[] columnNames={"�ֽ� ����", "�ֹ� ��հ�"," �ֽ� ��", "�� �ֹ� �ݾ�", "���� ������"};
				
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
		
		
		
		//���̺� ����� ��� �ֽ����� ���
		displayAllStockList();
		
		//�ʵ� Ŭ����, cancel ��ư ��Ȱ��ȭ
		init();
	}
	
	//init: ������ �� ����Ǵ� �޼���(�ʵ� Ŭ����, cancel ��ư ��Ȱ��ȭ)
	public void init() {
		//titleTF, averageTF, countTF;
		titleTF.setText("");
		averageTF.setText("");
		countTF.setText("");
		
		//cancelBtn �⺻ ���� : ��Ȱ��ȭ
		cancelBtn.setEnabled(false);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		
		try {
			if(c == addBtn) {
				addStock();
			}else if(c == deleteBtn) {
				//���õ� ���� ���� ���
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "������ ���ϴ� �ֽ� ���� ���� ������ �ּ���.");
					return;
				}else {
					deleteStock();
				}
				
			}else if(c == updateBtn) {
				//���õ� ���� ���� ���
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "���渦 ���ϴ� �ֽ� ���� ���� ������ �ּ���.");
					return;
				}else {
					updateStock();
				}
			}else if(c == searchBtn) {
				searchStock();
			}else if(c == cancelBtn) {
				displayAllStockList();
				init();
			}
			
		}catch (Exception ev) {
			System.out.println("���� �߻� : " + ev);
		}		
		
	}
	
	//Display: ���̺� ����� ��� �ֽ������� JTable�� ����ϴ� �޼ҵ�
	public void displayAllStockList() {
		List<StockDTO> stockList = StockDAO.getDAO().selectAllStockList();
		
		//�ֽ����� ����Ʈ�� ���� ��
		if(stockList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "����� �ֽ������� �����ϴ�.");
			return;
		}
		
		DefaultTableModel model=(DefaultTableModel)stockTable.getModel();
		
		for(int i=model.getRowCount();i>0;i--) {
			model.removeRow(0);
		}
		
		for(StockDTO stock:stockList) {
			Vector<Object> rowData=new Vector<Object>();
			
			rowData.add(stock.getTitle());
			rowData.add(stock.getAverage());
			rowData.add(stock.getStockCount());
			rowData.add(stock.getTotal());
			rowData.add(stock.getCreated());
			model.addRow(rowData);
		}
		
		
	}
	
	//Add: �ֽ������� �����޾� STOCK ���̺� �����ϴ� �޼ҵ�
	public void addStock() {
		//titleTF, averageTF, countTF;
		String titleTemp=titleTF.getText();
		String averageTemp= averageTF.getText();
		String countTemp= countTF.getText();
	
		
		//CalendarŬ������ getInstance()�޼��带 Ȱ��
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		String createDate = dateFormat.format(time.getTime());	
		
		
		
		//�ֽ� ����, �ֹ� ��հ�, �ֽ� �� �� �Է°��� ���� ���
		if(titleTemp.equals("") || averageTemp.equals("") || countTemp.equals("")) {
			JOptionPane.showMessageDialog(this, "�ֽ� ����, �ֹ� ��հ�, �ֽ� ���� �ݵ�� �Է��� �ּ���.");
			return;
		}
		
		
		if(!Pattern.matches(titleReg, titleTemp)) {//����ǥ���İ� �Է°��� ������ �ٸ� ���
			JOptionPane.showMessageDialog(this, "�ֽ� ������ 1~50 ������ �ѱ۸� �Է��� �ּ���.");
			return;
		}
		
		if(!Pattern.matches(intReg, averageTemp)) {
			JOptionPane.showMessageDialog(this, "�ֹ� ��հ��� ���ڷ� �Է��� �ּ���.");
			return;
		}
		
		if(!Pattern.matches(intReg, countTemp)) {
			JOptionPane.showMessageDialog(this, "�ֽ� ���� ���ڷ� �Է��� �ּ���.");
			return;
		}
		
		//��ȿ�� �˻� �� averageTemp, countTemp int�� ����ȯ �� ���Ͽ� total �� ����
		int intAverageTemp = Integer.parseInt(averageTemp);
		int intcountTemp = Integer.parseInt(countTemp);
		int total = intAverageTemp * intcountTemp;
		
	
		//DTO �ν��Ͻ��� �����ϰ� ���۳�Ʈ�� �Է°����� �ʵ尪 ����
		StockDTO stock=new StockDTO();
		
		stock.setTitle(titleTemp);
		stock.setAverage(intAverageTemp);
		stock.setStockCount(intcountTemp);
		stock.setTotal(total);
		stock.setCreated(createDate);
		
		//�ֽ� ������ �����Ͽ� STOCK ���̺� �����ϴ� DAO Ŭ������ �޼ҵ� ȣ��
		int rows=StockDAO.getDAO().insertStock(stock);
		
		
		JOptionPane.showMessageDialog(this, rows+"���� ������ �����Ͽ����ϴ�.");
		
		//���� �� �ֽ� ���̺� ���
		displayAllStockList();
		
		//�ʵ� Ŭ����, ��� ��ư ��Ȱ��ȭ
		init();
	}
	
	//Delete: Ŭ���� row �����ϴ� �޼���
	public void deleteStock() {
		//row�� ù��° cell�� ��������
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		
		//���� ������ ������ Ȯ��
		int result = JOptionPane.showConfirmDialog(null, title+"������ ���� �����Ͻðڽ��ϱ�?", "Delete", JOptionPane.YES_NO_OPTION);
		
		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			int rows=StockDAO.getDAO().deleteStock(title);
		}else {
			
		}
		
		//���� �� �ֽ� ���̺� ���
		displayAllStockList();
		
	}
	
	//Update: ������ row�� �ֹ� ��հ�, �ֽ� ���� �����Ͽ� �����ϴ� �޼��� 
	public void updateStock() {
		//row�� ù��° cell�� ��������
		
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		//���� ����� average, count ��������
		String average = stockTable.getValueAt(stockTable.getSelectedRow(), 1).toString();
		String count = stockTable.getValueAt(stockTable.getSelectedRow(), 2).toString();
		
		//�ٲ� �ż� ��հ�, �ֽ� �� �Է� �ʵ� ����(���� ����� �ż���հ�, �ֽ� �� �⺻������ ����)
		JTextField changeAverageTF = new JTextField(average);
		JTextField changeCountTF = new JTextField(count);
		
		//��ü ������ �ż� ��հ�, �ֽ� �� �߰�
		Object[] textFieldContents = {
		    "�ż� ��հ�:", changeAverageTF,
		    "�ֽ� ��:", changeCountTF
		};

		//�ֹ� ��հ�, �ֽ� �� ���� Ȯ��
		int result = JOptionPane.showConfirmDialog(null, textFieldContents, "Update", JOptionPane.OK_CANCEL_OPTION);
	

		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			String stringAverage = changeAverageTF.getText();
			String stringCount = changeCountTF.getText();
			
			//�ֽ� ����, �ֹ� ��հ�, �ֽ� �� �� �Է°��� ���� ���
			if(stringAverage.equals("") || stringCount.equals("")) {
				JOptionPane.showMessageDialog(this, "�ֹ� ��հ�, �ֽ� ���� �Է��� �ּ���.");
				return;
			}
			
			//��ȿ�� �˻�
			if(!Pattern.matches(intReg, stringAverage)) {
				JOptionPane.showMessageDialog(this, "�ֹ� ��հ��� ���ڷ� �Է��� �ּ���.");
				return;
			}
			
			if(!Pattern.matches(intReg, stringCount)) {
				JOptionPane.showMessageDialog(this, "�ֽ� ���� ���ڷ� �Է��� �ּ���.");
				return;
			}
			
			
			StockDTO stock =new StockDTO();
			
			//CalendarŬ������ getInstance()�޼��带 Ȱ��
			SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
			Calendar time = Calendar.getInstance();
			String createDate = dateFormat.format(time.getTime());	
			
			stock.setTitle(title);
			stock.setAverage(Integer.parseInt(stringAverage));
			stock.setStockCount(Integer.parseInt(stringCount));
			stock.setTotal(Integer.parseInt(stringAverage) * Integer.parseInt(stringCount));
			stock.setCreated(createDate);
			
			int rows=StockDAO.getDAO().updateStock(stock);
			
			JOptionPane.showMessageDialog(this, title+"������ ������ ���� �Ͽ����ϴ�.");
			
			
		}else {
			
		}
		
		//���� �� �ֽ� ���̺� ���
		displayAllStockList();
	}
	
	//Search: �ֽ� ���� �̸��� �����޾� stock ���̺� ����� �ش� �ֽ� ������
	//�˻��Ͽ� JTable ���۳�Ʈ�� ���
	public void searchStock() {
		
		  //showInputDialog�� �̿��� �ֽ� ���� �˻�
		  //to do showInputDialog title �����ϱ�
		  //No�� �����ϸ� null�� ���
		  String title = JOptionPane.showInputDialog(null,"�˻��� �ֽ� ������ �Է��ϼ���.","Search", JOptionPane.QUESTION_MESSAGE);
		  
		  //yes�� ������ ���
		  if(title != null) {
			  
				//�ֽ� ������ �Է°��� ���� ���
				if(title.equals("")) {
					JOptionPane.showMessageDialog(this, "�˻��� ���ϴ� �ֽ� ������ �Է��� �ּ���.");
					return;
				}
				
				//����ǥ���İ� �Է°��� ������ �ٸ� ���
				if(!Pattern.matches(titleReg, title)) {
					JOptionPane.showMessageDialog(this, "�ֽ� ������ 1~50 ������ �ѱ۸� �Է��� �ּ���.");
					return;
				}
			  
			  List<StockDTO> stockList=StockDAO.getDAO().selectTitleStockList(title);
			  
			  if(stockList.isEmpty()) {
					JOptionPane.showMessageDialog(this, "�Է��� �ֽ� ������ ��Ͽ� �����ϴ�.");
					return;
				}
				
				DefaultTableModel model=(DefaultTableModel)stockTable.getModel();
				
				for(int i=model.getRowCount();i>0;i--) {
					model.removeRow(0);
				}
				
				for(StockDTO stock:stockList) {
					Vector<Object> rowData=new Vector<Object>();
					rowData.add(stock.getTitle());
					rowData.add(stock.getAverage());
					rowData.add(stock.getStockCount());
					rowData.add(stock.getTotal());
					rowData.add(stock.getCreated());
					model.addRow(rowData);
				}
				
				//��� ��ư Ȱ��ȭ
				cancelBtn.setEnabled(true);
		  }
	}

}
