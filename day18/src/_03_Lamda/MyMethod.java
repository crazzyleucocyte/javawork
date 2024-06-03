package _03_Lamda;

@FunctionalInterface
public interface MyMethod {
	//이런 인터페이스를 쓸떄 없이 일부러 만들 필요 없이 이미 만들어져있는걸 쓰면 된다
	
	int method(int x, int y);
}
