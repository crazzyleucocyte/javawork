package _04_consumerLamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

//기존에 자바에서 만들어둥 인터페이스를 사용할것이기 때문에 인터페이스를 따로 만들 필요가 없다.

public class T01_consumer {

	
	
	
	
	
	public static void main(String[] args) {
		//컨슈머 : 매개변수 있고 리턴값이 없음
		/*컨슈머의 원형 : 미리 구현되어있음
		 * @FunctionalInterface
		 * public interface Consumer<T>{
		 * 		void accept(T t);
		 * }
		 */
		
		//Consumer Interface : 리턴값 없음
		// 1. 매개변수 1개인경우 매개변수의 괄호 생략 가능
		//컨슈머에 제네릭은 입력값의 자료형 변수명 컨슈머에 람다식으로 메소드를 지정하고 
		Consumer<String> consumer = x->System.out.println(x);	
		
		//메소드를 호출하여 사용한다.
		consumer.accept("java");
		
//		2. BiConsumer : 매개변수 2개
		BiConsumer<String, Integer>biconsumer = (x,y)-> System.out.println(x+" "+y+"일 입니다.");
		biconsumer.accept("오늘은 ", 3);
		
//		3. DoubleConsumer : 매개변수 1개 Double형인경우 //제네릭이 없다.
		DoubleConsumer doucon = d->System.out.println(d);
		doucon.accept(3.555);
		
//		4. ObjIntConsumer : 매개변수 두 개 중 한개는 모든 객체, 한개는 int형
//		제네릭에는 내가 만든 객체나 다른 wrapper클래스가 들어갈 수 있다.
		ObjIntConsumer <String> oiCon =(x,y)-> System.out.println(x+" "+y+"일 입니다.");
		oiCon.accept("오늘은 ", 3);
		
		
		
		
		
		
	}

}
