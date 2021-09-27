package xyz.itwill10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public String form() {
		return "param_form";
	}
	
	/*
	//��û ó�� �޼ҵ忡 HttpServletRequest �ڷ����� �Ű������� �����ϸ� Ŭ���̾�Ʈ��
	//��û����(������Ʈ �޼��� - HttpServletRequest ��ü)�� �ڵ����� �����޾� ����
	// => HttpServletRequest ��ü�� �̿��Ͽ� ���ް��� ��ȯ�޾� ���
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String form(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		request.setAttribute("name", name);
		return "param_display";
	}
	*/
	
	/*
	//���ް��� �̸��� ������ �̸��� �Ű�����(String)�� �����ϸ� �ڵ����� ���ް��� �Ű������� ����Ǿ� ����
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String form(String name, Model model) {
		model.addAttribute("name", name);
		return "param_display";
	}
	*/
	
	/*
	//@RequestParam : ���ް��� �Ű������� �����ϱ� ���� ������̼�
	// => �Ű������� �̸��� ���� �̸��� ���ް��� ���� ��� 400 ���� �߻�
	// => �Ű������� �ݵ�� ���ް��� ����ǵ��� ����ϴ� ������̼�
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String form(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "param_display";
	}
	*/
	
	/*
	//@RequestParam ������̼��� value �Ӽ��� ����Ͽ� ���ް��� �̸��� ���� ���� ����
	//value �Ӽ� : ���ް��� �̸��� �Ӽ������� ����
	// => ���ް��� �̸��� �Ű������� �̸��� �ٸ� ��� ���
	// => �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
	//required �Ӽ� : false(���ް� ���ʼ�) �Ǵ� true(���ް� �ʼ� - �⺻) �� �ϳ��� �Ӽ������� ����
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String form(@RequestParam(value = "username", required = true) String name, Model model) {
		model.addAttribute("name", name);
		return "param_display";
	}
	*/
	
	//defaultValue �Ӽ� : ���ް��� ���� �Ű������� �ƹ��� ���� �������� ���� ��� �Ű�������
	//����� �⺻���� �Ӽ������� ����
	@RequestMapping(value = "/param", method = RequestMethod.POST)
	public String form(@RequestParam(value = "username", defaultValue = "�Ӳ���") String name, Model model) {
		model.addAttribute("name", name);
		return "param_display";
	}
}
