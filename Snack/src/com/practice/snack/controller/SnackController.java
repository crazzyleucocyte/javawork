package com.practice.snack.controller;

import com.practice.snack.model.vo.*;

public class SnackController  {
	//import 해서 상속을 안해도 된다 

	private static Snack menu = new Snack();
	
	 public SnackController(){
		
	}
	 public String SaveData(String kind,String name, String flavor, int numOf,int price) {
		 menu.setKind(kind);
		 menu.setName(name);
		 menu.setFlavor(flavor);
		 menu.setNumOf(numOf);
		 menu.setPrice(price);
		 return "저장이 완료 되었습니다.";		 
	 }
	public String confirmData() {
		 return menu.information();
	 }
	 
}















//		 super(kind,name,flavor,numOf,price);