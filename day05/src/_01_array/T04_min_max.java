package _01_array;

public class T04_min_max {

	public static void main(String[] args) {
		//1차원 배열의 min값과max값 가져오기
		int []score = {8,4,9,2,6,1,3,5,7};
		
		
		//자리바꿈 num2에는 10을 num2는 20을 바꾸고 싶을때
		int num1 =10;
		int num2 =20;
		
//		num1=num2;
//		num2=num1; //자리바꿈 안됨
		//그래서 변수 하나를 만들어서 자리 바꿈을 한다
		
		int temp =num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+","+num2);
		
	}

}
