package _02_exception;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class T06_classCast__이해안됨 {
	
	public static void main(String[] args) {//main도 클래스 안에 있는 메소드이기 때문에 main밖에도 메소드를 만들 수 있다.
		/*
		try {
		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal aniDog = dog;
		Animal aniCat = cat;

		dog =(Dog)aniDog;
		dog = (Dog)ani;
		//위 두개는 인스턴스 오브(객체가 해당 자료형으로 만들어졌나?)로 할 수 있다
		
		if(ani instanceof Dog) {
			dog=(Dog)ani;
		}else {
			System.out.println("변경 불가");
		}
		
		} catch (ClassCatchException e) {
			System.out.println("부모 타입을 자식의 타입으로 형변환 할 수 없다");
		}
		*/
//		
		
//		T06_classCast t = new T06_classCast();
		Dog dog = new Dog();
//		Dog d = change(dog);
		Animal ani = new Animal();
		change(new Dog());
		change(dog);
		change(ani);
		ani= dog;
		change(ani);
//		if((change(dog))==null)	{
//			System.out.println("변환 불가");
//		}else {
//			dog = change(dog);
//			System.out.println("2135");
//		}
	}
		public static Dog change(Animal animal/*여기에 dog를 입력하면 Animal animal=new Dog();가 된다*/) {
			//static이 없으니 객체를 생성하고 써야 하는데 이 메소드가 포함되어있는 클래스는 퍼블릭T06_classCast이므로 해당 객체를 생성해야 한다
			//static이 있으면 객체 생성 없이 T06_classCast.change로 쓴다.
			Dog dog=null;
			if(animal instanceof Dog) {
			dog = (Dog)animal;
			System.out.println("변경");
			}else {
				System.out.println("변경 불가");
			}
			return dog;
		}//Animal animal자리에 입력하는 변수의 객체가 무엇인가가 중요한거다
		//애니멀이면 변환 불가 dog면 변환 가능
	
	

}
