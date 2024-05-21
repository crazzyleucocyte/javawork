package _02_abstract;

public class Crab extends Pet{

	
	
	public Crab() {
	}
	public Crab(String kind, String color, String feature) {
		super(kind,color,feature);
	}
	
	
//	Crab(String kind, String color){
//		this.kind=kind;
//		this.color=color;
//	}
	
	void sound() {
		System.out.println("울지 않습니다.");
	}
	void feature() {
		System.out.println("킹크랩은 맛있습니다.");
	}
	void info() {
		System.out.println("종류 : "+super.getKind());
	}
	
	
}
