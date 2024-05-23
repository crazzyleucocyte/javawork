package _01_langPackage;

public class T02_hashcode {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = str1;//원래 객체의 해시코드도 같다고 나온다

		//String 클래스는 equals, hasgCode를 오버라이딩 해놓은 상태
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());//이건 오버라이딩 한거
		System.out.println(str2.hashCode());
		
		//이게 원래 객체의 해시코드(고유)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str2));
		//str1.hashCode()의 값과 System.identityHashCode(str1)의 값이 다르다
		
	}

}
