package _04_car;

import java.util.Scanner;

public class T01_api_car {
//속성: 회사, 모델, 컬러, 스피드, 시동
//시동 켜고 끄기, 스피드 올리기(10씩), 스피드 내리기(10씩)
	
	String company="Honda";
	String model="s2000";
	String color="yelloe";
	int speed;
	boolean engStart;
	Scanner s = new Scanner(System.in);
	
	void engineOnOff() {
		engStart=!engStart;
		if(engStart)
			System.out.println("시동이 걸렸습니다.");
		else
			System.out.println("시동이 꺼졌습니다.");
	}
	void speedUp() {
		if(engStart) {
			speed+=10;
			System.out.println("현재 스피드는 : "+ speed+"입니다.");
		}else
		System.out.println("시동이 꺼져있습니다. 시동을 걸어주세요");
		
	}
	void speedDown() {
		if(engStart) {
			speed-=10;
			System.out.println("현재 스피드는 : "+ speed+"입니다.");
		}else
			System.out.println("시동이 꺼져있습니다. 시동을 걸어주세요");
	}
	String colorModify() {
		System.out.print("변경하실 모델 명을 입력해주세요 : ");
		String inputcolor=s.nextLine();
		color=inputcolor;
		return color;
	}
	
	
	
}
