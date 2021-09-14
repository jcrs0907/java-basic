package xyz.itwill08.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

//SpringDAO ����� �̿��Ͽ� DAO Ŭ���� �ۼ� - spring-jdbc ���̺귯��
// => JdbcTemplate Ŭ������ ���ø� �޼ҵ带 ȣ���Ͽ� DAO Ŭ���� �ۼ� 
public class StudentDAOImpl implements StudentDAO {
	//Bean Configuration File���� StudentDAOImpl Ŭ������ Spring Bean���� ����� ��
	//JdbcTemplate Ŭ������ Spring Bean�� �ʵ忡 �������Ͽ� �������� ���� - DI(Dependency Injection)
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertStudent(Student student) {
		String sql="insert into student values(?,?,?,?,?)";
		//JdbcTemplate.update(String sql,Object... args) : SQL ���(INSERT, UPDATE, DELETE)��
		//DBMS ������ �����Ͽ� �����ϴ� �޼ҵ� - �������� ����(int) ��ȯ
		// => �Ű������� SQL ��ɰ� InParameter�� ����� ���� ���ʴ�� �����Ͽ� �޼ҵ� ȣ��
		return jdbcTemplate.update(sql, student.getNo(), student.getName()
				, student.getPhone(), student.getAddress(), student.getBirthday());
	}

	@Override
	public int updateStudent(Student student) {
		String sql="update student set name=?,phone=?,address=?,birthday=? where no=?";
		return jdbcTemplate.update(sql, student.getName(), student.getPhone()
				, student.getAddress(), student.getBirthday(), student.getNo());
	}

	@Override
	public int deleteStudent(int no) {
		return jdbcTemplate.update("delete from student where no=?",no);
	}

	@Override
	public Student selectStudent(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

}
