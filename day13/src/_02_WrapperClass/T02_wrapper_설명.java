package _02_WrapperClass;

public class T02_wrapper_설명 {

	public static void main(String[] args) {
		/*
		 * valueOf(): Integer 객체에서 int형 값을 뽑아내는 메소드
		 * 			  Integer(객체) -> 언박싱 ->int 변환
		 * -언박싱(unboxing) : 참조자료형 -> 기본자료형
		 * -박싱(boxing) : 기본자료형 -> 참조자료형으로 변환
		 */
		
		//autoUnboxing언박싱
		//-------------------------------------------------------
		Integer num = Integer.valueOf(100);
		int num1 = num;//Integer를 int로 형변환하는것을 오토언박싱이라고 한다
		
		//char
		Character ch='z';
		char c = ch;//오토언박싱
		//-------------------------------------------------------
		
		//객체를 기본자료형으로 바꾸는 Unboxing
		int num2 = Integer.parseInt("100");
		Integer num3 = Integer.valueOf("100");
		
		//boxing
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		
		
		
		
		
		
	}

}
