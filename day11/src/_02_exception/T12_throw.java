package _02_exception;

public class T12_throw {

	public static void main(String[] args) {

		//throw와 throws가 있다.
		
		
		/*throws
		 * 예외 떠넘기기
		 * 메소드를 선언할떄 해당 메소드에서 날 수 있는 예외들을 적어두는 것
		 * ex)
		 * void method()throws Exception1, Exception2, ......{
		 * }
		 * 메소드를 호출하여 사용할 떄 발생할 수 잇는 예외를 명시해두고
		 * 그 메소드를 사용할 때에 예외에 대한 대시를 한드시 해줘야함
		 */
		
		
		/*throw
		 * 예외 발생시키기
		 * 새롭게 정의한 Exception은 catch가 알아서 처리하지 못해서
		 * 코딩을 다 짜고 테스트 할때 일부러 예외를 발생하도록 만든다
		 */
		
		//thorw:예외 강제 발생
		try {
			Exception e= new Exception("강제로 예외 발생 시킴");
			throw e;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass()  );
			System.out.println(e.getCause());
			//내가 사용자 정의로 exception을 사용 할때 사용함
		}
		
	}

}
