package programus;

import java.util.ArrayList;
import java.util.List;

public class 연습2 {
	public static void main(String[] args) {
//		int[] a = new int[10];
//		a[0]=5;
//		for(int i=0;i<10;i++) {
//		System.out.println(a[i]);
//		}
//		System.out.println(a);
		
//		int menu=(int)(Math.random()*2+1);
//		if(menu==1) {
//			System.out.println("돼지게티");
//			
//		}else {
//			System.out.println("크떡");
//		}
		
		
		String b ="abcdefg";
		String c []=b.split("");
		for(String d:c) {
			System.out.println(d);
		}
		System.out.println(12345%9);
		System.out.println((1+2+3+4+5)%9);
		char t ='1';
		System.out.println((int)t);
		System.out.println(b.substring(1));
		String d="1234";
		int e= Integer.parseInt(d);
		List<String> s = new ArrayList<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		String tst[] = s.toArray(new String[6]);
		System.out.println(tst);
		for(int i=0;i<tst.length;i++) {
		System.out.println(tst[i]);
		}
		System.out.println(0%3);
		
	}

}

