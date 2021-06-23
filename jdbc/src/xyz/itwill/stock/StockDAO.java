package xyz.itwill.stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StockDAO extends JdbcStockDAO{
	//1.클래스의 인스턴스를 저장하기 위한 참조필드 선언
	private static StockDAO _dao;
	
	//2. 생성자 은닉화
	private StockDAO() {
		// TODO Auto-generated constructor stub
	}
	
	//3. 정적 영역에서 클래스의 인스턴스를 생성하여 참조필드에 저장
	static {
		_dao = new StockDAO();
	}
	
	//4.참조필드에 저장된 인스턴스를 반환하는 메소드 작성
	public static StockDAO getDAO() {
		return _dao;
	}
	
	//insertStock: 주식 정보를 전달받아 stock 테이블에 새로운 행으로 삽입하여 주식 정보를 저장하고 저장 되어있는 행의 갯수를 반환하는 메소드
	public int insertStock(StockDTO stock) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rows=0;
		
		try {
			con = getConnection();
			
			String sql="insert into stock values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, stock.getTitle());
			pstmt.setInt(2, stock.getAverage());
			pstmt.setInt(3, stock.getStockCount());
			pstmt.setInt(4, stock.getTotal());
			pstmt.setString(5, stock.getCreated().substring(0, 10));
			
			rows=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("[에러]insertStock() 메소드의 SQL 오류 = "+e.getMessage());
		}finally {
			close(con, pstmt);
		}
		
		return rows;
	}
	
	//updateStock: 주식 종목을 전달받아 stock 테이블에 저장된 주식 정보를 변경하고 변경 행의 갯수를 반환하는 메소드
	//선택한 로우의 averagePrice를 찾아서 입력 받은 금액으로 바꿔주기
	public int updateStock(StockDTO stock) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			//average,stockCount,total,created 변경
			String sql="update stock set average=?, stockCount=?, total=?, created=? where title=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, stock.getAverage());
			pstmt.setInt(2, stock.getStockCount());
			pstmt.setInt(3, stock.getTotal());
			pstmt.setString(4, stock.getCreated().substring(0, 10));
			pstmt.setString(5, stock.getTitle());
			
			
			rows=pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println("[에러]insertStock() 메소드의 SQL 오류 = "+e.getMessage());
		}finally {
			close(con, pstmt);
		}
		
		
		return rows;
	}
	
	//deleteStock: 주식 종목을 전달받아 stock 테이블에 저장된 주식 정보를 삭제하고 삭제 행의 갯수를 반환하는 메소드
	public int deleteStock(String title) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="delete from stock where title=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, title);
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]deleteStock() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	public List<StockDTO> selectAllStockList() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		List<StockDTO> stockList=new ArrayList<StockDTO>();
		
		try {
			con=getConnection();
			
			String sql="select * from stock";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
						
			while(rs.next()) {
				StockDTO stock=new StockDTO();
				
				stock.setTitle(rs.getString("title"));
				stock.setAverage(rs.getInt("average"));
				stock.setStockCount(rs.getInt("stockCount"));
				stock.setTotal(rs.getInt("total"));
				stock.setCreated(rs.getString("created").substring(0, 10));
				stockList.add(stock);
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectAllStockList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return stockList;
	}
	
	//searchStock: 주식 종목을 전달받아 stock 테이블에 저장된 주식 정보를 검색하여 반환하는 메소드
	public List<StockDTO> selectTitleStockList(String title) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		List<StockDTO> stocklist=new ArrayList<StockDTO>();
		
		try {
			
			con=getConnection();
			
			String sql="select * from stock where title=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, title);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				StockDTO stock=new StockDTO();
				stock.setTitle(rs.getString("title"));
				stock.setAverage(rs.getInt("average"));
				stock.setStockCount(rs.getInt("stockCount"));
				stock.setTotal(rs.getInt("total"));
				stock.setCreated(rs.getString("created").substring(0, 10));
				stocklist.add(stock);
			}
			
		}catch(SQLException e) {
			System.out.println("[에러]selectTitleStockList() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return stocklist;
	}
}
