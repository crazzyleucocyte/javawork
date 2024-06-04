package _05_supplier;

import java.util.function.*;

public class T01_supplier {

	public static void main(String[] args) {
		
//		반환값이 있는경우 인터페이스명에 해당 반환값의 자료형이 있어야 한다.
		
		//supplier 는 매개변수는 없고 반환값이 있는 경우
		//제네릭에는 아무 객체나 넣을 수 있다.
//		Supplier<String>sup = ()->{return (String)"aaa";};
		Supplier<String>sup = ()->"aaa";
		
		String str = sup.get();
		System.out.println(str);
		System.out.println(sup.get());
//-----------------------------------------------------------------------------
		//IntSupplier
		IntSupplier isup = ()->5;
		IntSupplier isup2 = ()->(int)(Math.random()*45)+1;
		
		System.out.println(isup.getAsInt());
		System.out.println(isup2.getAsInt());
//-----------------------------------------------------------------------------
		//DouSupplier
		DoubleSupplier dousup=()-> 5.5;
		System.out.println(dousup.getAsDouble());
//-----------------------------------------------------------------------------
		//BooleanSupplier
		BooleanSupplier boosup = ()-> false;
		System.out.println(boosup.getAsBoolean());
		
		
	}

}
