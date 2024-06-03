package _02_Lamda;



//함수식 interface를 체크하는 어노테이션으로 메소드를 두 개 이상 만들경우 오류가 뜨도록 해준다
//추상 메소드가 1개 인지를 체크해준다
@FunctionalInterface
public interface MyOneArgument {
	void method(int x);
		
	
	
}
