package _02_exception;

public class T01_Exeption {

	public static void main(String[] args) {

		try {//예외가 나올 수 있는 프로그램
			int a=5/0;
			System.out.println(a);
			// 5/0이 오류가 떠서 뒤 코드는 실행되지 않고 catch로 가서 a는 출력되지 않았다
			int b = 5/2;
			System.out.println(b);
		}catch(Exception e) {//가장 상위가 Exception이니깐 위의 코드는 모든 에러를 인식한다
			//예외가 발생했을때 수행
			//e에는 발생에 대한 메시지가 들어간다
			System.out.println("오류");
		}
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			// TODO: handle exception
		}
		System.out.println(6);
		
	}

}
