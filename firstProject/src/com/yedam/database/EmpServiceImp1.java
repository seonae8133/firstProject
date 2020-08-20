package com.yedam.database;

public class EmpServiceImp1 implements EmpService {

	EmpDAO dao = new EmpDAO();
	
	@Override
	public Employee[] showList() {
		return dao.getEmpList();
		
	}

	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
		
	}

	@Override
	public void modEmp(Employee emp,Employee emp1) {
		dao.updateEmp(emp,emp1);
		
	}

	@Override
	public void delEmp(int empId) {
		dao.removeEmp(empId);
		
	}

	
}
