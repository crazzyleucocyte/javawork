package part5;

public class BasicLion {
	int height;
	int weight;
	int age;
	boolean sex; // true: 남, false: 여

	int running(int x, int y) {
		int result = (age * x) - y;
		return result;
	}
	boolean fight(BasicLion x) {
		boolean result = true;
		if( height > x.height && weight > x.weight ) result=true;
		else result = false;
		return result;
		
	}
	boolean hunting() {
		if (age>20) return false;
		else return true;
	}
	String sleeping() {
		return "GO TO SLEEP!!!";
	}
	void printOut() {
		System.out.println("height : "+height);
		System.out.println("weught : "+weight);
		System.out.println("age : "+age);
		System.out.println("sex : "+(sex?"male":"female"));
		
	}


	public static void main(String[] args) {
		BasicLion a = new BasicLion();
		BasicLion b = new BasicLion();

		a.height = 160;
		a.weight =100;
		a.age =10;
		a.sex = true;
		
		b.height =130;
		b.weight = 90;
		b.age = 9;
		b.sex = false;
		
		System.out.println("[Lion A]");
		a.printOut();
		System.out.println("a.running = "+a.running(5, 20));
		System.out.println("a.hunting = "+a.hunting());
		
		System.out.println("[B Lion]");
		System.out.println("b.running = "+b.running(6, 30));
		System.out.println("b.hunting = "+b.hunting());
		System.out.println(a.sleeping());
		System.out.println(b.fight(a));
		
		boolean fight = b.fight(a);
		System.out.println("winner is~~~"+(fight?"b~~":"a~~"));
		
		System.out.println("a Lion : "+a.sleeping());
		System.out.println("b Lion : "+b.sleeping());
		
		a=b=null;
		System.gc();
		
		
		
	}

}
