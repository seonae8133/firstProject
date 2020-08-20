package yedam.com.interfaces;

public class OracleDb implements DataAccessObject{//인터페이스 DataAccessObject 구현하는OracleDb 클래스 

	//DataAccessObject 클래스의 추상메소드 재정의
	@Override
	public void select() {
		System.out.println("오라클 db입력.");
		
	}

	@Override
	public void insert() {
		System.out.println("오라클 db수정.");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 db조회.");
		
	}//DataAccessObject를 구현하는 OracleDb

	
	
	
}
