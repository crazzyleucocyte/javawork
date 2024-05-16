package _06_static;

public class T01_main_static {

	public static void main(String[] args) {

		T01_api_static as1 = new T01_api_static();
		T01_api_static as2 = new T01_api_static();
		
		as1.num=1000;
		System.out.println("as1.Num : "+as1.num);
		System.out.println("as2.Num : "+as2.num);
		
		as1.sNum = 20000;
		System.out.println("as1.sNum : "+as1.sNum);
		T01_api_static.sNum=20;
		System.out.println("as2.sNum : "+as2.sNum);
		
		
		
	}

}
