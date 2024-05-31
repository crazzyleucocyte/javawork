package _12Months;

import java.util.Calendar;

import _04_Enum.Week;


public class Monthlywork {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(cal.MONTH);
		int day = cal.get(cal.DAY_OF_WEEK);
		String today="";
		
		switch(month+1) {
		case 1: today+=Month.JANUARY; break;
		case 2: today+=Month.FEBRUARY; break;
		case 3: today+=Month.MARCH; break;
		case 4: today+=Month.APRIL; break;
		case 5: today+=Month.MAY;break;
		case 6: today+=Month.JUNE;break;
		case 7: today+=Month.JULY;break;
		case 8: today+=Month.AUGUST;break;
		case 9: today+=Month.SEPTEMBER;break;
		case 10: today+=Month.OCTOBER;break;
		case 11: today+=Month.NOVEMBER;break;
		case 12: today+=Month.DECEMBER;break;
		}
		switch (day) {
		case 1:
			today += " "+DayOfMonth.SUNDAY;
			break;
		case 2:
			today += " "+DayOfMonth.MONDAY;
			break;
		case 3:
			today += " "+DayOfMonth.TUESDAY;
			break;
		case 4:
			today += " "+DayOfMonth.WEDNESDAY;
			break;
		case 5:
			today += " "+DayOfMonth.THURSDAY;
			break;
		case 6:
			today += " "+DayOfMonth.FRIDAY;
			break;
		case 7:
			today += " "+DayOfMonth.SATURDAY;
			break;
		}
		
		System.out.println("오늘은 "+today+"입니다.");
		
		//	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER,

		//SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
