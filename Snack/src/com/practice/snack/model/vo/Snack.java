package com.practice.snack.model.vo;

import  _04_ex01.T01_api_book;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	// snack()	,snack(info	),information(),getter, setter
	
	
	public Snack() {
		
	}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numOf=numOf;
		this.price=price;
	}
	
	public String information() {
		return kind+"("+name+" - "+flavor+") "+numOf+"개  "+ price+"원";
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setFlavor(String flavor) {
		this.flavor=flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf=numOf;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	
	
	
	
	
	
}
