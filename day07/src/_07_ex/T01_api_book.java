package _07_ex;

public class T01_api_book {

	// String bookName
	//int ISBN;
	//int price;
	//생성자 메소드 사용
	// 매개변수 갯수 없는거, 1개, 2개, 3개를 만들어라
		
		String bookName;
		long ISBN;
		String price;
		
		public T01_api_book() {
			
		}
		public T01_api_book(String bookName) {
			this.bookName = bookName;
		}
		public T01_api_book(String bookName, long ISBN) {
			this(bookName);
			this.ISBN = ISBN;
		}
		public T01_api_book(String bookName, long ISBN,int price) {
			this(bookName,ISBN);
			this.price = changePrice(price);
		
		}
		
		void printOut() {
			System.out.println("책 이름 : "+bookName);
			System.out.println("ISBN : "+ISBN);
			System.out.println("책 가격 : "+price+"\n");
		}
		
		public String changePrice(int price) {//3자리마다 ,를 넣는 코드
			String toString= Integer.toString(price);
			String toInt="";
			int countprice=toString.length()%3; //가격의 자릿수를 확인하는 변수
		
			for(int i =1;i<toString.length()+1;i++) {//정수를 문자열로 변경하여 한 자리씩 옮기면서,를 추가
				
				switch (countprice) {
				case 0: //자릿수가 3의 배수(3,6,9)인 경우
					toInt+=toString.charAt(i-1);
					if((i)%3==0) {
						if(i==toString.length())break;//마지막,는 123,456,이렇게 되기 떄문에 제외한다
					toInt+=",";
					}
					break;
				case 1: //3의 배수+1인 경우 1,234
					if((i)%3==2) toInt+=",";
					toInt+=toString.charAt(i-1);
					break;

				case 2: //3의 배수+2인 경우 12,345
					if((i)%3==0) toInt+=",";
					toInt+=toString.charAt(i-1);
					break;
				}
			}
			return toInt;

		}
		
}
