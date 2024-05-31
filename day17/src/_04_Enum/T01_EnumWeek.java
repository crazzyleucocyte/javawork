package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(cal.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		if (today == Week.SUNDAY) {
			System.out.println("일요일엔 짜파게티");
		} else if (today == Week.FRIDAY) {
			System.out.println("수업 끝나고 쉬어도 된다.");
		} else
			System.out.println("열심히 자바 공부를 한다.");

		System.out.println(week);
	}

}
