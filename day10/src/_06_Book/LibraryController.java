package _06_Book;

import java.util.ArrayList;

public class LibraryController {
	/*
	 * api class : 

   LibraryController
      속성 :
	member (Member를 객체 생성하여 필드에 저장)
	ArrayList<Book> aList 객체 생성

     생성자 :
	Member 객체를 매개변수로 받는 생성자 {
	    인스턴스변수 member에 넣기 
	}

     메소드 :
	void info{member의 toString() 출력}
	void insertBook() {
	    aList.add(  )
	    aList.add(  )
	    aList.add(  )
	}
	ArrayList<Book> selectAll() {
	    return aList;
	}
	Book searchBook(String bookTitle) {
	     Book book = null;
	     for() {

	     }
	     return book;
	}

	 */
	Member member=new Member();
	ArrayList<Book> aList=new ArrayList<Book>();
Book book = new Book();
	
	LibraryController(Member member){
		this.member=member;
	}

	void info() {
		System.out.println(member);
	}
	void insertBook(Book b) {
		aList.add(b);
	}

	ArrayList<Book> selectAll(){
		return aList;//ArrayList<Book>을 하면 모든 인덱스 번호의 객체가 출력이 된다
	}
	
	Book searchBook(String bookTitle) {
		Book book=null;
		boolean check=false;
		for(Book b:aList) {
			if(b.title.equals(bookTitle)) {
				book=b;
				check=true;
				break;
			}
		}
		if(check)return book;
		else {
			System.out.println("책을 찾을 수 없습니다.");
			return null;
		}
	}




}
