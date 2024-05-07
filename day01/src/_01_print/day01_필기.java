package _01_print;

public class day01_필기 {
	public static void main(String[] args) {

		/*
		 * char을 이진수로 표현할떄는 유니코드로 바꿔서 적용 된다 유니코드로 문자 0은 0이 아니라 이진수로 고쳤을때 48이 된다
		 * 
		 */
		char a = '0';
		System.out.println(a + 5);// 0이 유니코드로 변환시 48이기 때문에 5를 더한 53이 출력된다

		// 실수형 자료형의 경우 비트에 정수부와 실수부가 나뉘어 있다
		// float의 bit구조는 부호1 정수부8실수부23으로 구성되어있다
		// double의 bit구조는 부호비트 1 정수부비트11 실수부 비트52
		double dd = 0.15987e+2;
		System.out.println(dd);
		// 참조형 자료형은 기본형으 ㄹ제외한 나머지(String, System 등)
		// 객체의 주소로 저장하기 때문에 모든 참조형 자료형은 4byte이다.

		// 변수 명명 규칙
//		대소문자를 구분한다 
//		예약어를 사용해서는 안된다 
//		숫자로 시작해서는 안된다 - 뒤에 오는거는 가능
//		특수문자는 _와$만 허용한다 - 띄어 쓰기 불가능
////		길이 제한이 없다
//		
//		변수, 상수, 리터럴
//		변수는 하나의 값을 저장하기 위한 공간-덮어쓰기 가능
//		상수는 한 번만 값을 저장할 수 있는 공간 -변하지 않는 값일때
//		리터럴은 그 자체로 값을 의미하는것 - ??

//		//변수명명 규칙 권장사항
//		클래스 이름의 첫 글자는 대문자로 한다
//		카멜 표기법 사용 -맨 첫글자를 제외한 각 합성어의 첫 글자만 대문자로 표기
//		상수의 이름은 대문자로 한다
//		단어는_로 구분
//		ex)PI, MAX, MIN_SCORE
		// https://github.com/professorjiwon/javawork
//		강사님 깃허브

		/*
		 * System.out.printf("%d",5); System.out.format("%d",5); printf와 format 둘 다 똑같이
		 * 쓰이므로 둘 중 하나를 쓰면 된다 
		 * %b: boolean 
		 * %d : 10진수 정수 
		 * %o : 8진수 정수 
		 * %x,%X : 16진수 정수(x는 소문자 대문자 구분) 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f,
		 * 10,11,12,13,14,15,16,17,18,19,1a,1b,1c,1d,1e,1f 
		 * %f : 실수형(float) 형식으로 출력 
		 * %c:문자로 출력 
		 * %s: 문자열로 출력
		 * 
		 *////////////////
	/*	Scanner
	 * 화면에서 입력 받기
	 * System.in
	 * 키보드 장치를 직접 제어하고 키를 입력을 받는 자바의 표준 입출력스트림
	 * 키 값을 바이트 정보로 리턴
	 * Scanner 클래스
	 * System.in으로 받은 키 값(바이트 정보)들을 문자, 정수, 실수, 불린, 문자열, 등으로 변환
	 * java.util.Scanner 클래스
	 * 
	 * 
	 * import java.util*;
	 * Scanner s = new Scanner(System.in);
	 * String str1 = scan.next();
	 * 
	 * 
	 * 메소드는 괄호()가 있는것들을 말한다
	 * String next()
	 * String nextLine()
	 * int nextInt()
	 * long nextLong()
	 * float nextFloat()
	 * double nextDouble()
	 * boolean nextBoolean()
	 * 		 * 
		 */
	}
}
