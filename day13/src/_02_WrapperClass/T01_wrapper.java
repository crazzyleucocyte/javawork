package _02_WrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {
		
		//deprecated : 앞으로 없어질 가능성이 있는 것
		Integer iiii = new Integer(3);//가운데 줄이 그어지면 사라질것이니 사용하지 말라는 뜻
		Integer i = Integer.valueOf(3);//위에처럼 말고 아래꺼로 사용하시오 객체를 생성하지 않고 사용하니 이건 static메소드이다
		Integer i2 = Integer.valueOf(100);
		
		/*a.compareTo(b) :
		 * 0: 비교해서 같으면 0
		 * 1: 문자열이면 사전순의 반대(숫자도 같음)
		 * -1: 문자열의 사전순일때
		 *  한자리 한자리 비교한다
		 */
		System.out.println(i.compareTo(i2));
		
		int result =i;
		String result2 = i.toString();
		System.out.println("result = "+ (result+3));
		System.out.println("result = "+ result2+3);
		System.out.println("--------------------------------------------");
		
		System.out.println("MAX_VALUE : "+ Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : "+ Integer.MAX_VALUE);
		System.out.println("size : "+ Integer.SIZE+"bit");
		System.out.println("Bytes : "+ Integer.BYTES+"byte");
		System.out.println("type : ("+ Integer.TYPE+")type");
		
		
		
		
	}

}
