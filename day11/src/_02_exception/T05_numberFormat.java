package _02_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		String[]str= {"23","17","3.141952"};
		int i=0;
		try {
			for(i = 0;i<str.length;i++){
				int num =Integer.parseInt(str[i]);
				System.out.println(num);
			}//실수를 정수형으로 표현하려고 해도, 문자열을 정수형으로 표현하려고 해도 NumberFormatException이 뜬다
		} catch (NumberFormatException e) {
			System.out.println(str[i]+"는 정수로 변결할 수 없음");
		}System.out.println(i);
	}

}
