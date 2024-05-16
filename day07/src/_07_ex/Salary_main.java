package _07_ex;

public class Salary_main {

	public static void main(String[] args) {

		Salary hong = new Salary("홍길동","영업부","부장",25,"남",2500000,"010-1234-5678","서울시 강남구",10);
		hong.PrintOut();
//		
		Salary jang = new Salary("장범준","가수","팀장",34,"남",39000000,"010-6987-4514","서울시 강동구",8);
		jang.PrintOut();
		
		System.out.println("홍씨의 올해 보너스는 : " +hong.Bounus()+"입니다.");
	}

}
