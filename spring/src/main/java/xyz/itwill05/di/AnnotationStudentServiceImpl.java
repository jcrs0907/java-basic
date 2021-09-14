package xyz.itwill05.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component

//@Service : Service Ŭ������ Spring Bean���� ����ϱ� ���� ������̼�
//=> �⺻������ Ŭ�������� beanName���� �����ϸ� value �Ӽ��� ����Ͽ� beanName ���� ����
@Service("studentService")
public class AnnotationStudentServiceImpl implements StudentService {
	//@Autowired : �ʵ忡 Spring Bean ��ü�� �������踦 �ڵ����� �����ϴ� ����� �����ϴ� ������̼�
	// => �ʵ��� Setter �޼ҵ带 �������� �ʾƵ� Setter Injection ��� ����
	// => bean ������Ʈ�� autowire �Ӽ��� [byType] �Ӽ����� ������ ������� �������� ����
	//������)�ʵ��� �ڷ����� �������̽���� �ڽ�Ŭ������ Spring Bean�� �������� ��ϵ� ���
	//�������踦 ������ �� NoUniqueBeanDefinitionException �߻�
	//�ذ��-1)Spring Bean���� ��ϵ� �ڽ�Ŭ���� �� �ϳ��� beanName�� �ʵ��� ���� �̸����� ���� 
	// => �ڽ�Ŭ������ Spring Bean�� ������ ��ϵ� ��� autowrie �Ӽ��� [byName] �Ӽ����� ���� ������� �������� ����
	//�ذ��-2)@Qualifier ������̼Ǹ� ����Ͽ� �������踦 ������ Spring Bean�� ����
	//@Qualifier : �������踦 �����ϰ��� �ϴ� Spring Bean�� �����ϱ� ���� ������̼�
	// => @Autowired ������̼��� ���ӵ� ������̼�
	// => �������踦 ������ Spring Bean�� beanName�� value �Ӽ������� ���� - �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
	@Autowired
	//@Qualifier("annotationStudentJdbcDAO")
	@Qualifier("annotationStudentMybatisDAO")
	//@Resource : Spring Framework�� @Autowired ������̼��� �������� ������� ������̼�
	// => JDK ���̺귯���� ���� �����Ǵ� ������̼� - �ٸ� Framework���� ��� ����
	// => �⺻������ [byName]���� �������� ����
	//@Inject : Spring Framework�� @Autowired ������̼��� �������� ������� ������̼�
	// => JDK ���̺귯���� ���� �����Ǵ� ������̼� - �ٸ� Framework���� ��� ����
	// => �⺻������ [byType]���� �������� ����
	private StudentDAO studentDAO;
	
	public AnnotationStudentServiceImpl() {
		System.out.println("### AnnotationStudentServiceImpl Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	@Override
	public void addStudent(Student student) {
		System.out.println("*** AnnotationStudentServiceImpl Ŭ������ addStudent(Student student) �޼ҵ� ȣ�� ***");
		studentDAO.insertStudent(student);
	}

	@Override
	public void modifyStudent(Student student) {
		System.out.println("*** AnnotationStudentServiceImpl Ŭ������ modifyStudent(Student student) �޼ҵ� ȣ�� ***");
		studentDAO.updateStudent(student);
	}

	@Override
	public void removeStudent(int num) {
		System.out.println("*** AnnotationStudentServiceImpl Ŭ������ removeStudent(int num) �޼ҵ� ȣ�� ***");
		studentDAO.deleteStudent(num);
	}

	@Override
	public Student getStudent(int num) {
		System.out.println("*** AnnotationStudentServiceImpl Ŭ������ getStudent(int num) �޼ҵ� ȣ�� ***");
		return studentDAO.selectStudent(num);
	}

	@Override
	public List<Student> getStudentList() {
		System.out.println("*** AnnotationStudentServiceImpl Ŭ������ getStudentList() �޼ҵ� ȣ�� ***");
		return studentDAO.selectStudentList();
	}

}
