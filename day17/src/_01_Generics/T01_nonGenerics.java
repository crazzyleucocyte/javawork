package _01_Generics;

class Box{
	private Object object;
	
	void set(Object object) {
		this.object=object;
	}

	public Object get() {
		return object;
	}
	
	
}
class Auction{ }


public class T01_nonGenerics {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		String name =(String)box.get();//object->String
		
		box.set(new Auction());
		Auction a =(Auction)box.get();//Object->auction
		
		
	}

}
