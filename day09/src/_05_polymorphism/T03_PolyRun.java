package _05_polymorphism;


	class Car{
		String color;
		int speed;
		void drive()	{
			System.out.println("운전중 빵빵!!!!");
		}
		void stop() {
			System.out.println("stop!!!!!");
		}
		
	}
	class FireCar extends Car{
		void water() {
			System.out.println("물을 뿌립니다!~~~~");
		}
		void stop() {
			System.out.println("stop!");
		}
	}
	public class T03_PolyRun {
	
	public static void main(String[] args) {

		//자식에 자식을 넣음
		FireCar fCar =new FireCar();//자식 객체를 생성해서 부모와 자식 클래스 두개가 생성되어잇음
		fCar.water();
		fCar.drive();
		fCar.stop();
		Car a = new Car();
		a.stop();
		//부모에 자식을 넣음
		Car car = fCar;
		//fCar는 이미 객체가 생성되어 주소를 나타내는데 그 주소를 car에 넣는다
		//그래서 fcar와 car 총 두 개의 변수가 생겼고 두 변수의 주소는 같다
		car.stop();//
		car.drive();
//		car.water(); 오류
		
		//자식에 부모를 넣음
		FireCar fCar2 = (FireCar)car;//큰거에서 작을거 갈때 강제 형변환
		/*
		 * 위의 코드 뜻은 Car car = fCar;에서 자식 클래스를 사용하지 못하게 되었는데
		 * 이거를 fCar2를 새로 만들어서 car를 자식의 클래스로 형변환을 해서 대입을 해준것인데
		 * 이때 3개의 변수 car,fCar,fCar2의 주소는 모두 같다
		 * 주의 *
		 * 반드시 부모는 최초 객체 생성시 자식의 타입으로 객체가 생성되어있어야 한다
		 */
		
		Car car2 = new Car();//부모클래스 생성
//		FireCar fCar3= (FireCar)car2; //자식 클래스에 부모 객체를 형 변환해서 넣었다
		//위 코드는 class cast 오류가 났는데 뜻은 클래스를 형변환 할 수 없다는 뜻이다.
		//이 오류는 컴파일을 해야만 알 수 있는 오류로 빨간색으로 밑줄이 그어지지 않는다
		//오류가 난 이유는 부모 클래스를 생성할때는 자식 객체가 생성되지 않는데 이 상태에서 형변환을 하면 
		//해당 주소에 자식 클래스가 없기 떄문에 오류가 나는 것이다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
