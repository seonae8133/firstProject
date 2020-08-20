package yedam.com.interfaces;

public class DaoExample {

	public static void main(String[] args) {
		
//		DataAccessObject dao = new OracleDb(); // oracledb -> mysqldb
//		MySqlDb dao = new MySqlDb();
		
//		DataAccessObject dao = new OracleDb();
		DataAccessObject dao = new MySqlDb(); // 인터페이스 사용하면 new 뒤에 부분만 수정해서 재사용 가능
		
		
		dao.select();
		dao.insert();
		dao.update();
		
	}
}
