/*package _01_langPackage;

class Point implements Cloneable{
	int x;
	int y;
	Point(){
		
	}
	
	Point(int x, int y){
		this.x = x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "x= "+x+", y= "+y;
	}
	
	@Override
	public Object clone() {
		//여기부터
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	//여기까지는 그냥 뭘 하든 클론을 할떄는 다 똑같이 쓴다
	}
}

public class T04_clone {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy=(Point)original.clone();//오브젝트 타입을 포인트 타입으로 형변환해줘야 한다
		Point p1 = new Point();
		
		
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original);
		System.out.println(copy);
		System.out.println(System.identityHashCode(copy));
		System.out.println(System.identityHashCode(original));
		System.out.println(p1);
		
		p1.x=10;
		p1.y=20;
		copy =(Point)p1.clone();
		System.out.println(p1);
		System.out.println(copy);
	}
}
*/