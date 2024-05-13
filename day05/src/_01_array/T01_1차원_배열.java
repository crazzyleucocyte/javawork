package _01_array;

public class T01_1차원_배열 {

	public static void main(String[] args) {
		int num1 =1;
		int num2 = 2;
		int num3 =3;
		int num4=4;
		
		//배연[] : 배열 표시는 자료형 또는 변수명에 붙여준다	
		int[]arrayInt = new int[5];
		int attayInt1[] = new int[3];
		arrayInt[0]=10;
		arrayInt[2]=20;
		System.out.println(arrayInt[2]);
		
		int arrayInt2[]= {1, 2, 3, 4, 5};
		
		
		char[]arrayChar = {'a','b','c'};
		double[]arrayDou = {35.45,253.352,255,55};
		String[]arrayStr = {"sgsg","sgsg"};
		
		int[]arrayInt3 = new int[5]; //index번호 : 0~4
		arrayInt3[5]=9; //오류: 인덱스이ㅡ 범위를 넘어서 넣을 수 없음
		
		//배열 100개를 만들어서 1~100까지의 값을 넣는다
		int[]arrayInt4 = new int[100];
		for(int i =0;i<100;i++) {
			arrayInt4[i]=i+1;
		};
		
		
		
		
		
	}

}
