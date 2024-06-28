package programus;

public class 연습2 {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0]=5;
		for(int i=0;i<10;i++) {
		System.out.println(a[i]);
		}
		System.out.println(a);
		
		int menu=(int)(Math.random()*2+1);
		if(menu==1) {
			System.out.println("돼지게티");
			
		}else {
			System.out.println("크떡");
		}
		
	}

}
