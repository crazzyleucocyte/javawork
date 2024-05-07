package _03_Scanner;

import java.util.Scanner;
//import _02_variable.T02_char;과 같은 말로 위의 코드가 쓰인다
//import _02_variable.*;는 02 패키지 안에 있는 모든 클래스를 사용하겠다라는 뜻이다.

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = s.next(); // 문자열의 단어
		System.out.println("당신의 이름은 " + name);

		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		System.out.println("당신의 나이는" + age + "입니다.");

		System.out.print("키를 입력하세요 : ");
		double hight = s.nextDouble();
		System.out.printf("당신의 키는 %.1f입니다.", hight);

		System.out.print("당신은 남자입니까(true, false)?");
		boolean gender = s.nextBoolean();
		System.out.println("당신은 남자입니까?" + gender);
		
		System.out.print("주소를 입력하세요 : ");
		String address = s.nextLine();
		System.out.println("주소 : "+address);
		
		System.out.print("주소를 입력하세요 : ");
		String address2 = s.next();
		//엔터를 치는 곳까지 받아와서 앞에서 엔터 치기 전에 한 단어만 가져와서 남은게 2까지 넘어왔다
		//그래서 next는 조심해서 써야 하고 마지막에 써야 한다
		System.out.println("주소 : "+address2);
		
		System.out.print("당신의 성별은 무엇입니까? ");
//		String gender2 =s.next();
		char gender3 = s.next().charAt(1);
		//s.next() 뒤에 charAt(0)을 쓰면 괄호 안의 숫자 번째의 한 글자를 가져온다
//		System.out.println("성별 : "+gender2);
		
		System.out.println("성별 :"+gender3);
		
		
		
	}

}
