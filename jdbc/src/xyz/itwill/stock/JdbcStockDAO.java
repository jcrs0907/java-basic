package xyz.itwill.stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class JdbcStockDAO {
	private static PoolDataSource _poolDs;
	
	//setInitialPoolSize, setMaxPoolSize 찾아보기
	//static 블럭에 생성하는 이유 찾아보기
	static {
		_poolDs = PoolDataSourceFactory.getPoolDataSource();
		try {
			_poolDs.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
			_poolDs.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			_poolDs.setUser("stock");
			_poolDs.setPassword("1234");
			_poolDs.setInitialPoolSize(3);
			_poolDs.setMaxPoolSize(5);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Connection
	public Connection getConnection(){
		Connection con = null;
		try {
			con = _poolDs.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection con) {
		try {
			if(con!=null) con.close();
		}catch(SQLException e){
			e.printStackTrace();			
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		}catch(SQLException e){
			e.printStackTrace();			
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		}catch(SQLException e){
			e.printStackTrace();			
		}
	}
	
	
}
