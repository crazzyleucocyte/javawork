package programus;

import java.util.Arrays;

public class 연습33 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 100, 99, 98 };
		int answer = 0;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] /= 2;
				flag = false;
			} else if (arr[i] < 50 && arr[i] % 2 == 1) {
				arr[i] = arr[i] * 2 + 1;
				flag = false;
			}
			if (i == arr.length - 1) {
				i = 0;
				answer++;
				if (flag)
					break;
				flag = true;

			}
		}
	}
}
