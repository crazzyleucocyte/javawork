package _02_exception;

public class T09_tryCatchFinally {

	public static void main(String[] args) {
		/*
		try {

		}catch() {

		}finally {
			// 예외와 상관 없이 항상 실행
			 * try나 catch에 return이 있으면 메소드가 끝나지만 finally는 실행된다.

		}
		 */
		try {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[4]);
			return;//이 리턴이 실행되면 해당 메소드가 끝나게 되는데 이 경우 main이 끝난다
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를ㅁ 넘어섬");
		}finally {
			System.out.println("프로그램 종료");//finally는 리턴이 있어도 실행 된다
		}
		System.out.println("ㅈㅎㅈㄷㅅㅎ");
	}

}
