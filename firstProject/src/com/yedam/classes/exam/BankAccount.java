package com.yedam.classes.exam;

import java.util.Scanner;

public class BankAccount {

	private static Account[] acAray = new Account[100];
	private static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");
			
			int selcNo = scn.nextInt();scn.nextLine(); 
			
			if(selcNo ==1) {
				createAccount();
			} else if(selcNo==2) {
				accountList();
			} else if(selcNo ==3) {
				 deposit();
			} else if(selcNo==4) {
				withdraw();
			} else if(selcNo==5) {
				run = false;
			}
			
			
			
		}
		System.out.println("프로그램 종료");
	}
	
	

	//계좌생성하기
	private static void createAccount() {
		System.out.println("-----------------");
		System.out.println("계좌생성");
		System.out.println("-----------------");
		System.out.println("계좌번호 : ");
		String ano = scn.nextLine();
		System.out.println("계좌주");
		String owner = scn.nextLine();
		System.out.println("초기입금액");
		int balace = scn.nextInt();scn.nextLine(); 
		
		Account a1 = new Account(ano,owner,balace);
		
		for(int i=0; i<acAray.length; i++) {
			if(acAray[i]==null) {
				acAray[i] = a1;
				break;
			}
		}
	
	}
	
	//계좌 목록보기
	private static void accountList() {
		
		for(int i=0; i<acAray.length; i++) {
			if(acAray[i] != null) {
				System.out.println(acAray[i].getAno() + " " + acAray[i].getOwner() + "	 "
			+ acAray[i].getBalance());
				
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		int change = 0;
		
		System.out.println("예금 계좌 선택 >");
		Account add = findAccount(scn.next());
		System.out.println(add);
		change = scn.nextInt();
		add.setBalance(add.getBalance()+change);
		System.out.println("남은 금액은" + add.getBalance());
	
		}
		
	

	//출금하기
	private static void withdraw() {
		int change = 0;
		System.out.println("출금 계좌 선택> ");
		Account add = findAccount(scn.next());
		add.setBalance(add.getBalance()-change);
		System.out.println("남은 금액은 " + add.getBalance());
	
	}
	
//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
	
		Account a = null; // 생성자 Account 
		
		for(int i=0 ;i <acAray.length; i++) {
//			
			if(acAray[i]!=null) {
				if(acAray[i].getAno().equals(ano)) {
					 a = acAray[i];
					
				} 
			}
		}
		return a;
	}
		
		
//			if(acAray[i].getAno().equals(ano))
//				acAray[i].getBalance = ;
//				return null;
		
	}
	

