package _03_Calender_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {

		// date는 calendar와 다르게 객체를 생성할 수 있다.
		Date now = new Date();
		System.out.println(now);

//		now.setYear(2025);

		// Mon May 27 17:13:07 KST 2024이렇게 말고
		// 2024-05-27 17:18 이렇게 출력하고 싶다
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 이렇게 포멧을 정하고 sdf.format(표현하고 싶은 변수)를 하면 해당 포멧으로 출력
		// mm: 분
		// MM:월
		// hh:시간(12시간)
		// HH:시간(24시간)

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(now));

		// a를 붙였더니 오후라고 나왔다
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf2.format(now));

		// hh를 HH로 하면 24시 표현
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf3.format(now));

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf4.format(now));

		SimpleDateFormat sdf5 = new SimpleDateFormat("yy/M/d");
		System.out.println(sdf5.format(now));

		SimpleDateFormat sdf6 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf6.format(now));

		SimpleDateFormat sdf7 = new SimpleDateFormat("yy년 MM월 dd일 E요일 a h시 mm분 ss초");
		System.out.println(sdf7.format(now));

		String str = "20240507";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd");

		Date strNow;
		try {
			strNow = sdf8.parse(str);
			System.out.println(sdf9.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
