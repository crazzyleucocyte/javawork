package _01_StringBuffer_builder;

public class T03_Math {

	public static void main(String[] args) {
		//절대값
		System.out.println("-11의 절대값 : "+Math.abs(-11));
		System.out.println("-11.45의 절대값 : "+Math.abs(-11.45));
		System.out.println("--------------------------------------------");
		
		//소수점 이하 무조건 올림
		System.out.println("13.1의 올림 : "+Math.ceil(13.1));
		System.out.println("-13.1의 올림 : "+Math.ceil(-13.1));
		System.out.println("--------------------------------------------");
		
		System.out.println("13.7의 내림 : "+Math.floor(13.7));
		System.out.println("-13.7의 내림 : "+Math.floor(-13.7));
		System.out.println("--------------------------------------------");
		
		//가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수값 : "+ Math.rint(13.1));
		System.out.println("13.7의 가까운 정수값 : "+ Math.rint(13.7));
		System.out.println("13.5의 가까운 정수값 : "+ Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수값 : "+ Math.rint(-13.1));
		System.out.println("-13.7의 가까운 정수값 : "+ Math.rint(-13.7));
		System.out.println("--------------------------------------------");

		//소수점 이하 반올림
		System.out.println("13.1의 반올림 : "+Math.round(13.1));
		System.out.println("13.7의 반올림 : "+Math.round(13.7));
		System.out.println("-13.1의 반올림 : "+Math.round(-13.1));
		System.out.println("-13.7의 반올림 : "+Math.round(-13.7));
		System.out.println("--------------------------------------------");

		//두 수중 큰 수 반환
		System.out.println("7과 8 중 큰 숫자 : "+ Math.max(7, 8));
		System.out.println("7과 8 중 작은 숫자 : "+ Math.min(7, 8));
		System.out.println("7.8과 8 중 작은 숫자 : "+ Math.min(7.8, 8));
		System.out.println("--------------------------------------------");
		
		//소수점 2째자리까지 얻기(3째 자리에서 반올림)
		//반올림을 원하는 자리가 두쨰자리에 오도록 10의 배수를 곱하고 Math.round를 해서 다시 10의 배수로 나누면 됨
		//round는 lomg형으로 반환하기 떄문에 형변환을 해줘야 한다
		double value = 12.34567;
		double value2= value*100;
		System.out.println(value2);
		long re = Math.round(value2);
		int result=(int)Math.round(value2);
		System.out.println("result = "+result);
		System.out.println("result/100 = "+result/100);
		System.out.println("(double)result/100) = "+(double)result/100);
		System.out.println("--------------------------------------------");

		double ran = Math.random()*100;//0 ~ 99.9999999
		double ran2= Math.round(ran);
		System.out.println(ran2/100);//0 ~ 0.99

		double ran11 = (Math.random()*100)+1;//1 ~ 100.9999999
		double ran12= ran11*100;
		double ran13=Math.round(ran12);
		System.out.println(ran13/100);//0 ~ 0.99
		
		
		System.out.println((int)Math.pow(4, 2));//double형 제곱 ==16
		Math.sqrt(16);//루트 =4
		Math.cos(ran13);//코사인
		Math.sin(ran13);//사인
		Math.tan(ran13);//탄젠트
		
		
		
		
		
	}

}
