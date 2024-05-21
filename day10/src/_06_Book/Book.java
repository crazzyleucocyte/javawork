package _06_Book;

public class Book {
/*
 * api class : 
   Book
      속성 :
	title
	author
	publisher
	
      생성자 :
	매개변수가 없는 생성자
	매개변수가 3개인 생성자 {
		인스턴스 변수에 넣기
	}
	
      메소드 :
	각 필드의 setter / getter 메소드
      오버라이딩 : toString()
	제목 : title, 저자 : author, 출판사 : publisher


  
 */
	String title;
	String author;
	String publisher;
	
	Book(){
		
	}
	
	public Book(String title, String author,String publisher) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return "제목 : "+title+", 저자 : "+author+", 출판사 : "+publisher+"\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
