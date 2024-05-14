package _02_method;

public class To1_main_method {

	public static void main(String[] args) {
		
		T01_api_method ob1 = new T01_api_method();
		
		ob1.printOut();
		ob1.print2();  //int에 10이 들어옴
		int result = ob1.print2();
		
		System.out.println(result);// sout도 출력 되고 ,반환값인 10도 출력된다
		System.out.println(ob1.print2());
		
		System.out.println(ob1.print3());
		
		ob1.print4(5);
		
		int re2 =ob1.print5(7, 8);
		System.out.println(re2);
	
		ob1.print6("더조은", 100);
		
		T02_api_method ob3 = new T02_api_method();
		
		System.out.println(ob3.plus(2, 5));
		System.out.println(ob3.minus(9, 5));
		System.out.println(ob3.multiply(5, 6));
		System.out.println(ob3.divide(10, 5));
		
	}

}
