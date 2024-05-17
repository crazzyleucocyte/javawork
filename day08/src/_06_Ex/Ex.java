package _06_Ex;

public class Ex {

	public static void main(String[] args) {
		
		Exercise ex1=Exercise.getInstance();
		Exercise ex2=Exercise.getInstance();
		
		System.out.println("ex1==ex2"+(ex1==ex2));
		
		
	}

}

//싱글톤
class Exercise {
	private static Exercise ex1 = new Exercise();
	
	private Exercise(){
		System.out.println("객체 생성");
	}
	
	static Exercise getInstance() {
		return ex1;
	}
	
	
	
}


