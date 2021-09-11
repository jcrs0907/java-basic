package xyz.itwill.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xyz.itwill.dto.MyHewon;

public interface MyHewonMapper {
	int insertHewon(MyHewon hewon);
	List<MyHewon> selectHewonList();
	List<MyHewon> selectDiscriminatorHewonList();
	List<MyHewon> selectStateHewonList(int state);
	String selectBeanHewonId(MyHewon hewon);
	//Map �������̽��� ���׸��� ��Ű : String, �ʰ� : Object �����Ͽ� ���
	String selectMapHewonId(Map<String, Object> map);
	int insertMapHewon(Map<String, Object> map);
	List<Map<String, Object>> selectMapHewonList();
	//@Param : �߻�޼ҵ��� �Ű������� ����� ���� XML ������ ������Ʈ�� ��ϵ� SQL ��ɿ���
	//����� �� �ֵ��� �����ϴ� ������̼�
	// => value �Ӽ������� SQL ��ɿ��� ����� �� �ִ� �̸� ����
	// => �ٸ� �Ӽ��� ���� ��� �Ӽ����� ���� ����
	String selectParamHewonId(@Param(value="name") String name,@Param("phone") String phone);
	List<MyHewon> selectSearchHewonList(Map<String, Object> map);
	List<MyHewon> selectNameHewonList(String name);
	List<MyHewon> selectNameDynamicHewonList(Map<String, Object> map);
	List<MyHewon> selectDynamicHewonList(Map<String, Object> map);
	int updateHewon(MyHewon hewon);
	int updateDynamicHewon(MyHewon hewon);
	List<MyHewon> selectMultiDynamicHewonList(List<String> idList);
}

