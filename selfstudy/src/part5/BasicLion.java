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
		if(height>x.height&&weight>x.weight) result=true;
		else result = false;
		return result;
		
	}

	public static void main(String[] args) {
		BasicLion a = new BasicLion();
		BasicLion b = new BasicLion();

		a.height = 100;

	}

}
