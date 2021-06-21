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

//패널 네이밍 규칙 확인하기
//getContentPane contentPane 차이 구분하기
//getTableHeader와 메서드들 찾아보기
//topPanel 안의 Panel 보더 없애기
//StudentGUIApp에서 다 void로 들어가는 이유 알기 

//ActionListener 추가하기 
public class StockGUIApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	
	//사용할 스크롤팬, 테이블, 패널, 텍스트필드, 버튼 정의 
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
		
		//프로그램 title 정의 
		setTitle("주식 매매 프로그램");
		
		//topPanel, bottomPanel 생성 
		topPanel = new JPanel();
		bottomPanel = new JPanel();	
		
		//topPanel안에 "주식 종목", "주문 평균가"," 주식 수" 입력 필드와 "추가" 버튼 받기 
		namePanel = new JPanel();
		namePanel.setBorder(null);
		namePanel.add(new JLabel("주식 종목"));
		namePanel.add(nameTF = new JTextField(10));
		
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
		
		//bottomPanel안에 "검색", "수정", "삭제" 버튼 받기 
		bottomPanel.add(searchBtn = new JButton("검  색"));
		bottomPanel.add(updateBtn = new JButton("수  정"));
		bottomPanel.add(deleteBtn = new JButton("삭  제"));
		
		//array: column name
		String[] columnNames={"주식 종목", "주문 평균가"," 주식 수", "주문 금액", "수익률", "실현 손익", "최종 수정일"};
		//현재가 목록에서 생략하며 처음 저장은 주문 평균가로 저장한다.
		
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
		
		
		
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
