package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board>getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("자바","공부하기"));
		return list;
		
	}
	
		
		
	
}
