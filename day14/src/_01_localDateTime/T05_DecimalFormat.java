package _01_localDateTime;

import java.text.DecimalFormat;
import java.text.ParseException;

public class T05_DecimalFormat {

	public static void main(String[] args) {
		
		//number를 지정해둔 데시멀포멧으로 출력
		double number = 1234567.89;
		double number2 = 3.0;
//		DecimalFormat df = new DecimalFormat("#,###");
		//반올림이 된다
		System.out.println(new DecimalFormat("0").format(number));//정수출력 소수점은 반올림
		System.out.println(new DecimalFormat("#").format(number));
		System.out.println("----------------------------------------------");
		
		System.out.println(new DecimalFormat("#.#").format(number));//#.#를 해야 소수점 아래가 나오지만 정수면 안나옴
		System.out.println(new DecimalFormat("0.0").format(number));//정수여도 소수점 아래가 항상 나옴
		System.out.println("----------------------------------------------");
		
		System.out.println(new DecimalFormat("#.#").format(number2));//#.#를 해야 소수점 아래가 나오지만 정수면 안나옴
		System.out.println(new DecimalFormat("0.0").format(number2));//정수여도 소수점 아래가 항상 나옴
		System.out.println("----------------------------------------------");
		
		System.out.println(new DecimalFormat("##########.#####").format(number));
		System.out.println(new DecimalFormat("00000000000000.000000").format(number));
		System.out.println("----------------------------------------------");
		
		System.out.println(new DecimalFormat("#,###.#####").format(number));
		System.out.println(new DecimalFormat("0,000.00000").format(number));
		System.out.println("----------------------------------------------");
		
		
		//String 을 포멧을 적용시키는거..? 
		//"1,234,567.89"라는 String자료형을 숫자형식(double)으로 바꿔서 계산하고 싶다
		String stNum = "1,234,567.89";
		//String 값에서 인식할 포멧을 지정
		DecimalFormat df = new DecimalFormat("#,###.##");
		//Number객체를 사용했는데 오류가 생길 수도 있어서 try catch로 감쌌다
		try {
			//String에 해당 포멧이 있는 경우 그 String값을 숫자의 최상위 클래스인 number로 변환
			Number num = df.parse(stNum);
			//계산하기 위해 double형으로 변수
			double d = num.doubleValue(); //실수형으로 변환
			
			System.out.println(d*2);
			
			System.out.println((new DecimalFormat("#,###.##").parse(stNum).doubleValue())*2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
