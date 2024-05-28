package _02_ArrayList;

import java.util.ArrayList;

public class T02_ArrayList {

	public static void main(String[] args) {
		//제네릭을 사용하지 않는것은 권장하지 않음
		//매개변수로 어떠한 객체라도 받겠다는 뜻
		//권장하지 않는다는 뜻으로 노란색 밑줄이 그인다
		ArrayList list = new ArrayList(); 
		
		list.add(1);
		list.add(45.67);
		list.add("6");
		list.add(Integer.valueOf(7));
		list.add(new String ("98"));
		
		//위와같이 여러가지 자료형이 섞여 있는경우 자료형을 정해주어야 할때 최상위 클래스인 Object로 해준다
		Object obj=list.get(0);
		System.out.println(list.toString());
		
		//위에서 Object로 자료형을 지정해주었고 각 인덱스에 있는 값을 꺼내어 사용하려고 할때
		//object에서 해당 값의 자료형으로 형변환을 해주어야 한다
		int num1 = (int)list.get(0);
		double dou = (double)list.get(1);
		int num2 =Integer.parseInt((String)list.get(2));
		int num3 = (int)list.get(3);
		int num4 = Integer.parseInt((String)list.get(4));
		System.out.println("합계 : "+ (num1+dou+num2+num3+num4));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
