package xyz.itwill10.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

//@ControllerAdvice : ����ó�� �޼ҵ常 ����� Controller Ŭ�������� ����ϴ� ������̼�
// => ��� ��Ʈ�ѷ��� ��û ó�� �޼ҵ忡�� �߻��Ǵ� ���ܿ� ���� ó�� ����
@ControllerAdvice
public class ExceptionController {
	/*
	@ExceptionHandler(Exception.class)
	public String exceptionHander(Exception exception) {
		exception.printStackTrace();//���ܸ� �ֿܼ� ���
		return "userinfo/user_error";
	}
	*/
}
