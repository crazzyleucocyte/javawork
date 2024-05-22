package _04_Ex;

import java.util.Scanner;

public class Ex_api {
	Scanner s = new Scanner(System.in);
	int num1;
	int num2;
	void inputNum() throws UserException{
		System.out.println("1부터 100까지의 숫자 2개를 입력해주세요");
		
		
			num1 = s.nextInt();
			num2 = s.nextInt();
			if(1>num1||num1>100||num2<1||num2>100) {
				throw new UserException("1부터 100 사이의 수만 입력해주세요");
			}
		
		System.out.println("정수1 : "+num1);
		System.out.println("정수2 : "+num2);
		System.out.print(num1+"는 "+num2+"의 배수인가? ");
		if((double)num1/num2==0.00)System.out.println(true);
		else System.out.println(false);





	}

	
	

}
