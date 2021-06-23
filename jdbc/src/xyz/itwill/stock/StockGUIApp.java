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
	
	//»ç¿ëÇÒ ½ºÅ©·ÑÆÒ, Å×ÀÌºí, ÆĞ³Î, ÅØ½ºÆ®ÇÊµå, ¹öÆ° Á¤ÀÇ 
	private JTable stockTable;
	JScrollPane tableSP;
	JPanel topPanel, bottomPanel, namePanel, averagePanel, countPanel;
	JTextField titleTF, averageTF, countTF;
	JButton addBtn, deleteBtn, updateBtn, searchBtn, cancelBtn;
	
	//À¯È¿¼º °Ë»ç
	String titleReg="[°¡-ÆR]{1,50}";//1-50ÀÚ »çÀÌÀÇ ÇÑ±Û Çã¿ë
	String intReg = "^[0-9]+$";//0~9±îÁöÀÇ ¼ıÀÚ Çã¿ë
	

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
		
		//ÇÁ·Î±×·¥ title Á¤ÀÇ 
		setTitle("ÁÖ½Ä °ü¸® ÇÁ·Î±×·¥");
		
		//topPanel, bottomPanel »ı¼º 
		topPanel = new JPanel();
		bottomPanel = new JPanel();	
		
		//topPanel¾È¿¡ "ÁÖ½Ä Á¾¸ñ", "ÁÖ¹® Æò±Õ°¡"," ÁÖ½Ä ¼ö" ÀÔ·Â ÇÊµå¿Í "Ãß°¡" ¹öÆ° ¹Ş±â 
		namePanel = new JPanel();
		namePanel.setBorder(null);
		namePanel.add(new JLabel("ÁÖ½Ä Á¾¸ñ"));
		namePanel.add(titleTF = new JTextField(10));
		
		averagePanel = new JPanel();
		averagePanel.setBorder(null);
		averagePanel.add(new JLabel("ÁÖ¹® Æò±Õ°¡"));
		averagePanel.add(averageTF = new JTextField(10));
		
		countPanel = new JPanel();
		countPanel.add(new JLabel("ÁÖ½Ä ¼ö"));
		countPanel.add(countTF = new JTextField(10));
		
		topPanel.add(namePanel);
		topPanel.add(averagePanel);
		topPanel.add(countPanel);
		topPanel.add(addBtn = new JButton("Ãß  °¡"));
		
		//bottomPanel¾È¿¡ "°Ë»ö", "¼öÁ¤", "»èÁ¦", "Ãë¼Ò" ¹öÆ° ¹Ş±â 
		bottomPanel.add(searchBtn = new JButton("°Ë  »ö"));
		bottomPanel.add(updateBtn = new JButton("º¯  °æ"));
		bottomPanel.add(deleteBtn = new JButton("»è  Á¦"));
		bottomPanel.add(cancelBtn = new JButton("Ãë  ¼Ò"));
		
		
		//JButtonµé¿¡°Ô addActionListener Ãß°¡ÇÏ±â
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		
		//array: column name ¹è¿­ »ı¼º
		String[] columnNames={"ÁÖ½Ä Á¾¸ñ", "ÁÖ¹® Æò±Õ°¡"," ÁÖ½Ä ¼ö", "ÃÑ ÁÖ¹® ±İ¾×", "ÃÖÁ¾ ¼öÁ¤ÀÏ"};
				
		//table »ı¼º(columnNames ±âº»ÀûÀ¸·Î º¸¿©ÁÖ±â)
		stockTable = new JTable(new DefaultTableModel(columnNames, 0));
		stockTable.getTableHeader().setReorderingAllowed(false);
		stockTable.getTableHeader().setResizingAllowed(false);
		
		//JScrollPane¾È¿¡ Å×ÀÌºí ³Ö¾î¼­ »ı¼º 
		tableSP = new JScrollPane(stockTable);
		
		//getContentPane¿¡ ÀüÃ¼ ·¹ÀÌ¾Æ¿ô À§Ä¡
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);		
		getContentPane().add(tableSP, BorderLayout.CENTER);
		
		
		
		//Å×ÀÌºí¿¡ ÀúÀåµÈ ¸ğµç ÁÖ½ÄÁ¤º¸ Ãâ·Â
		displayAllStockList();
		
		//ÇÊµå Å¬¸®¾î, cancel ¹öÆ° ºñÈ°¼ºÈ­
		init();
	}
	
	//init: ½ÃÀÛÇÒ ¶§ ½ÇÇàµÇ´Â ¸Ş¼­µå(ÇÊµå Å¬¸®¾î, cancel ¹öÆ° ºñÈ°¼ºÈ­)
	public void init() {
		//titleTF, averageTF, countTF;
		titleTF.setText("");
		averageTF.setText("");
		countTF.setText("");
		
		//cancelBtn ±âº» »óÅÂ : ºñÈ°¼ºÈ­
		cancelBtn.setEnabled(false);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		
		try {
			if(c == addBtn) {
				addStock();
			}else if(c == deleteBtn) {
				//¼±ÅÃµÈ ÇàÀÌ ¾øÀ» °æ¿ì
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "»èÁ¦¸¦ ¿øÇÏ´Â ÁÖ½Ä Á¾¸ñ ÇàÀ» ¼±ÅÃÇØ ÁÖ¼¼¿ä.");
					return;
				}else {
					deleteStock();
				}
				
			}else if(c == updateBtn) {
				//¼±ÅÃµÈ ÇàÀÌ ¾øÀ» °æ¿ì
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "º¯°æ¸¦ ¿øÇÏ´Â ÁÖ½Ä Á¾¸ñ ÇàÀ» ¼±ÅÃÇØ ÁÖ¼¼¿ä.");
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
			System.out.println("¿¹¿Ü ¹ß»ı : " + ev);
		}		
		
	}
	
	//Display: Å×ÀÌºí¿¡ ÀúÀåµÈ ¸ğµç ÁÖ½ÄÁ¤º¸¸¦ JTable¿¡ Ãâ·ÂÇÏ´Â ¸Ş¼Òµå
	public void displayAllStockList() {
		List<StockDTO> stockList = StockDAO.getDAO().selectAllStockList();
		
		//ÁÖ½ÄÁ¾¸ñ ¸®½ºÆ®°¡ ¾øÀ» ‹š
		if(stockList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "ÀúÀåµÈ ÁÖ½ÄÁ¾¸ñÀÌ ¾ø½À´Ï´Ù.");
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
	
	//Add: ÁÖ½ÄÁ¤º¸¸¦ Á¦°ø¹Ş¾Æ STOCK Å×ÀÌºí¿¡ ÀúÀåÇÏ´Â ¸Ş¼Òµå
	public void addStock() {
		//titleTF, averageTF, countTF;
		String titleTemp=titleTF.getText();
		String averageTemp= averageTF.getText();
		String countTemp= countTF.getText();
	
		
		//CalendarÅ¬·¡½ºÀÇ getInstance()¸Ş¼­µå¸¦ È°¿ë
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		String createDate = dateFormat.format(time.getTime());	
		
		
		
		//ÁÖ½Ä Á¾¸ñ, ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö Áß ÀÔ·Â°ªÀÌ ¾ø´Â °æ¿ì
		if(titleTemp.equals("") || averageTemp.equals("") || countTemp.equals("")) {
			JOptionPane.showMessageDialog(this, "ÁÖ½Ä Á¾¸ñ, ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö¸¦ ¹İµå½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			return;
		}
		
		
		if(!Pattern.matches(titleReg, titleTemp)) {//Á¤±ÔÇ¥Çö½Ä°ú ÀÔ·Â°ªÀÇ Çü½ÄÀÌ ´Ù¸¥ °æ¿ì
			JOptionPane.showMessageDialog(this, "ÁÖ½Ä Á¾¸ñÀº 1~50 ¹üÀ§ÀÇ ÇÑ±Û¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			return;
		}
		
		if(!Pattern.matches(intReg, averageTemp)) {
			JOptionPane.showMessageDialog(this, "ÁÖ¹® Æò±Õ°¡´Â ¼ıÀÚ·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			return;
		}
		
		if(!Pattern.matches(intReg, countTemp)) {
			JOptionPane.showMessageDialog(this, "ÁÖ½Ä ¼ö´Â ¼ıÀÚ·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			return;
		}
		
		//À¯È¿¼º °Ë»ç ÈÄ averageTemp, countTemp int·Î Çüº¯È¯ ÈÄ °öÇÏ¿© total °ª »ı¼º
		int intAverageTemp = Integer.parseInt(averageTemp);
		int intcountTemp = Integer.parseInt(countTemp);
		int total = intAverageTemp * intcountTemp;
		
	
		//DTO ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ÄÄÆÛ³ÍÆ®ÀÇ ÀÔ·Â°ªÀ¸·Î ÇÊµå°ª º¯°æ
		StockDTO stock=new StockDTO();
		
		stock.setTitle(titleTemp);
		stock.setAverage(intAverageTemp);
		stock.setStockCount(intcountTemp);
		stock.setTotal(total);
		stock.setCreated(createDate);
		
		//ÁÖ½Ä Á¤º¸¸¦ Àü´ŞÇÏ¿© STOCK Å×ÀÌºí¿¡ ÀúÀåÇÏ´Â DAO Å¬·¡½ºÀÇ ¸Ş¼Òµå È£Ãâ
		int rows=StockDAO.getDAO().insertStock(stock);
		
		
		JOptionPane.showMessageDialog(this, rows+"°³ÀÇ Á¾¸ñÀ» ÀúÀåÇÏ¿´½À´Ï´Ù.");
		
		//ÀúÀå ÈÄ ÁÖ½Ä Å×ÀÌºí Ãâ·Â
		displayAllStockList();
		
		//ÇÊµå Å¬¸®¾î, Ãë¼Ò ¹öÆ° ºñÈ°¼ºÈ­
		init();
	}
	
	//Delete: Å¬¸¯ÇÑ row »èÁ¦ÇÏ´Â ¸Ş¼­µå
	public void deleteStock() {
		//rowÀÇ Ã¹¹øÂ° cell°ª °¡Á®¿À±â
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		
		//Á¤¸» »èÁ¦ÇÒ °ÍÀÎÁö È®ÀÎ
		int result = JOptionPane.showConfirmDialog(null, title+"Á¾¸ñÀ» Á¤¸» »èÁ¦ÇÏ½Ã°Ú½À´Ï±î?", "Delete", JOptionPane.YES_NO_OPTION);
		
		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			int rows=StockDAO.getDAO().deleteStock(title);
		}else {
			
		}
		
		//»èÁ¦ ÈÄ ÁÖ½Ä Å×ÀÌºí Ãâ·Â
		displayAllStockList();
		
	}
	
	//Update: ¼±ÅÃÇÑ rowÀÇ ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö¸¦ ¼öÁ¤ÇÏ¿© º¯°æÇÏ´Â ¸Ş¼­µå 
	public void updateStock() {
		//rowÀÇ Ã¹¹øÂ° cell°ª °¡Á®¿À±â
		
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		//ÇöÀç ÀúÀåµÈ average, count °¡Á®¿À±â
		String average = stockTable.getValueAt(stockTable.getSelectedRow(), 1).toString();
		String count = stockTable.getValueAt(stockTable.getSelectedRow(), 2).toString();
		
		//¹Ù²Ü ¸Å¼ö Æò±Õ°¡, ÁÖ½Ä ¼ö ÀÔ·Â ÇÊµå »ı¼º(ÇöÀç ÀúÀåµÈ ¸Å¼öÆò±Õ°¡, ÁÖ½Ä ¼ö ±âº»°ªÀ¸·Î »ı¼º)
		JTextField changeAverageTF = new JTextField(average);
		JTextField changeCountTF = new JTextField(count);
		
		//°´Ã¼ º¯¼ö¿¡ ¸Å¼ö Æò±Õ°¡, ÁÖ½Ä ¼ö Ãß°¡
		Object[] textFieldContents = {
		    "¸Å¼ö Æò±Õ°¡:", changeAverageTF,
		    "ÁÖ½Ä ¼ö:", changeCountTF
		};

		//ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö º¯°æ È®ÀÎ
		int result = JOptionPane.showConfirmDialog(null, textFieldContents, "Update", JOptionPane.OK_CANCEL_OPTION);
	

		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			String stringAverage = changeAverageTF.getText();
			String stringCount = changeCountTF.getText();
			
			//ÁÖ½Ä Á¾¸ñ, ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö Áß ÀÔ·Â°ªÀÌ ¾ø´Â °æ¿ì
			if(stringAverage.equals("") || stringCount.equals("")) {
				JOptionPane.showMessageDialog(this, "ÁÖ¹® Æò±Õ°¡, ÁÖ½Ä ¼ö¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
				return;
			}
			
			//À¯È¿¼º °Ë»ç
			if(!Pattern.matches(intReg, stringAverage)) {
				JOptionPane.showMessageDialog(this, "ÁÖ¹® Æò±Õ°¡´Â ¼ıÀÚ·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
				return;
			}
			
			if(!Pattern.matches(intReg, stringCount)) {
				JOptionPane.showMessageDialog(this, "ÁÖ½Ä ¼ö´Â ¼ıÀÚ·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
				return;
			}
			
			
			StockDTO stock =new StockDTO();
			
			//CalendarÅ¬·¡½ºÀÇ getInstance()¸Ş¼­µå¸¦ È°¿ë
			SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
			Calendar time = Calendar.getInstance();
			String createDate = dateFormat.format(time.getTime());	
			
			stock.setTitle(title);
			stock.setAverage(Integer.parseInt(stringAverage));
			stock.setStockCount(Integer.parseInt(stringCount));
			stock.setTotal(Integer.parseInt(stringAverage) * Integer.parseInt(stringCount));
			stock.setCreated(createDate);
			
			int rows=StockDAO.getDAO().updateStock(stock);
			
			JOptionPane.showMessageDialog(this, title+"Á¾¸ñÀÇ Á¤º¸¸¦ º¯°æ ÇÏ¿´½À´Ï´Ù.");
			
			
		}else {
			
		}
		
		//º¯°æ ÈÄ ÁÖ½Ä Å×ÀÌºí Ãâ·Â
		displayAllStockList();
	}
	
	//Search: ÁÖ½Ä Á¾¸ñ ÀÌ¸§À» Á¦°ø¹Ş¾Æ stock Å×ÀÌºí¿¡ ÀúÀåµÈ ÇØ´ç ÁÖ½Ä Á¤º¸¸¦
	//°Ë»öÇÏ¿© JTable ÄÄÆÛ³ÍÆ®¿¡ Ãâ·Â
	public void searchStock() {
		
		  //showInputDialogÀ» ÀÌ¿ëÇÑ ÁÖ½Ä Á¾¸ñ °Ë»ö
		  //to do showInputDialog title º¯°æÇÏ±â
		  //No¸¦ ¼±ÅÃÇÏ¸é null°ª Ãâ·Â
		  String title = JOptionPane.showInputDialog(null,"°Ë»öÇÒ ÁÖ½Ä Á¾¸ñÀ» ÀÔ·ÂÇÏ¼¼¿ä.","Search", JOptionPane.QUESTION_MESSAGE);
		  
		  //yes¸¦ ¼±ÅÃÇÑ °æ¿ì
		  if(title != null) {
			  
				//ÁÖ½Ä Á¾¸ñÀÇ ÀÔ·Â°ªÀÌ ¾ø´Â °æ¿ì
				if(title.equals("")) {
					JOptionPane.showMessageDialog(this, "°Ë»öÀ» ¿øÇÏ´Â ÁÖ½Ä Á¾¸ñÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
					return;
				}
				
				//Á¤±ÔÇ¥Çö½Ä°ú ÀÔ·Â°ªÀÇ Çü½ÄÀÌ ´Ù¸¥ °æ¿ì
				if(!Pattern.matches(titleReg, title)) {
					JOptionPane.showMessageDialog(this, "ÁÖ½Ä Á¾¸ñÀº 1~50 ¹üÀ§ÀÇ ÇÑ±Û¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
					return;
				}
			  
			  List<StockDTO> stockList=StockDAO.getDAO().selectTitleStockList(title);
			  
			  if(stockList.isEmpty()) {
					JOptionPane.showMessageDialog(this, "ÀÔ·ÂÇÑ ÁÖ½Ä Á¾¸ñÀÌ ¸ñ·Ï¿¡ ¾ø½À´Ï´Ù.");
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
				
				//Ãë¼Ò ¹öÆ° È°¼ºÈ­
				cancelBtn.setEnabled(true);
		  }
	}

}
