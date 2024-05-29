package _01_HashSet;
import java.util.*;


public class T02_HashSet {

	public static void main(String[] args) {
		//int형을 Set에 넣어줄떄는 객체만 넣어야하는데 기본자료형인 int는 넣을 수 없기 떄문에 Wrapper class의 객체인 Integer로 배열을 선언 후 넣어준다
		//근데 Integer형으로 하는것 보다 String으로 하는게 편해서 String으로 한다
		String inte[]= {"1","23"};
		Set set1 = new HashSet();
		
		set1.add(inte[0]);
		
		iteratorPrint(set1.iterator());
		//-------------------------------------------------------------------------
		
		/*
		 * "1", Integer.valueOf(1)
		 * 위 두개는 HashSet이 각각 다른 객체로 인식하고
		 * "2","2","2" 는 같은 객체로 인식한다.
		 */
		Object objArr[] = {"1", Integer.valueOf(1),"2","2","2","3","3","4","4","4"};
		//objArr 배열의 인덱스 하나하나의 값을 set2에 저장하기 위해 객체 생성
		Set/*<Object>*/ set2 = new HashSet();
		//objArr 배열의 인덱스 하나하나의 값을 set2에 저장
		for(int i = 0;i<objArr.length;i++) {
			set2.add(objArr[i]);
		}
		//{"1", Integer.valueOf(1),"2","2","2","3","3","4","4","4"}을 HashSet에 넣은 결과 출력
		iteratorPrint(set2.iterator());
		//-------------------------------------------------------------------------
//		Set<String> set3 =new HashSet<String>();
		
		//set1을 모두 지우고 결과 출력 
		set1.clear();
		System.out.println(set1.size());//0이 출력되면서 모두 지워진것 확인
		
		
		
		
		
		
		
		
	}

	static void iteratorPrint(Iterator<Object> i) {

		while(i.hasNext()) {
			Object ca =i.next();
			System.out.print(ca+", ");
		}
		System.out.println();
	}
}
