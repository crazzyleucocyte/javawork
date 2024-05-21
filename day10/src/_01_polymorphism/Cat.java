package _01_polymorphism;

public class Cat extends Pet{

	
	public Cat() {
		
	}
	public Cat(String kind, String color, String feature) {
		super(kind,color,feature);
	}
	
	
	
	
	void sound() {
		System.out.println("야옹");
	}
	void feature() {
		System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어다닙니다.");
	}
	
	
	
	
	
	
	
	
}
