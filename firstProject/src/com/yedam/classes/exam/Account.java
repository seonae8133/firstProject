package com.yedam.classes.exam;

public class Account {

	private String ano;//계좌번호
	private String owner; //계좌주
	private int balance; //초기 입금액
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this. owner= owner;
		this.balance = balance;
				
	}
	
	public String getAno() {//계좌번호
		return ano;
	}
	
	public void setAno(String ano ) {
		this.ano =ano;
	}
	
	public String getOwner() {//계좌주
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {//초기 입금액
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
