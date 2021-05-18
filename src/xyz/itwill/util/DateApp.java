package xyz.itwill.util;

import java.util.Date;

//java.util.Date: ��¥�� �ð������� �����ϱ� ���� Ŭ����
public class DateApp {

	public static void main(String[] args) {
		//Date Ŭ������ �Ű������� ���� �����ڷ� �ν��Ͻ��� �����ϸ�
		//�ý����� ���� ��¥�� �ð������� �ν��Ͻ��� ����
		Date now = new Date();
		
		//Date.toString(): Date �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println(now);//toString �޼ҵ� �ڵ� ȣ��
		System.out.println(now.toString());
		
		String[] day = {"��","��","ȭ","��","��","��","��"};
		
		String printDate = (now.getYear()+1900)+"��"+ (now.getMonth()+1)+"��"
				+ now.getDate() +"��" + day[now.getDay()]+"����";
		System.out.println("���� =" + printDate);
		
		//Date.getTime(): Date �ν��Ͻ��� ����� ��¥�� �ð������� long Ÿ���� ������
		//TimeStamp���� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//Ÿ�� ������: 1970�� 1�� 1�Ϻ��� 1ms���� 1�� ������ ������
		//��¥�� �ð������� ���������� ǥ���Ͽ� �����ϱ� ���� ���
		long nowTime= System.currentTimeMillis();
		System.out.println(nowTime);
		
		Date wantDate = new Date(100, 0, 1);//2000�� 1�� 1�� 0�� 0�� 0��
		System.out.println(wantDate);
		
		long wantTime = wantDate.getTime();
		System.out.println("������(��) =" + (nowTime-wantTime)/1000);
		
		
		
	}

}
