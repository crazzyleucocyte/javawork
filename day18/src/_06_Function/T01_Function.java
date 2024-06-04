package _06_Function;

import java.util.*;
import java.util.function.*;

public class T01_Function {
	
//	function은 매개변수와 반환값이 모두 있는 람다식의 인터페이스이다.
	static List<Student>list = Arrays.asList(
			new Student("홍길동",79,85),
			new Student("김수한무",24,36)
			);
	//출력 메소드
	//Function<Student, String>function에서 앞에 스튜던트는 매개변수 스트링은 반환형이다.
//	아래의 메소드는 람다식을 매개변수로 받은 메소드이다.
	static void printString(Function<Student, String>function) {
		for(Student student: list) {
			System.out.println(function.apply(student)+" ");
		}
	}
//	printInt도 인터페이스이다.
//	출력을 위해 printint의 매개변수로 function 인터페이스를 이용하여 받은 후 리스트니깐 for문을 돌려서 출력 내용 작성
	static void printInt(ToIntFunction<Student>function) {
		for(Student student: list) {
//			매개변수로 받은 student의 점수를 호출하기 위해 function.applyasInt()를 쓰고 list를 for문으로 돌면서 객체 하나하나를 function.applyasInt()괄호 안에 넣어서 출력한다.
			System.out.println(function.applyAsInt(student)+" ");
		}
	}
	
	public static void main(String[] args) {
		//리스트에 있는 모든 학생 이름 출력
		System.out.println("[학생 이름]");
		printString(t->t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t->t.getEng());
		
		System.out.println("[컴터 점수]");
		printInt(t->t.getCom());
		
	}

}
