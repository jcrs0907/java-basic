package xyz.itwill.util;

import java.util.Collections;
import java.util.List;


public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		System.out.println("-----학생정보 저장-----");
		//학생정보를 전달하여 저장매체에 저장하는 메소드 호출
		manager.insertStudent(new Student(1000, "학생이름1"));
		manager.insertStudent(new Student(2000, "학생이름2"));
		manager.insertStudent(new Student(3000, "학생이름3"));
		manager.insertStudent(new Student(4000, "학생이름4"));
		
		boolean result = manager.insertStudent(new Student(5000,"학생이름5"));
			
		if(result) {
			System.out.println("학생정보 성공 저장");
		}else {
			System.out.println("이미 저장된 학생정보라 저장 x");
		}
		System.out.println("-----검색하여 출력-----");
		//학번이 [2000]인 학생정보를 검색하여 출력
		Student searchStudent = manager.selectStudent(2000);
		if(searchStudent == null) {
			System.out.println("해당 학번의 학생정보를 찾을 수 없습니다.");
		}else {
			System.out.println(searchStudent);
		}
		
		System.out.println("-----이름 변경-----");
		
		searchStudent.setName("임걱정");
		
		if(manager.updateStudent(searchStudent)) {
			System.out.println("학생정보를 성공적으로 변경 하였습니다.");
		}else {
			System.out.println("변경할 학생정보를 찾을 수 없습니다.");			
		}
		
		System.out.println("-----삭제-----");
		//학번이 4000인 학생정보 삭제
		if(manager.deleteStudent(4000)) {
			System.out.println("성공적으로 삭제");
		}else {
			System.out.println("삭제할 학생이 없다");
		}
		List<Student> studentList = manager.selectStudentList();
		
		System.out.println("-----리스트 정렬 출력-----");
		Collections.sort(studentList);
		
		System.out.println("-----리스트 나열-----");
	
		
		for(Student student:studentList) {
			System.out.println(student);//toString() 메소드 자동 호출
		}
		System.out.println("-----------------------------------");
		
	}
}
