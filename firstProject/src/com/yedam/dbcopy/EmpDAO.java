package com.yedam.dbcopy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO { // 기능만 담당
	
	//입력
	
	public void addEmployee(Employee emp) { //Employee타입이 중요
		Connection conn = DBConnection.getConnection();//db연결
		//insert into emp_temp(employee_id, last_name, email, hire_date,job_id)
		//values(301,'test','test','2020-05-05','IT_PROG');
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date,job_id)"
				+ "values("+emp.getEmployeeId()+",\'"
								+emp.getLastName()+"\',\'"
								+emp.getEmail()+"\',\'"
								+emp.getHireDate()+"\',\'"
								+emp.getJobId()
								+"\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateEmp(Employee emp,Employee emp1) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp"+" set employee_id=" + emp1.getEmployeeId() +" where employee_id =" + emp.getEmployeeId() ;
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void removeEmp(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id =" + emp.getEmployeeId();
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 삭제되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//조회.
	public Employee[] getEmpList() {//getEmpList()를 호출하면 employee테이블에 배열 반환
		
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt =conn.prepareStatement(sql); //sql실행
		    ResultSet rs =pstmt.executeQuery(); //pstmt sql구문 실행결과 받아서 rs(resultset에 담음)
		    int idx = 0;
		    while(rs.next()) {
		    	Employee emp = new Employee();
		    	String firstName = rs.getString("first_name");
		    	emp.setFirstName(firstName);
		    	emp.setLastName(rs.getString("last_name"));
		    	emp.setEmployeeId(rs.getInt("employee_id"));
		    	emp.setEmail(rs.getString("email"));
		    	emp.setHireDate(rs.getString("hire_date"));
		    	emp.setJobId(rs.getString("job_id"));
		    	emp.setPhoneNumber(rs.getString("phone_number"));
		    	emp.setSalary(rs.getInt("salary"));
		    	
		    	employees[idx++] = emp; //Employee클래스 타입의 emp
		    
		    }
		    System.out.println(" -- end of data --"); //반복문 끝나면 처리
			} catch (SQLException e) {
					e.printStackTrace();
//위 select~ 영역에서 예외가 발생할 경우에는 e.printStackTrace 실행하라는 의미
	}//
		
		return employees; // 전체 배열 반환
	} //end of getEmpList()
	
	
	
}//end of class
