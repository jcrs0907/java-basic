package xyz.itwill10.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import xyz.itwill10.dto.Student;
import xyz.itwill10.mapper.StudentMapper;

//SpringMVC���� Mybatis Framework�� �̿��Ͽ� DAO Ŭ������ �ۼ��ϴ� ���
//1.DataSource ���� ���̺귯���� Mybatis ���� ���̺귯�� ���� ó�� - pom.xml
// => ojdbc, spring-jdbc(spring-tx), mybatis, mybatis-spring
//2.Mybatis Framework�� ȯ�漳������ �ۼ�
//3.SqlSessionFactory ���� Ŭ������ SqlSession ���� Ŭ������ Spring Bean���� ���
// => Bean Configuration File(root-context.xml)���� bean ������Ʈ ���
//4.DTO Ŭ���� �ۼ�
//5.Mapper �ۼ� - XML ���� ���ϰ� Interface ���� ������ ���ε��Ͽ� �ۼ�
//6.DAO Ŭ���� �ۼ� - Mapper�� ��ϵ� SQL ����� �����Ͽ� �����ϰ� ����� �����޾� ��ȯ

//Mybatis Framework���� �����Ǵ� �α׸� Spring �α� ����ü�� ��ϵǵ��� �����ϴ� ���
//1.log4jdbc-log4j2-jdbc4 ���̺귯�� ���� ó�� - pom.xml
//2.DataSource ���� Ŭ������ Spring Bean���� ����ϴ� ������Ʈ���� driverClassName �ʵ��
//url �ʵ带 log4jdbc-log4j2-jdbc4 ���̺귯������ �����Ǵ� ������ ������ ó�� - root-context.xml
//3.src/main/resources ������ log4jdbc.log4j2.properties ���� �ۼ�
//4.log4j.xml ���Ͽ��� �α� �̺�Ʈ�� ���� ��� ����

//DAO Ŭ���� : �����ü���� �࿡ ���� ����,����,����,�˻� ����� �����ϴ� Ŭ����
// => DBMS ������ SQL ����� �����Ͽ� ������ ����� Java �ڷ����� ��ü�� ��ȯ�ϴ� ����� �޼ҵ� �ۼ�

//@Repository : DAO Ŭ������ Spring Bean���� ����ϱ� ���� ������̼�
// => Ʈ����� �Ŵ��� ���� ����� �����޾� ���
//Spring Container�� Spring ������̼��� ó���ϱ� ���� Bean Configuration File(servlet-context.xml)����
//component-scan ������Ʈ�� ����Ͽ� DAO Ŭ������ �ۼ��� ��Ű�� ����
@Repository
public class StudentDAOImpl implements StudentDAO {
	//SqlSession ���� Ŭ������ ��ϵ� Spring Bean ��ü�� �ʵ忡 ������ ó��
	// => DAO Ŭ������ �޼ҵ忡�� SqlSession ��ü�� �޼ҵ� ȣ�� ����
	//@Autowired ������̼ǰ� @Qualifier ������̼��� ����Ͽ� ������ ó��
	// => �ʵ帶�� ������̼��� �̿��Ͽ� ������ ó��
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertStudent(Student student) {
		return sqlSession.getMapper(StudentMapper.class).insertStudent(student);
	}

	@Override
	public List<Student> selectStudentList() {
		return sqlSession.getMapper(StudentMapper.class).selectStudentList();
	}

}
