package _02_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class T01_ArrayList {

	public static void main(String[] args) {
		
		//<>안에는 기본자료형은 안되고 객체만 되니 int를 쓰고 싶으면 Integer를 써라
		//<>를 제네릭이라고 하고 자료형을 넣어주는것을 권장함 
		//여러 자료형을 받을 시 클래스를 만들어 객체로 넘겨주는 것을 권장함
		//list는 기본 배열 10개를 만드는데 객체 하나하나의 주소가 list의 한 칸에 들어간다
		ArrayList<String> alist = new ArrayList<String>();//(안에 숫자를 쓰면 처음에 만들어지는 list의 크기를 정할 수 있다)
		//String도 객체이기 때문에 제네릭에 들어갈 수 있다.
		
		//자식 객체를 부모타입으로 자동형변환하여 사용 가능(List안에 어레이 리스트가 있다)
		List<String> list = new ArrayList<String>();
		list.add("java");       //list[0]
		list.add("database");   //list[2]
		list.add("HTML");       //list[3]
		list.add(1, "객체 모델링");    //list[1]
		//바뀌는것이 아닌 끼어들기
		list.add("javascript");
		
		System.out.println("총 저장된 객체 수 : "+list.size());
		//list는 get()을 사용해서 저장된 값을 불러올 수 있음
		System.out.println(list.get(3));
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(i+1+"."+list.get(i));
		}
		int count=1;
		for(String str : list) {
			System.out.println(count+++". " +str);
		}
		System.out.println("----------------------------------------------");

		count=1;
		list.remove(2);
		list.remove(2);
		list.remove("객체 모델링");
		list.remove(list.get(0));
		for(String str : list) {
			System.out.println(count+++". " +str);
		}
		System.out.println("----------------------------------------------");
		
		list.add("java");
		list.add("Database");
		list.add("HTML");
		count=1;
		for(String str : list) {
			System.out.println(count+++". " +str);
		}
		System.out.println("----------------------------------------------");
		
		list.set(2, "객체 모델링");//인덱스 사이에 끼워넣는것이 아니라 교체하는것 replace와 비슷
		count=1;
		for(String str : list) {
			System.out.println(count+++". " +str);
		}
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
