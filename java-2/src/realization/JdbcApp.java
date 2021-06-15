package realization;

//DBMS를 이용한 학생 관리 프로글
public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql mysql=new JdbcMysql();
		
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
		*/
		
		/*
		//시스템 변경에 의한 클래스 변경시 프로그램의 대부분을 변경 처리
		// => 클래스 간의 결합도가 높아 유지보수의 효율성 감소 
		JdbcOracle oracle=new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		*/
		
		//인터페이스를 이용하여 클래스를 작성할 경우 시스템 변경에 의한 클래스 변경시 
		//프로그램의 일부분만 변경 처리 가능
		// => 클래스 간의 결합도를 낮춰 유지보수의 효율성 증가
		//JdbcMysql jdbc=new JdbcMysql();
		//JdbcOracle jdbc=new JdbcOracle();
		
		//참조변수는 부모 인터페이스를 이용하여 생성하는 것을 권장
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}
