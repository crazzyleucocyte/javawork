package _06_Book;

public class Member {
/*
 * api class : 
   


   Member
      속성 :
	name
	age
	gender
	
     생성자 :
	매개변수가 없는 생성자
	매개변수가 3개인 생성자 {
		인스턴스 변수에 넣기
	}
	
      메소드 :
	각 필드의 setter / getter 메소드
      오버라이딩 : toString()
	이름 : name, 나이 : age, 성별 : gender
	
 */
	
	String name;
	int age;
	String gender;
	Member(){
		
	}
	public Member(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "이름 : "+name+" 나이 : "+age+", 성별 : "+gender;
	}
	
	
	
	
	
}
