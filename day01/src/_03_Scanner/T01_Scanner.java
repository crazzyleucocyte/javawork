package _03_Scanner;

import java.util.Scanner;
//import _02_variable.T02_char;과 같은 말로 위의 코드가 쓰인다
//import _02_variable.*;는 02 패키지 안에 있는 모든 클래스를 사용하겠다라는 뜻이다.

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//이름
		System.out.print("이름을 입력하세요 : ");
		String name = s.next(); // 문자열의 단어
		System.out.println("당신의 이름은 " + name);

		//나이
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		System.out.println("당신의 나이는" + age + "입니다.");

		//키
		System.out.print("키를 입력하세요 : ");
		double hight = s.nextDouble();
		System.out.printf("당신의 키는 %.1f입니다.", hight);

		//boolean 남자인가요?
		System.out.print("당신은 남자입니까(true, false)?");
		boolean gender = s.nextBoolean();
		System.out.println("당신은 남자입니까?" + gender);
		
		//주소.nextline
		System.out.print("주소를 입력하세요 : ");
		String address = s.nextLine();//서울특별시 강남구
		System.out.println("주소 : "+address);//주소 : 서울특별시 강남구
		
		System.out.print("주소를 입력하세요 : ");
		String address2 = s.next();//서울특별시 강남구
		//엔터를 치는 곳까지 받아와서 앞에서 엔터 치기 전에 한 단어만 가져와서 남은게 2까지 넘어왔다
		//그래서 next는 조심해서 써야 하고 마지막에 써야 한다
		System.out.println("주소 : "+address2);//주소 : 서울특별시
		
		/*
		 * 아래와 같이 했을때 발생하는 오류
		 * 
		 * System.out.print("주소를 입력하세요 : "); 
		 * String address = s.next();//서울특별시 강남구
		 * System.out.println("주소 : "+address);//주소 : 서울특별시
		 * 
		 * System.out.print("주소를 입력하세요 : ");
		String address2 = s.next();
		System.out.println("주소 : "+address2);//주소 : 강남구
		
		next는 입력 받은 문자열 중 띄어쓰기 단위로 가져오고 nextLine는 엔터 단위로 가져오기 때문에 위와 같은 코드 작성시 오류가 뜬다
		next에 서울특별시 강남구를 입력했을 경우 띄어쓰기 단위로 가져와서 엔터가 없는 서울특별시만 가져오고 
		강남구는 사라지지 않고 다음 nextLine로 넘어간다 그래서 강남구 다음 엔터를 쳤기 때문에 
		address를 입력하지 않아도 자동으로 강남구가 뜬다
		 */		
		System.out.print("당신의 성별은 무엇입니까? ");
//		String gender2 =s.next();
		char gender3 = s.next().charAt(1);
		//s.next() 뒤에 charAt(0)을 쓰면 괄호 안의 숫자 번째의 한 글자를 가져온다
		//주의 할 점은 char형이라는 것
//		System.out.println("성별 : "+gender2);
		
		System.out.println("성별 :"+gender3);
		
		
		
	}

}
