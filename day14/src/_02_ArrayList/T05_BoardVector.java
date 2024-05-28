package _02_ArrayList;

import java.util.*;

public class T05_BoardVector {

	public static void main(String[] args) {
		
		//vector와 arrayList의 차이는 멀티 쓰레드의 가능유무이다
		//단일쓰레드에서는 arrayList를 사용하고 멀티쓰레드에서는 vector를 사용한다
		//링크드 리스트는 삭제와 추가가 빈번할때 유용하다
		List<Board>list = new Vector<Board>();
		
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(1);
		
		for(Board b : list) {
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
	}

}
