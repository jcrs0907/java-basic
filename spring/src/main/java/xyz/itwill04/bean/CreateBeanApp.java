package xyz.itwill04.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

//Spring Container�κ��� Spring Bean�� �����޾� ����ϴ� ���
// => Bean Configuration File(XML)�� bean ������Ʈ�� �̿��Ͽ� Ŭ������ Spring Bean���� ���
@SuppressWarnings("deprecation")
public class CreateBeanApp {
	public static void main(String[] args) {
		System.out.println("���-1.ApplicationContext �������̽��� ��ӹ��� Ŭ������ ������ Spring Container");
		//Spring Container ���� �� - Bean Configuration File �б� �� 
		System.out.println("========== Spring Container �ʱ�ȭ �� ==========");
		//ApplicationContext : Spring Container ����� �����ϱ� ���� ��ü
		// => Bean Configuration File�� bean ������Ʈ�� ��ϵ� ��� Ŭ������ �̸� ��ü�� �����Ͽ� ����
		ApplicationContext context=new ClassPathXmlApplicationContext("04-1_beanCreate.xml");
		//Spring Container ���� �� - Bean Configuration File ���� �� 
		System.out.println("========== Spring Container �ʱ�ȭ �� ==========");
		//DL(Dependency Lookup) : Spring Container���� �ʿ��� Spring Bean�� �˻��Ͽ� �����޴� ���
		//ApplicationContext.getBean(String beanName) : beanName�� �����Ͽ� Spring Container�κ���
		//Spring Bean�� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Object Ÿ������ Spring Bean�� ��ȯ�ϹǷ� ����� ��ü ����ȯ�Ͽ� ���
		// => ���޹��� beanName�� Spring Bean�� ���� ��� NoSuchBeanDefinitionException �߻�
		CreateBean bean1=(CreateBean)context.getBean("createBean");
		bean1.display();
		
		//ClassPathXmlApplicationContext.close() : ApplicationContext ��ü�� �����ϴ� �޼ҵ�
		// => Spring Container�� �����ϴ� ��� Spring Bean ����
		((ClassPathXmlApplicationContext)context).close();
		System.out.println("===============================================");
		System.out.println("���-2.BeanFactory �������̽��� ��ӹ��� Ŭ������ ������ Spring Container");
		System.out.println("========== Spring Container �ʱ�ȭ �� ==========");
		//BeanFactory : Spring Container ����� �����ϱ� ���� ��ü
		// => Bean Configuration File�� bean ������Ʈ�� ��ϵ� Ŭ������ �̸� ��ü�� ��������
		//�ʰ� getBean() �޼ҵ� ȣ��� ����
		BeanFactory factory=new XmlBeanFactory
				(new FileSystemResource("src/main/resources/04-1_beanCreate.xml"));
		System.out.println("========== Spring Container �ʱ�ȭ �� ==========");
		CreateBean bean2=(CreateBean)factory.getBean("createBean");
		bean2.display();
		System.out.println("===============================================");
	}
}








