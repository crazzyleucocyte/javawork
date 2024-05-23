package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {
		
		//substring(index: int x):x번째 부터 반환 
		//substring(index: int x, lastIndex: int y):x번째 부터 y번쨰까지 반환 
		String str = "spring aws8 start";
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,10));
		
		
	}

}
