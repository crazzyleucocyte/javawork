package _07_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//predicate는 반환값이 boolean형인 인터페이스다



public class T01_predicate {
	static List<Student>list = Arrays.asList(
			new Student("홍길동","남",85),
			new Student("김수한무","남",36),
			new Student("거북이","여",60),
			new Student("두루미","여",06),
			new Student("맹꽁이","남",97)
			);
	
	//남여별 평균 구하기
	
	//Predicate<Student> predicate를 매개변수로 받아서 람다식 t->t.getGender().equals("여")를 입력 받는 메소드
	//for문으로 list를 돌면서 t->t.getGender().equals("여")의 결과를 predicate.test(student)로 가져와서 
	//if문의 조건문으로 넣은 후 리스트의 객체 중 (sum+=student.getCom())성별이 여자인 학생의 컴퓨터 점수를 sum에 더한다
	
	static double avg(Predicate<Student> predicate) {
		int sum = 0, count=0;
		for(Student student : list) {
			if(predicate.test(student)){
				count++;
				sum+=student.getCom();
			}
		}
		return(double)sum/count;
	}
	
//--------------------------------------------------------------------------------
	//predicate 람다를 일반 메소드 형식으로 변경
//	static boolean Predicate(Student student) {
//		return student.getGender().equals("남");
//	}
//-------main---------
//		boolean ff=Predicate(new Student("sdfsdf","여",50));
//		System.out.println(ff);
//--------------------------------------------------------------------------------
	
	
	
	public static void main(String[] args) {
		double maleAvg =avg(t->t.getGender().equals("남"));
		System.out.printf("남자의 평균 점수 = %.2f\n",maleAvg);
		
		double femaleAvg =avg(t->t.getGender().equals("여"));
		System.out.printf("남자의 평균 점수 = %.2f\n",femaleAvg);
		
		
		
		
		Predicate<Student> predicate=t->t.getGender().equals("남");
		
		System.out.println(predicate.test(new Student("sdfsdf","남",50)));
		System.out.println(predicate.test(new Student("sdfsdf","여",50)));
	
		
	}

}
