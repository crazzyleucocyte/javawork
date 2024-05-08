package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {

		System.out.printf("%7d\n", 32000);
		// %와d사이에 숫자를 입력하면 그 만큼의 자릿수를 가진 채 출력하라는 뜻이다
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 3200);
		System.out.println("--------------------------------------");
		// 모두 오른쪽 줄맞춤이 된다.
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n", 3200);
		// %와d사이에 7을 쓰고 그 앞에 0을 쓰면 앞의 빈 자리는 모두 0으로 채워진다.
		//숫자 앞에 0이 있는경우만 가능 빈 자리를 0이 아닌 숫자로 채우는것은 불가능
		System.out.println("--------------------------------------");
		System.out.printf("[%10s]\n", "abcdefg");
		System.out.printf("[%-10s]\n", "abcdefg");
		//-를 사용하면 왼쪽 정렬이 된다
		
		System.out.printf("%6.2f\n",3.5468432);
		//.도 자리를 차지해서 3.14는 4자리를 차지한다
		//%와 f사이에 실수를 입력하면 정수부는 숫자의 총 자릿수 실수부는 소숫점 아랫자리를 나타낸다
		System.out.printf("%.3f\n",3.54683);
		System.out.printf("%.4f\n",3.54683);
		System.out.printf("%.5f\n",3.54683);
		System.out.printf("%.6f\n",3.54683);
		System.out.format("%.6f\n",3.54683);
		//정수부를 입력하지 않을 경우 자동으로 맞춰주는데 실수부만큼 소숫점 아랫자리를 나타낸다
		//가장 자주 사용하는 코드로 실수의 소숫점을 맞추는데 쓰인다

	}

}
