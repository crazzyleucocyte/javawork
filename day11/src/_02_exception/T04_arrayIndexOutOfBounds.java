package _02_exception;

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		try {

			String str[]= {"abc","def","ghi"};
			str[3]="kim";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류");
			e.printStackTrace();//오류 메시지 출력
			System.out.println();
			System.out.println(e);
		}


	}

}
