package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.*;
public class BookArrayRun {

	public static void main(String[] args) {
		//책의 정보를 저장할때 배열로 넣는 방법
		Scanner input = new Scanner(System.in);
		Book books[]=new Book[3];
		for(int i=0;i<books.length;i++) {
			System.out.println(i+1+" 번째 책의 ");
			System.out.print("책 제목을 입력하시오 : ");
			String inpTitle=input.nextLine();
			
			System.out.print("저자를 입력하시오 : ");
			String inpAuthor=input.nextLine();
			
			System.out.print("가격을 입력하시오 : ");
			int inpPrice = input.nextInt();
			input.nextLine();
			
			System.out.print("출판사를 입력하시오 : ");
			String inpPublisher=input.nextLine();
			System.out.println();
			
			
			books[i]= new Book(inpTitle,inpAuthor,inpPrice,inpPublisher);
			inpTitle=inpAuthor=inpPublisher=null;
			inpPrice=0;
		}
		for(Book result:books) {
			System.out.println(result.information());
		}
		
		//책 검색
		System.out.print("검색할 책의 제목을 입력해주세요 : ");
		String searchBook=input.nextLine();
		
		boolean bookChenk=false;
		
		for(Book search:books) {
			if(search.getTitle().equals(searchBook)) {
				System.out.print("찾으신 책의 정보는 : "+ search.information()+"입니다.");
				bookChenk=true;
				break;
		}
		}if(!bookChenk) System.out.println("그런 책 없습니다.");
		
		
		
		
		
	}

}
