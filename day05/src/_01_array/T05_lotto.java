package _01_array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {

		// p.122
		//성공
		// 1. 6개의 1차원 배열
		// 2. 1~45 숫자를 랜덤으로 추출해서 배열에 넣기
		// 3. 배열에 들어있는 값과 랜덤 추출한 값이 같은가 비교
		// 4. 다르면 배열에 넣기, 같은값이면 다시 랜덤 추출
		int lotto1[] = new int[6];
		int temp1 = 0;
		boolean check=false;
		while (lotto1[lotto1.length-1]==0) { // i는 6개의 번호 중 순서
			check=false;

			int num = (int) (Math.random() * 45) + 1; // 번호 추출
			System.out.println(num);

			for (int d = 0; d < lotto1.length; d++) { // 뽑은 번호가 이미 있는지 확인
				if (lotto1[d] == num) 
					check = true;
				break;//같은 수가 나왔을 경우 break를 안하고 나머지 배열을 돌려도 되지만 break를 넣어서 끝내주는게 빨리 끝난다
			}
			if(check) continue;
			lotto1[temp1]=num;
			temp1++;
		}
		System.out.println(Arrays.toString(lotto1));
		/*

		int lotto[] = new int[6];
		int index = 0;//뽑은 숫자가 커질 수록 비교해야 하는 숫자는 0부터 늘어난다
		while (lotto[lotto.length-1]==0) {
			int temp = (int) (Math.random() * 45) + 1;
			boolean insert = true;
			for (int i = 0; i <= index; i++) {
			//처음 뽑을떄는 숫자 하나만 뽑아서 비교해야할 숫자도 하나지만 
			//뽑은 숫자가 5개 정도 되면 비교해야할 숫자도 5개로 같이 늘어나야 한다
			//index가 0이고 i가 0보다 커지면 for문이 끝난다
				if (lotto[i] == temp) {
					insert = false;
					break;
				}
			}
		if(insert) {
			lotto[index]=temp;
			index++;
		}
		if(index==6) break; //배열이 6개가 꽉 차면 while 빠져나오기



		}
		System.out.println(Arrays.toString(lotto));


		 */
	}

}
