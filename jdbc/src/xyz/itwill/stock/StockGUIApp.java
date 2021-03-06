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
	
	//사용할 스크롤팬, 테이블, 패널, 텍스트필드, 버튼 정의 
	private JTable stockTable;
	JScrollPane tableSP;
	JPanel topPanel, bottomPanel, namePanel, averagePanel, countPanel;
	JTextField titleTF, averageTF, countTF;
	JButton addBtn, deleteBtn, updateBtn, searchBtn, cancelBtn;
	
	//유효성 검사
	String titleReg="[가-힣]{1,50}";//1-50자 사이의 한글 허용
	String intReg = "^[0-9]+$";//0~9까지의 숫자 허용
	

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
		
		//프로그램 title 정의 
		setTitle("주식 관리 프로그램");
		
		//topPanel, bottomPanel 생성 
		topPanel = new JPanel();
		bottomPanel = new JPanel();	
		
		//topPanel안에 "주식 종목", "주문 평균가"," 주식 수" 입력 필드와 "추가" 버튼 받기 
		namePanel = new JPanel();
		namePanel.setBorder(null);
		namePanel.add(new JLabel("주식 종목"));
		namePanel.add(titleTF = new JTextField(10));
		
		averagePanel = new JPanel();
		averagePanel.setBorder(null);
		averagePanel.add(new JLabel("주문 평균가"));
		averagePanel.add(averageTF = new JTextField(10));
		
		countPanel = new JPanel();
		countPanel.add(new JLabel("주식 수"));
		countPanel.add(countTF = new JTextField(10));
		
		topPanel.add(namePanel);
		topPanel.add(averagePanel);
		topPanel.add(countPanel);
		topPanel.add(addBtn = new JButton("추  가"));
		
		//bottomPanel안에 "검색", "수정", "삭제", "취소" 버튼 받기 
		bottomPanel.add(searchBtn = new JButton("검  색"));
		bottomPanel.add(updateBtn = new JButton("변  경"));
		bottomPanel.add(deleteBtn = new JButton("삭  제"));
		bottomPanel.add(cancelBtn = new JButton("취  소"));
		
		
		//JButton들에게 addActionListener 추가하기
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		
		//array: column name 배열 생성
		String[] columnNames={"주식 종목", "주문 평균가"," 주식 수", "총 주문 금액", "최종 수정일"};
				
		//table 생성(columnNames 기본적으로 보여주기)
		stockTable = new JTable(new DefaultTableModel(columnNames, 0));
		stockTable.getTableHeader().setReorderingAllowed(false);
		stockTable.getTableHeader().setResizingAllowed(false);
		
		//JScrollPane안에 테이블 넣어서 생성 
		tableSP = new JScrollPane(stockTable);
		
		//getContentPane에 전체 레이아웃 위치
		getContentPane().add(topPanel, BorderLayout.NORTH);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);		
		getContentPane().add(tableSP, BorderLayout.CENTER);
		
		
		
		//테이블에 저장된 모든 주식정보 출력
		displayAllStockList();
		
		//필드 클리어, cancel 버튼 비활성화
		init();
	}
	
	//init: 시작할 때 실행되는 메서드(필드 클리어, cancel 버튼 비활성화)
	public void init() {
		//titleTF, averageTF, countTF;
		titleTF.setText("");
		averageTF.setText("");
		countTF.setText("");
		
		//cancelBtn 기본 상태 : 비활성화
		cancelBtn.setEnabled(false);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		
		try {
			if(c == addBtn) {
				addStock();
			}else if(c == deleteBtn) {
				//선택된 행이 없을 경우
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "삭제를 원하는 주식 종목 행을 선택해 주세요.");
					return;
				}else {
					deleteStock();
				}
				
			}else if(c == updateBtn) {
				//선택된 행이 없을 경우
				if(stockTable.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(this, "변경를 원하는 주식 종목 행을 선택해 주세요.");
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
			System.out.println("예외 발생 : " + ev);
		}		
		
	}
	
	//Display: 테이블에 저장된 모든 주식정보를 JTable에 출력하는 메소드
	public void displayAllStockList() {
		List<StockDTO> stockList = StockDAO.getDAO().selectAllStockList();
		
		//주식종목 리스트가 없을 떄
		if(stockList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "저장된 주식종목이 없습니다.");
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
	
	//Add: 주식정보를 제공받아 STOCK 테이블에 저장하는 메소드
	public void addStock() {
		//titleTF, averageTF, countTF;
		String titleTemp=titleTF.getText();
		String averageTemp= averageTF.getText();
		String countTemp= countTF.getText();
	
		
		//Calendar클래스의 getInstance()메서드를 활용
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Calendar time = Calendar.getInstance();
		String createDate = dateFormat.format(time.getTime());	
		
		
		
		//주식 종목, 주문 평균가, 주식 수 중 입력값이 없는 경우
		if(titleTemp.equals("") || averageTemp.equals("") || countTemp.equals("")) {
			JOptionPane.showMessageDialog(this, "주식 종목, 주문 평균가, 주식 수를 반드시 입력해 주세요.");
			return;
		}
		
		
		if(!Pattern.matches(titleReg, titleTemp)) {//정규표현식과 입력값의 형식이 다른 경우
			JOptionPane.showMessageDialog(this, "주식 종목은 1~50 범위의 한글만 입력해 주세요.");
			return;
		}
		
		if(!Pattern.matches(intReg, averageTemp)) {
			JOptionPane.showMessageDialog(this, "주문 평균가는 숫자로 입력해 주세요.");
			return;
		}
		
		if(!Pattern.matches(intReg, countTemp)) {
			JOptionPane.showMessageDialog(this, "주식 수는 숫자로 입력해 주세요.");
			return;
		}
		
		//유효성 검사 후 averageTemp, countTemp int로 형변환 후 곱하여 total 값 생성
		int intAverageTemp = Integer.parseInt(averageTemp);
		int intcountTemp = Integer.parseInt(countTemp);
		int total = intAverageTemp * intcountTemp;
		
	
		//DTO 인스턴스를 생성하고 컴퍼넌트의 입력값으로 필드값 변경
		StockDTO stock=new StockDTO();
		
		stock.setTitle(titleTemp);
		stock.setAverage(intAverageTemp);
		stock.setStockCount(intcountTemp);
		stock.setTotal(total);
		stock.setCreated(createDate);
		
		//주식 정보를 전달하여 STOCK 테이블에 저장하는 DAO 클래스의 메소드 호출
		int rows=StockDAO.getDAO().insertStock(stock);
		
		
		JOptionPane.showMessageDialog(this, rows+"개의 종목을 저장하였습니다.");
		
		//저장 후 주식 테이블 출력
		displayAllStockList();
		
		//필드 클리어, 취소 버튼 비활성화
		init();
	}
	
	//Delete: 클릭한 row 삭제하는 메서드
	public void deleteStock() {
		//row의 첫번째 cell값 가져오기
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		
		//정말 삭제할 것인지 확인
		int result = JOptionPane.showConfirmDialog(null, title+"종목을 정말 삭제하시겠습니까?", "Delete", JOptionPane.YES_NO_OPTION);
		
		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			int rows=StockDAO.getDAO().deleteStock(title);
		}else {
			
		}
		
		//삭제 후 주식 테이블 출력
		displayAllStockList();
		
	}
	
	//Update: 선택한 row의 주문 평균가, 주식 수를 수정하여 변경하는 메서드 
	public void updateStock() {
		//row의 첫번째 cell값 가져오기
		
		String title = stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString();
		
		//현재 저장된 average, count 가져오기
		String average = stockTable.getValueAt(stockTable.getSelectedRow(), 1).toString();
		String count = stockTable.getValueAt(stockTable.getSelectedRow(), 2).toString();
		
		//바꿀 매수 평균가, 주식 수 입력 필드 생성(현재 저장된 매수평균가, 주식 수 기본값으로 생성)
		JTextField changeAverageTF = new JTextField(average);
		JTextField changeCountTF = new JTextField(count);
		
		//객체 변수에 매수 평균가, 주식 수 추가
		Object[] textFieldContents = {
		    "매수 평균가:", changeAverageTF,
		    "주식 수:", changeCountTF
		};

		//주문 평균가, 주식 수 변경 확인
		int result = JOptionPane.showConfirmDialog(null, textFieldContents, "Update", JOptionPane.OK_CANCEL_OPTION);
	

		if(result == JOptionPane.NO_OPTION) {
			
		}else if(result == JOptionPane.YES_OPTION){
			String stringAverage = changeAverageTF.getText();
			String stringCount = changeCountTF.getText();
			
			//주식 종목, 주문 평균가, 주식 수 중 입력값이 없는 경우
			if(stringAverage.equals("") || stringCount.equals("")) {
				JOptionPane.showMessageDialog(this, "주문 평균가, 주식 수를 입력해 주세요.");
				return;
			}
			
			//유효성 검사
			if(!Pattern.matches(intReg, stringAverage)) {
				JOptionPane.showMessageDialog(this, "주문 평균가는 숫자로 입력해 주세요.");
				return;
			}
			
			if(!Pattern.matches(intReg, stringCount)) {
				JOptionPane.showMessageDialog(this, "주식 수는 숫자로 입력해 주세요.");
				return;
			}
			
			
			StockDTO stock =new StockDTO();
			
			//Calendar클래스의 getInstance()메서드를 활용
			SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
			Calendar time = Calendar.getInstance();
			String createDate = dateFormat.format(time.getTime());	
			
			stock.setTitle(title);
			stock.setAverage(Integer.parseInt(stringAverage));
			stock.setStockCount(Integer.parseInt(stringCount));
			stock.setTotal(Integer.parseInt(stringAverage) * Integer.parseInt(stringCount));
			stock.setCreated(createDate);
			
			int rows=StockDAO.getDAO().updateStock(stock);
			
			JOptionPane.showMessageDialog(this, title+"종목의 정보를 변경 하였습니다.");
			
			
		}else {
			
		}
		
		//변경 후 주식 테이블 출력
		displayAllStockList();
	}
	
	//Search: 주식 종목 이름을 제공받아 stock 테이블에 저장된 해당 주식 정보를
	//검색하여 JTable 컴퍼넌트에 출력
	public void searchStock() {
		
		  //showInputDialog을 이용한 주식 종목 검색
		  //to do showInputDialog title 변경하기
		  //No를 선택하면 null값 출력
		  String title = JOptionPane.showInputDialog(null,"검색할 주식 종목을 입력하세요.","Search", JOptionPane.QUESTION_MESSAGE);
		  
		  //yes를 선택한 경우
		  if(title != null) {
			  
				//주식 종목의 입력값이 없는 경우
				if(title.equals("")) {
					JOptionPane.showMessageDialog(this, "검색을 원하는 주식 종목을 입력해 주세요.");
					return;
				}
				
				//정규표현식과 입력값의 형식이 다른 경우
				if(!Pattern.matches(titleReg, title)) {
					JOptionPane.showMessageDialog(this, "주식 종목은 1~50 범위의 한글만 입력해 주세요.");
					return;
				}
			  
			  List<StockDTO> stockList=StockDAO.getDAO().selectTitleStockList(title);
			  
			  if(stockList.isEmpty()) {
					JOptionPane.showMessageDialog(this, "입력한 주식 종목이 목록에 없습니다.");
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
				
				//취소 버튼 활성화
				cancelBtn.setEnabled(true);
		  }
	}

}
