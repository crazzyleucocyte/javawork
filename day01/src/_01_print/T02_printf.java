package _01_print;

public class T02_printf {

	public static void main(String[] args) {
		
		//printf(a,b)//a에 출력되는 값이 문자열형으로 들어가고 b는 a에 있는 %가 있는 자리와 표현 형식을 b의 숫자로 출력함
		//10진수 출력
		System.out.printf("%d\n",3);// %d는 10진수로 3을 출력하라
		System.out.printf("%d, %d", 10, 20);
		
		int num1 = 100;
		int num2 = 200;
		System.out.printf("\n%d, %d", num1, num2);
		
		//8진수 출력 %o
		System.out.printf("\n%o",9);
		
		//16진수 출력%x, %X
		System.out.printf("\n%x, %X", 13, 13);//x가 소문자인지 대문자인지에 따라 16진수의 알파벳의 대소문자가 정해짐
		
		//실수형 출력%f
		System.out.printf("\n%f",3.55555555555);//반올림 해서 소수점 6번째자리 까지만 나옴
		
		//문자 1개 출력%c
		System.out.printf("\n%c",'m');
		
		//문자열 출력은 %s
		System.out.printf("\n%s","집 가고 싶다.");
		
		//논리형 출력은 %b
		System.out.printf("\n%b", true);
		System.out.printf(", %b",7<5);
		
		//현재는 2024년 5월 이고, 우리나라의 평균키는 175.7입니다.
		System.out.printf("\n현재는 %d년 %d월 이고, 우리나라의 평균키는 %f입니다.",2024, 5, 175.5);
		
		//이 과정의 정원은 25명이고, 현재 25명 수강 중 입니다. 100%를 달성했습니다.
		System.out.printf("\n이 과정의 정원은 %d이고, 현재 %d명 수강중입니다. %d%%를 달성했습니다.",25, 25, 100);
		//%또한 이스케이프 문자여서 %%로 써야 %가 출력된다.
		
		
		
		

	}

}
