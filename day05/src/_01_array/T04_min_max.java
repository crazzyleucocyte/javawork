package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {

		// 자리바꿈 num2에는 10을 num2는 20을 바꾸고 싶을때
		int num1 = 10;
		int num2 = 20;

//		num1=num2;
//		num2=num1; //자리바꿈 안됨
		// 그래서 변수 하나를 만들어서 자리 바꿈을 한다

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1 + "," + num2);

		// 1차원 배열의 min값과max값 가져오기
		int[] score = { 8, 4, 9, 2, 6, 1, 3, 5, 7 };

		int min = score[0];// 8이지만 두번쨰인 4와 비교해서 더 작을 경우 0번째에 4를 넣어서 자리 바꿈을 한다
//		이렇게 마지막 7까지 하면 가장 작은 1이 0번째로 온다

		// 내림차순 정렬
		for (int d = 0; d < score.length; d++) {
			for (int i = d; i < score.length; i++) {
				if (score[d] > score[i]) {
					temp = score[d];
					score[d] = score[i];
					score[i] = temp;
				}
			}
		}
		System.out.println(score[0]);
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println("\n최솟값 : " + score[0] + ", 최댓값 : " + score[score.length - 1]);
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (min > score[i])
				min = score[i];
			if (max < score[i])
				max = score[i];
		}System.out.println("최솟값: "+min);
		System.out.println("최댓값: "+max);

		int k =2;
		System.out.println(score[k]);
		System.out.println(score[k+5]);
		System.out.println(score[k*3]);
		System.out.println(score[k-1]);
		
		int arri[] = new int[10];
		for(int i = 0;i<arri.length;i++) {
			arri[i]=(int)(Math.random()*10); //0~9까지 출력
		}
		for (int i = 0;i<arri.length;i++) {
			System.out.print(arri[i]+",");
			
		}//위의 랜덤으로 배열을 지정하는 코드를 아래의 Arrays로 대체 가능하다
		
		System.out.print("\n"+Arrays.toString(arri));//for 문을 쓰지 않아도 랜덤 추출이 가능
		
		for (int d = 0; d < arri.length; d++) {
			for (int i = d; i < arri.length; i++) {
				if (arri[d] > arri[i]) {
					temp = arri[d];
					arri[d] = arri[i];
					arri[i] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arri.length; i++) {
			System.out.print(arri[i] + ", ");
		}
		
		
		
		
	}

}
