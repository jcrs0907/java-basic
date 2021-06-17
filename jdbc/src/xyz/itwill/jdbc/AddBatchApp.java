package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBatchApp {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.getConnection();
		
		//�ټ��� ���� �����ϰų� �����ϰ��� �� ��� Batch ������ SQL ����� �����Ͽ�
		//�Ѳ����� 
		String sql = "insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, 5000);
		pstmt.setString(2, "����");
		pstmt.setString(3, "010-5746-2178");
		pstmt.setString(4, "����� ������");
		pstmt.setString(5, "1996-05-06");
		pstmt.addBatch();
		
		

	}

}
