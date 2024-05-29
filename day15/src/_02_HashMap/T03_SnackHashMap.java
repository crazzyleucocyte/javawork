package _02_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class T03_SnackHashMap {

	public static void main(String[] args) {

		Map <String, Snack>map = new<String, Snack> HashMap();
		
		map.put("바나나킥", new Snack("바나나 맛", 310));
		map.put("매운 새우깡", new Snack("매운 맛", 455));
		map.put("프링글스", new Snack("언니언 맛", 566));
		map.put("고소미", new Snack("고소한 맛", 238));
		
		System.out.println(map);
		
		//키값이 있으면 값을 덮어쓰기, 키값이 없으면 넣기
		map.put("새우깡", new Snack("순한 새우맛",300));
		System.out.println(map);
		
		//replace 키에 해당하는 값 변경(키가 없으면 아무것도 하지 않음)
		map.replace("프링글스", new Snack("오리지널",555));
		System.out.println(map);
		System.out.println("----------------------------------------------------------");
		
		//map은 곧바로 iterator에 넣을 수 없다 
		//----------------------------------------------------------
		//   1번 방법
		//----------------------------------------------------------
		//그래서 map을 iterator에서 사용하려면 Map => Set => Iterator 해야한다
		//iterator에 넣는거랑 구조가 비슷함
		//1. Map=>Set
		Set<String> keySet = map.keySet();//keySet()는 map에 있는 모든 키를 가져오기
		
		//2. Set=>Iterator
		Iterator<String> itKey = keySet.iterator();
		
		int count=1;
		//Iterator를 사용해 출력
		while(itKey.hasNext()) {
			//map에 있는 key값(과자 이름)을 String key에 저장
			String key = itKey.next();  //위의 1. Map=>Set 에서 String으로 안하면 (String)itKey.next();으로 해야한다
			//key값에 해당하는 값(snack 객체)를 가져와서 Snack에 저장
			Snack value = map.get(key);
			//key와 값을 출력
			System.out.println(count+++". "+key+" : "+value);
//			System.out.println(count+++". "+key);
		}
		System.out.println("----------------------------------------------------------");
		//----------------------------------------------------------
		//2-1번 방법(EntrySet())_제네릭 사용 안함
		//----------------------------------------------------------
		
		//map의 entry값을 set으로 변환
		Set entrySet = map.entrySet(); //엔트리 타입 :키+값 세트의 집합
		//변환된 setEntry 값을 iterator에 저장
		Iterator itEntry = entrySet.iterator();
		//iterator 출력
		while(itEntry.hasNext()) {
			//엔트리 타입을 이터레이터에 넣어서 가져온걸 엔트리 자료형의 엔트리에 저장
			Entry entry =(Entry)itEntry.next();
			
			//Entry = key+value이 있는 엔트리 타입
			//가져온 엔트리의 키값만 저장하기 위해 스트링 타입에 엔트리의 getKey를 해서 저장
			String key = (String)entry.getKey();//Entry 중에서 key만 얻어옴. key는 String타입
			Snack value=(Snack)entry.getValue();
			System.out.println(key+" / "+value);
		}
		System.out.println("----------------------------------------------------------");
		
		//----------------------------------------------------------
		//2-2번 방법(EntrySet())_제네릭 사용
		//----------------------------------------------------------
		
		
//		Set<String,Snack> e = map.entrySet();//Set 제네릭에<String, String>처럼 두개는 넣을 수 없다
		
		Set<Entry<String,Snack>> entrySet2 = map.entrySet(); //위에 Set entrySet = map.entrySet();둘 중 하나 하면 됨
		
		Iterator <Entry<String,Snack>>itEntry2 = entrySet2.iterator();
		while(itEntry2.hasNext()) {
			Entry<String,Snack> entry = itEntry2.next();
			String key = entry.getKey();//Entry 중에서 key만 얻어옴. key는 String타입
			Snack value=entry.getValue();
			System.out.println(key+" / "+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
