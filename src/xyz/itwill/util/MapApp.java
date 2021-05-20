package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map 인터페이스를 상속받는 자료구조 클래스: HashMap, Hashtable 등
//=>키(key)와 값(value: 인스턴스)을 하나의 쌍(entry:엔트리)으로 묶어서 관리하는 자료구조 클래스
//키를 이용하여 값을 빠르게 검색하기 위해 사용
//엔트리: 키와 값으로 구성되는 데이터
public class MapApp {
	public static void main(String[] args) {
		//Map 인터페이스를 상속받은 자료구조 클래스는 키와 값의 제네릭 타입에 자료형 전달
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(K key, V value): Map 인스턴스에 엔트리를 추가하는 메서드
		//=>키는 내부적으로 Set 인터페이스 타입으로 저장되며 값은 Collection 인터페이스 타입으로 저장
		//=>키는 중복 저장되지 않으며 순서없이 저장
		System.out.println("------Map.put(K key, V value)-----");
		map.put(1000, "학생이름1");
		map.put(2000, "학생이름2");
		map.put(3000, "학생이름3");
		map.put(4000, "학생이름4");
		System.out.println(map);
		//Map.toString(): Map 인스턴스에 저장된 모든 엔트리를 문자열로 변환하여 반환하는 메소드
		map.put(2000, "학생이름777");
		System.out.println("-----Map.toString()-----");
		System.out.println(map);
		System.out.println("-----Map.remove()-----");
		//Map.remove(K key): Map 인스턴스에 저장된 엔트리 중 전달받은 키와 같은 엔트리를 삭제하는 메소드.
		map.remove(4000);
		System.out.print(map);
		System.out.println("-----Map.get()-----");
		//Map.get(K key): Map 인스턴스에 저장된 엔트리 중 전달받은 키와 같은 엔트리의 값을 반환하는 메소드
		String name = map.get(1000);
		System.out.println(name);
		System.out.println("------Map.values()------");
		//Map.values(): Map 인스턴스에 저장된 모든 엔트리의 값을 Collection 인스턴스로 반환하는 메소드
		Iterator<String> iteratorValue = map.values().iterator();
		while(iteratorValue.hasNext()) {
			System.out.print(iteratorValue.next()+ " ");
		}
		System.out.println();
		System.out.println("-------Map.keySet()------------");
		//Map.keySet(): Map 인스턴스에 저장된 모든 엔트리의 키를 Set 인스턴스로 반환하는 메소드
		Iterator<Integer> iteratorKey = map.keySet().iterator();
		
		while(iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.print(key+ " "+map.get(key)+",");
		}
		System.out.println();
		System.out.println("-------향상된 포문을 이용한 Map.values()-------------");
		
		for(String value:map.values()) {
			System.out.print(value+ " ");
		}
		System.out.println();
		System.out.println("----------향상된 포문을 이용한 Map.keySet()-----------");
		
		for(Integer key:map.keySet()) {
			System.out.print(key+ "= "+map.get(key)+",");
		}
	}
}
