package _05_Thread;

import java.awt.Toolkit;

public class T02_Thread {
	public static void main(String[] args) {

		//toolkit은 윈도우에서 나는 소리를 쓸 수 있도록 만들어준것
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0;i<5;i++) {
			try {
			Thread.sleep(1000);
			toolkit.beep();
			System.out.println(i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}






		}
	}



}
