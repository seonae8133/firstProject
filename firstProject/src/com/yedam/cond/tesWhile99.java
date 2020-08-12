package com.yedam.cond;

public class tesWhile99 {

	public static void main(String[] args) {
	
		int i =1;
		int j =1;
		
		while(i<=9) {
				System.out.println(i+"x"+j+"="+i*j);
			j++;
			
			if(j==10) {
				i++;
				j=1;
				
			}
		}
		
	
	}
}
