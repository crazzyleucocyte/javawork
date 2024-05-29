package _01_HashSet;
import java.util.*;

class ClassA{
	String str;

	public ClassA() {	}
	public ClassA(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "ClassA [str=" + str + "]";
	}

}

public class T01_HashSet {
	//HashSet: list랑 비슷한데 순서가 없고 중복이 안되는것
	public static void main(String[] args) {
		HashSet set1=new HashSet(); 
		Set set2 = new HashSet();

		ClassA ca1 = new ClassA("java");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("sql"));
		set2.add(new ClassA("react"));
		set2.add(new ClassA("aws"));

		int size = set2.size();


		System.out.println("저장된 객체의 갯수 : "+size);
		//모든 객체를 출력할때 순서가 없으므로 for문을 사용하지 못한다
		//		Iterator<ClassA>i = set2.iterator();//iterator메소드
		//		System.out.print("set2 출력 : ");
		//		while(i.hasNext()) {
		//			ClassA ca =i.next();
		//			System.out.print(ca+" ");
		//		}
		//		System.out.println();

		iteratorPrint(set2.iterator());

		set2.add(new ClassA("AWS"));
		iteratorPrint(set2.iterator());



		// 삭제 : 오라클 삭제(그냥 삭제하는 메소드가 없음...??)
		Iterator<ClassA>i = set2.iterator();
		while(i.hasNext()) {
			//Set set2의 iterator를 만들어서 while로 반복하면서 하나하나의 ClassA 객체를 ca에 넣음
			ClassA ca =i.next();
			//Set set2의 하나의 객체를 새로운 ca에 저장을 하고 그 객체의 인스턴스 변수를 String s에 저장해서 비교하기 편하게 했다
			String s = ca.str;
			if(s.equals("oracle"))
//				set2.remove(ca);//이렇게 하면 오류가 나는데 그 이유는 직접 Set에 접근해서 삭제는 못하고 iterator에서 삭제해야한다
				i.remove();//인자를 안써준 이유는 반복을 할때 한개의 값만 가져오기 떄문에 입력하지 않아도 한개만 가져왔기 떄문에 그거를 삭제한다
		}


	}
	//출력 시 계속 호출이 되도록 메소드 구현
	//자신의 클래스 내에서 정적 메소드를 사용할때는 (클래스명.메소드)를 하지 않아도 사용 가능하다
	/*
	 * 메소드를 만들떄 
	 * Iterator<ClassA>i = set2.iterator();
	 * 이런 식이 필요할때 왼쪽항을 매개변수로 두고 오른쪽 항을 인자로 받으면 메소드 안에 쓰지 않고 사용이 가능하다
	 */
	static void iteratorPrint(Iterator<ClassA> i) {

		while(i.hasNext()) {
			ClassA ca =i.next();
			System.out.print(ca+", ");
		}
		System.out.println();
	}


















}
