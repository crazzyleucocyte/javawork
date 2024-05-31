package _02_MultiGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		//product타입의 객체 p1에 들어갈 수 있는 자료형은 Tv와 String 두개 뿐이다.
		Product<Tv,String> p1 =new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("smart TV");
		
		Tv kind=p1.getKind();
		String model=p1.getModel();
		
		System.out.println("제품명 : "+ kind+" / 모델명 : "+model);
		
		Product <Car,Integer>p2=new Product<>();
		
		//p2의 setKind에는 Car만 들어갈 수 있다.
		p2.setKind(new Car());
		p2.setModel(2024);
		
		Car kindCar = p2.getKind();
		int modelCar = p2.getModel();
		
		System.out.println("제품명 : "+ kindCar+" / 모델명 : "+modelCar+"년형 SUV");
		
		
		
		
		
	}

}
