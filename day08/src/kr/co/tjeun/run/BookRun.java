package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;//임포트는 패키지명.클래스

public class BookRun {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		/*
		//기본 생성자로 객체를 생성하여 getter/setter메소드로 값 초기화
		Book book = new Book();
		book.setTitle("개미");
		book.setAuthor("베르나르 베르베르");
		book.setPrice(79000);
		book.setPublisher("열린책들");
		System.out.println(book.information());

		//초기화 방법 2. 매개변수가 있는 생성자 이용
		Book book1 = new Book("용의자 x의 헌신","히가시노 게이고",23000,"현대문학");
		System.out.println(book1.information());
		
		
		//사용자로 부터 값을 입력 받아 초기화 하여 출력하기
		Book book2 = new Book();
		System.out.print("책 제목을 입력하시오 : ");
		String inpTitle=info.nextLine();
		System.out.print("저자를 입력하시오 : ");
		String inpAuthor=info.nextLine();
		System.out.print("가격을 입력하시오 : ");
		int inpPrice = info.nextInt();
		info.nextLine();
		System.out.print("출판사를 입력하시오 : ");
		
		String inpPublisher=info.nextLine();
		
		book2.setTitle(inpTitle);
		book2.setAuthor(inpAuthor);
		book2.setPrice(inpPrice);
		book2.setPublisher(inpPublisher);
		System.out.println(book2.information());
*/
		//관리 해야 되는데 일반 변수 사용 할 경우
		Book book1=null;//  객체를 생성했는데 지역변수여서 null값 지정
		Book book2=null;
		Book book3=null;
		
		for(int i =0;i<3;i++) {
			System.out.println(i+1+"번째 도서 정보 입력");
			
			System.out.print("책 제목을 입력하시오 : ");
			String inpTitle=info.nextLine();
			
			System.out.print("저자를 입력하시오 : ");
			String inpAuthor=info.nextLine();
			
			System.out.print("가격을 입력하시오 : ");
			int inpPrice = info.nextInt();
			info.nextLine();
			
			System.out.print("출판사를 입력하시오 : ");
			String inpPublisher=info.nextLine();
			
			if(i==0)
			book1=new Book(inpTitle, inpAuthor, inpPrice,inpPublisher);
			else if(i==1)
				book2=new Book(inpTitle, inpAuthor, inpPrice,inpPublisher);
			else
				book3=new Book(inpTitle, inpAuthor, inpPrice,inpPublisher);
		}
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
//		도서 제목으로 검색하는 서비스 for문으로 못 돌림
		System.out.print("검색할 책 제목 : ");
		String search = info.nextLine();
		
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.information());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.information());
		}
		if(!book1.getTitle().equals(search)&&!book2.getTitle().equals(search)&&!book3.getTitle().equals(search)) {
			System.out.println("그런 책 없어요");
		}
		
		
		
		
		
		
		
		





	}

}
