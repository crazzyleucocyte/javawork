package _02_ArrayList;

import java.util.*;

public class T04_BoardArrayList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
		Board b1 = new Board("제목1","내용1","글쓴이1");
		list.add(b1);
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		Board b2 = list.get(1);
		System.out.println(b2);
		
		Board b3 = new Board();
		b3.setTitle("title1");
		b3.setContent("게시판 내용");
		b3.setWriter("아무개");
		
		list.add(b3);
		for(Board b : list) {
			System.out.println(b);
		}
		System.out.println("---------------------------------------------");
		list.remove(2);
		for(Board b : list) {
			System.out.println(b);
		}
		System.out.println("---------------------------------------------");
		System.out.println(list);
		
		
		
	}

}
