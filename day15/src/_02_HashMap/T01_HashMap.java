package _02_HashMap;
import java.util.*;


public class T01_HashMap {

	public static void main(String[] args) {
		//hashmap의 키 값은 String, 값은 Integer로 입력
		Map<String,Integer> map  = new HashMap<String, Integer>();
		
		map.put("홍길동", 95);
		map.put("홍길동", 97);
		//키 값이 홍길동으로 같을 경우 값은 덮어쓰기가 된다
		map.put("이소영", 85);
		map.put("최서진", 67);
		System.out.println("size() : "+map.size());
		//map.get(key)를 하면 반환값은 값으로 홍길동의 점수가 나온다
		System.out.println("홍길동의 점수 : "+map.get("홍길동"));
		
		System.out.println(map);
		
		//remove(key) : 객체 삭제로 key와 value 모두 삭제가 된다
		map.remove("이소영");
		System.out.println(map);//iterator를 사용하여 출력한것
		
		
	}

}
