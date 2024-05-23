package _02_StringMethod;

public class T01_indexOf {

	public static void main(String[] args) {
		
		//indexOf :
		String str="java program";
		int index = str.indexOf("program");
		System.out.println(index);
		
		index = str.indexOf("abc");
		System.out.println(index);
		
		if(str.indexOf("java")<0)System.out.println("존재하지 않음");
		else System.out.println(str.indexOf("java")+"번째에 존재합니다.");
		
		
	}

}
