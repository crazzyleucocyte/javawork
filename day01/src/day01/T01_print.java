package day01;

public class T01_print {

	public static void main(String[] args) {
		// 주석: 실행하지 않음 한 줄 주석 설명이나 기타 사항들을 적는다
		/*
		 * 여러줄 주석 여러줄 주석은 설명이나 특이사항들을 적을때 사용
		 */
		// 출력문: println -> 출력 후 줄바꿈 println의 ln은 line이라는 뜻으로 줄바꿈을 뜻한다
//		문자열을 출력할 떄는 반드시 쌍따옴표("")를 넣어준다
		for(int i =0;i<3;i++) {
		System.out.println();
		System.out.println("더조은 컴퓨터 학원");
		System.out.println("내 이름은 강민석");
		System.out.println(3 + 7);
		System.out.println(5 * 3);
		// +기호는 숫자였을때에는 연산을 하고 문자
		// 문자열 이었을떄는 문자들을 연결해줌
		System.out.println(5 + 3 + "문자열 연결");
		System.out.println("강의실 : " + " 801호");

		// 앞에 문자열이 있을경우 뒤의 숫자도 문자로 인식
		// +와-만 해당하고 *와 /는 문제 없음
		System.out.println("연산 결과 : " + 7 + 9);
		System.out.println("연산 결과 : " + 7 * 9);

		// 문자열 뒤에 + 기호로 넣어주고 뒤에는 숫자로 인식해주고 싶을때는 괄호를 써준다
		System.out.println("연산 결과 : " + (7 + 9));

		System.out.print("sfdf");
		System.out.print("sfdf");
		System.out.print("줄바꿈 안함");
		System.out.print(" 이제 줄바꿈 안됨");
		
		
		System.out.println(" 줄바꿈 함");
		
		System.out.println("제 이름은 강민석입니다. 저의 장점은 착한것 입니다.");}
		
		

	}

}
