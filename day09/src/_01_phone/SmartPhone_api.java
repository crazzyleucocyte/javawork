package _01_phone;

public class SmartPhone_api extends Phone_api {
	//extends를 직접 쓰지 않아도 클래스 만드는 창에서 superclass를 object에서 다른걸로 바꾸면 클래스 파일을 만들면서 상속이 가능하다
	//폰 클래스에서 폰 객체를 생성햇더니 오류가 났다
	//부모의 생성자 메소드에 매개변수가 있을 경우 자식 클래스에도 생성자 메소드에도 매개변수가 있어야 한다.
	
	String search;
	
	//부모의 생성자에 매개변수가 있으면 자식도 반드시 생성자가 있아야 하고 
	//부모 생성자의 인자값을 넘겨줘야함
	//이유: 자식의 객체를 생성하면 부모의 객체도 생성됨
	
	//인강에서 super에 대한 조건이 있는 표가 이 내용인듯
	SmartPhone_api(String model, String color){
		super(model,color);
	}
	
	String search(String search) {
		this.search=search;
		return this.search+"를 검색합니다.";
	}
	
	
	
	
	

}
