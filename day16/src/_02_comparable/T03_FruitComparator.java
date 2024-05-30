package _02_comparable;

import java.util.*;

public class T03_FruitComparator {

	public static void main(String[] args) {
		//TreeSet에 들어간 Fruit 객체의 정렬기준을 모르기 때문에 정렬기준을(new FruitDescending())이렇게
		//지정해주어야 오류가 나지 않는다.
		TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitDescending());
		ts.add(new Fruit("포도",3000));
		ts.add(new Fruit("바나나", 1000));
		ts.add(new Fruit("수박",13000));
		
		Iterator<Fruit> itts = ts.iterator();
		while(itts.hasNext()) {
			Fruit fr = itts.next();
			
			System.out.println("과일 이름 : "+fr.name+"가격 : "+fr.price);
		}
		
	}

}
