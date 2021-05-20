package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map �������̽��� ��ӹ޴� �ڷᱸ�� Ŭ����: HashMap, Hashtable ��
//=>Ű(key)�� ��(value: �ν��Ͻ�)�� �ϳ��� ��(entry:��Ʈ��)���� ��� �����ϴ� �ڷᱸ�� Ŭ����
//Ű�� �̿��Ͽ� ���� ������ �˻��ϱ� ���� ���
//��Ʈ��: Ű�� ������ �����Ǵ� ������
public class MapApp {
	public static void main(String[] args) {
		//Map �������̽��� ��ӹ��� �ڷᱸ�� Ŭ������ Ű�� ���� ���׸� Ÿ�Կ� �ڷ��� ����
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(K key, V value): Map �ν��Ͻ��� ��Ʈ���� �߰��ϴ� �޼���
		//=>Ű�� ���������� Set �������̽� Ÿ������ ����Ǹ� ���� Collection �������̽� Ÿ������ ����
		//=>Ű�� �ߺ� ������� ������ �������� ����
		System.out.println("------Map.put(K key, V value)-----");
		map.put(1000, "�л��̸�1");
		map.put(2000, "�л��̸�2");
		map.put(3000, "�л��̸�3");
		map.put(4000, "�л��̸�4");
		System.out.println(map);
		//Map.toString(): Map �ν��Ͻ��� ����� ��� ��Ʈ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		map.put(2000, "�л��̸�777");
		System.out.println("-----Map.toString()-----");
		System.out.println(map);
		System.out.println("-----Map.remove()-----");
		//Map.remove(K key): Map �ν��Ͻ��� ����� ��Ʈ�� �� ���޹��� Ű�� ���� ��Ʈ���� �����ϴ� �޼ҵ�.
		map.remove(4000);
		System.out.print(map);
		System.out.println("-----Map.get()-----");
		//Map.get(K key): Map �ν��Ͻ��� ����� ��Ʈ�� �� ���޹��� Ű�� ���� ��Ʈ���� ���� ��ȯ�ϴ� �޼ҵ�
		String name = map.get(1000);
		System.out.println(name);
		System.out.println("------Map.values()------");
		//Map.values(): Map �ν��Ͻ��� ����� ��� ��Ʈ���� ���� Collection �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		Iterator<String> iteratorValue = map.values().iterator();
		while(iteratorValue.hasNext()) {
			System.out.print(iteratorValue.next()+ " ");
		}
		System.out.println();
		System.out.println("-------Map.keySet()------------");
		//Map.keySet(): Map �ν��Ͻ��� ����� ��� ��Ʈ���� Ű�� Set �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		Iterator<Integer> iteratorKey = map.keySet().iterator();
		
		while(iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.print(key+ " "+map.get(key)+",");
		}
		System.out.println();
		System.out.println("-------���� ������ �̿��� Map.values()-------------");
		
		for(String value:map.values()) {
			System.out.print(value+ " ");
		}
		System.out.println();
		System.out.println("----------���� ������ �̿��� Map.keySet()-----------");
		
		for(Integer key:map.keySet()) {
			System.out.print(key+ "= "+map.get(key)+",");
		}
	}
}
