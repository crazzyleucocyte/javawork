package _01_array;

import java.util.Arrays;

public class T05_lotto {

	public static void main(String[] args) {

		// p.122
		//실패
		// 1. 6개의 1차원 배열
		// 2. 1~45 숫자를 랜덤으로 추출해서 배열에 넣기
		// 3. 배열에 들어있는 값과 랜덤 추출한 값이 같은가 비교
		// 4. 다르면 배열에 넣기, 같은값이면 다시 랜덤 추출
		int lotto1[] = new int[6];
		int temp1 = 0;
		boolean insert=false;
		for (int i = 0; i < lotto1.length; i++) { // i는 6개의 번호 중 순서

			
				int num = (int) (Math.random() * 45) + 1; // 번호 추출
				System.out.println(num);

				number: for (int d = 0; d < lotto1.length; d++) { // 뽑은 번호가 이미 있는지 확인
					if (lotto1[d] == num) {
						insert = true;
						break;
					} else {
						lotto1[i] = num;
//						break again;

					}
				}
			
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
