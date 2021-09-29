package xyz.itwill05.di;

import java.util.List;

//Service Ŭ���� : ���α׷� ���࿡ �ʿ��� ����� �����ϱ� ���� Ŭ���� - ���۳�Ʈ(���)
// => Service Ŭ������ �޼ҵ�� DAO Ŭ������ �޼ҵ带 ȣ���Ͽ� ���α׷� ���࿡ �ʿ��� ����� ����
// => Service Ŭ������ ����Ǿ ���α׷��� ������ �ּ�ȭ �ϱ� ���� �������̽��� ��ӹ޾� �ۼ�
public class StudentServiceImpl implements StudentService {
	/*
	//StudentJdbcDAO ��ü�� �ʵ忡 �����ؾ� ���԰��� ����
	// => Constructor �Ǵ� Setter �޼ҵ带 �̿��Ͽ� ��ü�� ���޹޾� �ʵ忡 ����
	//private StudentJdbcDAO studentJdbcDAO;
	
	//�ʵ��� �ڷ����̳� �̸��� ����� ��� �ʵ� ���� �����ڿ� �޼ҵ带 ��� ����
	private StudentMybatisDAO studentMybatisDAO;
	
	public StudentServiceImpl() {
		System.out.println("### StudentServiceImpl Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	public StudentServiceImpl(StudentJdbcDAO studentJdbcDAO) {
		super();
		this.studentJdbcDAO = studentJdbcDAO;
		System.out.println("### StudentServiceImpl Ŭ������ �Ű������� ����� ������ ȣ�� ###");
	}

	public StudentJdbcDAO getStudentJdbcDAO() {
		return studentJdbcDAO;
	}

	public void setStudentJdbcDAO(StudentJdbcDAO studentJdbcDAO) {
		this.studentJdbcDAO = studentJdbcDAO;
		System.out.println("*** StudentServiceImpl Ŭ������ setStudentJdbcDAO() �޼ҵ� ȣ�� ***");
	}

	@Override
	public void addStudent(Student student) {
		System.out.println("*** StudentServiceImpl Ŭ������ addStudent() �޼ҵ� ȣ�� ***");
		studentJdbcDAO.insertStudent(student);
	}

	@Override
	public void modifyStudent(Student student) {
		System.out.println("*** StudentServiceImpl Ŭ������ modifyStudent() �޼ҵ� ȣ�� ***");
		studentJdbcDAO.updateStudent(student);
	}

	@Override
	public void removeStudent(int num) {
		System.out.println("*** StudentServiceImpl Ŭ������ removeStudent() �޼ҵ� ȣ�� ***");
		studentJdbcDAO.deleteStudent(num);
	}

	@Override
	public Student getStudent(int num) {
		System.out.println("*** StudentServiceImpl Ŭ������ getStudent() �޼ҵ� ȣ�� ***");
		return studentJdbcDAO.selectStudent(num);
	}

	@Override
	public List<Student> getStudentList() {
		System.out.println("*** StudentServiceImpl Ŭ������ getStudentList() �޼ҵ� ȣ�� ***");
		return studentJdbcDAO.selectStudentList();
	}
	*/
	
	//DAO Ŭ������ �θ� �������̽��� �̿��Ͽ� �ʵ带 �����ϸ� �ʵ忡�� ��� �ڽ� Ŭ������
	//������ ��ü�� ���޹޾� ���� - ��������
	// => �������̽� �ʵ�� �޼ҵ带 ȣ���ϸ� �ʵ忡 ����� �ڽ�Ŭ���� ��ü�� �޼ҵ� ȣ�� - �������̵忡 ���� ������ 
	// => ��ü���� ���յ� ���߾� ���������� ȿ���� ���� - ���� ������ Ŭ������ ����ŵ� ���� Ŭ������ ��ġ�� ���� �ּ�ȭ
	private StudentDAO studentDAO; 
	
	public StudentServiceImpl() {
		System.out.println("### StudentServiceImpl Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
		System.out.println("### StudentServiceImpl Ŭ������ �Ű������� ����� ������ ȣ�� ###");
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
		System.out.println("*** StudentServiceImpl Ŭ������ setStudentDAO() �޼ҵ� ȣ�� ***");
	}

	@Override
	public void addStudent(Student student) {
		System.out.println("*** StudentServiceImpl Ŭ������ addStudent() �޼ҵ� ȣ�� ***");
		studentDAO.insertStudent(student);
	}

	@Override
	public void modifyStudent(Student student) {
		System.out.println("*** StudentServiceImpl Ŭ������ modifyStudent() �޼ҵ� ȣ�� ***");
		studentDAO.updateStudent(student);
	}

	@Override
	public void removeStudent(int num) {
		System.out.println("*** StudentServiceImpl Ŭ������ removeStudent() �޼ҵ� ȣ�� ***");
		studentDAO.deleteStudent(num);
	}

	@Override
	public Student getStudent(int num) {
		System.out.println("*** StudentServiceImpl Ŭ������ getStudent() �޼ҵ� ȣ�� ***");
		return studentDAO.selectStudent(num);
	}

	@Override
	public List<Student> getStudentList() {
		System.out.println("*** StudentServiceImpl Ŭ������ getStudentList() �޼ҵ� ȣ�� ***");
		return studentDAO.selectStudentList();
	}
}










