package _01_langPackage;

import java.util.Arrays;

class Point {
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "x= "+x+", y= "+y;
	}


}
class Circle implements Cloneable{
	Point p; //중심점(x, y)좌표
	double r;//반지름

	Circle(Point p, double r){
		this.p=p;
		this.r=r;
		
		//인스턴스변수가 기본자료형이면 깊은복사
		//인스턴스변수가 참조자료형이면 앝은 복사(즉, 주소만 복사)
	}
	@Override
	public Circle clone() {//T04에서는 Object로 반환해서 Point로 형변환을 해줬는데 여기서는 Circle로 형변환 해서 반환한다
		//여기부터
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Circle)obj;
	//여기까지는 그냥 뭘 하든 클론을 할떄는 다 똑같이 쓴다
	}
	
	//매개변수에 들어가는 p도 깊은 복사를 했다.
	public Circle deepclone() { 
		//여기부터
		Object obj = null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Circle c = (Circle)obj;
		c.p=new Point(this.p.x,this.p.y);
		return c;
		//여기까지는 그냥 뭘 하든 클론을 할떄는 다 똑같이 쓴다
	}
	
	@Override
	public String toString() {
		return "p= ["+p+"], r= "+r;
	}
	
	

}
public class T05_cloneShallowDeepCopy {

	public static void main(String[] args) {

		//얕은 복사 둘 중 하나를 변경하면 다른 하나도 변경됨
		String str[]= {"a","b","c"};
		String copyStr[]=str;

		str[0]="d";
//		copyStr[1]="d";
	
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		System.out.println(Arrays.toString(copyStr));
		System.out.println(Arrays.toString(str));
		System.out.println("---------------------------------------");

		//깊은 복사
		String deepcopy[]= new String[5];
		for(int i = 0;i<str.length;i++) {
			deepcopy[i]=str[i];
		}
		System.out.println(Arrays.toString(deepcopy));
	System.out.println("---------------------------------------");
		str[0]="a";
		System.out.println(Arrays.toString(copyStr));
		System.out.println(Arrays.toString(deepcopy));
		System.out.println("---------------------------------------");
		//클론은 깊은 복사가 된다
		//깊은 복사는 복사하기 전 배열의 값을 변경해도 새로운 변수에서는 바뀌지 않지만 얕은 복사는 변경된다
		
		//2. Arrays.copyOf(원본배열, 복사할 길이)//깊은복사
		String arrayCopy[]= Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(arrayCopy));
		arrayCopy[2]="z";
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println(Arrays.toString(str));
		System.out.println("---------------------------------------");
		
		//3. Clone()
//		Point p1 = new Point(1,5);
		Circle c1= new Circle(new Point(1,5),3);
		Circle c2 = c1.clone()	;
		
		System.out.println(c1.r);
		System.out.println(c2.r);
		
		c1.r=100.0;
		c1.p.x=700;
		System.out.println(c1.r);
		System.out.println(c2.r);
		System.out.println("---------------------------------------");
		
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);
		System.out.println("---------------------------------------");
		
		Circle c3 = c1.deepclone();
		c1.r=50.0;
		c1.p.x=1000;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//배열에서의 clone
		int num[]= {1,2,3};//베열은 implrment 없이 클론을 사용할 수 있다
		int[]numClone=num.clone();
		numClone[0]=100;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(numClone));
		
		
		
		
	}

}
