package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class To6_ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 1. 길이가 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		 * 2. 길이가 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		 * 3.가용자로 부터 입력받은 수 만큼 배열을 만들고 1~닙력받은 수를 차례대로 넣어 출력
		 * 4. 길이가 5인 배열에 사과, 귱, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용아여 귤 출력
		 * 5.문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */


		/*
		// 1.
		int arry[] = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = i + 1;
		}
		System.out.println(Arrays.toString(arry));


		// 2.
		for (int i = 0; i < arry.length; i++) {
			arry[i] = 10 - i;
		}
		System.out.println(Arrays.toString(arry));


		// 3.
		System.out.print("숫자를 입력해주세요 : ");
		int input = s.nextInt();
		int arry1[] = new int[input];
		for (int i = 0; i < arry1.length; i++) {
			arry1[i] = i + 1;
			System.out.print(arry1[i] + ", ");
		}

//			 4. 길이가 5인 배열에 사과, 귱, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용아여 귤 출력
		String fruit[]= {"사과","귤","포도","복숭아","참외"};
		for(int i =0;i<fruit.length;i++) {
			if(fruit[i].equals("귤")) System.out.println(fruit[i]);
		}

		// 5.문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력
		int sum=0;
		System.out.print("문자열을 입력해주세요.");
		String input1 = s.nextLine();

		char apple[]=new char[input1.length()];
		System.out.println("검색할 문자를 입력해주세요 :");

		char search = s.next().charAt(0);
		System.out.println(search+"가 존재하는 위치(인덱스) : ");

		for(int i=0;i<input1.length();i++) {
			apple[i]=input1.charAt(i);
			if(search == input1.charAt(i)) {

				System.out.println(i+", ");
				sum++;
			}
		}System.out.println(search +"의 개수 : "+sum);


//		ex)
//		   문자열 : application
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
//
//		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
//		   숫자와 같은 요일 출력

	     char week[]=new char[] {'월','화','수','목','금','토','일'};
	     System.out.print("0~6사이의 숫자를 입력해주세요 : ");
	     int day=s.nextInt();
	     for(int i =0;i<week.length;i++) {
	    	 if(i==day)  System.out.println(week[i]);
	     }
	     if(day<0||day>6) System.out.println("잘못 입력하셨습니다.");




//		   ex.
//		   0 ~ 6 사이 숫자 입력 : 4			
//		   금요일
//		   0 ~ 6 사이 숫자 입력 : 7
//		   잘못 입력하셨습니다.
//
//		7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
//		   배열 전체의 합 출력
		System.out.print("배열의 크기를 입력해주세요 : ");
		int inputArray = s.nextInt();
		int sum = 0;
		int arrayNum[] = new int[inputArray];
		for(int i =0;i<inputArray;i++) {
			arrayNum[i]=i+1;
			sum+=arrayNum[i];
		}System.out.println("배열의 합은 : "+sum);


		 */



		//		8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//		   다시 정수를 받도록 하세요. 
		System.out.print("3이상인 홀수 자연수를 입력하세요: ");
		int arrayNum=s.nextInt();
		if(arrayNum<3||(arrayNum %2)==0)System.out.println("다시 입력하세요.");
		System.out.println("input 값" + arrayNum);
		int score[]=new int[arrayNum];
		// 내림차순 정렬4
		for (int i = 0; i < arrayNum/2; i++) {
			score[i]=i+1;
			System.out.print(score[i]+", ");
		}
		for (int i = arrayNum/2; i < arrayNum; i++) {
//			       3                      7
			score[i]=7-i;
			System.out.print(score[i]+", ");
		}



		//		   ex.
		//		   정수 : 4
		//		   다시 입력하세요.
		//		   정수 : -6
		//		   다시 입력하세요.
		//		   정수 : 5
		//		   1, 2, 3, 2, 1
		//
		//		9. 사용자가 입력한 값이 배열에 있는지 검색하여
		//		   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//		   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		//		   ex.
		//		   치킨 이름을 입력하세요 : 양념			
		//		   양념치킨 배달 가능
		//
		//		   치킨 이름을 입력하세요 : 불닭
		//		   불닭치킨은 없는 메뉴입니다.
		//
		//		10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//		     1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//		     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		//
		//		     ex.
		//		     5 3 2 7 4 8 6 10 9 10 
		//		     최대값 : 10
		//		     최소값 : 2


	}

}
