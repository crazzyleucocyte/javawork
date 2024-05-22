package _04_Ex;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Ex_api ex = new Ex_api();
		try {
			ex.inputNum();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
