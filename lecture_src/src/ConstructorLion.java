
public class ConstructorLion {

	int height;
	int weight;
	int age;
	boolean sex;   // true:��, false:��
	
	public ConstructorLion() {  // ����Ʈ ������ �޼ҵ�
	}
	public ConstructorLion(int g, boolean s) {  // ����� ���� ������ �޼ҵ�
		height = weight = 0;
		age = g;
		sex = s;
	}
	public ConstructorLion(int h, int w, int g, boolean s) {  // ����� ���� ������ �޼ҵ�
		height = h;
		weight = w;
		age = g;
		sex = s;
	}
	
    int running(int x, int y) {		// �޸���
		int result = (age*x)-y;
		return result;
	}
	boolean fight(ConstructorLion x) {			// �ο��
		boolean result = true;
		if( height > x.height && weight > x.weight ) 
			 result = true;
		else result = false;
		return result;
	}
	boolean hunting() {				// ����ϱ�
		if( age > 20 ) return false;
		else return true;
	}
	String sleeping() {				// ���ڱ�
		return "Going to Sleep!!!";
	}
	void printOut() {
		System.out.println("height="+height);
		System.out.println("weight="+weight);
		System.out.println("age="+age);
		System.out.println("sex="+( sex ? "MAIL" : "FEMAIL"));
	}
	
	public static void main(String[] args) {

		ConstructorLion a = new ConstructorLion();
		ConstructorLion b = new ConstructorLion(10,true);
		ConstructorLion c = new ConstructorLion(190, 200, 7, false);
		
		/*
		a.height = 160;
		a.weight = 100;
		a.age = 10;
		a.sex = true;
		
		b.height = 130;
		b.weight = 90;
		b.age = 9;
		b.sex = false;
		*/
		System.out.println("[A Lion]");
		a.printOut();
	
		System.out.println("[B Lion]");
		b.printOut();

		System.out.println("[C Lion]");
		c.printOut();
		
		a = b = c = null;
		System.gc();
		
	}

}
