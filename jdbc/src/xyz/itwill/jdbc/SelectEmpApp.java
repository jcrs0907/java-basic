package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//EMP ���̺��� ��� ����� �����ȣ,����̸�,����,�޿��� �޿������� �������� ���ĵǵ��� 
//�˻��Ͽ� ����ϴ� JDBC ���α׷�
public class SelectEmpApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			stmt=con.createStatement();
			
			String sql="select empno,ename,job,sal from emp order by sal desc";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("�����ȣ = "+rs.getInt("empno"));
				System.out.println("����̸� = "+rs.getString("ename"));
				System.out.println("���� = "+rs.getString("job"));
				System.out.println("�޿� = "+rs.getInt("sal"));
				System.out.println("============================================");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("[����]OracleDriver Ŭ������ ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("[����]JDBC ���� ���� = "+e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}
