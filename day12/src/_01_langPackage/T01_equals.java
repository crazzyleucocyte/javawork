package _01_langPackage;

class Value{
	int value;

	Value(int value){
		this.value=value;
	}
	
	@Override
	public boolean equals(Object o) {
		//매개변수에 Object를 넣은것은 가장 차상위 객체이므로 이걸 넣어서 어껀 객체가 와도 실행 되도록했다
		return value == ((Value)o).value;
		
	}
	
	
}

public class T01_equals {

	public static void main(String[] args) {

		Value v1= new Value(10);
		Value v2= new Value(10);

		if(v1.equals(v2)) {
			System.out.println("v1과 v2가 같다");

		}else
			System.out.println("v1과 v2가 다르다");

	/*
	 * 같은 10인데 다르다가 나왔다
	 * 
	 * object의 equals는 주소가 같은가를 물어본다
	 * 하지만 우리는 오버라이드를 해서 값이 같은가로 바꿨다
	 */
	Value v3= v1;
	if(v1.equals(v3)) {
		System.out.println("v1과 v2가 같다");
		
	}else
		System.out.println("v1과 v2가 다르다");
	}
	/*
	 * 주소가 같을때 같다고 나온다
	 */
	
}





