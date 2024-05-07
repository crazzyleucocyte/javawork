package _02_variable;

public class T01_var {

	public static void main(String[] args) {
		/*기본자료형
		 * 정수 : int
		 * 실수 : double
		 * 참, 거짓 : boolean
		 * 문자 1개 : char(유니코드 사용)
		 * 
		 * 단축키: [ctl+shift+/] // 정수 타입: byte(1byte), char(2byte), short(2byte),
		 * int(4byte), long(8byte)
		 */
		int num1;
		int num2 = 10;

		num1 = 11;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1+num2);
		System.out.println(num1*2 + num2);
		
		int sum = num1 +num2;
		System.out.println("num1+num2="+sum);
		//변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오. 그리고 출력하시오
		int sum2 = sum+5;
		System.out.println("sum + 5 = "+sum2);
		
		long long01 = 5000000000000L;
		//L을 쓰지 않으면 기본 자료형인 int 형인데 숫자가 너무 커서 L을 써서 long형으로 바꿔주지 않으면 오류가 난다
		
		double doub01=3.7021684;
		System.out.println(doub01);
		double doub02 = 78.0168543;
		System.out.println(doub01+doub02);
		//기본자료형 8byte를 float 4byte에   큰 자료형을 작은 자형에 넣어서 오류남
		float float01=45.5435849f;//소수점 이하 6자리까지 표현 가능
		System.out.println(float01);
		
		
		
	}

}
