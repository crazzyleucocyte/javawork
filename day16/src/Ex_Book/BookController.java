package Ex_Book;

import java.util.*;

public class BookController extends Book {
	static List<Book> book = new <Book>ArrayList();

	
	public BookController() {
		book.add(new Book("고양이","베르나르 베르베르","소설",14800));
		book.add(new Book("달러구트 꿈백화점","이미예","소설",13800));
		book.add(new Book("미움받을 용기","기시미 이치로","인문",14900));
		book.add(new Book("용의자 X의 헌신","히가시노 게이고","추리소설",18800));
		book.add(new Book("1111","2222","333",18800));
		
	}
	public BookController(Book b) {
		book.add(b);
	}
	public BookController(String title, String author, String category, int price) {
		book.add(new Book(title, author, category, price));
	}
	
	
	
	static void insertBook(Book b) {
		book.add(b);
	}
	static Book insertBook(String title, String author, String category, int price) {
		Book b =new Book(title, author, category, price);
		book.add(b);
		return b;
	}
	
	int ListAll() {
		int i =1;
		for(Book bok: book) {
			System.out.println(i++ +". "+bok);
		}
		return book.size();
		
	}
	
	Book SearchBook(String title) {
		Iterator<Book> it =book.iterator();

		int i =0;
		while(it.hasNext()) {
			
			Book bok = it.next();
			String tit= bok.getTitle();
			if(tit.equals(title)) {
				return bok;
				
			} 
		}return null;
	}
	Book SearchBook(String title,String author) {
		Iterator<Book> it =book.iterator();
		
		int i =0;
		while(it.hasNext()) {
			
			Book bok = it.next();
			String tit= bok.getTitle();
			String auth= bok.getAuthor();
			if(tit.equals(title)&&auth.equals(author)) {
				return bok;
				
			} 
		}return null;
	}
	
	Book deleteBook(String title,String author){
		Book bok=null;
		for(int i =0;i<book.size();i++) {
			bok=book.get(i);
			if(bok.getTitle().equals(title)&&bok.getAuthor().equals(author)) {
				book.remove(bok);
				System.out.println(bok);
				return bok;
			}
		}
			return null;
	}
	
	void ascBook() {
		book.sort(null);
	}
	void delete() {
		book.remove(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
