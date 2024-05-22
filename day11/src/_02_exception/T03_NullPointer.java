package _02_exception;

public class T03_NullPointer {

	public static void main(String[] args) {
		//null이 있어서 가지고 올 수 없는 경우
		try {
			
		String data = null;
		System.out.println(data.toString());
		} catch (NullPointerException exnull) {
			System.out.println("데이터가 들어있지 않습니다.");
			System.out.println("메시지 : "+exnull);
			}
		
		
	}

}
