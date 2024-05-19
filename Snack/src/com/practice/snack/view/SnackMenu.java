package com.practice.snack.view;

import java.util.Scanner;

import com.practice.snack.controller.SnackController;

public class SnackMenu  {
	
	SnackController src=new SnackController();
	
	Scanner s=new Scanner(System.in);
//	SnackController con =new SnackController();
	
	public void main() {
		System.out.println("스낵류를 입력해주세요.");
		System.out.print("종류 : ");
		String kind=s.next();

		System.out.print("이름 : ");
		String name=s.next();
		
		System.out.print("맛 : ");
		String flavor=s.next();
		
		System.out.print("개수 : ");
		int numOf=s.nextInt();
		
		System.out.print("가격 : ");
		int price=s.nextInt();
		
		System.out.println(src.SaveData(kind, name,flavor,numOf,price));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(Y/N)");
		char yoOrn=s.next().charAt(0);		
		if(yoOrn=='y'||yoOrn=='Y')	System.out.println(src.confirmData());
	}
	
	
	
}
