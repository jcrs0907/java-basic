package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT ���̺��� ����� ��� �л������� �˻��Ͽ� ����ϴ� ���α׷�
public class ResultSetMetaDataApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();
		
		String sql="select * from student order by no";
		//String sql="select no,name,phone from student order by no";
		//ResultSet : �˻������ �����ϱ� ���� �ν��Ͻ�
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		System.out.println("=============================================================");
		//ResultSet.getMetaData() : �˻���(ResultSet �ν��Ͻ�)�� ���� �ΰ����� ������
		//�����ϰ� �ִ� ResultSetMetaData �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		ResultSetMetaData rsmd=rs.getMetaData();
		
		//ResultSetMetaData.getColumnCount() : �˻����� �÷� ������ ��ȯ�ϴ� �޼ҵ�
		int columnCount=rsmd.getColumnCount();
		System.out.println("�˻����� �÷� ���� = "+columnCount);
		System.out.println("=============================================================");
		for(int i=1;i<=columnCount;i++) {
			//ResultSetMetaData.getColumnLabel(int columnIndex) : columnIndex ��ġ��
			//�÷����� ��ȯ�ϴ� �޼ҵ�
			String columnLabel=rsmd.getColumnLabel(i);
			
			//ResultSetMetaData.isNullable(int columnIndex) : columnIndex ��ġ��
			//�÷��� ���� NULL ��� ������(0 or 1)�� ��ȯ�ϴ� �޼ҵ�
			int isNull=rsmd.isNullable(i);
			String nullResult="NULL";
			if(isNull==ResultSetMetaData.columnNoNulls) {
				nullResult="NOT NULL";
			}
			
			//ResultSetMetaData.getColumnTypeName(int columnIndex) : columnIndex ��ġ��
			//�÷��� ���� ����Ŭ �ڷ����� ��ȯ�ϴ� �޼ҵ�
			String columnTypeName=rsmd.getColumnTypeName(i);
			
			//ResultSetMetaData.getColumnDisplaySize(int columnIndex) : columnIndex ��ġ��
			//�÷��� ���� ���ũ�⸦ ��ȯ�ϴ� �޼ҵ�
			int columnDisplaySize=rsmd.getColumnDisplaySize(i);
			
			System.out.println("�÷��� = "+columnLabel);
			System.out.println("NULL ��� ���� = "+nullResult);
			System.out.println("�÷� �ڷ��� = "+columnTypeName);
			System.out.println("�÷� ���ũ�� = "+columnDisplaySize);
			System.out.println("=============================================================");
		}
		ConnectionFactory.close(con, stmt, rs);
	}
}







