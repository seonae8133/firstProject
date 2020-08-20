package yedam.com.interfaces;

public class MySqlDb implements DataAccessObject {//인터페이스쓸때는 상속이 아닌  implements

	public void select() {
		System.out.println("Mysql db입력.");
		
	}

	@Override
	public void insert() {
		System.out.println("Mysql db수정.");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql db조회.");
		
	}//DataAccessObject를 구현하는 OracleDb

}
