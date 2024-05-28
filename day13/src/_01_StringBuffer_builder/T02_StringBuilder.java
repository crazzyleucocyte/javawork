package _01_StringBuffer_builder;

public class T02_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb);
		
		sb.insert(4, "2");
		System.out.println(sb);
		
		sb.setCharAt(4, '7');
		System.out.println(sb);

		/*
		 * String(불변성) : 한번 객체가 생성되면 더ㅠ어쓰기가 안됨(무조건 새로 생성)
		 * 			자주 변하지 않는 문자열을 사용할때(혹은 변경이 별로 없는 문자열일떄)
		 * 
		 * StringBuffer(가변성): 추가, 삭제, 수정을 할수 있다. 동기화를 지원(멀티스레드 일때 사용)
		 * 					   자주 변경되는 문자열을 사용할때, 멀티쓰레드 일떄 사용
	
		 * StringBuilder(가변성): 추가, 삭제, 수정을 할수 있다. 동기화를 지원하지 않음
		 * 					   자주 변경되는 문자열을 사용할때, 단일쓰레드 일떄 사용
		 * 					   StringBUffer보다 빠름
		 */
		
		
		
		
	}

}
