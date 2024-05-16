package _02_constructor;

public class T01_api_tv {

	String company;
	String model;
	int channel;
	
//	//생성자
//	T01_api_tv(){
//		System.out.println("기본 생성자");
//	}
	//매개변수가 1개인 생성자
	
	T01_api_tv(String company){
		this.company=company;
	}
	
	//매개변수가 3개인 생성자
	T01_api_tv(String company, String model, int channel){
		this.company = company;
		this.model = model;
		this.channel = channel;
	}
	
	
	
	
}
