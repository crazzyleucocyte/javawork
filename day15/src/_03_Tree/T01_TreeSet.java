package _03_Tree;

import java.util.*;

public class T01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet();
		TreeSet<Integer> score = new TreeSet();
		
		scores.add(87);
		scores.add(12);
		scores.add(72);
		scores.add(65);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println("------------------------------------------");
		System.out.println("94점보다 아래 점수"+scores.lower(94));
		System.out.println(scores.higher(94));
		System.out.println("------------------------------------------");
		
		System.out.println(scores.ceiling(90));//88이 있으면 88반환 없으면 88보다 큰 수 반환
		System.out.println(scores.ceiling(91));
		System.out.println(scores.ceiling(92));
		System.out.println("------------------------------------------");
		System.out.println(scores.floor(86));//86이 있으면 86반환 없으면 86보다 작은 수 반환
		System.out.println("------------------------------------------");
		
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println("남아있는 객체 수 : "+scores.size());
		}
		System.out.println("------------------------------------------");
		
		
		
		
		
		System.out.println(scores.headSet(66));//66보다 낮은 점수 반환
		System.out.println(scores.headSet(100));
		System.out.println(scores.tailSet(1));//1보다 높은 점수들 반환
		System.out.println("------------------------------------------");
		
		System.out.println(scores.headSet(95,true));//숫자 뒤에는 해당 숫자를 포함하는지 여부를 묻는 매개변수
		System.out.println(scores.headSet(95,false));
		System.out.println(scores.headSet(95));//안쓸경우 디폴트는 false이다.
		System.out.println("------------------------------------------");
		scores.add(87);
		scores.add(12);
		scores.add(72);
		scores.add(65);
		scores.add(95);
		scores.add(80);
		
		score.add(87);
		score.add(12);
		score.add(72);
		score.add(65);
		score.add(95);
		score.add(80);
		System.out.println(scores.subSet(1, true,100,true));//1부터 100까지 검색
		if(score.equals(scores))System.out.println("same");
		
	}

}
