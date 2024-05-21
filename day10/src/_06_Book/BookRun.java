package _06_Book;

public class BookRun {
/*
 * 
	 

main class : BookRun
     LibraryController 객체 생성
     책 넣기
     책 목록 출력
     책 검색	
 */
	
	
	public static void main(String[] args) {
		Book book = new Book("개미", "베르나르", "현대");
		Member member = new Member("강민석",27,"남자");
		
		
		LibraryController lib = new LibraryController(new Member("강민재",11,"남자"));
		lib.info();
		
		lib.insertBook(book);
		lib.insertBook(new Book("sg","sgwe","sdgg"));
		lib.insertBook(new Book("s123","sgwe","sdgg"));
		
		System.out.println(lib.searchBook("sgf"));
		System.out.println();
		System.out.println(lib.selectAll());
//		System.out.println(lib);
	}
}
