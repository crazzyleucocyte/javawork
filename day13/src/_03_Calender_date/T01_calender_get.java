package _03_Calender_date;

import java.util.Calendar;

public class T01_calender_get {

	public static void main(String[] args) {
		//Calendar의 일 주 요일 달 년은 모두
		//public static finall이 붙어있다


		//Calendar : 추상 클래스. 객체를 생성할 수 없음. 메소드를 이용함
		Calendar today =Calendar.getInstance();
		//따로 입력하지 않고 날짜를 출력하면 시스템에 있는 오늘 날짜를 출력
		System.out.println("현재 년도 : "+today.get(Calendar.YEAR));

		//월은 0부터 시작해서 항상 1을 더해줘야한다.         클래스이름.필드(변수)이름
		System.out.println("현재 월 : "+(today.get(Calendar.MONTH)+1));
		System.out.println("이 달의 몇번쨰 주인지 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올 해의 몇번쨰 주인지 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("--------------------------------------------");

		//일

		System.out.println("오늘은 몇 일인지 : "+today.get(Calendar.DATE));
		System.out.println("오늘은 몇 일인지 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일 중 몇 일인지 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("--------------------------------------------");

		//요일(일~토)
		int week =today.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일(1:일요일)"+week);

		switch(week) {
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		case 1:
			System.out.println("일요일");
			break;
		}
		System.out.println("--------------------------------------------");


		//시간
		System.out.println("시간(0~23) : "+ today.get(Calendar.HOUR_OF_DAY));
		//AM, PM : am=0 pm=1
		//ampm은 0과 1로 나와서 if문으로 만들어줘야 한다
		int ampm=today.get(Calendar.AM_PM);
		if(ampm==0) {
			System.out.print("시간 : AM ");
			if(today.get(Calendar.HOUR)<10) {
				System.out.println("0"+today.get(Calendar.HOUR));
			}else System.out.println(today.get(Calendar.HOUR));


		}
		else {
			if(today.get(Calendar.HOUR)<10){
				System.out.print("시간 : PM ");
				System.out.println("0"+today.get(Calendar.HOUR));
			}else System.out.println(today.get(Calendar.HOUR));

		}
		
		System.out.println("분 : "+ today.get(Calendar.MINUTE));
		System.out.println("초 : "+ today.get(Calendar.SECOND));
		System.out.println("1/1000초 : "+ today.get(Calendar.MILLISECOND));
		

	}

}
