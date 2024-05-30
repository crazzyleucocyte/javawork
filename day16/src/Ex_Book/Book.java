package Ex_Book;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title;		//책 제목
	private String author;		//작가
	private String category;	//장르
	private int price;			//가격
	
	
	public Book() {
	}
	public Book(String title, String author, String categroy, int price) {
		this.title = title;
		this.author = author;
		this.category = categroy;
		this.price = price;
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
	public String getCategroy() {
		return category;
	}
	public void setCategroy(String categroy) {
		this.category = categroy;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price;
	}
	@Override
	public String toString() {
		return "책 제목 : " + title + ", 저자 : " + author + ", 장르 : " + category + ", 가격 : " + price + "원]";
	}
	
	
	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}
	
	
	
	
	
	
}
