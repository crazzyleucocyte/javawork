package _02_StringMethod;

public class T05_contain {

	public static void main(String[] args) {
		//contain : 문자열 아넹 찾고자하는 문자열이 포함되어 있는지 검사
		String str = "JSP 웹 프로그래밍";
		boolean result = str.contains("웹");
		System.out.println(result);
		System.out.println(str.contains("d"));
		
		if(str.contains("웹"))
			System.out.println("웹페이지를 만드는 프로그램");
		else
			System.out.println("기타 프로그램");
	}

}
