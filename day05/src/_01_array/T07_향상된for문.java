package _01_array;

import java.util.Arrays;

public class T07_향상된for문 {

	public static void main(String[] args) {
		//향상된for문 배열에서만 사용가능
		//배열을 처음부터 끝까지 사용할때 사용한다 ex)몇개만 가져오시오 이런가 안됨
		
		int num[]= {1,2,3,4,5};
		
		for(int result:num){//초기식은 배열의 자료형과 똑같이
			//result변수에 num에 있는 인덱스들을 하나씩 덮어씌우면서 출력한다
	System.out.println(result);
		}
		System.out.println("------------------------------");
		String name[]= {"홍길동","아무개","김길동"};
		for(String result:name)
			System.out.println(result);
		
		//copy 하는 법
		//배열의 단점 : 배열의 크기가 넣을 값보다 크면 메모리 낭비
		//		  	배열의 크기가 적을 경우 나중에 늘릴수 없다
		// 배열의 크기가 너무 커도 안되고 너무 작아도 안된다
//		배열의 크기가 작을 경우 copy하여 만들어야 함
		int oldScore[] = new int[]{98,46,35,19,41};
		int newScore[]= new int[10];
		//배열의 크기가 부족할 경우 올드에 있는걸 뉴에 넣으시오
		
		for(int i=0;i<oldScore.length;i++) {
			newScore[i]=oldScore[i];
		}
		newScore[5]=57;
		System.out.println(Arrays.toString(newScore));
//라이브러리(api): System.arraycopy(컨트롤 c 배열,몇번부터 복사할것인가, 컨트롤 v배열,몇번부터 넣을것인가, 몇개를 넣을것인가)
		//위와 같은 일이 생길거를 방지해서library에 메소드를 만들어 놨다
		System.arraycopy(oldScore, 0, newScore, 6, 4);
//		System.arraycopy(oldScore, 1, newScore, 2, 3);//올드 1번쨰 인덱스부터 옮기고 뉴 2번부터 넣는데 3개만 넣을것이다
//		(옮기기 전 변수, 몇번 인덱스부터 옮길것인가,옮긴 후 변수 ,몇번부터 넣을 것인가 ,몇 개를 넣을 것인가)
		
		System.out.println(Arrays.toString(newScore));
		
		//3개를 넣을 수 있는 문자열 배열을 만들어서 값을 넣고
		//10개짜리 배열을 만들어서 복사하여 넣기(인덱스 5번부터 2개만 넣기)
		
		
		String home[]= {"벌써","집","가고 싶다",};
		String please[]=new String[10];
		System.arraycopy(home, 1, please, 5, 2);
		System.out.println(Arrays.toString(please));
		
		
		
		
		
		
		
	}
}
