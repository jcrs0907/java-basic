package xyz.itwill10.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller : Ŭ���̾�Ʈ�� ��û�� ó���ϴ� Controller Ŭ������ Spring Bean���� ����ϴ� ������̼�
// => �⺻������ Ŭ�������� beanName���� ���(ù���ڴ� �ҹ���) - value �Ӽ����� beanName ���� ����
// => Controller �������̽��� ��ӹ��� �ʾƵ� Controller Ŭ������ �ۼ� ����
// => Ŭ���̾�Ʈ�� ��û�� ó���ϴ� �ټ��� ��û ó�� �޼ҵ� �ۼ� ���� - @RequestMapping ������̼� ��� 
@Controller
public class HelloController {
	private static final Logger logger=LoggerFactory.getLogger(HelloController.class);
	
	//��û ó�� �޼ҵ忡�� Front Controller(DispatcherServlet)���� ViewName�� �����ϴ� ���
	// => Front Controller�� ���޹��� ViewName�� ViewResolver Ŭ�������� �����Ͽ� JSP ����
	//��ġ�� �޾� ������ �̵��Ͽ� ���� ó��
	//1.��û ó�� �޼ҵ��� ��ȯ���� void�� �ۼ��ϸ� �޼ҵ���� ViewName���� ����
	//2.��û ó�� �޼ҵ��� ��ȯ���� String�� �ۼ��ϸ� ��ȯ�Ǵ� ���ڿ��� ViewName���� ����
	//3.��û ó�� �޼ҵ��� ��ȯ���� ModelAndView�� �ۼ��ϸ� ModelAndView ��ü�� ViewName�� �����Ͽ� ����
	
	//Ŭ���̾�Ʈ�� ��û�� ó���ϱ� ���� �޼ҵ�
	//@RequestMapping : Ŭ���̾�Ʈ ��û����(URL)�� ����Ͽ� Ŭ���̾�Ʈ ��û�� �޼ҵ带 ȣ���ϴ� ������̼�
	// => @GetMapping, @PostMapping, @PutMapping, @DeleteMapping ���� ������̼����� ��� ����
	//value �Ӽ� : Ŭ���̾�Ʈ�� ��û����(URL)�� �Ӽ������� ����
	// => �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
	// => �ٸ� ��û ó�� �޼ҵ�� ��û����(URL)�� �ߺ��� ��� WAS ����� ���� �߻�
	@RequestMapping(value = "/hello")
	public void hello() {
		//��û ó�� ��� �ۼ� - Service Ŭ������ �޼ҵ� ȣ�� 
		logger.info("/hello ��û >> HelloController Ŭ������ hello() �޼ҵ带 ȣ���Ͽ� ��û ó��");
	}

	@RequestMapping("/helloViewName")
	public String helloViewName() {
		logger.info("/helloViewName ��û >> HelloController Ŭ������ helloViewName()�� ȣ���Ͽ� ��û ó��");
		return "hello";
	}
	
	@RequestMapping("/helloModelAndView")
	public ModelAndView helloModelAndView() {
		logger.info("/helloModelAndView ��û >> HelloController Ŭ������ helloModelAndView()�� ȣ���Ͽ� ��û ó��");
		
		/*
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("hello");
		*/
		
		//ModelAndView ��ü ������ �����ڷ� ViewName�� ���޹޾� ���� 
		ModelAndView modelAndView=new ModelAndView("hello");

		return modelAndView;
	}
}









