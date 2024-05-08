package _01_casting;

public class T03_castingOp {


	public static void main(String[] args) {
		
		// int 형보다 작은 자료형의 연산은 모두 int로 자동 형변환 됨
		byte b1 = 10;
		byte b2 = 20;
		
//		byte result = b1+b2;// error
//		int result = b1+b2;
		byte result2 = (byte)(b1+b2);
		
		char c1 = 'A';
//		char c2 = c1+1;// char+int>>int이기 떄문에 오류가 남
		int c3 = c1+1;
		char c2 = (char)(c1+1);
		System.out.println(c3);
		System.out.println(c2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1/num2;//소수점 이하는 안나오고 몫만 나온다
		System.out.println(num1 + "."+num2 +"의 몫 : "+result3);
		
		double dou2 = 3;
		double reslut4 =num1/dou2;// int/double=double
		System.out.println(reslut4);
		
		num1=100;
		num2 = 3;
		double re = (double)num1/num2;
		re = num1/(double)num2;
		re = (double)num1/(double)num2;
		
		double re2= num1/num2;//3.0
		System.out.println(re2);
		
		
		
		
		
		
		
		
	}
}
