package _02_variable;

public class T02_char {

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = '김';
		char ch3 = '^';
		System.out.println(ch1 + "\n" + ch2 + "\n" + ch3);
		char ch4 = 'A' + 1;// 변수를 선언하면서 동시에 대입을 하면 리터럴 값이다
		System.out.println(ch4);
		char ch5 = 'C';
		// char ch6 = ch5 + 1;
		// 오류가 나는 이유는 자동 형변환 떄문, 연산이 일어났을 경우 기본 자료형인 int보다 작은 자료형이 형변환이 되어 char ch6은
		// int가 된다

		char ch7 = 'A' + '1'; // a의 유니코드 (65) +1의 유니코드(49) = 114(r)
		System.out.println(ch7);
	}

}


