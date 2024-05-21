package _02_abstract;

//추상 클래스 : 클래스 앞에 abstract키워드 사용
//추상 메서드가 1개 이상 포함되어 있으면 반드시 추상클래스로 해야한다.

abstract public class Pet {
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
	//추상 메서드
	abstract void sound();	
	//상속 받는 곳에서 반드시 구현해야함
	
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
	
	abstract void info();
	@Override
	public String toString() {
		return "fgdg";
	}
}
