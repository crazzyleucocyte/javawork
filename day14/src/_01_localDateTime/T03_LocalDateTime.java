package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		
		LocalDateTime startDay = LocalDateTime.of(2024,5,7,10,2,59);
		LocalDateTime endDay = LocalDateTime.of(2024,11,25,18,30,0);

		
		//날짜와 시간 출력 형식 변경
		System.out.println(startDay);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss");
		System.out.println("시작일 : "+startDay.format(dtf));
		System.out.println("종료일 : "+endDay.format(dtf));
		
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다.");
		}else if(today.isAfter(endDay)) {
			System.out.println("수업 종료했습니다.");
		}else if(today.isEqual(endDay)) {
			System.out.println("오늘은 종료하는 날입니다");
		}
		
		//두 기간 사이의 기간(초)
		Duration duration = Duration.between(today, endDay);
		System.out.println(duration.getSeconds());
		
		//두 날짜 사이의 기간을 시간, 월, 등등으로 출력
		System.out.println("종료일까지 시간 : "+today.until(endDay,ChronoUnit.HOURS)+"시간 남음");
		System.out.println("종료일까지 시간 : "+today.until(endDay,ChronoUnit.MONTHS)+"개월 남음");
		System.out.println("종료일까지 시간 : "+today.until(endDay,ChronoUnit.HOURS)+"시간 남음");
		System.out.println("-----------------------------------------------");
		
		LocalTime endTime = LocalTime.of(18,30, 0);
		System.out.println("종료시간까지 "+LocalTime.now().until(endTime, ChronoUnit.HOURS)+"시간 남음");
		System.out.println("-----------------------------------------------");

		
		//특정 날짜에 년, 월, 일, 시간, 분, 초 등을 추가 혹은 감소시키는데 변수에 있는 시간은 변경되지 않음
		//
		System.out.println(today.plusYears(3).format(dtf));
		System.out.println(today.plusMonths(7).format(dtf));
		System.out.println(today.plusDays(15).format(dtf));
		System.out.println("-----------------------------------------------");
		
		System.out.println(today.minusYears(3).format(dtf));
		System.out.println(today.minusMonths(7).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		System.out.println("-----------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
