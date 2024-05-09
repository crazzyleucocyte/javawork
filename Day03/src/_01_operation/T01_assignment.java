package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		//% 값을 나눈 나머지
		int num1 = 10;
		int num2 = 3;
		int result = num1%num2;
		System.out.println("나머지 : "+num1+" % "+num2+" = "+result);
		System.out.println("몫 : "+num1 /num2);
		
		num1 = num1 + 10;
		System.out.println(num1);
		
		num1+=10; //num1 = num1+ 10;
		System.out.println(num1);
		
		num1 +=5;
		System.out.println(num1);
		
		num1 -= 8; //35-8
		System.out.println(num1);
		
		num1-=17;
		System.out.println(num1);
		
		num1*=3;
		System.out.println(num1);
		
		num1/=3;
		System.out.println(num1);
		
		num1%=4;
		System.out.println(num1);
		
		int num3 = 300_000_000;//_를 인식하지 않고 숫자만 읽어서 사람이 보기 편하니 큰 숫자를 쓸때는 _를 사용하자
		System.out.println(num3);
		
		
	}

}
