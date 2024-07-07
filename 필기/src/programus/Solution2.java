package programus;
import java.util.*;

class Solution4 {
    public static String solution(String my_string, int[] indices) {
       
        String my_char[]=my_string.split("");
        StringBuilder my_strb = new StringBuilder();
        Arrays.sort(indices);
        int j = 0;
        for(int i = 0 ; i < my_char.length ; i++ ){
                
                            System.out.println("--------------");

            if ( i == indices [j] ){
            	
                System.out.println("i ="+i+"indices["+j+"] = "+indices[j]);
//                if(j==indices[indices.length-1]) continue;
                if(i==indices[indices.length-1]) continue;
                j++;
                continue;
            }
                System.out.println("i ="+i+"indices["+j+"] = "+indices[j]);
            
            my_strb.append(my_char[i]);
            
        }
        // for(int a: indices){
        // System.out.println(a);
        // }
        return my_strb.toString();
    }
}


public class Solution2{
	public static void main(String[] args) {
		Solution4 s4=new Solution4();
		int indices[]=new int[]{1, 16, 6, 15, 0, 10, 11, 3};
		
		Solution4.solution("apporoograpemmemprs",indices);
	}
}
