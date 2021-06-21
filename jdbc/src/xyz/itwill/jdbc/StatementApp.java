package xyz.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Statement : ���ӵ� DBMS ������ SQL ������ �����Ͽ� ����� ����� ��ȯ�ϴ� ����� �����ϴ� �ν��Ͻ�
//���� : �ϳ��� Statement �ν��Ͻ��� �ټ��� SQL ������ �����Ͽ� ���� ����
//���� : SQL ���ɿ� Java �������� �����ϰ��� �� ��� ���ڿ� ���� ��� �̿�
// => ���ڿ� ������ �̿��� ��� ������ �� ���������� ȿ���� ����
// => InSQL ��ŷ ���(�� ��� �κ����� SQL ������ �����ϴ� ���)�� ���
public class StatementApp {
	public static void main(String[] args) throws Exception {
		/*
		//Ű����� �л������� �Է¹޾� STUDENT ���̺��� �����Ͽ� �����ϰ� STUDENT ���̺���
		//����� ��� �л������� �˻��Ͽ� ����ϴ� JDBC ���α׷�
		
		//Ű����� �л������� �Է¹ޱ� ���� �Է� ��Ʈ�� ����
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����� �л������� �Է¹޾� ����
		System.out.println("<<�л����� �Է�>>");
		System.out.print("�й� �Է� >> ");
		int no=Integer.parseInt(in.readLine());
		System.out.print("�̸� �Է� >> ");
		String name=in.readLine();
		System.out.print("��ȭ��ȣ �Է� >> ");
		String phone=in.readLine();
		System.out.print("�ּ� �Է� >> ");
		String address=in.readLine();
		System.out.print("������� �Է� >> ");
		String birthday=in.readLine();
		System.out.println("=============================================================");
		//�Էµ� �л������� STUDENT ���̺��� ������ �����Ͽ� ����
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();
		//+�����ڸ� ���� �����ؾߵȴ�
		String sql1="insert into student values("+no+",'"+name+"','"
				+phone+"','"+address+"','"+birthday+"')";
		int rows=stmt.executeUpdate(sql1);
		
		System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		System.out.println("=============================================================");
		//STUDENT ���̺��� ����� ��� ��(�л�����)�� �˻��Ͽ� ���
		String sql2="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql2);
		
		System.out.println("<<�л���� ���>>");
		while(rs.next()) {
			System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=============================================================");
		*/
		
		//Ű����� �̸��� �Է¹޾� STUDENT ���̺��� ����� �л������� �Է��� �̸����� 
		//�˻��Ͽ� ����ϴ� JDBC ���α׷� �ۼ�
		
		//Ű����� �л������� �Է¹ޱ� ���� �Է� ��Ʈ�� ����
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����� �̸� �Է¹޾� ����
		System.out.println("<<�л����� �˻�>>");
		System.out.print("�̸� �Է� >> ");
		String name=in.readLine();
		System.out.println("=============================================================");
		//STUDENT ���̺����� ����� �л����� �� �Էµ� �̸��� �л������� �˻��Ͽ� ���
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();
		
		String sql="select * from student where name='"+name+"' order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		System.out.println("<<�˻���� ���>>");
		if(rs.next()) {
			do {
				System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
			} while(rs.next());
		} else {
			System.out.println("�˻��� �л������� �����ϴ�.");
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=============================================================");
	}
}


















