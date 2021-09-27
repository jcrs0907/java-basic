package xyz.itwill10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import xyz.itwill10.dto.Hewon;

@Controller
//@SessionAttributes : ��û ó�� �޼ҵ��� �����������Ը� �����Ǵ� ��ü�� ���� ��Ʈ�ѷ��� ��� 
//��û ó�� �޼ҵ�� ������������ ����� �� �ֵ��� �����ϴ� ������̼�
// => Model ��ü�� �̿��Ͽ� ��ü�� ������ ��� Request Scope�� �ƴ� Session Scope ���
// => Session Scope�� ��������� ���� ��Ʈ�ѷ��� �ڿ��� ��� ����
// => ���� ó���� �ٸ� ��û ó�� �޼ҵ忡�� �ʿ��� ������ �����ϰų� �˻��ϴ� �۾� ����
//value �Ӽ� : Session Scope�� �����ϰ� ���� �Ӽ����� �Ӽ������� ����
// => �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
@SessionAttributes("hewon")
public class SessionController {
	//���̵� ���޹޾� ȸ�������� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ� - Service Ŭ������ �޼ҵ�
	private Hewon getHewon(String id) {
		Hewon hewon=new Hewon();
		hewon.setId("abc123");
		hewon.setPasswd("123456");
		hewon.setName("ȫ�浿");
		hewon.setEmail("abc@itwill.xyz");
		hewon.setGender("����");
		return hewon;
	}
	
	//���̵� ���޹޾� ȸ�������� �˻��Ͽ� ���������� �����ϴ� ��û ó�� �޼ҵ�
	// => ȸ�������� �������� ������������ ȸ������ ���
	@RequestMapping("/hewon_view")
	public String hewonView(Model model) {
		//ȸ�������� �˻��Ͽ� ��ȯ�޾� ���� - Service Ŭ������ �޼ҵ� ȣ��
		Hewon hewon=getHewon("abc123");
		
		//Model ��ü�� �̿��Ͽ� ���������� �˻��� ȸ������ ���� - Request Scope
		//model.addAttribute("hewon", hewon);
		//Model.addAttribute(Object attributeValue) : �� �������� �����Ǵ� ��ü�� �Ӽ���(attributeName)��
		//������ ��� ��ü(�Ӽ���)�� Ŭ�������� �Ӽ������� �ڵ� ���� - ù��° ���ڴ� �ҹ��ڷ� ��ȯ
		// => �⺻��(Wrapper) �Ǵ� String Ŭ������ ����
		//@SessionAttributes ������̼ǿ� ���� ���� ��Ʈ�ѷ��� ��� ��û ó�� �޼ҵ�� 
		//������������ ���ǵ��� ���� - Session Scope
		model.addAttribute(hewon);
		
		return "session/hewon_view";
	}
	
	/*
	//���̵� ���޹޾� ȸ�������� �˻��Ͽ� ���������� �����ϴ� ��û ó�� �޼ҵ�
	// => ȸ�������� �������� ������������ �Է��±׿� ȸ�������� �ʱⰪ���� ����
	@RequestMapping(value = "/hewon_update",method = RequestMethod.GET)
	public String hewonUpdate(@RequestParam String id, Model model) {
		Hewon hewon=getHewon(id);
		model.addAttribute(hewon);
		return "session/hewon_update";
	}
	*/
	
	@RequestMapping(value = "/hewon_update",method = RequestMethod.GET)
	public String hewonUpdate(Model model) {
		return "session/hewon_update";
	}
	
	//ȸ�������� ���޹޾� ȸ�������� �����ϴ� ��û ó�� �޼ҵ�
	//@SessionAttributes ������̼ǿ� ���� ������ ��ü�� �Ű������� �����ϰ� ���ް��� �޾� �ʵ尪 ����
	//SessionStatus : @SessionAttributes ������̼ǿ� ���� ������ ��ü�� ���������� �����ϴ� ��ü
	@RequestMapping(value = "/hewon_update",method = RequestMethod.POST)
	public String hewonUpdate(@ModelAttribute Hewon hewon, SessionStatus status) {
		System.out.println("���� ���̵� = "+hewon.getId());
		
		//SessionStatus.setComplete() : @SessionAttributes ������̼ǿ� ���� ������ ��ü�� �����ϴ� �޼ҵ�
		status.setComplete();
		
		return "session/hewon_view";
	}
}






