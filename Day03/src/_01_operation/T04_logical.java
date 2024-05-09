package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		//논리합과 논리 곱
		/*
		x y  논리곱(&&)  논리합(||)
		0 0     0          0
		0 1     0          1
		1 0     0          1
		1 1     1         11111
		*/
		
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1>num2 && num1<=num2;
		     //f(0)      //f(0)   &&     t(1)      일단 && 앞에 거짓이 있으면 뒤에는 확인 안하고 출력한다
		System.out.println(re1);
		re1 = num1>num2 || num1<=num2;
		System.out.println(re1+"\n--------------------"); 
		
		//! : not
		re1 =!re1;
		System.out.println(re1);
		
		boolean b1 = false;
		System.out.println(!b1);
		
		char ch = 'K';
		System.out.println(ch);
		System.out.println("소문자 인가?"+(ch>='a'&&ch>='z'));//97~122
		//소문자는 97부터이므로 97인 a보다 크고 소문자z 보다 작으면 소문자
		System.out.println("대문자 인가?"+(ch>='A'&&ch>='Z'));//65~90
		//char은 문자로써가 아닌 유니코드로써 비교 한다
		
		
		
		
		
		
		
	}

}
