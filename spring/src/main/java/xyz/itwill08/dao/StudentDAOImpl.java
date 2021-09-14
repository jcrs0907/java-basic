package xyz.itwill08.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

//SpringDAO 기능을 이용하여 DAO 클래스 작성 - spring-jdbc 라이브러리
// => JdbcTemplate 클래스의 템플릿 메소드를 호출하여 DAO 클래스 작성 
public class StudentDAOImpl implements StudentDAO {
	//Bean Configuration File에서 StudentDAOImpl 클래스를 Spring Bean으로 등록할 때
	//JdbcTemplate 클래스의 Spring Bean을 필드에 인젝션하여 의존관계 설정 - DI(Dependency Injection)
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
		//JdbcTemplate.update(String sql,Object... args) : SQL 명령(INSERT, UPDATE, DELETE)을
		//DBMS 서버에 전달하여 실행하는 메소드 - 조작행의 갯수(int) 반환
		// => 매개변수에 SQL 명령과 InParameter에 저장될 값을 차례대로 전달하여 메소드 호출
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
