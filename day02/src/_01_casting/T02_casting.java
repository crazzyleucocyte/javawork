package _01_casting;

public class T02_casting {

	public static void main(String[] args) {

		System.out.println("byte크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);// byte로 표현 할 수 있는 최소 값을 출력
		System.out.println("short의 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);// short로 표현 할 수 있는 값을 출력
		System.out.println("int의 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);// int로 표현 할 수 있는 값을 출력
		System.out.println("char의 크기 : " + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);
		System.out.println("long의 크기 : "+ Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("--------------------------------------");
		
		int num1 = 123456;
		byte b1 = (byte) num1;// int>>byte
		System.out.println(b1);// 64

		long long1 = 1111111111111123456L;
		float float1 = long1; // long>>float 지수로 표현되어 자주 쓰지는 않음
		System.out.println(float1);
		
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
		
		
		
		
		
		
	}

}
