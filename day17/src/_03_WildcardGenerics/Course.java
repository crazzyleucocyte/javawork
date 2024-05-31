package _03_WildcardGenerics;

public class Course {
	//모든 사람이면 등록 가능
	static void registerCourse(Applicant<?> a) {//<?> 를 안쓰면 경고문이 뜬다
		System.out.println(a.kind.getClass().getSimpleName()+"가 course에 등록함");
		//a 변수의 kind를 가져와서.getClass() 클래스 명을 출력하는데.getSimpleName()간단하게 클래스명만 가져온다
	}
	
	//학생만 등록 가능
	static void registerCourse2(Applicant<? extends Student >a) {//student 와 student를 상속 받은 high와 middle도 가능하
		System.out.println(a.kind.getClass().getSimpleName()+"가 course2에 등록함");
		
	}
	
	//직장인 일반인 등록 가능
	static void registerCourse3(Applicant<? super Worker>a) {//worker와 worker의 부모인 person까지 가능
		System.out.println(a.kind.getClass().getSimpleName()+"가 course3에 등록함");
		
	}
	
	
	
	
	
	
	
}







