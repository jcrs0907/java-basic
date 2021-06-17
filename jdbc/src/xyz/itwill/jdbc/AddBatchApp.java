package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBatchApp {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		
		//다수의 행을 삽입하거나 변경하고자 할 경우 Batch 영역에 SQL 명령을 저장하여
		//한꺼번에 
		String sql = "insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, 5000);
		pstmt.setString(2, "장길산");
		pstmt.setString(3, "010-5746-2178");
		pstmt.setString(4, "서울시 도봉구");
		pstmt.setString(5, "1996-05-06");
		pstmt.addBatch();
		
		

	}

}
