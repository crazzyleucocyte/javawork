package part5;

public class ConstructorLion {
	
	int height;
	int weight;
	int age;
	boolean sex; //true: 남, false: 여  //멤버 변수
	
	public ConstructorLion() {   //디폴트 생성자 메소드
		
	}
	public ConstructorLion(int g, boolean s) {  //사용자 정의 생성자 메소드
		height =weight = 0;
		age = g;
		sex = s;		
	}
	public ConstructorLion(int h, int w, int g, boolean s) {
		height = h;
		weight = w;
		age = g;
		sex =s;		
	}
	
	int running(int x, int y) {
		int result = (age * x) - y;
		return result;
	}
	boolean fight(ConstructorLion x) {
		boolean result = true;
		if( height > x.height && weight > x.weight ) result=true;
		else result = false;
		return result;
	}
	boolean hunting() {
		if(age>20) return true;
		else return false;
	}
	String sleeping() {
		return "GO TO SLEEP!!!";
	}
	void printOut() {
		System.out.println("height : "+height);
		System.out.println("weight : "+weight);
		System.out.println("age : "+age);
		System.out.println("sex : "+(sex?"Male":"Female"));
	}
	
	
	
	public static void main(String[] args) {
		ConstructorLion a = new ConstructorLion();
		ConstructorLion b = new ConstructorLion(10, true);
		ConstructorLion c = new ConstructorLion(190, 200, 7, false);
		
		/*//아래 처럼 일일이 하나씩 대입해야 했던것을 위의 생성자 메소드로 간단하게 대입할 수 있다
		a.height = 160;
		a.weight =100;
		a.age =10;
		a.sex = true;
		
		b.height =130;
		b.weight = 90;
		b.age = 9;
		b.sex = false;
		*/
		
		//아래의 printout 메소드를 사용하면 역시 일일이 아래처럼 입력해야 했던것을 간단히 출력 할 수 있다
		System.out.println("[A Lion]\nheight : "+a.height+""
				+ "\nweight : "+a.weight+
				"\nweight : "+a.weight+
				"\nsex : "+a.sex);
		
		System.out.println("[A Lion]");
		a.printOut();
		System.out.println("[B Lion]");
		b.printOut();
		System.out.println("[C Lion]");
		c.printOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
