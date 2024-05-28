package thing;

import java.util.*;

public class Things {

	public static void main(String[] args) {
		 System.out.println("2: "+Integer.toBinaryString(2));//2를 2진수로 나타낸 것 
		  //Integer.toBinaryString()은 괄호의 숫자를 이진수로 나타내는 메서드다 

		 
		 int a[]= {1,2,3,4};
		 int b[]= Arrays.copyOf(a, a.length+1);
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(b));
		 
		 List <Integer>answer=Arrays.stream(a).boxed().toList();
	        
	        System.out.println(answer);
	        Solution sol = new Solution();
	        
	        System.out.println(sol.solution(0,"wsdawsdassw"));
	}

}
class Solution {
int n;
    
    public int move(int n,char con){
       
        if(con=='w')n=1;
        else if(con=='s')n=-1;
        else if(con=='d')n=10;
        else if(con=='a')n=-10;
        return this.n=this.n+n;
            
    }
    public int solution(int n, String control) {
        this.n=n;
        
        for(char chArray : control.toCharArray()){
            move(this.n,chArray);
            System.out.println(this.n);
        }
        
        return this.n;
    }
}
