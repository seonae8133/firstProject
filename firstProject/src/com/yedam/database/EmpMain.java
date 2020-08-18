package com.yedam.database;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 리스트 | 2. 입력 | 3.수정 | 4.삭제 | 9. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scn.nextInt();
			
			
			
			if(selectNo== 1) {
				
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				
//				for(int i=0; i<emp.length; i++)
				for(Employee emp:emps) {
					if(emp!=null)
					System.out.println(emp.toString());
				}
			} else if(selectNo ==2) {
				EmpDAO dao = new EmpDAO();
				System.out.println("사원번호 입력>");
				int empId = scn.nextInt();
				System.out.println("이름 입력>");
				String empName = scn.nextLine();
				System.out.println("이메일 입력>");
				String empEmail = scn.nextLine();
				System.out.println("입사일 입력>");
				String empHire = scn.nextLine();
				System.out.println("Job 입력>");
				String empJob = scn.nextLine();
				
				Employee emp = new Employee(empId,empName,empEmail,empHire,empJob);
				
//				Employee emp = new Employee(333,"test","test","2020-05-05","IT_PROG");
				dao.addEmployee(emp);
			} else if(selectNo ==3) {//수정
				EmpDAO dao = new EmpDAO();
				
				Employee emp = new Employee();
				System.out.println("수정 대상");
				int be =scn.nextInt();
				emp.setEmployeeId(be);
				System.out.println("수정 할 값");
				Employee emp1 = new Employee();
				int af = scn.nextInt();
				emp1.setEmployeeId(af);
				dao.updateEmp(emp, emp1);
				
			}else if (selectNo ==4) {//삭제
				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee();
				System.out.println("삭제할 사원번호 입력");
				int belno = scn.nextInt();
				emp.setEmployeeId(belno);
				dao.removeEmp(emp);
				
				
			}else if(selectNo ==9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}//end of main
}
