package xyz.itwill04.bean;

import org.springframework.stereotype.Component;

//@Component : Ŭ������ Spring Bean���� ����ϱ� ���� ������̼�
// => �⺻������ Ŭ�������� beanName���� ���� - ù���ڴ� �ҹ��ڷ� ��ȯ
//@Component ������̼��� value �Ӽ��� ����Ͽ� beanName ���� ����
// => �ٸ� �Ӽ��� ���� ��� �Ӽ����� ����
@Component(value = "bean")
public class ComponentAnnontationBean {
	public ComponentAnnontationBean() {
		System.out.println("### ComponentAnnontationBean Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	public void display() {
		System.out.println("*** ComponentAnnontationBean Ŭ������ display() �޼ҵ� ȣ�� ***");
	}
}
