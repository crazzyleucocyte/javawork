package Ex_Book;

import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookController bc = new BookController();

		Book deletBook;
		Book insertBook;
		Book searchedBook;

		try {
			menu:while(true) {
				System.out.print("\n어서오세요 더조은 도서관 무인 민원처리기입니다. "
						+ "\n1. 새 도서 추가"
						+ "\n2. 도서 전체 조회"
						+ "\n3. 도서 검색 조회"
						+ "\n4. 도서 삭제"
						+ "\n5. 도서명 오름차순 정렬"
						+ "\n9. 종료"
						+ "\n원하시는 항목의 번호를 입력해주세요  ");
				int menuNum = s.nextInt();
				s.nextLine();
				
				
				switch(menuNum) {

				case 1://새 도서 추가
					System.out.println("\n1번 새 도서 추가를 선택하셨습니다.");
					System.out.print("추가하실 책의 제목을 입력해주세요. : ");
					String title = s.nextLine();
					System.out.print("저자를 입력해주세요. : ");
					String author=s.nextLine();
					System.out.print("장르를 입력해주세요. : ");
					String genre = s.next();
					System.out.print("가격를 입력해주세요. : ");
					int price = s.nextInt();

					System.out.println("\n추가하실 책이 ");
					System.out.println(bc.insertBook(title,author,genre,price)+"이 맞나요?(y/n)");

					char answer=s.next().charAt(0);				//추가할 책 정보 확인
					if(answer=='y'||answer=='Y'||answer=='ㅛ') {
						System.out.println("저장이 완료되었습니다.");
						break;
				
					}else if(answer=='n'||answer=='N'||answer=='ㅜ'){
						System.out.println("처음으로 돌아갑니다.");
						break;
			
					}else {
						System.out.println("y나n만 입력해주세요.");
						break;
					}
//--------------------------------------------------------------------------------------------------
				case 2://도서 전체 조회
					System.out.println("\n2번 도서 전체 조회를 선택하셨습니다.");
					if(bc.ListAll()==0) {
						System.out.println("책이 없습니다.");
					}

					break;
//--------------------------------------------------------------------------------------------------
				case 3://도서 검색 조히ㅗ
					System.out.print("\n3번 도서 검색 조회를 선택하셨습니다.\n검색하실 책의 제목을 입력해주세요.  ");
					String inputTitle = s.nextLine();
					
					System.out.println("\n"+inputTitle+"을 검색합니다.");
					searchedBook=bc.SearchBook(inputTitle);
					
					if(searchedBook!=null) {
						System.out.println("검색하신 책의 정보입니다."+searchedBook);
					}else System.out.println("검색하신 책이 존재하지 않습니다.");

					break;
//--------------------------------------------------------------------------------------------------
				case 4://도서 삭제
					System.out.println("\n4번 도서 삭제를 선택하셨습니다.\n삭제하실 책의 제목을 입력해주세요.  ");
					String deleteTitle = s.nextLine();
					System.out.println("삭제하실 책의 저자를 입력해주세요");
					String deleteAuthor = s.nextLine();

					deletBook=(bc.SearchBook(deleteTitle, deleteAuthor));
					if(deletBook!=null) {
						
						System.out.println("아래의 책을 삭제하실건가요(y/n)?\n"+deletBook);			//삭제할 책의 정보 확인
						answer=s.next().charAt(0);
						if(answer=='y'||answer=='Y'||answer=='ㅛ'||answer=='ㅇ'||answer=='네') {
							System.out.println("삭제가 완료되었습니다.");
							break;
					
						}else if(answer=='n'||answer=='N'||answer=='ㅜ'){
							System.out.println("처음으로 돌아갑니다.");
							break;
					
						}else {
							System.out.println("y나n만 입력해주세요.");
							break;
						}
						
					}else System.out.println("입력하신 책이 존재하지 않습니다.");
					break;
//--------------------------------------------------------------------------------------------------
				case 5://도서명 오름차순 정렬
					System.out.println("\n5번 도서명 오름차순을 선택하셨습니다.");
					bc.ascBook();
					
					System.out.println("오름차순 정렬이 완료되었습니다.\n\n도서 목록을 보여드리겠습니다.");
					if(bc.ListAll()==0) {
						System.out.println("책이 없습니다.");
					}

					break;
//--------------------------------------------------------------------------------------------------
				case 9://종료
					System.out.println("\n9번 종료를 선택하셨습니다.\n이용해주셔서 감사합니다. 프로그램을 종료합니다.");
					break menu;

//--------------------------------------------------------------------------------------------------
				default:
					System.out.println("다시 입력해주세요.");
				}
			}
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다.");				//혹시 발생할 오류에 대해 예외 처리 
		}
	}
}
