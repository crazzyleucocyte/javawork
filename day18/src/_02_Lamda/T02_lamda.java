package _02_Lamda;

public class T02_lamda {

	public static void main(String[] args) {
		
		
		MyOneArgument mo = new MyOneArgument() {
			
			@Override
			public void method(int x) {
				int result = x*2;
				System.out.println(result);
				
			}
		};
		mo.method(4);
		mo=(x)-> { int result=x*3;
		System.out.println(result);
		};
		
		mo=(x)-> System.out.println(x*4);
		mo.method(4);
		
		
		
		
		
		
		
		
	}

}
