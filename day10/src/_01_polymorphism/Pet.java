package _01_polymorphism;

public class Pet {
	/*속성
	
	kind//종류
	color//색상
	
	메소드
	생성자 : pet(kind,color)
	sound()//울음소리
	pattern()//특징
	getKind()//종류 게터 메소드
	getColor()//색생 게터 메소드
	toString(){종류: 포유류, 색상: 흰색}//오버라이딩
	info(){출력문} 종류: 포유류, 색상:흰색
	
	
	자식
	생성자 2개
	cat(){
	내꺼 생성자 호출
	super(kind, color)
	}
	cat(kind,color){}
	//오버라이딩
	 * sound()
	 * pattern()
	*/
	
	private String kind, color, feature;
	
	public Pet() {
		
	}
	
	public Pet(String kind, String color,String feature){
		this.kind=kind;
		this.color=color;
		this.feature=feature;
	}
	
	void sound()	{
		System.out.println("울음소리");
	}
	
	void feature() {
		System.out.println("특징");
	}
	
	String getKind() {
		return kind;
	}
	
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	
	String info() {
		return "종류 : "+kind+", 색상 : "+color+", 특징 : "+feature;
	}
	@Override
	public String toString() {
		return info();
	}
}
