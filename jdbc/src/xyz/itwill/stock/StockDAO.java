package xyz.itwill.stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StockDAO extends JdbcStockDAO{
	//1.Ŭ������ �ν��Ͻ��� �����ϱ� ���� �����ʵ� ����
	private static StockDAO _dao;
	
	//2. ������ ����ȭ
	private StockDAO() {
		// TODO Auto-generated constructor stub
	}
	
	//3. ���� �������� Ŭ������ �ν��Ͻ��� �����Ͽ� �����ʵ忡 ����
	static {
		_dao = new StockDAO();
	}
	
	//4.�����ʵ忡 ����� �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� �ۼ�
	public static StockDAO getDAO() {
		return _dao;
	}
	
	//insertStock: �ֽ� ������ ���޹޾� stock ���̺� ���ο� ������ �����Ͽ� �ֽ� ������ �����ϰ� ���� �Ǿ��ִ� ���� ������ ��ȯ�ϴ� �޼ҵ�
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
			System.out.println("[����]insertStock() �޼ҵ��� SQL ���� = "+e.getMessage());
		}finally {
			close(con, pstmt);
		}
		
		return rows;
	}
	
	//updateStock: �ֽ� ������ ���޹޾� stock ���̺� ����� �ֽ� ������ �����ϰ� ���� ���� ������ ��ȯ�ϴ� �޼ҵ�
	//������ �ο��� averagePrice�� ã�Ƽ� �Է� ���� �ݾ����� �ٲ��ֱ�
	public int updateStock(StockDTO stock) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			//average,stockCount,total,created ����
			String sql="update stock set average=?, stockCount=?, total=?, created=? where title=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, stock.getAverage());
			pstmt.setInt(2, stock.getStockCount());
			pstmt.setInt(3, stock.getTotal());
			pstmt.setString(4, stock.getCreated().substring(0, 10));
			pstmt.setString(5, stock.getTitle());
			
			
			rows=pstmt.executeUpdate();
			
		}catch (SQLException e) {
			System.out.println("[����]insertStock() �޼ҵ��� SQL ���� = "+e.getMessage());
		}finally {
			close(con, pstmt);
		}
		
		
		return rows;
	}
	
	//deleteStock: �ֽ� ������ ���޹޾� stock ���̺� ����� �ֽ� ������ �����ϰ� ���� ���� ������ ��ȯ�ϴ� �޼ҵ�
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
			System.out.println("[����]deleteStock() �޼ҵ��� SQL ���� = "+e.getMessage());
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
			System.out.println("[����]selectAllStockList() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return stockList;
	}
	
	//searchStock: �ֽ� ������ ���޹޾� stock ���̺� ����� �ֽ� ������ �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
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
			System.out.println("[����]selectTitleStockList() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return stocklist;
	}
}
