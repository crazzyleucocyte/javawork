package _06_Ex;

public class Max {

	public static void main(String[] args) {

		int arr[]= {9,5,24,13,3,21};
		Math m = new Math();
		
		System.out.println("최대값 : "+m.max(arr));
		System.out.println("최소값 : "+m.min(arr));
		
		
		
		
	}

}

class Math{
	 
	Math(){
		
	}
	int max(int...x) {
		int max=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) max=x[i];
		}
		return max;
	}
	int min(int...x) {
		int min=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) min=x[i];
		}
		return min;
	}
	
	
	
	
}


