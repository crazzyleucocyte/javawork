package day02;

public class 형변환 {

	public static void main(String[] args) {
		/*타입 변환(cating)
			값의 타입을 다른 타입으로 변환하는 것
			boolean 제외 7개의 기본형으 ㄴ서로 타입 변환 가능
			-자동 타입 변환:Promotion
			-강제 타입 변환:Casting
			
			-자동 형변환
				byte b1 = 10;-----1byte크기의 b1
				short s1 = b1;----1byte크기의 b1을 short에 대입해서 1byte를 2byte에 대입해 형 변환을 시킨다
			
			byte->short->int->long->float->double				
			1      2      4     8     4      8byte	
						char^	
						주로 사용 하는 것 int를 double로 변환
			
			-강제 형변환(casting)	
			작은크기 타입 =(작은크기 타입)큰 크기 타입
		*/
		
		int a =103029770;
//		byte b = a;//오류
		byte b = (byte)a;//오류 안남
		System.out.println(b);//10이 출력됨
		//103029770이라는 큰 숫자를 byte형으로 casting했을때 10이라는 작은 숫자로 변경 되어 손실이 크다
		
		/*
		연산식에서 자동 타입 변환
		int+int = int
		short = short+int--오류남  더 큰 형태인 int를 계산 결과short으로 할 경우 오류가 나서 형 변환을 해줘야 함
		short = (short)(short+int)--오류 안남
		double = int+double--오류 안남
		int =int+double--error
		int =(int)(int+double)--오류 안남
		
		
		int이하 타입의 연산의 경우 무조건 int형으로 형변환이 됨
		byte result = b+b1;//error int 이하의 자료형들을 연산하면 자동으로 int가 되니 오류가 난다
		
		char a = 'A';
		char b = a+1;//error(char+int)의 연산이므로 결과는 int여야 하지만 char로 되어 있어 오류가 남
		long와 byte를 연산 할 경우 long형으로 출력
		
		실수 타입 연산 double가 하나 있을 경우 double로 출력
		float른 두 항 다 float일 경우만 float로 출력
		
		
		
		
		*/
		int c=10;
		double d =3.14;
		double sum = c+d;//int형 c가 연산 결과 double로 변경됨
	    byte b1 = 20;
	    byte result = (byte)(b+b1);//오류 안남
	    char a1 = 'a';
	    char b2 = (char)(a1+1);
	    System.out.println((int)b2);
	}

}
