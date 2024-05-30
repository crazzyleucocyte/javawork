package _02_comparable;

import java.util.*;

class Decending implements Comparator{

	
	//comparator를 써서 compare를 할 경우 한 번 일부러 적용 시켜줘야 sort가 된다.
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1);//내림차순
//			return c1.compareTo(c2);//오름차순
		}
		return -1;
	}
	
}


public class T02_comparator {

	public static void main(String[] args) {
		String strArr[]= {"cat","dog","tiger","Lion"};
		System.out.println(Arrays.toString(strArr));
		
		//sort하면 유니코드 기준으로 정렬을 해준다
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//.CASE_INSENSITIVE_ORDER 메소드는 대소문자를 가리지 않고 정렬한다
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		//----------------------------------------
		//만들어준 compare를 사용하는 방법
		//----------------------------------------
		//만들어준 compare는 대소문자가 구분이 되지 않는다
		Arrays.sort(strArr,new Decending());
		System.out.println(Arrays.toString(strArr));
		
		//compare를 쓰고 대소문자 구분 없이 정렬하는거를 한 번 더 입력
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		
		
	}

}
