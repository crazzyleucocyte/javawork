package _06_Function;

import java.util.*;
import java.util.function.*;

public class T02_Function {
//	function은 람다식의 인터페이스이다.
	static List<Student>list = Arrays.asList(
			new Student("홍길동",79,85),
			new Student("김수한무",24,36),
			new Student("거북이",64,60),
			new Student("두루미",68,06),
			new Student("맹꽁이",13,97)
			);
	
	//평균 출력 메서드
	//반환형 double매개변수는 (ToIntFunction)
	//int, double, lont는 그냥 function의 매개변수나 반환형 자리에 입력할 수 없고 toIntFunction이나 ToDoubleFunction으로 써야한다.
	
	//printDouble이라는 메소드의 매개변수로 ToDoubleFunction<Student>fun를 받았는데 이때의 함수를 입력해주는것에 따라 메소드에 들어가는 매개변수가 달라진다.
	static void printDouble(ToDoubleFunction<Student>fun) {
		double sum=0;
		for(Student dou:list) {
//			메소드에 입력해주는 함수의 결과에 따라 다른 값이 fun.applyAsDouble(dou)에 들어온다.
			sum+=fun.applyAsDouble(dou);
		}
		System.out.println(sum/list.size());
	}
	

	
	
	
	
	public static void main(String[] args) {
		
//		ToDoubleFunction<Student> fun=(t)->t.getEng();
		
//		System.out.println(fun.applyAsDouble(new Student("맹꽁이",13,97)));
		System.out.println("영어점수 평균");
		printDouble(t->t.getEng());
		System.out.println("컴퓨터점수 평균");
		printDouble(t->t.getCom());
		//영어평균
		//컴터 평균
		
	}

}
