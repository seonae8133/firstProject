package com.yedam.classes.exam;

public class msaService {

		public boolean login(String id, String password) {
			msa m1 = new msa("홍","hong");
			
			if(m1.getId().equals("홍")&&m1.getPassword().equals("12345")) {
			return true;
			}
			return false;
		}
	
		
}
