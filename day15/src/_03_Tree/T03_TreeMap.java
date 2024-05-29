package _03_Tree;

import java.util.*;
import java.util.NavigableMap;
import java.util.Map.Entry;

public class T03_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer>treeMap	= new TreeMap<String, Integer>();
		
		treeMap.put("apple", 1000);
		treeMap.put("banana", 3000);
		treeMap.put("cherry", 10000);
		treeMap.put("grape", 5000);
		treeMap.put("mango", 1000);
		treeMap.put("orange", 500);
		treeMap.put("peach", 1000);
		treeMap.put("watermelon", 10000);
		//트리로 비교할때 알파벳은 사전 순으로 검색한다
		System.out.println("[d~n 사이의 단어 검색]");
		NavigableMap<String,Integer >naviMap=treeMap.subMap("c", true, "n", false);
		System.out.println(treeMap.subMap("c", true, "n", false));//이렇게 해도 출력 됨
		System.out.println(naviMap);//이렇게 해도 출력 된다
		for(Entry<String,Integer >entry : naviMap.entrySet()) {
			String key= entry.getKey(); 
			System.out.println("key : "+key+", value : "+entry.getValue());
		}
		
		
		
		/*map에는 키와 값이 같이 있고
		 * 
		 * Set에는 키와 값중 하나만 들어올 수 있
		 * 
		 */
		
		
	}

}
