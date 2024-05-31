package _01_Generics;

import java.util.ArrayList;

class Fruit{

	@Override
	public String toString() {
		return "Fruit";
	}
	
}
class Apple extends Fruit{
	
	@Override
	public String toString(){
		return "Fruit";
	}
}
class Banana extends Fruit{

	@Override
	public String toString() {
		return "Banana";
	}
	
}
class Tjoeun{
	
	@Override
	public String toString() {
		return "tjeoun";
	}
	
}
class Box2<T>{
	ArrayList <T> list = new ArrayList();
	
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	
}

public class T03_GenericsExtneds {

	public static void main(String[] args) {
		Box2<Fruit> fruitBox = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> tjeounBox = new Box2<>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Banana());
		fruitBox.add(new Apple());
//		fruitBox.add(new Tjeoun());//상속받지 않아서 불가능하다
		
		appleBox.add(new Apple());
//		appleBox.add(new Fruit()); //자식 객체에 부모 제네릭을 넣을 수는 없고 넣으려면 super를 써야한다
		tjeounBox.add(new Tjoeun());
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjeounBox);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
