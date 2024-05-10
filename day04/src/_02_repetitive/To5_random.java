package _02_repetitive;

public class To5_random {

	public static void main(String[] args) {
		//Math클래스(수학에 관련된 클래스)
		double random1 = Math.random();//double형으로 출력
		System.out.println(random1); //실수형 : 0~0.999999999999
		System.out.println("-------------------------------");
		//1 이상을 출력하고 싶을때는 10을 곱해준다
		random1 = Math.random()*10;
		System.out.println(random1);
		
		int random2 = (int)random1;
		System.out.println(random2);//(0~9)정수 값을 출력하고 싶으면 (int)로 형변환을 하면 된다
		
		int random3 = (int)random1 +1;//0~9 값에 +1을 해줘서 1~10의 값이 나온다
		System.out.println(random3);
		//0~4
		//0~4의 값을 받고 싶을 경우 두 가지 방법이 있다 하나는 /2 하나는ㄴ *5
		//0~0.99999*5=0~4.99999
		System.out.println("-------------------------");
		
		
		int random4 = (int)(Math.random()*5);
		//(int)Math.random()*5일 경우 모두 0이 나오니 ()를 해줘야 한다
		System.out.println(random4); 
		
		int random5 = random4+1;//1~5
		
		
		
		
		
		
		
		
		
		
		
	}

}
