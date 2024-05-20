package _02_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar ambul=new AmbulanceCar("현대","스타랙스",150);
		
		ambul.powerOnOff();
		System.out.println(ambul.information());
		System.out.println("속도를 올립니다. 시속"+ambul.SpeedUp(160)+"km/h");
		ambul.emergency();
		ambul.sirenOff();
		ambul.sirenOn();
		System.out.println(ambul.ambulanceStatus());
		ambul.sirenOn();
		ambul.powerOnOff();
		System.out.println("\n"+ambul.ambulanceStatus());
		
		
		
		
	}

}
