package _03_Lsp;

class Cat {
	void speak() {
		System.out.println("야옹");
	}
}
class WhiteCat extends Cat{
	String color = "white";
	@Override
	void speak() {
		System.out.println("white meow");
	}
}
	class BlackCat extends Cat{
		String color = "white";
//		@Override
		void speak2() {
			System.out.println("Black meow");
		}
		
}


public class CatRun {

	public static void main(String[] args) {

		Cat cat = new WhiteCat();
		cat.speak();
		
		WhiteCat whiteCat = (WhiteCat)cat;
		whiteCat.speak();
		
		Cat catb=new BlackCat();
		catb.speak();
		
		BlackCat blackCat = (BlackCat)catb;
		blackCat.speak2();
		
		
	}

}
