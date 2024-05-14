package _04_car;

import java.util.Scanner;

public class T01_main_car {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
		T01_api_car s2000=new T01_api_car();
		System.out.println(s2000.color);
		s2000.speedUp();
		
		s2000.engineOnOff();
		s2000.speedUp();
		s2000.speedUp();
		s2000.speedUp();
		s2000.speedDown();
		s2000.speedDown();
		s2000.speedDown();
		s2000.speedDown();
		s2000.colorModify();
		System.out.println(s2000.color);
	}

}
