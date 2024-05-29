package _01_HashSet;

import java.util.*;

public class T04_HashSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();// <>안에 있는 값을 앞에 썼으면 뒤에는 안써도 된다

		// set에 랜덤한 값 저장
		int i = 0;
		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(set);
		// 서로 다른 값을 넣기 때문에 clear해줌
		set.clear();

		// (i=0 ; i<6 ; i++)로 할 경우 size상관 없이 6번만 돌아가기 때문에 중복 값이 나온 경우 size가 6보다 작을 수 있다
		for (i = 0; set.size() < 6; i++) {
			set.add((int) (Math.random() * 45) + 1);
		}
		System.out.println(set);
		//set으로 할 경우 순서가 없어 내림차순이나 오름차순으로 정렬이 되지 않는다
		//이 때문에 set을 list로 변환해준다
		
		List list = new ArrayList(set);
		Collections.sort(list);
		
		System.out.println(list);
	}

}
