package _03_Calender_date;

import java.util.Calendar;

public class T03_calendar_연산 {

	public static void main(String[] args) {
		Calendar date1=Calendar.getInstance();
		Calendar date2=Calendar.getInstance();
		Calendar date3=Calendar.getInstance();

		//(기준 날짜, 몇 일 후or전)
		date1.add(Calendar.DATE, 100);
		System.out.println("오늘부터 100일 후 : "+(date1.get(Calendar.MONTH)+1)+"월"+date1.get(Calendar.DATE)+"일");

		date2.add(Calendar.DATE, -100);
		System.out.println("오늘부터 100일 전 : "+(date2.get(Calendar.MONTH)+1)+"월"+date2.get(Calendar.DATE)+"일");
	
		date3.add(Calendar.MONTH, 2);//오늘부터 2달 후
		System.out.println("오늘부터 2달 전 : "+(date3.get(Calendar.MONTH)+1)+"월"+date3.get(Calendar.DATE)+"일");
	
	
	
	
	
	}

}
