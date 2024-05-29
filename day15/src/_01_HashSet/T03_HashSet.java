package _01_HashSet;

import java.util.*;

//사용자 정의 클래스로 Set에 지정하면 equals가 오버라이딩 되어있지 않아 사용하지 못하는데 오버라이딩을 단축키로 시켜주면 가능
class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
//		return Objects.hash(age, name);//단축키를 써서 만든 해시코드
		return name.hashCode()+age;//name의 해쉬코드를 만들고 나이를 붙이시오
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)//내 객체와 매개변수로 받은 객체가 같은 객체인가?
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())//getclass는 패키지명.클래스명
//			return false;
//		//위에는 같은객체가 아닌지 대비해주는거고 아래가 진짜 이퀄스다
//		Member other = (Member) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//매개변수로 받은 객체가 Member클래스이냐
			Member member = (Member)obj;
			return age ==member.age &&name.equals(member.name);//두 객체의 인스턴스변수의 값이 같은가 비교
		}
		return false;
	}
	
	
	
}

public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		//set에 들어간 두 개의 객체의 인스턴스 변수 두 개의 값이 서로 같기때문에 Set은 서로 같은 객체로 인식해 size가 하나로 출력된다
		//이때 숫자를 하나라도 바꾸면 서로 다른 객체로 인식되어 size가 2가 된다.
		
		System.out.println("size : "+set.size());
		for(Member element : set) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
