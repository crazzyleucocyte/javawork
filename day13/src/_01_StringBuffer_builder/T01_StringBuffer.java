package _01_StringBuffer_builder;

public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1==sb2 ?"+(sb1==sb2));
		//equals를 오버라이딩하지 않음(주소가 같은가?)
		System.out.println("sb1.equals(sb2) ?"+(sb1.equals(sb2)));
		System.out.println("--------------------------------------------");
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("--------------------------------------------");
		
		System.out.println("s1==s2 ?"+(s1==s2));
		System.out.println("s1.equals(s2) ?"+(s1.equals(s2)));
		
		//equals는 안되어있고 toString은 오버라이딩 되어있음(오버라이딩 반환)
		//append 가장 뒤에 문자열 추가
		System.out.println("sb1="+sb1);
		sb1.append("def");
		System.out.println("sb1="+sb1);
		sb1.append(123);
		System.out.println("sb1="+sb1);
		sb1.append(true);
		System.out.println("sb1="+sb1);
		System.out.println("--------------------------------------------");
		
		//index 8번에 있는 문자 삭제
		sb1.deleteCharAt(8);
		System.out.println("sb1="+sb1);
		//index 6번부터 11번 앞 번호인 10번까지 삭제
		sb1.delete(6, 11);
		System.out.println("sb1="+sb1);
		System.out.println("--------------------------------------------");
		
		//index 1번자리에 해당 매개변수를 끼워넣어서 인덱스 1번자리에 인자가 들어간다
//		insert(int offset[얼만큼 떨어뜨려서], 문자열)
		sb1.insert(1, "java");
		System.out.println("sb1="+sb1);
		System.out.println("--------------------------------------------");
		
		sb1.replace(5, sb1.length(), "spring");
		System.out.println("sb1="+sb1);
		System.out.println("sb1.reverse()"+sb1.reverse());
		System.out.println("--------------------------------------------");
		
		//capacity(): StringBuffer의 객체가 생성될때 기본버퍼의 크기는 16Byte+생성자 메소드에 입력한 문자크기
		StringBuffer sb5 = new StringBuffer();
		StringBuffer sb6 = new StringBuffer("a");
		System.out.println("sb5의 버퍼크기 : "+sb5.capacity());
		System.out.println("sb6의 버퍼크기 : "+sb6.capacity());
		
		//생성자 메소드에 숫자를 입력하면 버퍼의 크기 지정 가능
		StringBuffer sb7 = new StringBuffer(32);
		System.out.println("sb7의 버퍼크기 : "+sb7.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
