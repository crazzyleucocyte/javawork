package _01_Ocject;

public class T01_main_class {

	public static void main(String[] args) {

		T01_api_Class ob1 = new T01_api_Class();
		int result = ob1.num;
		System.out.println(result);
		System.out.println(ob1.name);
		System.out.println(ob1.num);
		
		ob1.name="강민석";
		System.out.println(ob1.name);
		
		T02_api_class me = new T02_api_class();
		System.out.println("주소 : "+me.adress);
		System.out.println(me.age+" 살");
		me.adress="경기도 의왕시";
		System.out.println("주소 : "+me.adress);
		
	}

}
