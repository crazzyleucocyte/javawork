package _02_comparable;
import java.util.*;

class Person implements Comparable<Person>{
	String name;
	int age;

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	//내림차순 혹은 오름차순으로 정렬이 되지 않는 콜랙션에 compareTo를 오버라이드 해서 메소드를 만들어 적용하면 정렬기준이 생겨 
	//내림차순 혹은 오름차순으로 정렬이 가능하다
	//comparable를 쓰면 자동으로 입력할때마다 적용이 되어서 따로 쓸 필요가 없다
	@Override
	public int compareTo(Person o) {
		if(age<o.age)
			return -1;
		else if(age==o.age)
			return 0;
		else
			return 1;
		
	}
	
}


public class T01_comparable {
//treeSet에 객체를 입력 할 경우 treeSet은 정렬하도록 되어있는데 입력 받은 객체의 정렬기준을 알지 못해 오류가 난다
	//따라서 treeSet에 객체를 입력할 경우 정렬기준을 만들어 줘야 오류가 나지 않는다.
	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		TreeSet<Person> tset = new TreeSet<Person>();
		
		treeset.add(new Person("홍길동",45));
		treeset.add(new Person("강민석",27));
		treeset.add(new Person("김수한무",52));
		tset.add(new Person("홍길동",45));
		tset.add(new Person("강민석",27));
		tset.add(new Person("김수한무",52));
		
		Iterator<Person> itts = treeset.iterator();
		while(itts.hasNext()) {
			Person person =itts.next();
			
			System.out.println("이름 : "+person.name+"나이 : "+person.age);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
