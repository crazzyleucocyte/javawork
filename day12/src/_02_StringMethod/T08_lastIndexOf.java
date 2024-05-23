package _02_StringMethod;

public class T08_lastIndexOf {

	public static void main(String[] args) {

		String str = "bcdeabcfghcba";
		
		
		//lastIndexOf는 오버로딩이 4개가 되어있다
		System.out.println(str.lastIndexOf('a'));//(char)
		System.out.println(str.lastIndexOf("abc"));//(String)
		System.out.println(str.lastIndexOf("bcdeabcfghcba", 1));//(String,int)
		//int값으로 입력하는 index는 해당 index를 기준으로 뒤에서 앞으로 문자를 검색한다.
		//검색할때 뒤에 있는 int값은 검색하려는 문자열의 첫번째 자리에 있는 문자를 기준으로 검색하기 때문에 검색하려는 문자열이 길어질 경우
		//주의해야한다
		//예시로 위의 lastIndexOf의 경우 검색하려는 문자열과 똑같은 문자를 검색할 경우 index번호에 어떤 수를 넣던지 0이 나온다
		System.out.println(str.lastIndexOf('a', 5));//(char,int)
		
		
	}

}
