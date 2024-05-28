package _03_LinkedList;

import java.util.*;

public class T01_LinkedList {
	
	

	public static void main(String[] args) {
		//링크드 리스트는 삭제와 추가가 빈번할때 유용하다
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(0,1);//index 0번에 1추가
		list.addFirst(0);//addFirst: 무조건 맨 앞에 추가
		list.addLast(20);//addLast : 맨 뒤에 추가인데 그냥 add랑 똑같아서 자주 사용하지 않음
		list.add(50);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove();//()에 인자를 쓰지 않을 경우 무조건 맨 앞 node 삭제
		System.out.println(list);
		
		list.removeFirst();// remove()와 같은 기능을 하기 때문에 자주 사용하지는 않는다
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println("----------------------------------------------");
		//linkedList의 경우 객체의 주소가 인덱스에 들어있고 인덱스의 주소를 따라가서 객체를 찾을때 객체들이 규칙 없이 여기저기
		//중구난방으로 생성이 되어있어서 순차적으로 출력을 하면 0번 객체 찾아서 출력 후 1번 주소를 찾아가서 출력
		//...3번 출력은 0번, 1번, 2번을 다시 돌고 출력..이렇게 돼서 
		//순차적으로 출력할 경우 비효율적이다 이때 사용하는것이 "iterator"이다.
	
		//iterator: 
		//모든 객체를 한 공간에 집어넣고 무작위로 하나씩 꺼내고 다 꺼낼경우 끝나는 형식으로 쓴다
		
		//for문으로 linkedList를 출력하려면 검색 속도가 느려진다
		//i번쨰 주소는 i-1번에 들어있어서 i-1을 먼저 찾아야하고
		//i-1번쨰 주소를 찾으려면 i-2번째를 먼저 찾아야하고......
		//결국 실행 횟수는 팩토리얼을 따라 진행하기 때문에 비효율적이다.
		for(int i = 0;i<list.size();i++) {
			list.get(i);
		}
		list.add(10);
		list.add(0,1);//index 0번에 1추가
		list.addFirst(0);//addFirst: 무조건 맨 앞에 추가
		list.addLast(20);//addLast : 맨 뒤에 추가인데 그냥 add랑 똑같아서 자주 사용하지 않음
		list.add(50);
		System.out.println(list);//iterator와 똑같은 값을 출력하는걸로 보아 println도 iterator로 진행되는것 같음
		//Iterator:리스트를 순회할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator();//list의 객체를 넣어줌
		//hasNext : 남아있는 객체가 있는가? true
		while(iterator.hasNext()) {//get하는건 next=>순회하면서 객체를 얻어옴
			System.out.print(iterator.next()+" ");
			
		}
	
	
	
	
		
	
	
	}

}
