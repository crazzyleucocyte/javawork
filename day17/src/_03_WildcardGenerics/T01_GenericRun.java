package _03_WildcardGenerics;

public class T01_GenericRun {

	public static void main(String[] args) {
		Applicant<Person>ap=new Applicant(new Person());
		Applicant<Student>ap2=new Applicant(new Person());
		Applicant<Student>ap3=new Applicant(new HighStudent());
		
		Course.registerCourse(ap3);
		Course.registerCourse(new Applicant<Person>(new Person()));
		//코스 클래스에 있는 레지스터 코스를 가져왔는데 레지스터 코스의 매개변수로 어플리컨트 객체를 받아와서 생성자 메소드를
		//입력해야하는데 어플리컨드의 생성자 메소드에 kind를 입력해야하는데 이 kind로 person의 생성자 메소드를 넣은것이다.
		
		Course.registerCourse(new Applicant<Worker>(new Worker()));
		Course.registerCourse(new Applicant<Worker>(new Worker()));
		Course.registerCourse(new Applicant<Student>(new Student()));
		Course.registerCourse(new Applicant<Student>(new HighStudent()));
		Course.registerCourse(new Applicant<Student>(new MiddleStudent()));
		
		
		
		
		
	}

}
