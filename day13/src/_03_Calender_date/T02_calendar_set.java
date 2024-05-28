package _03_Calender_date;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1=Calendar.getInstance();
		
		date1.set(2024, 12,7);
		int month = date1.get(Calendar.MONTH);
		System.out.println("월 : "+(date1.get(Calendar.MONTH)+1));
		
		//넣을떄는 이렇게 넣으면 되고 월을 출력할떄만 조심하면 된다
		date1.set(2024, 5-1,27,16,53);
		System.out.println(date1.get(Calendar.HOUR)+"시");
		System.out.println(date1.get(Calendar.MINUTE)+"분");
		System.out.println(date1.get(Calendar.SECOND)+"초");
		
		//앞에는 숫자, 위에는 달을 넣을 수 있다.
		date1.set(Calendar.MONTH,Calendar.MAY);
		System.out.println(date1.get(Calendar.MONTH)+1+"월");
		
		
		
		
		
		
		
	}

}
