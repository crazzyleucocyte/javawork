package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {

		byte b1 = 20;
		short s1 = b1;// byte>>short

		int int1 = b1;// byte>>int
		int1 = s1;// short>>int

		char ch1 = '김';
		int inch = ch1; // char>>int 문자를 유니코드로 바꾼것을 출력
		System.out.println("'김'의 유니코드는 "+inch);//44608
		System.out.println(ch1);//김

		double d1= int1;//int>>double
		System.out.println(d1);
		
		d1 = inch;// char>>int>>double 그냥 int임
		System.out.println(inch);
		
		d1=s1+1;//short>>double
		System.out.println(d1);
		
		d1 = b1+2;//byte>>double
		System.out.println(d1);
	}

}
