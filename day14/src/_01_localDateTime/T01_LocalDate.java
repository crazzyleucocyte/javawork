package _01_localDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue()+"월");
		System.out.println(today.getDayOfMonth()+"일");
		System.out.println("365일 중 "+today.getDayOfYear()+"일");
		System.out.println(today.getDayOfWeek());//문자
		System.out.println(today.getDayOfWeek().getValue());//숫자
		System.out.println(today.getMonthValue()+"월은 총 "+today.lengthOfMonth()+"일까지 있다");
		System.out.println("올 해는 총 "+today.lengthOfYear()+"일까지 있다");
		System.out.println("올해는 윤년인가? "+ today.isLeapYear());
		
		//원하는 날짜 설정
		LocalDate day = LocalDate.of(2024, 5, 7);
		System.out.println(day);
		
	}

}
