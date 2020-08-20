package com.yedam.database;

public interface EmpService {

	 public Employee[] showList();
	 public void addEmp(Employee emp);
	 public void modEmp(Employee emp,Employee emp1);
	 public void delEmp(int empId);
}
