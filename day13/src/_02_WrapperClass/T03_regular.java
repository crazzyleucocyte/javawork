package _02_WrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {
		
		//전화번호 표현 양식
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//(02|010) : 02나 010이 들어올 수 있다
		//- : 무조건 들어오시오
		// \d{3,4} : \d는 숫자가 들어올 수 있고 {}안에 숫자는 숫자가 3개나4개 올 수 있다 
		String data = "010-234-6789";
		
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else
			System.out.println("정규식과 일치하지 않습니다.");
		
		// 이메일체크
		//앞에는 문자나 숫자 최소 1개 이상  @  문자나 숫자 .문자
		//앞에는 문자나 숫자 최소 1개 이상  @  문자나 숫자 .문자.문자
		regExp="^[a-zA-Z]\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data="alstjr7696@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
	}else
		System.out.println("정규식과 일치하지 않습니다.");
	
//		+뜻은 한 개 이상
		
		
		
		
	}

}
