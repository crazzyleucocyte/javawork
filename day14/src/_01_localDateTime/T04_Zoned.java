package _01_localDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T04_Zoned {

	public static void main(String[] args) {
		//아시아 서울 표준시
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		//유럽 런던 표준시
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		//유럽 배를린 표준시
		ZonedDateTime berlinDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(berlinDT);
		//미국 뉴욕 표준시
		ZonedDateTime newyorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyorkDT);
		
		//기준시간
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		//calendar의 국가 및 시간대 변경에 사용하여 해당 국가에 맞는 calendar를 사용할 수 있다
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now.get(Calendar.HOUR));
		
		
		
	}

}
