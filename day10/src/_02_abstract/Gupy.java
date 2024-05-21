package _02_abstract;

public class Gupy extends Pet{

	

	public Gupy() {
	}


	public Gupy(String kind, String color, String feature) {
		super(kind,color,feature);
	}
	void sound() {
		System.out.println("뽀글뽀글");
	}
	void feature() {
		System.out.println("무늬가 예쁩니다.");
	}
	void info() {
		System.out.println("특징 : "+super.getFeature());
	}
	
}
