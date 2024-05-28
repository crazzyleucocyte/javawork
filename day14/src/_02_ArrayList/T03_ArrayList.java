package _02_ArrayList;

import java.util.*;

public class T03_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 10);
			list.add(random);
		}
		System.out.println(list.toString());

		// sublist(int,int) 몇 부터 몇까지 가져와라

		List<Integer> list2 = new ArrayList<Integer>(list.subList(3, 6));
		System.out.println(list2.toString());

		// sort: 내림차순
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list2);

		// contailsAll : list는 list2의 요소를 모두 가지고 있는가?
		System.out.println(list.containsAll(list2));

		// retainAll : list와 list2의 요소 중 교집합만 남기고 모두 삭제
		System.out.println("교집합 : " + list.retainAll(list2));
		System.out.println(list);
		System.out.println(list2);

		list.clear();
		list2.clear();
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		list.set(4, 3);
		list2.add(7);
		list2.add(3);
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		//문제 . list2의 객체가 list에 들어있으면 삭제.출력
		System.out.println(list);
		System.out.println(list2);
		
//		앞에서부터 count할 경우 인덱스가 지워지면서 앞으로 떙겨져서 삭제가 제대로 되지 않는다 
//		이 때문에 뒤에서부터 count해야한다
		for(int i =list2.size()-1;i>=0;i--) {
			if(list.contains(list2.get(i))) {
				System.out.println(list2.get(i));
				list2.remove(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		if(list.containsAll(list2)) {
			list2.removeAll(list);
		}
		
		System.out.println(list);
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		

	}

}
