package xyz.itwill.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

//Provider Ŭ���� : SQL ����� ��ȯ�ϴ� �޼ҵ尡 ����� Ŭ����
// => ���� SQL ����� Java ������� �����Ͽ� ����
public class MyHewonProvider {
	public String selectDynamicHewonList(Map<String, Object> map) {
		//SQL Ŭ���� : SQL ����� �����Ͽ� �����ϱ� ���� Ŭ����
		// => SQL ��� �ۼ��� �ʿ��� �޼ҵ带 ȣ���Ͽ� SQL ��� �ۼ�
		//SQL.toString() �޼ҵ带 ȣ���Ͽ� SQL �ν��Ͻ��� ����� SQL ����� ���ڿ��� �����Ͽ� ��ȯ
		return new SQL() {{
			SELECT("*");
			FROM("myhewon");
			if(map.get("name")!=null && !map.get("name").equals("")) {
				WHERE("hewon_name=#{name}");
			}
			ORDER_BY("hewon_id");
		}}.toString();
	}
}
