package xyz.itwill.util;

import java.util.Collections;
import java.util.List;


public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		System.out.println("-----�л����� ����-----");
		//�л������� �����Ͽ� �����ü�� �����ϴ� �޼ҵ� ȣ��
		manager.insertStudent(new Student(1000, "�л��̸�1"));
		manager.insertStudent(new Student(2000, "�л��̸�2"));
		manager.insertStudent(new Student(3000, "�л��̸�3"));
		manager.insertStudent(new Student(4000, "�л��̸�4"));
		
		boolean result = manager.insertStudent(new Student(5000,"�л��̸�5"));
			
		if(result) {
			System.out.println("�л����� ���� ����");
		}else {
			System.out.println("�̹� ����� �л������� ���� x");
		}
		System.out.println("-----�˻��Ͽ� ���-----");
		//�й��� [2000]�� �л������� �˻��Ͽ� ���
		Student searchStudent = manager.selectStudent(2000);
		if(searchStudent == null) {
			System.out.println("�ش� �й��� �л������� ã�� �� �����ϴ�.");
		}else {
			System.out.println(searchStudent);
		}
		
		System.out.println("-----�̸� ����-----");
		
		searchStudent.setName("�Ӱ���");
		
		if(manager.updateStudent(searchStudent)) {
			System.out.println("�л������� ���������� ���� �Ͽ����ϴ�.");
		}else {
			System.out.println("������ �л������� ã�� �� �����ϴ�.");			
		}
		
		System.out.println("-----����-----");
		//�й��� 4000�� �л����� ����
		if(manager.deleteStudent(4000)) {
			System.out.println("���������� ����");
		}else {
			System.out.println("������ �л��� ����");
		}
		List<Student> studentList = manager.selectStudentList();
		
		System.out.println("-----����Ʈ ���� ���-----");
		Collections.sort(studentList);
		
		System.out.println("-----����Ʈ ����-----");
	
		
		for(Student student:studentList) {
			System.out.println(student);//toString() �޼ҵ� �ڵ� ȣ��
		}
		System.out.println("-----------------------------------");
		
	}
}
